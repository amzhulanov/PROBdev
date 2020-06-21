package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.0)",
    comments = "Source: payment.proto")
public final class PaymentServiceGrpc {

  private PaymentServiceGrpc() {}

  public static final String SERVICE_NAME = "PaymentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.CashFlow,
      grpc.APIResponse> getPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "payment",
      requestType = grpc.CashFlow.class,
      responseType = grpc.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.CashFlow,
      grpc.APIResponse> getPaymentMethod() {
    io.grpc.MethodDescriptor<grpc.CashFlow, grpc.APIResponse> getPaymentMethod;
    if ((getPaymentMethod = PaymentServiceGrpc.getPaymentMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getPaymentMethod = PaymentServiceGrpc.getPaymentMethod) == null) {
          PaymentServiceGrpc.getPaymentMethod = getPaymentMethod =
              io.grpc.MethodDescriptor.<grpc.CashFlow, grpc.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "payment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.CashFlow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("payment"))
              .build();
        }
      }
    }
    return getPaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.CashFlow,
      grpc.Status> getEnrollMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enroll",
      requestType = grpc.CashFlow.class,
      responseType = grpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.CashFlow,
      grpc.Status> getEnrollMethod() {
    io.grpc.MethodDescriptor<grpc.CashFlow, grpc.Status> getEnrollMethod;
    if ((getEnrollMethod = PaymentServiceGrpc.getEnrollMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getEnrollMethod = PaymentServiceGrpc.getEnrollMethod) == null) {
          PaymentServiceGrpc.getEnrollMethod = getEnrollMethod =
              io.grpc.MethodDescriptor.<grpc.CashFlow, grpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "enroll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.CashFlow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("enroll"))
              .build();
        }
      }
    }
    return getEnrollMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.CashFlow,
      grpc.APIResponse> getRefundMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "refund",
      requestType = grpc.CashFlow.class,
      responseType = grpc.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.CashFlow,
      grpc.APIResponse> getRefundMethod() {
    io.grpc.MethodDescriptor<grpc.CashFlow, grpc.APIResponse> getRefundMethod;
    if ((getRefundMethod = PaymentServiceGrpc.getRefundMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getRefundMethod = PaymentServiceGrpc.getRefundMethod) == null) {
          PaymentServiceGrpc.getRefundMethod = getRefundMethod =
              io.grpc.MethodDescriptor.<grpc.CashFlow, grpc.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "refund"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.CashFlow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("refund"))
              .build();
        }
      }
    }
    return getRefundMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Card,
      grpc.APIResponse> getAddCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCard",
      requestType = grpc.Card.class,
      responseType = grpc.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Card,
      grpc.APIResponse> getAddCardMethod() {
    io.grpc.MethodDescriptor<grpc.Card, grpc.APIResponse> getAddCardMethod;
    if ((getAddCardMethod = PaymentServiceGrpc.getAddCardMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getAddCardMethod = PaymentServiceGrpc.getAddCardMethod) == null) {
          PaymentServiceGrpc.getAddCardMethod = getAddCardMethod =
              io.grpc.MethodDescriptor.<grpc.Card, grpc.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Card.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("addCard"))
              .build();
        }
      }
    }
    return getAddCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.UserId,
      grpc.WhoAreYouParams> getDelCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delCard",
      requestType = grpc.UserId.class,
      responseType = grpc.WhoAreYouParams.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.UserId,
      grpc.WhoAreYouParams> getDelCardMethod() {
    io.grpc.MethodDescriptor<grpc.UserId, grpc.WhoAreYouParams> getDelCardMethod;
    if ((getDelCardMethod = PaymentServiceGrpc.getDelCardMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getDelCardMethod = PaymentServiceGrpc.getDelCardMethod) == null) {
          PaymentServiceGrpc.getDelCardMethod = getDelCardMethod =
              io.grpc.MethodDescriptor.<grpc.UserId, grpc.WhoAreYouParams>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.WhoAreYouParams.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("delCard"))
              .build();
        }
      }
    }
    return getDelCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.UserId,
      grpc.ListOfOperation> getGetJournalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getJournal",
      requestType = grpc.UserId.class,
      responseType = grpc.ListOfOperation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.UserId,
      grpc.ListOfOperation> getGetJournalMethod() {
    io.grpc.MethodDescriptor<grpc.UserId, grpc.ListOfOperation> getGetJournalMethod;
    if ((getGetJournalMethod = PaymentServiceGrpc.getGetJournalMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getGetJournalMethod = PaymentServiceGrpc.getGetJournalMethod) == null) {
          PaymentServiceGrpc.getGetJournalMethod = getGetJournalMethod =
              io.grpc.MethodDescriptor.<grpc.UserId, grpc.ListOfOperation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getJournal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ListOfOperation.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("getJournal"))
              .build();
        }
      }
    }
    return getGetJournalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.UserId,
      grpc.Balance> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBalance",
      requestType = grpc.UserId.class,
      responseType = grpc.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.UserId,
      grpc.Balance> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<grpc.UserId, grpc.Balance> getGetBalanceMethod;
    if ((getGetBalanceMethod = PaymentServiceGrpc.getGetBalanceMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getGetBalanceMethod = PaymentServiceGrpc.getGetBalanceMethod) == null) {
          PaymentServiceGrpc.getGetBalanceMethod = getGetBalanceMethod =
              io.grpc.MethodDescriptor.<grpc.UserId, grpc.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("getBalance"))
              .build();
        }
      }
    }
    return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.TaskId,
      grpc.Task> getGetTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTask",
      requestType = grpc.TaskId.class,
      responseType = grpc.Task.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.TaskId,
      grpc.Task> getGetTaskMethod() {
    io.grpc.MethodDescriptor<grpc.TaskId, grpc.Task> getGetTaskMethod;
    if ((getGetTaskMethod = PaymentServiceGrpc.getGetTaskMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getGetTaskMethod = PaymentServiceGrpc.getGetTaskMethod) == null) {
          PaymentServiceGrpc.getGetTaskMethod = getGetTaskMethod =
              io.grpc.MethodDescriptor.<grpc.TaskId, grpc.Task>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.TaskId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Task.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("getTask"))
              .build();
        }
      }
    }
    return getGetTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub>() {
        @java.lang.Override
        public PaymentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceStub(channel, callOptions);
        }
      };
    return PaymentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub>() {
        @java.lang.Override
        public PaymentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceBlockingStub(channel, callOptions);
        }
      };
    return PaymentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub>() {
        @java.lang.Override
        public PaymentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceFutureStub(channel, callOptions);
        }
      };
    return PaymentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PaymentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void payment(grpc.CashFlow request,
        io.grpc.stub.StreamObserver<grpc.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPaymentMethod(), responseObserver);
    }

    /**
     */
    public void enroll(grpc.CashFlow request,
        io.grpc.stub.StreamObserver<grpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getEnrollMethod(), responseObserver);
    }

    /**
     */
    public void refund(grpc.CashFlow request,
        io.grpc.stub.StreamObserver<grpc.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRefundMethod(), responseObserver);
    }

    /**
     */
    public void addCard(grpc.Card request,
        io.grpc.stub.StreamObserver<grpc.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCardMethod(), responseObserver);
    }

    /**
     * <pre>
     *для удаления карты user можно получать из контекста
     * </pre>
     */
    public void delCard(grpc.UserId request,
        io.grpc.stub.StreamObserver<grpc.WhoAreYouParams> responseObserver) {
      asyncUnimplementedUnaryCall(getDelCardMethod(), responseObserver);
    }

    /**
     */
    public void getJournal(grpc.UserId request,
        io.grpc.stub.StreamObserver<grpc.ListOfOperation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetJournalMethod(), responseObserver);
    }

    /**
     */
    public void getBalance(grpc.UserId request,
        io.grpc.stub.StreamObserver<grpc.Balance> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     */
    public void getTask(grpc.TaskId request,
        io.grpc.stub.StreamObserver<grpc.Task> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.CashFlow,
                grpc.APIResponse>(
                  this, METHODID_PAYMENT)))
          .addMethod(
            getEnrollMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.CashFlow,
                grpc.Status>(
                  this, METHODID_ENROLL)))
          .addMethod(
            getRefundMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.CashFlow,
                grpc.APIResponse>(
                  this, METHODID_REFUND)))
          .addMethod(
            getAddCardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Card,
                grpc.APIResponse>(
                  this, METHODID_ADD_CARD)))
          .addMethod(
            getDelCardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.UserId,
                grpc.WhoAreYouParams>(
                  this, METHODID_DEL_CARD)))
          .addMethod(
            getGetJournalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.UserId,
                grpc.ListOfOperation>(
                  this, METHODID_GET_JOURNAL)))
          .addMethod(
            getGetBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.UserId,
                grpc.Balance>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            getGetTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.TaskId,
                grpc.Task>(
                  this, METHODID_GET_TASK)))
          .build();
    }
  }

  /**
   */
  public static final class PaymentServiceStub extends io.grpc.stub.AbstractAsyncStub<PaymentServiceStub> {
    private PaymentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceStub(channel, callOptions);
    }

    /**
     */
    public void payment(grpc.CashFlow request,
        io.grpc.stub.StreamObserver<grpc.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enroll(grpc.CashFlow request,
        io.grpc.stub.StreamObserver<grpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnrollMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void refund(grpc.CashFlow request,
        io.grpc.stub.StreamObserver<grpc.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRefundMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCard(grpc.Card request,
        io.grpc.stub.StreamObserver<grpc.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *для удаления карты user можно получать из контекста
     * </pre>
     */
    public void delCard(grpc.UserId request,
        io.grpc.stub.StreamObserver<grpc.WhoAreYouParams> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJournal(grpc.UserId request,
        io.grpc.stub.StreamObserver<grpc.ListOfOperation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetJournalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBalance(grpc.UserId request,
        io.grpc.stub.StreamObserver<grpc.Balance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTask(grpc.TaskId request,
        io.grpc.stub.StreamObserver<grpc.Task> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PaymentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PaymentServiceBlockingStub> {
    private PaymentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.APIResponse payment(grpc.CashFlow request) {
      return blockingUnaryCall(
          getChannel(), getPaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Status enroll(grpc.CashFlow request) {
      return blockingUnaryCall(
          getChannel(), getEnrollMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.APIResponse refund(grpc.CashFlow request) {
      return blockingUnaryCall(
          getChannel(), getRefundMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.APIResponse addCard(grpc.Card request) {
      return blockingUnaryCall(
          getChannel(), getAddCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *для удаления карты user можно получать из контекста
     * </pre>
     */
    public grpc.WhoAreYouParams delCard(grpc.UserId request) {
      return blockingUnaryCall(
          getChannel(), getDelCardMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.ListOfOperation getJournal(grpc.UserId request) {
      return blockingUnaryCall(
          getChannel(), getGetJournalMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Balance getBalance(grpc.UserId request) {
      return blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Task getTask(grpc.TaskId request) {
      return blockingUnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PaymentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PaymentServiceFutureStub> {
    private PaymentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.APIResponse> payment(
        grpc.CashFlow request) {
      return futureUnaryCall(
          getChannel().newCall(getPaymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Status> enroll(
        grpc.CashFlow request) {
      return futureUnaryCall(
          getChannel().newCall(getEnrollMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.APIResponse> refund(
        grpc.CashFlow request) {
      return futureUnaryCall(
          getChannel().newCall(getRefundMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.APIResponse> addCard(
        grpc.Card request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *для удаления карты user можно получать из контекста
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.WhoAreYouParams> delCard(
        grpc.UserId request) {
      return futureUnaryCall(
          getChannel().newCall(getDelCardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ListOfOperation> getJournal(
        grpc.UserId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetJournalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Balance> getBalance(
        grpc.UserId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Task> getTask(
        grpc.TaskId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PAYMENT = 0;
  private static final int METHODID_ENROLL = 1;
  private static final int METHODID_REFUND = 2;
  private static final int METHODID_ADD_CARD = 3;
  private static final int METHODID_DEL_CARD = 4;
  private static final int METHODID_GET_JOURNAL = 5;
  private static final int METHODID_GET_BALANCE = 6;
  private static final int METHODID_GET_TASK = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaymentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaymentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PAYMENT:
          serviceImpl.payment((grpc.CashFlow) request,
              (io.grpc.stub.StreamObserver<grpc.APIResponse>) responseObserver);
          break;
        case METHODID_ENROLL:
          serviceImpl.enroll((grpc.CashFlow) request,
              (io.grpc.stub.StreamObserver<grpc.Status>) responseObserver);
          break;
        case METHODID_REFUND:
          serviceImpl.refund((grpc.CashFlow) request,
              (io.grpc.stub.StreamObserver<grpc.APIResponse>) responseObserver);
          break;
        case METHODID_ADD_CARD:
          serviceImpl.addCard((grpc.Card) request,
              (io.grpc.stub.StreamObserver<grpc.APIResponse>) responseObserver);
          break;
        case METHODID_DEL_CARD:
          serviceImpl.delCard((grpc.UserId) request,
              (io.grpc.stub.StreamObserver<grpc.WhoAreYouParams>) responseObserver);
          break;
        case METHODID_GET_JOURNAL:
          serviceImpl.getJournal((grpc.UserId) request,
              (io.grpc.stub.StreamObserver<grpc.ListOfOperation>) responseObserver);
          break;
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((grpc.UserId) request,
              (io.grpc.stub.StreamObserver<grpc.Balance>) responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask((grpc.TaskId) request,
              (io.grpc.stub.StreamObserver<grpc.Task>) responseObserver);
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

  private static abstract class PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Payment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentService");
    }
  }

  private static final class PaymentServiceFileDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier {
    PaymentServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentServiceMethodDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaymentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentServiceFileDescriptorSupplier())
              .addMethod(getPaymentMethod())
              .addMethod(getEnrollMethod())
              .addMethod(getRefundMethod())
              .addMethod(getAddCardMethod())
              .addMethod(getDelCardMethod())
              .addMethod(getGetJournalMethod())
              .addMethod(getGetBalanceMethod())
              .addMethod(getGetTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
