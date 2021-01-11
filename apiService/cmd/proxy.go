package cmd

import (
	"context"
	"flag"
	"fmt"
	"github.com/grpc-ecosystem/grpc-gateway/v2/runtime"
	"github.com/joho/godotenv"
	"github.com/spf13/cobra"
	gw "github.com/wiqram/IG-Trading-Microservices/protos/api"
	"google.golang.org/grpc"
	"google.golang.org/protobuf/proto"
	"log"
	"net/http"
	"os"
)

// proxyCmd is the serve sub command to start the api server
var proxyCmd = &cobra.Command{
	Use:   "proxy",
	Short: "proxy tests the api server",
	RunE:  proxy,
}

func init() {
	//
}

func proxy(cmd *cobra.Command, args []string) error {
	ctx := context.Background()
	ctx, cancel := context.WithCancel(ctx)
	defer cancel()

	err := godotenv.Load()
	if err != nil {
		log.Fatal("Error loading .env file")
	}

	// Register gRPC server endpoint
	// Note: Make sure the gRPC server is running properly and accessible
	mux := http.NewServeMux()
	g, err := newGateway(ctx)
	if err != nil {
		return err
	}
	mux.Handle("/", g)
	mux.HandleFunc("/swagger.json", serveSwagger)
	fs := http.FileServer(http.Dir("www/swagger-ui"))
	mux.Handle("/swagger-ui/", http.StripPrefix("/swagger-ui", fs))
	proxyPort := ":" + os.Getenv("PROXY_PORT")
	log.Println("Starting proxy server at " + proxyPort)
	// Start HTTP server (and proxy calls to gRPC server endpoint)
	return http.ListenAndServe(proxyPort, mux)
}

func newGateway(ctx context.Context) (http.Handler, error) {
	grpcServerAddress := os.Getenv("HOST") + ":" + os.Getenv("PORT")
	grpcServerEndpoint := flag.String("grpc-server-endpoint", grpcServerAddress, "gRPC server endpoint")
	mux := runtime.NewServeMux(runtime.WithForwardResponseOption(httpResponseModifier))
	fwdRespOpt := mux.GetForwardResponseOptions()
	for i := range fwdRespOpt {
		fmt.Println("this is the integer inside fwdrespopt ", i)
	}
	fmt.Println("this is the forward response fnction length ---  ", len(fwdRespOpt))
	opts := []grpc.DialOption{grpc.WithInsecure()}
	err := gw.RegisterAPIHandlerFromEndpoint(ctx, mux, *grpcServerEndpoint, opts)
	if err != nil {
		return nil, err
	}
	return mux, nil
}

func httpResponseModifier(ctx context.Context, w http.ResponseWriter, _ proto.Message) error {
	md, ok := runtime.ServerMetadataFromContext(ctx)
	if !ok {
		return nil
	}
	fmt.Println("we are in response modifier ", len(md.HeaderMD))
	setDefaultHeaders(w)
	return nil
}

func setDefaultHeaders(w http.ResponseWriter) {
	w.Header().Set("Access-Control-Allow-Origin", "*")
	w.Header().Set("Access-Control-Allow-Methods", "GET")
	w.Header().Set("Cache-Control", "no-store, no-cache, must-revalidate, post-check=0, pre-check=0")
	w.Header().Set("Content-Type", "application/json; charset=UTF-8")
	w.Header().Set("Vary", "Accept-Encoding")
}

func serveSwagger(w http.ResponseWriter, r *http.Request) {
	http.ServeFile(w, r, "www/api.swagger.json")
}
