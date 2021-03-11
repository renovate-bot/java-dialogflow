/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dialogflow.v2beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * Service for managing [Conversations][google.cloud.dialogflow.v2beta1.Conversation].
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/dialogflow/v2beta1/conversation.proto")
public final class ConversationsGrpc {

  private ConversationsGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.v2beta1.Conversations";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.CreateConversationRequest,
          com.google.cloud.dialogflow.v2beta1.Conversation>
      getCreateConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConversation",
      requestType = com.google.cloud.dialogflow.v2beta1.CreateConversationRequest.class,
      responseType = com.google.cloud.dialogflow.v2beta1.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.CreateConversationRequest,
          com.google.cloud.dialogflow.v2beta1.Conversation>
      getCreateConversationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.CreateConversationRequest,
            com.google.cloud.dialogflow.v2beta1.Conversation>
        getCreateConversationMethod;
    if ((getCreateConversationMethod = ConversationsGrpc.getCreateConversationMethod) == null) {
      synchronized (ConversationsGrpc.class) {
        if ((getCreateConversationMethod = ConversationsGrpc.getCreateConversationMethod) == null) {
          ConversationsGrpc.getCreateConversationMethod =
              getCreateConversationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.CreateConversationRequest,
                          com.google.cloud.dialogflow.v2beta1.Conversation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateConversation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.CreateConversationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.Conversation
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationsMethodDescriptorSupplier("CreateConversation"))
                      .build();
        }
      }
    }
    return getCreateConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ListConversationsRequest,
          com.google.cloud.dialogflow.v2beta1.ListConversationsResponse>
      getListConversationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConversations",
      requestType = com.google.cloud.dialogflow.v2beta1.ListConversationsRequest.class,
      responseType = com.google.cloud.dialogflow.v2beta1.ListConversationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ListConversationsRequest,
          com.google.cloud.dialogflow.v2beta1.ListConversationsResponse>
      getListConversationsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.ListConversationsRequest,
            com.google.cloud.dialogflow.v2beta1.ListConversationsResponse>
        getListConversationsMethod;
    if ((getListConversationsMethod = ConversationsGrpc.getListConversationsMethod) == null) {
      synchronized (ConversationsGrpc.class) {
        if ((getListConversationsMethod = ConversationsGrpc.getListConversationsMethod) == null) {
          ConversationsGrpc.getListConversationsMethod =
              getListConversationsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.ListConversationsRequest,
                          com.google.cloud.dialogflow.v2beta1.ListConversationsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConversations"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.ListConversationsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.ListConversationsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationsMethodDescriptorSupplier("ListConversations"))
                      .build();
        }
      }
    }
    return getListConversationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetConversationRequest,
          com.google.cloud.dialogflow.v2beta1.Conversation>
      getGetConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConversation",
      requestType = com.google.cloud.dialogflow.v2beta1.GetConversationRequest.class,
      responseType = com.google.cloud.dialogflow.v2beta1.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.GetConversationRequest,
          com.google.cloud.dialogflow.v2beta1.Conversation>
      getGetConversationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.GetConversationRequest,
            com.google.cloud.dialogflow.v2beta1.Conversation>
        getGetConversationMethod;
    if ((getGetConversationMethod = ConversationsGrpc.getGetConversationMethod) == null) {
      synchronized (ConversationsGrpc.class) {
        if ((getGetConversationMethod = ConversationsGrpc.getGetConversationMethod) == null) {
          ConversationsGrpc.getGetConversationMethod =
              getGetConversationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.GetConversationRequest,
                          com.google.cloud.dialogflow.v2beta1.Conversation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConversation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.GetConversationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.Conversation
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationsMethodDescriptorSupplier("GetConversation"))
                      .build();
        }
      }
    }
    return getGetConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest,
          com.google.cloud.dialogflow.v2beta1.Conversation>
      getCompleteConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompleteConversation",
      requestType = com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest.class,
      responseType = com.google.cloud.dialogflow.v2beta1.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest,
          com.google.cloud.dialogflow.v2beta1.Conversation>
      getCompleteConversationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest,
            com.google.cloud.dialogflow.v2beta1.Conversation>
        getCompleteConversationMethod;
    if ((getCompleteConversationMethod = ConversationsGrpc.getCompleteConversationMethod) == null) {
      synchronized (ConversationsGrpc.class) {
        if ((getCompleteConversationMethod = ConversationsGrpc.getCompleteConversationMethod)
            == null) {
          ConversationsGrpc.getCompleteConversationMethod =
              getCompleteConversationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest,
                          com.google.cloud.dialogflow.v2beta1.Conversation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CompleteConversation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.Conversation
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationsMethodDescriptorSupplier("CompleteConversation"))
                      .build();
        }
      }
    }
    return getCompleteConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.CreateCallMatcherRequest,
          com.google.cloud.dialogflow.v2beta1.CallMatcher>
      getCreateCallMatcherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCallMatcher",
      requestType = com.google.cloud.dialogflow.v2beta1.CreateCallMatcherRequest.class,
      responseType = com.google.cloud.dialogflow.v2beta1.CallMatcher.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.CreateCallMatcherRequest,
          com.google.cloud.dialogflow.v2beta1.CallMatcher>
      getCreateCallMatcherMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.CreateCallMatcherRequest,
            com.google.cloud.dialogflow.v2beta1.CallMatcher>
        getCreateCallMatcherMethod;
    if ((getCreateCallMatcherMethod = ConversationsGrpc.getCreateCallMatcherMethod) == null) {
      synchronized (ConversationsGrpc.class) {
        if ((getCreateCallMatcherMethod = ConversationsGrpc.getCreateCallMatcherMethod) == null) {
          ConversationsGrpc.getCreateCallMatcherMethod =
              getCreateCallMatcherMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.CreateCallMatcherRequest,
                          com.google.cloud.dialogflow.v2beta1.CallMatcher>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCallMatcher"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.CreateCallMatcherRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.CallMatcher.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationsMethodDescriptorSupplier("CreateCallMatcher"))
                      .build();
        }
      }
    }
    return getCreateCallMatcherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ListCallMatchersRequest,
          com.google.cloud.dialogflow.v2beta1.ListCallMatchersResponse>
      getListCallMatchersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCallMatchers",
      requestType = com.google.cloud.dialogflow.v2beta1.ListCallMatchersRequest.class,
      responseType = com.google.cloud.dialogflow.v2beta1.ListCallMatchersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ListCallMatchersRequest,
          com.google.cloud.dialogflow.v2beta1.ListCallMatchersResponse>
      getListCallMatchersMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.ListCallMatchersRequest,
            com.google.cloud.dialogflow.v2beta1.ListCallMatchersResponse>
        getListCallMatchersMethod;
    if ((getListCallMatchersMethod = ConversationsGrpc.getListCallMatchersMethod) == null) {
      synchronized (ConversationsGrpc.class) {
        if ((getListCallMatchersMethod = ConversationsGrpc.getListCallMatchersMethod) == null) {
          ConversationsGrpc.getListCallMatchersMethod =
              getListCallMatchersMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.ListCallMatchersRequest,
                          com.google.cloud.dialogflow.v2beta1.ListCallMatchersResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCallMatchers"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.ListCallMatchersRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.ListCallMatchersResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationsMethodDescriptorSupplier("ListCallMatchers"))
                      .build();
        }
      }
    }
    return getListCallMatchersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.DeleteCallMatcherRequest, com.google.protobuf.Empty>
      getDeleteCallMatcherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCallMatcher",
      requestType = com.google.cloud.dialogflow.v2beta1.DeleteCallMatcherRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.DeleteCallMatcherRequest, com.google.protobuf.Empty>
      getDeleteCallMatcherMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.DeleteCallMatcherRequest, com.google.protobuf.Empty>
        getDeleteCallMatcherMethod;
    if ((getDeleteCallMatcherMethod = ConversationsGrpc.getDeleteCallMatcherMethod) == null) {
      synchronized (ConversationsGrpc.class) {
        if ((getDeleteCallMatcherMethod = ConversationsGrpc.getDeleteCallMatcherMethod) == null) {
          ConversationsGrpc.getDeleteCallMatcherMethod =
              getDeleteCallMatcherMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.DeleteCallMatcherRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCallMatcher"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.DeleteCallMatcherRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationsMethodDescriptorSupplier("DeleteCallMatcher"))
                      .build();
        }
      }
    }
    return getDeleteCallMatcherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest,
          com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse>
      getBatchCreateMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateMessages",
      requestType = com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest.class,
      responseType = com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest,
          com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse>
      getBatchCreateMessagesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest,
            com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse>
        getBatchCreateMessagesMethod;
    if ((getBatchCreateMessagesMethod = ConversationsGrpc.getBatchCreateMessagesMethod) == null) {
      synchronized (ConversationsGrpc.class) {
        if ((getBatchCreateMessagesMethod = ConversationsGrpc.getBatchCreateMessagesMethod)
            == null) {
          ConversationsGrpc.getBatchCreateMessagesMethod =
              getBatchCreateMessagesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest,
                          com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "BatchCreateMessages"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationsMethodDescriptorSupplier("BatchCreateMessages"))
                      .build();
        }
      }
    }
    return getBatchCreateMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ListMessagesRequest,
          com.google.cloud.dialogflow.v2beta1.ListMessagesResponse>
      getListMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMessages",
      requestType = com.google.cloud.dialogflow.v2beta1.ListMessagesRequest.class,
      responseType = com.google.cloud.dialogflow.v2beta1.ListMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dialogflow.v2beta1.ListMessagesRequest,
          com.google.cloud.dialogflow.v2beta1.ListMessagesResponse>
      getListMessagesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dialogflow.v2beta1.ListMessagesRequest,
            com.google.cloud.dialogflow.v2beta1.ListMessagesResponse>
        getListMessagesMethod;
    if ((getListMessagesMethod = ConversationsGrpc.getListMessagesMethod) == null) {
      synchronized (ConversationsGrpc.class) {
        if ((getListMessagesMethod = ConversationsGrpc.getListMessagesMethod) == null) {
          ConversationsGrpc.getListMessagesMethod =
              getListMessagesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dialogflow.v2beta1.ListMessagesRequest,
                          com.google.cloud.dialogflow.v2beta1.ListMessagesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMessages"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.ListMessagesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dialogflow.v2beta1.ListMessagesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new ConversationsMethodDescriptorSupplier("ListMessages"))
                      .build();
        }
      }
    }
    return getListMessagesMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static ConversationsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversationsStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ConversationsStub>() {
          @java.lang.Override
          public ConversationsStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ConversationsStub(channel, callOptions);
          }
        };
    return ConversationsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConversationsBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversationsBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ConversationsBlockingStub>() {
          @java.lang.Override
          public ConversationsBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ConversationsBlockingStub(channel, callOptions);
          }
        };
    return ConversationsBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static ConversationsFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversationsFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<ConversationsFutureStub>() {
          @java.lang.Override
          public ConversationsFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ConversationsFutureStub(channel, callOptions);
          }
        };
    return ConversationsFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Service for managing [Conversations][google.cloud.dialogflow.v2beta1.Conversation].
   * </pre>
   */
  public abstract static class ConversationsImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Creates a new conversation. Conversations are auto-completed after 24
     * hours.
     * Conversation Lifecycle:
     * There are two stages during a conversation: Automated Agent Stage and
     * Assist Stage.
     * For Automated Agent Stage, there will be a dialogflow agent responding to
     * user queries.
     * For Assist Stage, there's no dialogflow agent responding to user queries.
     * But we will provide suggestions which are generated from conversation.
     * If [Conversation.conversation_profile][google.cloud.dialogflow.v2beta1.Conversation.conversation_profile] is configured for a dialogflow
     * agent, conversation will start from `Automated Agent Stage`, otherwise, it
     * will start from `Assist Stage`. And during `Automated Agent Stage`, once an
     * [Intent][google.cloud.dialogflow.v2beta1.Intent] with [Intent.live_agent_handoff][google.cloud.dialogflow.v2beta1.Intent.live_agent_handoff] is triggered, conversation
     * will transfer to Assist Stage.
     * </pre>
     */
    public void createConversation(
        com.google.cloud.dialogflow.v2beta1.CreateConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Conversation>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateConversationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns the list of all conversations in the specified project.
     * </pre>
     */
    public void listConversations(
        com.google.cloud.dialogflow.v2beta1.ListConversationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListConversationsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListConversationsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Retrieves the specific conversation.
     * </pre>
     */
    public void getConversation(
        com.google.cloud.dialogflow.v2beta1.GetConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Conversation>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetConversationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Completes the specified conversation. Finished conversations are purged
     * from the database after 30 days.
     * </pre>
     */
    public void completeConversation(
        com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Conversation>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCompleteConversationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a call matcher that links incoming SIP calls to the specified
     * conversation if they fulfill specified criteria.
     * </pre>
     */
    public void createCallMatcher(
        com.google.cloud.dialogflow.v2beta1.CreateCallMatcherRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.CallMatcher>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCallMatcherMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns the list of all call matchers in the specified conversation.
     * </pre>
     */
    public void listCallMatchers(
        com.google.cloud.dialogflow.v2beta1.ListCallMatchersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListCallMatchersResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListCallMatchersMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Requests deletion of a call matcher.
     * </pre>
     */
    public void deleteCallMatcher(
        com.google.cloud.dialogflow.v2beta1.DeleteCallMatcherRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCallMatcherMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Batch ingests messages to conversation. Customers can use this RPC to
     * ingest historical messages to conversation.
     * </pre>
     */
    public void batchCreateMessages(
        com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getBatchCreateMessagesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists messages that belong to a given conversation.
     * `messages` are ordered by `create_time` in descending order. To fetch
     * updates without duplication, send request with filter
     * `create_time_epoch_microseconds &gt;
     * [first item's create_time of previous request]` and empty page_token.
     * </pre>
     */
    public void listMessages(
        com.google.cloud.dialogflow.v2beta1.ListMessagesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListMessagesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListMessagesMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateConversationMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.CreateConversationRequest,
                      com.google.cloud.dialogflow.v2beta1.Conversation>(
                      this, METHODID_CREATE_CONVERSATION)))
          .addMethod(
              getListConversationsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.ListConversationsRequest,
                      com.google.cloud.dialogflow.v2beta1.ListConversationsResponse>(
                      this, METHODID_LIST_CONVERSATIONS)))
          .addMethod(
              getGetConversationMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.GetConversationRequest,
                      com.google.cloud.dialogflow.v2beta1.Conversation>(
                      this, METHODID_GET_CONVERSATION)))
          .addMethod(
              getCompleteConversationMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest,
                      com.google.cloud.dialogflow.v2beta1.Conversation>(
                      this, METHODID_COMPLETE_CONVERSATION)))
          .addMethod(
              getCreateCallMatcherMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.CreateCallMatcherRequest,
                      com.google.cloud.dialogflow.v2beta1.CallMatcher>(
                      this, METHODID_CREATE_CALL_MATCHER)))
          .addMethod(
              getListCallMatchersMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.ListCallMatchersRequest,
                      com.google.cloud.dialogflow.v2beta1.ListCallMatchersResponse>(
                      this, METHODID_LIST_CALL_MATCHERS)))
          .addMethod(
              getDeleteCallMatcherMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.DeleteCallMatcherRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_CALL_MATCHER)))
          .addMethod(
              getBatchCreateMessagesMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest,
                      com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse>(
                      this, METHODID_BATCH_CREATE_MESSAGES)))
          .addMethod(
              getListMessagesMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.dialogflow.v2beta1.ListMessagesRequest,
                      com.google.cloud.dialogflow.v2beta1.ListMessagesResponse>(
                      this, METHODID_LIST_MESSAGES)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Service for managing [Conversations][google.cloud.dialogflow.v2beta1.Conversation].
   * </pre>
   */
  public static final class ConversationsStub
      extends io.grpc.stub.AbstractAsyncStub<ConversationsStub> {
    private ConversationsStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversationsStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversationsStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a new conversation. Conversations are auto-completed after 24
     * hours.
     * Conversation Lifecycle:
     * There are two stages during a conversation: Automated Agent Stage and
     * Assist Stage.
     * For Automated Agent Stage, there will be a dialogflow agent responding to
     * user queries.
     * For Assist Stage, there's no dialogflow agent responding to user queries.
     * But we will provide suggestions which are generated from conversation.
     * If [Conversation.conversation_profile][google.cloud.dialogflow.v2beta1.Conversation.conversation_profile] is configured for a dialogflow
     * agent, conversation will start from `Automated Agent Stage`, otherwise, it
     * will start from `Assist Stage`. And during `Automated Agent Stage`, once an
     * [Intent][google.cloud.dialogflow.v2beta1.Intent] with [Intent.live_agent_handoff][google.cloud.dialogflow.v2beta1.Intent.live_agent_handoff] is triggered, conversation
     * will transfer to Assist Stage.
     * </pre>
     */
    public void createConversation(
        com.google.cloud.dialogflow.v2beta1.CreateConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Conversation>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateConversationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns the list of all conversations in the specified project.
     * </pre>
     */
    public void listConversations(
        com.google.cloud.dialogflow.v2beta1.ListConversationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListConversationsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListConversationsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Retrieves the specific conversation.
     * </pre>
     */
    public void getConversation(
        com.google.cloud.dialogflow.v2beta1.GetConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Conversation>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConversationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Completes the specified conversation. Finished conversations are purged
     * from the database after 30 days.
     * </pre>
     */
    public void completeConversation(
        com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Conversation>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompleteConversationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a call matcher that links incoming SIP calls to the specified
     * conversation if they fulfill specified criteria.
     * </pre>
     */
    public void createCallMatcher(
        com.google.cloud.dialogflow.v2beta1.CreateCallMatcherRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.CallMatcher>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCallMatcherMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns the list of all call matchers in the specified conversation.
     * </pre>
     */
    public void listCallMatchers(
        com.google.cloud.dialogflow.v2beta1.ListCallMatchersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListCallMatchersResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCallMatchersMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Requests deletion of a call matcher.
     * </pre>
     */
    public void deleteCallMatcher(
        com.google.cloud.dialogflow.v2beta1.DeleteCallMatcherRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCallMatcherMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Batch ingests messages to conversation. Customers can use this RPC to
     * ingest historical messages to conversation.
     * </pre>
     */
    public void batchCreateMessages(
        com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchCreateMessagesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists messages that belong to a given conversation.
     * `messages` are ordered by `create_time` in descending order. To fetch
     * updates without duplication, send request with filter
     * `create_time_epoch_microseconds &gt;
     * [first item's create_time of previous request]` and empty page_token.
     * </pre>
     */
    public void listMessages(
        com.google.cloud.dialogflow.v2beta1.ListMessagesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListMessagesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMessagesMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Service for managing [Conversations][google.cloud.dialogflow.v2beta1.Conversation].
   * </pre>
   */
  public static final class ConversationsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConversationsBlockingStub> {
    private ConversationsBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversationsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversationsBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a new conversation. Conversations are auto-completed after 24
     * hours.
     * Conversation Lifecycle:
     * There are two stages during a conversation: Automated Agent Stage and
     * Assist Stage.
     * For Automated Agent Stage, there will be a dialogflow agent responding to
     * user queries.
     * For Assist Stage, there's no dialogflow agent responding to user queries.
     * But we will provide suggestions which are generated from conversation.
     * If [Conversation.conversation_profile][google.cloud.dialogflow.v2beta1.Conversation.conversation_profile] is configured for a dialogflow
     * agent, conversation will start from `Automated Agent Stage`, otherwise, it
     * will start from `Assist Stage`. And during `Automated Agent Stage`, once an
     * [Intent][google.cloud.dialogflow.v2beta1.Intent] with [Intent.live_agent_handoff][google.cloud.dialogflow.v2beta1.Intent.live_agent_handoff] is triggered, conversation
     * will transfer to Assist Stage.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Conversation createConversation(
        com.google.cloud.dialogflow.v2beta1.CreateConversationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateConversationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns the list of all conversations in the specified project.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.ListConversationsResponse listConversations(
        com.google.cloud.dialogflow.v2beta1.ListConversationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListConversationsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Retrieves the specific conversation.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Conversation getConversation(
        com.google.cloud.dialogflow.v2beta1.GetConversationRequest request) {
      return blockingUnaryCall(getChannel(), getGetConversationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Completes the specified conversation. Finished conversations are purged
     * from the database after 30 days.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Conversation completeConversation(
        com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCompleteConversationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a call matcher that links incoming SIP calls to the specified
     * conversation if they fulfill specified criteria.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.CallMatcher createCallMatcher(
        com.google.cloud.dialogflow.v2beta1.CreateCallMatcherRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCallMatcherMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns the list of all call matchers in the specified conversation.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.ListCallMatchersResponse listCallMatchers(
        com.google.cloud.dialogflow.v2beta1.ListCallMatchersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCallMatchersMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Requests deletion of a call matcher.
     * </pre>
     */
    public com.google.protobuf.Empty deleteCallMatcher(
        com.google.cloud.dialogflow.v2beta1.DeleteCallMatcherRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCallMatcherMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Batch ingests messages to conversation. Customers can use this RPC to
     * ingest historical messages to conversation.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse batchCreateMessages(
        com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest request) {
      return blockingUnaryCall(
          getChannel(), getBatchCreateMessagesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists messages that belong to a given conversation.
     * `messages` are ordered by `create_time` in descending order. To fetch
     * updates without duplication, send request with filter
     * `create_time_epoch_microseconds &gt;
     * [first item's create_time of previous request]` and empty page_token.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.ListMessagesResponse listMessages(
        com.google.cloud.dialogflow.v2beta1.ListMessagesRequest request) {
      return blockingUnaryCall(getChannel(), getListMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Service for managing [Conversations][google.cloud.dialogflow.v2beta1.Conversation].
   * </pre>
   */
  public static final class ConversationsFutureStub
      extends io.grpc.stub.AbstractFutureStub<ConversationsFutureStub> {
    private ConversationsFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversationsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversationsFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a new conversation. Conversations are auto-completed after 24
     * hours.
     * Conversation Lifecycle:
     * There are two stages during a conversation: Automated Agent Stage and
     * Assist Stage.
     * For Automated Agent Stage, there will be a dialogflow agent responding to
     * user queries.
     * For Assist Stage, there's no dialogflow agent responding to user queries.
     * But we will provide suggestions which are generated from conversation.
     * If [Conversation.conversation_profile][google.cloud.dialogflow.v2beta1.Conversation.conversation_profile] is configured for a dialogflow
     * agent, conversation will start from `Automated Agent Stage`, otherwise, it
     * will start from `Assist Stage`. And during `Automated Agent Stage`, once an
     * [Intent][google.cloud.dialogflow.v2beta1.Intent] with [Intent.live_agent_handoff][google.cloud.dialogflow.v2beta1.Intent.live_agent_handoff] is triggered, conversation
     * will transfer to Assist Stage.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.Conversation>
        createConversation(com.google.cloud.dialogflow.v2beta1.CreateConversationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateConversationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns the list of all conversations in the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.ListConversationsResponse>
        listConversations(com.google.cloud.dialogflow.v2beta1.ListConversationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListConversationsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Retrieves the specific conversation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.Conversation>
        getConversation(com.google.cloud.dialogflow.v2beta1.GetConversationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConversationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Completes the specified conversation. Finished conversations are purged
     * from the database after 30 days.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.Conversation>
        completeConversation(
            com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCompleteConversationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a call matcher that links incoming SIP calls to the specified
     * conversation if they fulfill specified criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.CallMatcher>
        createCallMatcher(com.google.cloud.dialogflow.v2beta1.CreateCallMatcherRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCallMatcherMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns the list of all call matchers in the specified conversation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.ListCallMatchersResponse>
        listCallMatchers(com.google.cloud.dialogflow.v2beta1.ListCallMatchersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCallMatchersMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Requests deletion of a call matcher.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteCallMatcher(com.google.cloud.dialogflow.v2beta1.DeleteCallMatcherRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCallMatcherMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Batch ingests messages to conversation. Customers can use this RPC to
     * ingest historical messages to conversation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse>
        batchCreateMessages(
            com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchCreateMessagesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists messages that belong to a given conversation.
     * `messages` are ordered by `create_time` in descending order. To fetch
     * updates without duplication, send request with filter
     * `create_time_epoch_microseconds &gt;
     * [first item's create_time of previous request]` and empty page_token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dialogflow.v2beta1.ListMessagesResponse>
        listMessages(com.google.cloud.dialogflow.v2beta1.ListMessagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMessagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CONVERSATION = 0;
  private static final int METHODID_LIST_CONVERSATIONS = 1;
  private static final int METHODID_GET_CONVERSATION = 2;
  private static final int METHODID_COMPLETE_CONVERSATION = 3;
  private static final int METHODID_CREATE_CALL_MATCHER = 4;
  private static final int METHODID_LIST_CALL_MATCHERS = 5;
  private static final int METHODID_DELETE_CALL_MATCHER = 6;
  private static final int METHODID_BATCH_CREATE_MESSAGES = 7;
  private static final int METHODID_LIST_MESSAGES = 8;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConversationsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConversationsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CONVERSATION:
          serviceImpl.createConversation(
              (com.google.cloud.dialogflow.v2beta1.CreateConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Conversation>)
                  responseObserver);
          break;
        case METHODID_LIST_CONVERSATIONS:
          serviceImpl.listConversations(
              (com.google.cloud.dialogflow.v2beta1.ListConversationsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dialogflow.v2beta1.ListConversationsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_CONVERSATION:
          serviceImpl.getConversation(
              (com.google.cloud.dialogflow.v2beta1.GetConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Conversation>)
                  responseObserver);
          break;
        case METHODID_COMPLETE_CONVERSATION:
          serviceImpl.completeConversation(
              (com.google.cloud.dialogflow.v2beta1.CompleteConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Conversation>)
                  responseObserver);
          break;
        case METHODID_CREATE_CALL_MATCHER:
          serviceImpl.createCallMatcher(
              (com.google.cloud.dialogflow.v2beta1.CreateCallMatcherRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.CallMatcher>)
                  responseObserver);
          break;
        case METHODID_LIST_CALL_MATCHERS:
          serviceImpl.listCallMatchers(
              (com.google.cloud.dialogflow.v2beta1.ListCallMatchersRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dialogflow.v2beta1.ListCallMatchersResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_CALL_MATCHER:
          serviceImpl.deleteCallMatcher(
              (com.google.cloud.dialogflow.v2beta1.DeleteCallMatcherRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_MESSAGES:
          serviceImpl.batchCreateMessages(
              (com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_MESSAGES:
          serviceImpl.listMessages(
              (com.google.cloud.dialogflow.v2beta1.ListMessagesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dialogflow.v2beta1.ListMessagesResponse>)
                  responseObserver);
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

  private abstract static class ConversationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversationsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.ConversationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Conversations");
    }
  }

  private static final class ConversationsFileDescriptorSupplier
      extends ConversationsBaseDescriptorSupplier {
    ConversationsFileDescriptorSupplier() {}
  }

  private static final class ConversationsMethodDescriptorSupplier
      extends ConversationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConversationsMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConversationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new ConversationsFileDescriptorSupplier())
                      .addMethod(getCreateConversationMethod())
                      .addMethod(getListConversationsMethod())
                      .addMethod(getGetConversationMethod())
                      .addMethod(getCompleteConversationMethod())
                      .addMethod(getCreateCallMatcherMethod())
                      .addMethod(getListCallMatchersMethod())
                      .addMethod(getDeleteCallMatcherMethod())
                      .addMethod(getBatchCreateMessagesMethod())
                      .addMethod(getListMessagesMethod())
                      .build();
        }
      }
    }
    return result;
  }
}