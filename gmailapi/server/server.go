package server

import (
	"context"
	"fmt"
	"github.com/joho/godotenv"
	"github.com/wiqram/IG-Trading-Microservices/gmailapi/gmail"
	pb "github.com/wiqram/IG-Trading-Microservices/protos/gmailapi"
	"google.golang.org/grpc"
	"log"
	"net"
	"os"
)

// Server holds necessary values for server
type server struct {
	pb.UnimplementedGmailapiSvcServer
}

func Execute() {
	err := godotenv.Load()
	if err != nil {
		log.Fatal("Error loading .env file")
	}
	port := ":" + os.Getenv("PORT")
	//proxyPort := ":" + os.Getenv("PROXY_PORT")
	fmt.Printf("Gmail API server is listenining on port %s\n ", port)
	lis, err := net.Listen("tcp", port)
	if err != nil {
		log.Fatalf("failed to listen: %v", err)
	}
	s := grpc.NewServer()
	pb.RegisterGmailapiSvcServer(s, &server{})
	if err := s.Serve(lis); err != nil {
		log.Fatalf("failed to serve: %v", err)
	}
	fmt.Printf("Gmail API server is listenining on port %s\n ", port)
}

// subscribeToMail subscribes to the mailbox with specific label id

func (s *server) SubscribeToMail(ctx context.Context, in *pb.SubscriptionRequest) (*pb.SubscriptionResponse, error) {
	log.Printf("This is the inputs emailId", in.EmailId)
	//labelName, err := interceptor.GetLabelName(ctx)
	//topicName, err := interceptor.GetTopicName(ctx)
	in.EmailId = "me"
	in.LabelName = os.Getenv("LABELTORETRIEVE")
	in.TopicName = os.Getenv("GMAIL_TOPIC_NAME")
	subResp, err := gmail.SubscribeToGmailLabel(in.EmailId, in.LabelName, in.TopicName)
	if err != nil {
		log.Println("Api: SubscribeToMail", "failed to subscribe to mailbox", err.Error())
		return nil, err
	}
	fmt.Printf("This is watch response historyid at server level%s\n ", subResp.HistoryId)
	return &pb.SubscriptionResponse{TransactionId: fmt.Sprintf("%f", subResp.Expiration), HistoryId: fmt.Sprintf("%f", subResp.HistoryId)}, nil

}
