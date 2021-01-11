package com.iggroup.webapi.samples.client.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: igapi.proto")
public final class IgSvcGrpc {

  private IgSvcGrpc() {}

  public static final String SERVICE_NAME = "demo_igapi.IgSvc";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.iggroup.webapi.samples.client.grpc.OpenTradeRequest,
      com.iggroup.webapi.samples.client.grpc.TradeResponse> METHOD_TRADE_ACTION =
      io.grpc.MethodDescriptor.<com.iggroup.webapi.samples.client.grpc.OpenTradeRequest, com.iggroup.webapi.samples.client.grpc.TradeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "demo_igapi.IgSvc", "tradeAction"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.iggroup.webapi.samples.client.grpc.OpenTradeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.iggroup.webapi.samples.client.grpc.TradeResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IgSvcStub newStub(io.grpc.Channel channel) {
    return new IgSvcStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IgSvcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IgSvcBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IgSvcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IgSvcFutureStub(channel);
  }

  /**
   */
  public static abstract class IgSvcImplBase implements io.grpc.BindableService {

    /**
     */
    public void tradeAction(com.iggroup.webapi.samples.client.grpc.OpenTradeRequest request,
        io.grpc.stub.StreamObserver<com.iggroup.webapi.samples.client.grpc.TradeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TRADE_ACTION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_TRADE_ACTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.iggroup.webapi.samples.client.grpc.OpenTradeRequest,
                com.iggroup.webapi.samples.client.grpc.TradeResponse>(
                  this, METHODID_TRADE_ACTION)))
          .build();
    }
  }

  /**
   */
  public static final class IgSvcStub extends io.grpc.stub.AbstractStub<IgSvcStub> {
    private IgSvcStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IgSvcStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IgSvcStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IgSvcStub(channel, callOptions);
    }

    /**
     */
    public void tradeAction(com.iggroup.webapi.samples.client.grpc.OpenTradeRequest request,
        io.grpc.stub.StreamObserver<com.iggroup.webapi.samples.client.grpc.TradeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TRADE_ACTION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IgSvcBlockingStub extends io.grpc.stub.AbstractStub<IgSvcBlockingStub> {
    private IgSvcBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IgSvcBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IgSvcBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IgSvcBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.iggroup.webapi.samples.client.grpc.TradeResponse tradeAction(com.iggroup.webapi.samples.client.grpc.OpenTradeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TRADE_ACTION, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IgSvcFutureStub extends io.grpc.stub.AbstractStub<IgSvcFutureStub> {
    private IgSvcFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IgSvcFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IgSvcFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IgSvcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.iggroup.webapi.samples.client.grpc.TradeResponse> tradeAction(
        com.iggroup.webapi.samples.client.grpc.OpenTradeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TRADE_ACTION, getCallOptions()), request);
    }
  }

  private static final int METHODID_TRADE_ACTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IgSvcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IgSvcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRADE_ACTION:
          serviceImpl.tradeAction((com.iggroup.webapi.samples.client.grpc.OpenTradeRequest) request,
              (io.grpc.stub.StreamObserver<com.iggroup.webapi.samples.client.grpc.TradeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class IgSvcDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.iggroup.webapi.samples.client.grpc.Igapi.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (IgSvcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IgSvcDescriptorSupplier())
              .addMethod(METHOD_TRADE_ACTION)
              .build();
        }
      }
    }
    return result;
  }
}
