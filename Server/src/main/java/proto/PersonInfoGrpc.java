package proto;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: person.proto")
public final class PersonInfoGrpc {

  private PersonInfoGrpc() {}

  public static final String SERVICE_NAME = "PersonInfo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.Person.PersonRequest,
      proto.Person.InfoReply> getGetPersonInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPersonInfo",
      requestType = proto.Person.PersonRequest.class,
      responseType = proto.Person.InfoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.Person.PersonRequest,
      proto.Person.InfoReply> getGetPersonInfoMethod() {
    io.grpc.MethodDescriptor<proto.Person.PersonRequest, proto.Person.InfoReply> getGetPersonInfoMethod;
    if ((getGetPersonInfoMethod = PersonInfoGrpc.getGetPersonInfoMethod) == null) {
      synchronized (PersonInfoGrpc.class) {
        if ((getGetPersonInfoMethod = PersonInfoGrpc.getGetPersonInfoMethod) == null) {
          PersonInfoGrpc.getGetPersonInfoMethod = getGetPersonInfoMethod = 
              io.grpc.MethodDescriptor.<proto.Person.PersonRequest, proto.Person.InfoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonInfo", "GetPersonInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Person.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Person.InfoReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonInfoMethodDescriptorSupplier("GetPersonInfo"))
                  .build();
          }
        }
     }
     return getGetPersonInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonInfoStub newStub(io.grpc.Channel channel) {
    return new PersonInfoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonInfoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonInfoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonInfoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonInfoFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonInfoImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPersonInfo(proto.Person.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.Person.InfoReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPersonInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPersonInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.Person.PersonRequest,
                proto.Person.InfoReply>(
                  this, METHODID_GET_PERSON_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class PersonInfoStub extends io.grpc.stub.AbstractStub<PersonInfoStub> {
    private PersonInfoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonInfoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonInfoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonInfoStub(channel, callOptions);
    }

    /**
     */
    public void getPersonInfo(proto.Person.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.Person.InfoReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPersonInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonInfoBlockingStub extends io.grpc.stub.AbstractStub<PersonInfoBlockingStub> {
    private PersonInfoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonInfoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonInfoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonInfoBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.Person.InfoReply getPersonInfo(proto.Person.PersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPersonInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonInfoFutureStub extends io.grpc.stub.AbstractStub<PersonInfoFutureStub> {
    private PersonInfoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonInfoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonInfoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonInfoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Person.InfoReply> getPersonInfo(
        proto.Person.PersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPersonInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PERSON_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonInfoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonInfoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PERSON_INFO:
          serviceImpl.getPersonInfo((proto.Person.PersonRequest) request,
              (io.grpc.stub.StreamObserver<proto.Person.InfoReply>) responseObserver);
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

  private static abstract class PersonInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonInfoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.Person.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonInfo");
    }
  }

  private static final class PersonInfoFileDescriptorSupplier
      extends PersonInfoBaseDescriptorSupplier {
    PersonInfoFileDescriptorSupplier() {}
  }

  private static final class PersonInfoMethodDescriptorSupplier
      extends PersonInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonInfoMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonInfoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonInfoFileDescriptorSupplier())
              .addMethod(getGetPersonInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
