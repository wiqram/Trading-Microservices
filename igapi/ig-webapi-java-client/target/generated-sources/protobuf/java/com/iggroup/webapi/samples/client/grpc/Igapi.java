// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: igapi.proto

package com.iggroup.webapi.samples.client.grpc;

public final class Igapi {
  private Igapi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_demo_igapi_OpenTradeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_demo_igapi_OpenTradeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_demo_igapi_TradeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_demo_igapi_TradeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013igapi.proto\022\ndemo_igapi\">\n\020OpenTradeRe" +
      "quest\022\017\n\007user_id\030\001 \001(\t\022\014\n\004epic\030\002 \001(\t\022\013\n\003" +
      "buy\030\003 \001(\010\":\n\rTradeResponse\022\025\n\rtransactio" +
      "nId\030\001 \001(\t\022\022\n\ntradePrice\030\002 \001(\0052O\n\005IgSvc\022F" +
      "\n\013tradeAction\022\034.demo_igapi.OpenTradeRequ" +
      "est\032\031.demo_igapi.TradeResponseBj\n&com.ig" +
      "group.webapi.samples.client.grpcB\005IgapiP" +
      "\001Z7github.com/wiqram/IG-Trading-Microser" +
      "vices/protos/igapib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_demo_igapi_OpenTradeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_demo_igapi_OpenTradeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_demo_igapi_OpenTradeRequest_descriptor,
        new java.lang.String[] { "UserId", "Epic", "Buy", });
    internal_static_demo_igapi_TradeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_demo_igapi_TradeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_demo_igapi_TradeResponse_descriptor,
        new java.lang.String[] { "TransactionId", "TradePrice", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}