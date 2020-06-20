// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payment.proto

package grpc;

/**
 * Protobuf type {@code Task}
 */
public final class Task extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Task)
    TaskOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Task.newBuilder() to construct.
  private Task(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Task() {
    update_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Task();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Task(
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
            if (userId_ != null) {
              subBuilder = userId_.toBuilder();
            }
            userId_ = input.readMessage(grpc.UUID.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userId_);
              userId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            type_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            update_ = s;
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
    return grpc.Payment.internal_static_Task_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.Payment.internal_static_Task_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.Task.class, grpc.Task.Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private grpc.UUID userId_;
  /**
   * <code>.UUID userId = 1;</code>
   * @return Whether the userId field is set.
   */
  @java.lang.Override
  public boolean hasUserId() {
    return userId_ != null;
  }
  /**
   * <code>.UUID userId = 1;</code>
   * @return The userId.
   */
  @java.lang.Override
  public grpc.UUID getUserId() {
    return userId_ == null ? grpc.UUID.getDefaultInstance() : userId_;
  }
  /**
   * <code>.UUID userId = 1;</code>
   */
  @java.lang.Override
  public grpc.UUIDOrBuilder getUserIdOrBuilder() {
    return getUserId();
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <code>int32 type = 2;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int UPDATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object update_;
  /**
   * <code>string update = 3;</code>
   * @return The update.
   */
  @java.lang.Override
  public java.lang.String getUpdate() {
    java.lang.Object ref = update_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      update_ = s;
      return s;
    }
  }
  /**
   * <code>string update = 3;</code>
   * @return The bytes for update.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUpdateBytes() {
    java.lang.Object ref = update_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      update_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (userId_ != null) {
      output.writeMessage(1, getUserId());
    }
    if (type_ != 0) {
      output.writeInt32(2, type_);
    }
    if (!getUpdateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, update_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUserId());
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, type_);
    }
    if (!getUpdateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, update_);
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
    if (!(obj instanceof grpc.Task)) {
      return super.equals(obj);
    }
    grpc.Task other = (grpc.Task) obj;

    if (hasUserId() != other.hasUserId()) return false;
    if (hasUserId()) {
      if (!getUserId()
          .equals(other.getUserId())) return false;
    }
    if (getType()
        != other.getType()) return false;
    if (!getUpdate()
        .equals(other.getUpdate())) return false;
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
    if (hasUserId()) {
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + UPDATE_FIELD_NUMBER;
    hash = (53 * hash) + getUpdate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.Task parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.Task parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.Task parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.Task parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.Task parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.Task parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.Task parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.Task parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.Task parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.Task parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.Task parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.Task parseFrom(
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
  public static Builder newBuilder(grpc.Task prototype) {
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
   * Protobuf type {@code Task}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Task)
      grpc.TaskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.Payment.internal_static_Task_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.Payment.internal_static_Task_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.Task.class, grpc.Task.Builder.class);
    }

    // Construct using grpc.Task.newBuilder()
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
      if (userIdBuilder_ == null) {
        userId_ = null;
      } else {
        userId_ = null;
        userIdBuilder_ = null;
      }
      type_ = 0;

      update_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.Payment.internal_static_Task_descriptor;
    }

    @java.lang.Override
    public grpc.Task getDefaultInstanceForType() {
      return grpc.Task.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.Task build() {
      grpc.Task result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.Task buildPartial() {
      grpc.Task result = new grpc.Task(this);
      if (userIdBuilder_ == null) {
        result.userId_ = userId_;
      } else {
        result.userId_ = userIdBuilder_.build();
      }
      result.type_ = type_;
      result.update_ = update_;
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
      if (other instanceof grpc.Task) {
        return mergeFrom((grpc.Task)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.Task other) {
      if (other == grpc.Task.getDefaultInstance()) return this;
      if (other.hasUserId()) {
        mergeUserId(other.getUserId());
      }
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (!other.getUpdate().isEmpty()) {
        update_ = other.update_;
        onChanged();
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
      grpc.Task parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.Task) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private grpc.UUID userId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.UUID, grpc.UUID.Builder, grpc.UUIDOrBuilder> userIdBuilder_;
    /**
     * <code>.UUID userId = 1;</code>
     * @return Whether the userId field is set.
     */
    public boolean hasUserId() {
      return userIdBuilder_ != null || userId_ != null;
    }
    /**
     * <code>.UUID userId = 1;</code>
     * @return The userId.
     */
    public grpc.UUID getUserId() {
      if (userIdBuilder_ == null) {
        return userId_ == null ? grpc.UUID.getDefaultInstance() : userId_;
      } else {
        return userIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.UUID userId = 1;</code>
     */
    public Builder setUserId(grpc.UUID value) {
      if (userIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userId_ = value;
        onChanged();
      } else {
        userIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.UUID userId = 1;</code>
     */
    public Builder setUserId(
        grpc.UUID.Builder builderForValue) {
      if (userIdBuilder_ == null) {
        userId_ = builderForValue.build();
        onChanged();
      } else {
        userIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.UUID userId = 1;</code>
     */
    public Builder mergeUserId(grpc.UUID value) {
      if (userIdBuilder_ == null) {
        if (userId_ != null) {
          userId_ =
            grpc.UUID.newBuilder(userId_).mergeFrom(value).buildPartial();
        } else {
          userId_ = value;
        }
        onChanged();
      } else {
        userIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.UUID userId = 1;</code>
     */
    public Builder clearUserId() {
      if (userIdBuilder_ == null) {
        userId_ = null;
        onChanged();
      } else {
        userId_ = null;
        userIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.UUID userId = 1;</code>
     */
    public grpc.UUID.Builder getUserIdBuilder() {
      
      onChanged();
      return getUserIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.UUID userId = 1;</code>
     */
    public grpc.UUIDOrBuilder getUserIdOrBuilder() {
      if (userIdBuilder_ != null) {
        return userIdBuilder_.getMessageOrBuilder();
      } else {
        return userId_ == null ?
            grpc.UUID.getDefaultInstance() : userId_;
      }
    }
    /**
     * <code>.UUID userId = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.UUID, grpc.UUID.Builder, grpc.UUIDOrBuilder> 
        getUserIdFieldBuilder() {
      if (userIdBuilder_ == null) {
        userIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            grpc.UUID, grpc.UUID.Builder, grpc.UUIDOrBuilder>(
                getUserId(),
                getParentForChildren(),
                isClean());
        userId_ = null;
      }
      return userIdBuilder_;
    }

    private int type_ ;
    /**
     * <code>int32 type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <code>int32 type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object update_ = "";
    /**
     * <code>string update = 3;</code>
     * @return The update.
     */
    public java.lang.String getUpdate() {
      java.lang.Object ref = update_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        update_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string update = 3;</code>
     * @return The bytes for update.
     */
    public com.google.protobuf.ByteString
        getUpdateBytes() {
      java.lang.Object ref = update_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        update_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string update = 3;</code>
     * @param value The update to set.
     * @return This builder for chaining.
     */
    public Builder setUpdate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      update_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string update = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdate() {
      
      update_ = getDefaultInstance().getUpdate();
      onChanged();
      return this;
    }
    /**
     * <code>string update = 3;</code>
     * @param value The bytes for update to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      update_ = value;
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


    // @@protoc_insertion_point(builder_scope:Task)
  }

  // @@protoc_insertion_point(class_scope:Task)
  private static final grpc.Task DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.Task();
  }

  public static grpc.Task getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Task>
      PARSER = new com.google.protobuf.AbstractParser<Task>() {
    @java.lang.Override
    public Task parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Task(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Task> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Task> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.Task getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

