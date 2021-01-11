package com.iggroup.webapi.samples.client.grpc;

import io.grpc.stub.StreamObserver;
//import com.iggroup.webapi.samples.client.grpc.Igapi;

public class IGAPIServiceImpl extends IgSvcGrpc.IgSvcImplBase {
    @Override
    public void tradeAction(OpenTradeRequest request,
                         StreamObserver<TradeResponse> responseObserver) {
        // HelloRequest has toString auto-generated.
        System.out.println(request);

        // You must use a builder to construct a new Protobuffer object
        TradeResponse response = TradeResponse.newBuilder()
                .setTransactionId("1234")
                .build();

        // Use responseObserver to send a single response back
        responseObserver.onNext(response);

        // When you are done, you must call onCompleted.
        responseObserver.onCompleted();
    }
}