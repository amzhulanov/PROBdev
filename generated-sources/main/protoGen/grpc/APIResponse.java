// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payment.proto

package grpc;

/**
 * Protobuf type {@code APIResponse}
 */
public final class APIResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:APIResponse)
    APIResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use APIResponse.newBuilder() to construct.
  private APIResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private APIResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new APIResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private APIResponse(
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
            grpc.UUID.Builder subBuilder = null;
            if (idTask_ != null) {
              subBuilder = idTask_.toBuilder();
            }
            idTask_ = input.readMessage(grpc.UUID.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(idTask_);
              idTask_ = subBuilder.buildPartial();
            }

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
    return grpc.Payment.internal_static_APIResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.Payment.internal_static_APIResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.APIResponse.class, grpc.APIResponse.Builder.class);
  }

  public static final int IDTASK_FIELD_NUMBER = 1;
  private grpc.UUID idTask_;
  /**
   * <code>.UUID idTask = 1;</code>
   * @return Whether the idTask field is set.
   */
  @java.lang.Override
  public boolean hasIdTask() {
    return idTask_ != null;
  }
  /**
   * <code>.UUID idTask = 1;</code>
   * @return The idTask.
   */
  @java.lang.Override
  public grpc.UUID getIdTask() {
    return idTask_ == null ? grpc.UUID.getDefaultInstance() : idTask_;
  }
  /**
   * <code>.UUID idTask = 1;</code>
   */
  @java.lang.Override
  public grpc.UUIDOrBuilder getIdTaskOrBuilder() {
    return getIdTask();
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
    if (idTask_ != null) {
      output.writeMessage(1, getIdTask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idTask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIdTask());
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
    if (!(obj instanceof grpc.APIResponse)) {
      return super.equals(obj);
    }
    grpc.APIResponse other = (grpc.APIResponse) obj;

    if (hasIdTask() != other.hasIdTask()) return false;
    if (hasIdTask()) {
      if (!getIdTask()
          .equals(other.getIdTask())) return false;
    }
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
    if (hasIdTask()) {
      hash = (37 * hash) + IDTASK_FIELD_NUMBER;
      hash = (53 * hash) + getIdTask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.APIResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.APIResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.APIResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.APIResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.APIResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.APIResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.APIResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.APIResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.APIResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.APIResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.APIResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.APIResponse parseFrom(
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
  public static Builder newBuilder(grpc.APIResponse prototype) {
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
   * Protobuf type {@code APIResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:APIResponse)
      grpc.APIResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.Payment.internal_static_APIResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.Payment.internal_static_APIResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.APIResponse.class, grpc.APIResponse.Builder.class);
    }

    // Construct using grpc.APIResponse.newBuilder()
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
      if (idTaskBuilder_ == null) {
        idTask_ = null;
      } else {
        idTask_ = null;
        idTaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.Payment.internal_static_APIResponse_descriptor;
    }

    @java.lang.Override
    public grpc.APIResponse getDefaultInstanceForType() {
      return grpc.APIResponse.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.APIResponse build() {
      grpc.APIResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.APIResponse buildPartial() {
      grpc.APIResponse result = new grpc.APIResponse(this);
      if (idTaskBuilder_ == null) {
        result.idTask_ = idTask_;
      } else {
        result.idTask_ = idTaskBuilder_.build();
      }
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
      if (other instanceof grpc.APIResponse) {
        return mergeFrom((grpc.APIResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.APIResponse other) {
      if (other == grpc.APIResponse.getDefaultInstance()) return this;
      if (other.hasIdTask()) {
        mergeIdTask(other.getIdTask());
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
      grpc.APIResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.APIResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private grpc.UUID idTask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.UUID, grpc.UUID.Builder, grpc.UUIDOrBuilder> idTaskBuilder_;
    /**
     * <code>.UUID idTask = 1;</code>
     * @return Whether the idTask field is set.
     */
    public boolean hasIdTask() {
      return idTaskBuilder_ != null || idTask_ != null;
    }
    /**
     * <code>.UUID idTask = 1;</code>
     * @return The idTask.
     */
    public grpc.UUID getIdTask() {
      if (idTaskBuilder_ == null) {
        return idTask_ == null ? grpc.UUID.getDefaultInstance() : idTask_;
      } else {
        return idTaskBuilder_.getMessage();
      }
    }
    /**
     * <code>.UUID idTask = 1;</code>
     */
    public Builder setIdTask(grpc.UUID value) {
      if (idTaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        idTask_ = value;
        onChanged();
      } else {
        idTaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.UUID idTask = 1;</code>
     */
    public Builder setIdTask(
        grpc.UUID.Builder builderForValue) {
      if (idTaskBuilder_ == null) {
        idTask_ = builderForValue.build();
        onChanged();
      } else {
        idTaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.UUID idTask = 1;</code>
     */
    public Builder mergeIdTask(grpc.UUID value) {
      if (idTaskBuilder_ == null) {
        if (idTask_ != null) {
          idTask_ =
            grpc.UUID.newBuilder(idTask_).mergeFrom(value).buildPartial();
        } else {
          idTask_ = value;
        }
        onChanged();
      } else {
        idTaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.UUID idTask = 1;</code>
     */
    public Builder clearIdTask() {
      if (idTaskBuilder_ == null) {
        idTask_ = null;
        onChanged();
      } else {
        idTask_ = null;
        idTaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.UUID idTask = 1;</code>
     */
    public grpc.UUID.Builder getIdTaskBuilder() {
      
      onChanged();
      return getIdTaskFieldBuilder().getBuilder();
    }
    /**
     * <code>.UUID idTask = 1;</code>
     */
    public grpc.UUIDOrBuilder getIdTaskOrBuilder() {
      if (idTaskBuilder_ != null) {
        return idTaskBuilder_.getMessageOrBuilder();
      } else {
        return idTask_ == null ?
            grpc.UUID.getDefaultInstance() : idTask_;
      }
    }
    /**
     * <code>.UUID idTask = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.UUID, grpc.UUID.Builder, grpc.UUIDOrBuilder> 
        getIdTaskFieldBuilder() {
      if (idTaskBuilder_ == null) {
        idTaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            grpc.UUID, grpc.UUID.Builder, grpc.UUIDOrBuilder>(
                getIdTask(),
                getParentForChildren(),
                isClean());
        idTask_ = null;
      }
      return idTaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:APIResponse)
  }

  // @@protoc_insertion_point(class_scope:APIResponse)
  private static final grpc.APIResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.APIResponse();
  }

  public static grpc.APIResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<APIResponse>
      PARSER = new com.google.protobuf.AbstractParser<APIResponse>() {
    @java.lang.Override
    public APIResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new APIResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<APIResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<APIResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.APIResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

