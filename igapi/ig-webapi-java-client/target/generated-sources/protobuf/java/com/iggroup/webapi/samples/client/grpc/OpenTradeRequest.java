// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: igapi.proto

package com.iggroup.webapi.samples.client.grpc;

/**
 * <pre>
 *The request containing any user identifier, the instrument to deal on and direction of trade, buy long or sell short
 * </pre>
 *
 * Protobuf type {@code demo_igapi.OpenTradeRequest}
 */
public final class OpenTradeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:demo_igapi.OpenTradeRequest)
    OpenTradeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpenTradeRequest.newBuilder() to construct.
  private OpenTradeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpenTradeRequest() {
    userId_ = "";
    epic_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpenTradeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OpenTradeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            epic_ = s;
            break;
          }
          case 24: {

            buy_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.iggroup.webapi.samples.client.grpc.Igapi.internal_static_demo_igapi_OpenTradeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.iggroup.webapi.samples.client.grpc.Igapi.internal_static_demo_igapi_OpenTradeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.iggroup.webapi.samples.client.grpc.OpenTradeRequest.class, com.iggroup.webapi.samples.client.grpc.OpenTradeRequest.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <code>string user_id = 1;</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 1;</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EPIC_FIELD_NUMBER = 2;
  private volatile java.lang.Object epic_;
  /**
   * <code>string epic = 2;</code>
   * @return The epic.
   */
  @java.lang.Override
  public java.lang.String getEpic() {
    java.lang.Object ref = epic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      epic_ = s;
      return s;
    }
  }
  /**
   * <code>string epic = 2;</code>
   * @return The bytes for epic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEpicBytes() {
    java.lang.Object ref = epic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      epic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUY_FIELD_NUMBER = 3;
  private boolean buy_;
  /**
   * <code>bool buy = 3;</code>
   * @return The buy.
   */
  @java.lang.Override
  public boolean getBuy() {
    return buy_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (!getEpicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, epic_);
    }
    if (buy_ != false) {
      output.writeBool(3, buy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (!getEpicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, epic_);
    }
    if (buy_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, buy_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.iggroup.webapi.samples.client.grpc.OpenTradeRequest)) {
      return super.equals(obj);
    }
    com.iggroup.webapi.samples.client.grpc.OpenTradeRequest other = (com.iggroup.webapi.samples.client.grpc.OpenTradeRequest) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getEpic()
        .equals(other.getEpic())) return false;
    if (getBuy()
        != other.getBuy()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + EPIC_FIELD_NUMBER;
    hash = (53 * hash) + getEpic().hashCode();
    hash = (37 * hash) + BUY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBuy());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.iggroup.webapi.samples.client.grpc.OpenTradeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *The request containing any user identifier, the instrument to deal on and direction of trade, buy long or sell short
   * </pre>
   *
   * Protobuf type {@code demo_igapi.OpenTradeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:demo_igapi.OpenTradeRequest)
      com.iggroup.webapi.samples.client.grpc.OpenTradeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.iggroup.webapi.samples.client.grpc.Igapi.internal_static_demo_igapi_OpenTradeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.iggroup.webapi.samples.client.grpc.Igapi.internal_static_demo_igapi_OpenTradeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.iggroup.webapi.samples.client.grpc.OpenTradeRequest.class, com.iggroup.webapi.samples.client.grpc.OpenTradeRequest.Builder.class);
    }

    // Construct using com.iggroup.webapi.samples.client.grpc.OpenTradeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userId_ = "";

      epic_ = "";

      buy_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.iggroup.webapi.samples.client.grpc.Igapi.internal_static_demo_igapi_OpenTradeRequest_descriptor;
    }

    @java.lang.Override
    public com.iggroup.webapi.samples.client.grpc.OpenTradeRequest getDefaultInstanceForType() {
      return com.iggroup.webapi.samples.client.grpc.OpenTradeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.iggroup.webapi.samples.client.grpc.OpenTradeRequest build() {
      com.iggroup.webapi.samples.client.grpc.OpenTradeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.iggroup.webapi.samples.client.grpc.OpenTradeRequest buildPartial() {
      com.iggroup.webapi.samples.client.grpc.OpenTradeRequest result = new com.iggroup.webapi.samples.client.grpc.OpenTradeRequest(this);
      result.userId_ = userId_;
      result.epic_ = epic_;
      result.buy_ = buy_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.iggroup.webapi.samples.client.grpc.OpenTradeRequest) {
        return mergeFrom((com.iggroup.webapi.samples.client.grpc.OpenTradeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.iggroup.webapi.samples.client.grpc.OpenTradeRequest other) {
      if (other == com.iggroup.webapi.samples.client.grpc.OpenTradeRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (!other.getEpic().isEmpty()) {
        epic_ = other.epic_;
        onChanged();
      }
      if (other.getBuy() != false) {
        setBuy(other.getBuy());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.iggroup.webapi.samples.client.grpc.OpenTradeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.iggroup.webapi.samples.client.grpc.OpenTradeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 1;</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object epic_ = "";
    /**
     * <code>string epic = 2;</code>
     * @return The epic.
     */
    public java.lang.String getEpic() {
      java.lang.Object ref = epic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        epic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string epic = 2;</code>
     * @return The bytes for epic.
     */
    public com.google.protobuf.ByteString
        getEpicBytes() {
      java.lang.Object ref = epic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        epic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string epic = 2;</code>
     * @param value The epic to set.
     * @return This builder for chaining.
     */
    public Builder setEpic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      epic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string epic = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEpic() {
      
      epic_ = getDefaultInstance().getEpic();
      onChanged();
      return this;
    }
    /**
     * <code>string epic = 2;</code>
     * @param value The bytes for epic to set.
     * @return This builder for chaining.
     */
    public Builder setEpicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      epic_ = value;
      onChanged();
      return this;
    }

    private boolean buy_ ;
    /**
     * <code>bool buy = 3;</code>
     * @return The buy.
     */
    @java.lang.Override
    public boolean getBuy() {
      return buy_;
    }
    /**
     * <code>bool buy = 3;</code>
     * @param value The buy to set.
     * @return This builder for chaining.
     */
    public Builder setBuy(boolean value) {
      
      buy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool buy = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuy() {
      
      buy_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:demo_igapi.OpenTradeRequest)
  }

  // @@protoc_insertion_point(class_scope:demo_igapi.OpenTradeRequest)
  private static final com.iggroup.webapi.samples.client.grpc.OpenTradeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.iggroup.webapi.samples.client.grpc.OpenTradeRequest();
  }

  public static com.iggroup.webapi.samples.client.grpc.OpenTradeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpenTradeRequest>
      PARSER = new com.google.protobuf.AbstractParser<OpenTradeRequest>() {
    @java.lang.Override
    public OpenTradeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OpenTradeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OpenTradeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenTradeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.iggroup.webapi.samples.client.grpc.OpenTradeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

