// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: payment.proto

package grpc;

/**
 * Protobuf type {@code ListOfOperation}
 */
public final class ListOfOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ListOfOperation)
    ListOfOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListOfOperation.newBuilder() to construct.
  private ListOfOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOfOperation() {
    operation_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListOfOperation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListOfOperation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              operation_ = new java.util.ArrayList<grpc.Operation>();
              mutable_bitField0_ |= 0x00000001;
            }
            operation_.add(
                input.readMessage(grpc.Operation.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        operation_ = java.util.Collections.unmodifiableList(operation_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.Payment.internal_static_ListOfOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.Payment.internal_static_ListOfOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.ListOfOperation.class, grpc.ListOfOperation.Builder.class);
  }

  public static final int OPERATION_FIELD_NUMBER = 1;
  private java.util.List<grpc.Operation> operation_;
  /**
   * <code>repeated .Operation operation = 1;</code>
   */
  @java.lang.Override
  public java.util.List<grpc.Operation> getOperationList() {
    return operation_;
  }
  /**
   * <code>repeated .Operation operation = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends grpc.OperationOrBuilder> 
      getOperationOrBuilderList() {
    return operation_;
  }
  /**
   * <code>repeated .Operation operation = 1;</code>
   */
  @java.lang.Override
  public int getOperationCount() {
    return operation_.size();
  }
  /**
   * <code>repeated .Operation operation = 1;</code>
   */
  @java.lang.Override
  public grpc.Operation getOperation(int index) {
    return operation_.get(index);
  }
  /**
   * <code>repeated .Operation operation = 1;</code>
   */
  @java.lang.Override
  public grpc.OperationOrBuilder getOperationOrBuilder(
      int index) {
    return operation_.get(index);
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
    for (int i = 0; i < operation_.size(); i++) {
      output.writeMessage(1, operation_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < operation_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, operation_.get(i));
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
    if (!(obj instanceof grpc.ListOfOperation)) {
      return super.equals(obj);
    }
    grpc.ListOfOperation other = (grpc.ListOfOperation) obj;

    if (!getOperationList()
        .equals(other.getOperationList())) return false;
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
    if (getOperationCount() > 0) {
      hash = (37 * hash) + OPERATION_FIELD_NUMBER;
      hash = (53 * hash) + getOperationList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.ListOfOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.ListOfOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.ListOfOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.ListOfOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.ListOfOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.ListOfOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.ListOfOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.ListOfOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.ListOfOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.ListOfOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.ListOfOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.ListOfOperation parseFrom(
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
  public static Builder newBuilder(grpc.ListOfOperation prototype) {
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
   * Protobuf type {@code ListOfOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ListOfOperation)
      grpc.ListOfOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.Payment.internal_static_ListOfOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.Payment.internal_static_ListOfOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.ListOfOperation.class, grpc.ListOfOperation.Builder.class);
    }

    // Construct using grpc.ListOfOperation.newBuilder()
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
        getOperationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (operationBuilder_ == null) {
        operation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        operationBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.Payment.internal_static_ListOfOperation_descriptor;
    }

    @java.lang.Override
    public grpc.ListOfOperation getDefaultInstanceForType() {
      return grpc.ListOfOperation.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.ListOfOperation build() {
      grpc.ListOfOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.ListOfOperation buildPartial() {
      grpc.ListOfOperation result = new grpc.ListOfOperation(this);
      int from_bitField0_ = bitField0_;
      if (operationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          operation_ = java.util.Collections.unmodifiableList(operation_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.operation_ = operation_;
      } else {
        result.operation_ = operationBuilder_.build();
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
      if (other instanceof grpc.ListOfOperation) {
        return mergeFrom((grpc.ListOfOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.ListOfOperation other) {
      if (other == grpc.ListOfOperation.getDefaultInstance()) return this;
      if (operationBuilder_ == null) {
        if (!other.operation_.isEmpty()) {
          if (operation_.isEmpty()) {
            operation_ = other.operation_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOperationIsMutable();
            operation_.addAll(other.operation_);
          }
          onChanged();
        }
      } else {
        if (!other.operation_.isEmpty()) {
          if (operationBuilder_.isEmpty()) {
            operationBuilder_.dispose();
            operationBuilder_ = null;
            operation_ = other.operation_;
            bitField0_ = (bitField0_ & ~0x00000001);
            operationBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOperationFieldBuilder() : null;
          } else {
            operationBuilder_.addAllMessages(other.operation_);
          }
        }
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
      grpc.ListOfOperation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.ListOfOperation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<grpc.Operation> operation_ =
      java.util.Collections.emptyList();
    private void ensureOperationIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        operation_ = new java.util.ArrayList<grpc.Operation>(operation_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        grpc.Operation, grpc.Operation.Builder, grpc.OperationOrBuilder> operationBuilder_;

    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public java.util.List<grpc.Operation> getOperationList() {
      if (operationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(operation_);
      } else {
        return operationBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public int getOperationCount() {
      if (operationBuilder_ == null) {
        return operation_.size();
      } else {
        return operationBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public grpc.Operation getOperation(int index) {
      if (operationBuilder_ == null) {
        return operation_.get(index);
      } else {
        return operationBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public Builder setOperation(
        int index, grpc.Operation value) {
      if (operationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationIsMutable();
        operation_.set(index, value);
        onChanged();
      } else {
        operationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public Builder setOperation(
        int index, grpc.Operation.Builder builderForValue) {
      if (operationBuilder_ == null) {
        ensureOperationIsMutable();
        operation_.set(index, builderForValue.build());
        onChanged();
      } else {
        operationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public Builder addOperation(grpc.Operation value) {
      if (operationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationIsMutable();
        operation_.add(value);
        onChanged();
      } else {
        operationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public Builder addOperation(
        int index, grpc.Operation value) {
      if (operationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationIsMutable();
        operation_.add(index, value);
        onChanged();
      } else {
        operationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public Builder addOperation(
        grpc.Operation.Builder builderForValue) {
      if (operationBuilder_ == null) {
        ensureOperationIsMutable();
        operation_.add(builderForValue.build());
        onChanged();
      } else {
        operationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public Builder addOperation(
        int index, grpc.Operation.Builder builderForValue) {
      if (operationBuilder_ == null) {
        ensureOperationIsMutable();
        operation_.add(index, builderForValue.build());
        onChanged();
      } else {
        operationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public Builder addAllOperation(
        java.lang.Iterable<? extends grpc.Operation> values) {
      if (operationBuilder_ == null) {
        ensureOperationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, operation_);
        onChanged();
      } else {
        operationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public Builder clearOperation() {
      if (operationBuilder_ == null) {
        operation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        operationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public Builder removeOperation(int index) {
      if (operationBuilder_ == null) {
        ensureOperationIsMutable();
        operation_.remove(index);
        onChanged();
      } else {
        operationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public grpc.Operation.Builder getOperationBuilder(
        int index) {
      return getOperationFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public grpc.OperationOrBuilder getOperationOrBuilder(
        int index) {
      if (operationBuilder_ == null) {
        return operation_.get(index);  } else {
        return operationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public java.util.List<? extends grpc.OperationOrBuilder> 
         getOperationOrBuilderList() {
      if (operationBuilder_ != null) {
        return operationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(operation_);
      }
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public grpc.Operation.Builder addOperationBuilder() {
      return getOperationFieldBuilder().addBuilder(
          grpc.Operation.getDefaultInstance());
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public grpc.Operation.Builder addOperationBuilder(
        int index) {
      return getOperationFieldBuilder().addBuilder(
          index, grpc.Operation.getDefaultInstance());
    }
    /**
     * <code>repeated .Operation operation = 1;</code>
     */
    public java.util.List<grpc.Operation.Builder> 
         getOperationBuilderList() {
      return getOperationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        grpc.Operation, grpc.Operation.Builder, grpc.OperationOrBuilder> 
        getOperationFieldBuilder() {
      if (operationBuilder_ == null) {
        operationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            grpc.Operation, grpc.Operation.Builder, grpc.OperationOrBuilder>(
                operation_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        operation_ = null;
      }
      return operationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ListOfOperation)
  }

  // @@protoc_insertion_point(class_scope:ListOfOperation)
  private static final grpc.ListOfOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.ListOfOperation();
  }

  public static grpc.ListOfOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOfOperation>
      PARSER = new com.google.protobuf.AbstractParser<ListOfOperation>() {
    @java.lang.Override
    public ListOfOperation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListOfOperation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListOfOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOfOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.ListOfOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

