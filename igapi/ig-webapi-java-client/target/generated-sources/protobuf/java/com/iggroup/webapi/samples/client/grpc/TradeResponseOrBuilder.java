// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: igapi.proto

package com.iggroup.webapi.samples.client.grpc;

public interface TradeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:demo_igapi.TradeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string transactionId = 1;</code>
   * @return The transactionId.
   */
  java.lang.String getTransactionId();
  /**
   * <code>string transactionId = 1;</code>
   * @return The bytes for transactionId.
   */
  com.google.protobuf.ByteString
      getTransactionIdBytes();

  /**
   * <code>int32 tradePrice = 2;</code>
   * @return The tradePrice.
   */
  int getTradePrice();
}
