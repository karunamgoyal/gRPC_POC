package com.helloworld.grpcservices;

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
    comments = "Source: contact_service.proto")
public final class ContactServiceGrpc {

  private ContactServiceGrpc() {}

  public static final String SERVICE_NAME = "ContactService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.helloworld.modelproto.ContactProto,
      com.helloworld.modelproto.Response> getCreateContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createContact",
      requestType = com.helloworld.modelproto.ContactProto.class,
      responseType = com.helloworld.modelproto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.helloworld.modelproto.ContactProto,
      com.helloworld.modelproto.Response> getCreateContactMethod() {
    io.grpc.MethodDescriptor<com.helloworld.modelproto.ContactProto, com.helloworld.modelproto.Response> getCreateContactMethod;
    if ((getCreateContactMethod = ContactServiceGrpc.getCreateContactMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getCreateContactMethod = ContactServiceGrpc.getCreateContactMethod) == null) {
          ContactServiceGrpc.getCreateContactMethod = getCreateContactMethod = 
              io.grpc.MethodDescriptor.<com.helloworld.modelproto.ContactProto, com.helloworld.modelproto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContactService", "createContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.helloworld.modelproto.ContactProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.helloworld.modelproto.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("createContact"))
                  .build();
          }
        }
     }
     return getCreateContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.helloworld.modelproto.ContactId,
      com.helloworld.modelproto.ContactProto> getGetContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getContact",
      requestType = com.helloworld.modelproto.ContactId.class,
      responseType = com.helloworld.modelproto.ContactProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.helloworld.modelproto.ContactId,
      com.helloworld.modelproto.ContactProto> getGetContactMethod() {
    io.grpc.MethodDescriptor<com.helloworld.modelproto.ContactId, com.helloworld.modelproto.ContactProto> getGetContactMethod;
    if ((getGetContactMethod = ContactServiceGrpc.getGetContactMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getGetContactMethod = ContactServiceGrpc.getGetContactMethod) == null) {
          ContactServiceGrpc.getGetContactMethod = getGetContactMethod = 
              io.grpc.MethodDescriptor.<com.helloworld.modelproto.ContactId, com.helloworld.modelproto.ContactProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContactService", "getContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.helloworld.modelproto.ContactId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.helloworld.modelproto.ContactProto.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("getContact"))
                  .build();
          }
        }
     }
     return getGetContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.helloworld.modelproto.ContactProto,
      com.helloworld.modelproto.Response> getUpdateContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateContact",
      requestType = com.helloworld.modelproto.ContactProto.class,
      responseType = com.helloworld.modelproto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.helloworld.modelproto.ContactProto,
      com.helloworld.modelproto.Response> getUpdateContactMethod() {
    io.grpc.MethodDescriptor<com.helloworld.modelproto.ContactProto, com.helloworld.modelproto.Response> getUpdateContactMethod;
    if ((getUpdateContactMethod = ContactServiceGrpc.getUpdateContactMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getUpdateContactMethod = ContactServiceGrpc.getUpdateContactMethod) == null) {
          ContactServiceGrpc.getUpdateContactMethod = getUpdateContactMethod = 
              io.grpc.MethodDescriptor.<com.helloworld.modelproto.ContactProto, com.helloworld.modelproto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContactService", "updateContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.helloworld.modelproto.ContactProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.helloworld.modelproto.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("updateContact"))
                  .build();
          }
        }
     }
     return getUpdateContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.helloworld.modelproto.ContactId,
      com.helloworld.modelproto.Response> getDeleteContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteContact",
      requestType = com.helloworld.modelproto.ContactId.class,
      responseType = com.helloworld.modelproto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.helloworld.modelproto.ContactId,
      com.helloworld.modelproto.Response> getDeleteContactMethod() {
    io.grpc.MethodDescriptor<com.helloworld.modelproto.ContactId, com.helloworld.modelproto.Response> getDeleteContactMethod;
    if ((getDeleteContactMethod = ContactServiceGrpc.getDeleteContactMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getDeleteContactMethod = ContactServiceGrpc.getDeleteContactMethod) == null) {
          ContactServiceGrpc.getDeleteContactMethod = getDeleteContactMethod = 
              io.grpc.MethodDescriptor.<com.helloworld.modelproto.ContactId, com.helloworld.modelproto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContactService", "deleteContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.helloworld.modelproto.ContactId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.helloworld.modelproto.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("deleteContact"))
                  .build();
          }
        }
     }
     return getDeleteContactMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContactServiceStub newStub(io.grpc.Channel channel) {
    return new ContactServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContactServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ContactServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContactServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ContactServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ContactServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createContact(com.helloworld.modelproto.ContactProto request,
        io.grpc.stub.StreamObserver<com.helloworld.modelproto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateContactMethod(), responseObserver);
    }

    /**
     */
    public void getContact(com.helloworld.modelproto.ContactId request,
        io.grpc.stub.StreamObserver<com.helloworld.modelproto.ContactProto> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContactMethod(), responseObserver);
    }

    /**
     */
    public void updateContact(com.helloworld.modelproto.ContactProto request,
        io.grpc.stub.StreamObserver<com.helloworld.modelproto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateContactMethod(), responseObserver);
    }

    /**
     */
    public void deleteContact(com.helloworld.modelproto.ContactId request,
        io.grpc.stub.StreamObserver<com.helloworld.modelproto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteContactMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.helloworld.modelproto.ContactProto,
                com.helloworld.modelproto.Response>(
                  this, METHODID_CREATE_CONTACT)))
          .addMethod(
            getGetContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.helloworld.modelproto.ContactId,
                com.helloworld.modelproto.ContactProto>(
                  this, METHODID_GET_CONTACT)))
          .addMethod(
            getUpdateContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.helloworld.modelproto.ContactProto,
                com.helloworld.modelproto.Response>(
                  this, METHODID_UPDATE_CONTACT)))
          .addMethod(
            getDeleteContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.helloworld.modelproto.ContactId,
                com.helloworld.modelproto.Response>(
                  this, METHODID_DELETE_CONTACT)))
          .build();
    }
  }

  /**
   */
  public static final class ContactServiceStub extends io.grpc.stub.AbstractStub<ContactServiceStub> {
    private ContactServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContactServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContactServiceStub(channel, callOptions);
    }

    /**
     */
    public void createContact(com.helloworld.modelproto.ContactProto request,
        io.grpc.stub.StreamObserver<com.helloworld.modelproto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContact(com.helloworld.modelproto.ContactId request,
        io.grpc.stub.StreamObserver<com.helloworld.modelproto.ContactProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateContact(com.helloworld.modelproto.ContactProto request,
        io.grpc.stub.StreamObserver<com.helloworld.modelproto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteContact(com.helloworld.modelproto.ContactId request,
        io.grpc.stub.StreamObserver<com.helloworld.modelproto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteContactMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ContactServiceBlockingStub extends io.grpc.stub.AbstractStub<ContactServiceBlockingStub> {
    private ContactServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContactServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContactServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.helloworld.modelproto.Response createContact(com.helloworld.modelproto.ContactProto request) {
      return blockingUnaryCall(
          getChannel(), getCreateContactMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.helloworld.modelproto.ContactProto getContact(com.helloworld.modelproto.ContactId request) {
      return blockingUnaryCall(
          getChannel(), getGetContactMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.helloworld.modelproto.Response updateContact(com.helloworld.modelproto.ContactProto request) {
      return blockingUnaryCall(
          getChannel(), getUpdateContactMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.helloworld.modelproto.Response deleteContact(com.helloworld.modelproto.ContactId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteContactMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ContactServiceFutureStub extends io.grpc.stub.AbstractStub<ContactServiceFutureStub> {
    private ContactServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContactServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContactServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.helloworld.modelproto.Response> createContact(
        com.helloworld.modelproto.ContactProto request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateContactMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.helloworld.modelproto.ContactProto> getContact(
        com.helloworld.modelproto.ContactId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContactMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.helloworld.modelproto.Response> updateContact(
        com.helloworld.modelproto.ContactProto request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateContactMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.helloworld.modelproto.Response> deleteContact(
        com.helloworld.modelproto.ContactId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteContactMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CONTACT = 0;
  private static final int METHODID_GET_CONTACT = 1;
  private static final int METHODID_UPDATE_CONTACT = 2;
  private static final int METHODID_DELETE_CONTACT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContactServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContactServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CONTACT:
          serviceImpl.createContact((com.helloworld.modelproto.ContactProto) request,
              (io.grpc.stub.StreamObserver<com.helloworld.modelproto.Response>) responseObserver);
          break;
        case METHODID_GET_CONTACT:
          serviceImpl.getContact((com.helloworld.modelproto.ContactId) request,
              (io.grpc.stub.StreamObserver<com.helloworld.modelproto.ContactProto>) responseObserver);
          break;
        case METHODID_UPDATE_CONTACT:
          serviceImpl.updateContact((com.helloworld.modelproto.ContactProto) request,
              (io.grpc.stub.StreamObserver<com.helloworld.modelproto.Response>) responseObserver);
          break;
        case METHODID_DELETE_CONTACT:
          serviceImpl.deleteContact((com.helloworld.modelproto.ContactId) request,
              (io.grpc.stub.StreamObserver<com.helloworld.modelproto.Response>) responseObserver);
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

  private static abstract class ContactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContactServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.helloworld.grpcservices.ContactServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContactService");
    }
  }

  private static final class ContactServiceFileDescriptorSupplier
      extends ContactServiceBaseDescriptorSupplier {
    ContactServiceFileDescriptorSupplier() {}
  }

  private static final class ContactServiceMethodDescriptorSupplier
      extends ContactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContactServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ContactServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContactServiceFileDescriptorSupplier())
              .addMethod(getCreateContactMethod())
              .addMethod(getGetContactMethod())
              .addMethod(getUpdateContactMethod())
              .addMethod(getDeleteContactMethod())
              .build();
        }
      }
    }
    return result;
  }
}
