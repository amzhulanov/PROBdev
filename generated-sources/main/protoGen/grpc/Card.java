// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payment.proto

package grpc;

/**
 * Protobuf type {@code Card}
 */
public final class Card extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Card)
    CardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Card.newBuilder() to construct.
  private Card(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Card() {
    number_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Card();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Card(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            number_ = s;
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
    return grpc.Payment.internal_static_Card_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.Payment.internal_static_Card_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.Card.class, grpc.Card.Builder.class);
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

  public static final int NUMBER_FIELD_NUMBER = 2;
  private volatile java.lang.Object number_;
  /**
   * <code>string number = 2;</code>
   * @return The number.
   */
  @java.lang.Override
  public java.lang.String getNumber() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      number_ = s;
      return s;
    }
  }
  /**
   * <code>string number = 2;</code>
   * @return The bytes for number.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNumberBytes() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      number_ = b;
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
    if (!getNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, number_);
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
    if (!getNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, number_);
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
    if (!(obj instanceof grpc.Card)) {
      return super.equals(obj);
    }
    grpc.Card other = (grpc.Card) obj;

    if (hasUserId() != other.hasUserId()) return false;
    if (hasUserId()) {
      if (!getUserId()
          .equals(other.getUserId())) return false;
    }
    if (!getNumber()
        .equals(other.getNumber())) return false;
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
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.Card parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.Card parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.Card parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.Card parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.Card parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.Card parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.Card parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.Card parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.Card parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.Card parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.Card parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.Card parseFrom(
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
  public static Builder newBuilder(grpc.Card prototype) {
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
   * Protobuf type {@code Card}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Card)
      grpc.CardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.Payment.internal_static_Card_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.Payment.internal_static_Card_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.Card.class, grpc.Card.Builder.class);
    }

    // Construct using grpc.Card.newBuilder()
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
      number_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.Payment.internal_static_Card_descriptor;
    }

    @java.lang.Override
    public grpc.Card getDefaultInstanceForType() {
      return grpc.Card.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.Card build() {
      grpc.Card result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.Card buildPartial() {
      grpc.Card result = new grpc.Card(this);
      if (userIdBuilder_ == null) {
        result.userId_ = userId_;
      } else {
        result.userId_ = userIdBuilder_.build();
      }
      result.number_ = number_;
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
      if (other instanceof grpc.Card) {
        return mergeFrom((grpc.Card)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.Card other) {
      if (other == grpc.Card.getDefaultInstance()) return this;
      if (other.hasUserId()) {
        mergeUserId(other.getUserId());
      }
      if (!other.getNumber().isEmpty()) {
        number_ = other.number_;
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
      grpc.Card parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.Card) e.getUnfinishedMessage();
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

    private java.lang.Object number_ = "";
    /**
     * <code>string number = 2;</code>
     * @return The number.
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        number_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string number = 2;</code>
     * @return The bytes for number.
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string number = 2;</code>
     * @param value The number to set.
     * @return This builder for chaining.
     */
    public Builder setNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumber() {
      
      number_ = getDefaultInstance().getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string number = 2;</code>
     * @param value The bytes for number to set.
     * @return This builder for chaining.
     */
    public Builder setNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      number_ = value;
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


    // @@protoc_insertion_point(builder_scope:Card)
  }

  // @@protoc_insertion_point(class_scope:Card)
  private static final grpc.Card DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.Card();
  }

  public static grpc.Card getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Card>
      PARSER = new com.google.protobuf.AbstractParser<Card>() {
    @java.lang.Override
    public Card parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Card(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Card> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Card> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.Card getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

