// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var task_task_pb = require('../task/task_pb.js');
var project_project_pb = require('../project/project_pb.js');
var user_user_pb = require('../user/user_pb.js');

function serialize_demo_task_CreateTaskRequest(arg) {
  if (!(arg instanceof task_task_pb.CreateTaskRequest)) {
    throw new Error('Expected argument of type demo_task.CreateTaskRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_demo_task_CreateTaskRequest(buffer_arg) {
  return task_task_pb.CreateTaskRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_demo_task_ListTaskRequest(arg) {
  if (!(arg instanceof task_task_pb.ListTaskRequest)) {
    throw new Error('Expected argument of type demo_task.ListTaskRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_demo_task_ListTaskRequest(buffer_arg) {
  return task_task_pb.ListTaskRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_demo_task_ListTaskResponse(arg) {
  if (!(arg instanceof task_task_pb.ListTaskResponse)) {
    throw new Error('Expected argument of type demo_task.ListTaskResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_demo_task_ListTaskResponse(buffer_arg) {
  return task_task_pb.ListTaskResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_demo_task_TaskResponse(arg) {
  if (!(arg instanceof task_task_pb.TaskResponse)) {
    throw new Error('Expected argument of type demo_task.TaskResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_demo_task_TaskResponse(buffer_arg) {
  return task_task_pb.TaskResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_demo_task_UpdateTaskRequest(arg) {
  if (!(arg instanceof task_task_pb.UpdateTaskRequest)) {
    throw new Error('Expected argument of type demo_task.UpdateTaskRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_demo_task_UpdateTaskRequest(buffer_arg) {
  return task_task_pb.UpdateTaskRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


var TaskSvcService = exports.TaskSvcService = {
  createTask: {
    path: '/demo_task.TaskSvc/createTask',
    requestStream: false,
    responseStream: false,
    requestType: task_task_pb.CreateTaskRequest,
    responseType: task_task_pb.TaskResponse,
    requestSerialize: serialize_demo_task_CreateTaskRequest,
    requestDeserialize: deserialize_demo_task_CreateTaskRequest,
    responseSerialize: serialize_demo_task_TaskResponse,
    responseDeserialize: deserialize_demo_task_TaskResponse,
  },
  updateTask: {
    path: '/demo_task.TaskSvc/updateTask',
    requestStream: false,
    responseStream: false,
    requestType: task_task_pb.UpdateTaskRequest,
    responseType: task_task_pb.TaskResponse,
    requestSerialize: serialize_demo_task_UpdateTaskRequest,
    requestDeserialize: deserialize_demo_task_UpdateTaskRequest,
    responseSerialize: serialize_demo_task_TaskResponse,
    responseDeserialize: deserialize_demo_task_TaskResponse,
  },
  listTask: {
    path: '/demo_task.TaskSvc/listTask',
    requestStream: false,
    responseStream: false,
    requestType: task_task_pb.ListTaskRequest,
    responseType: task_task_pb.ListTaskResponse,
    requestSerialize: serialize_demo_task_ListTaskRequest,
    requestDeserialize: deserialize_demo_task_ListTaskRequest,
    responseSerialize: serialize_demo_task_ListTaskResponse,
    responseDeserialize: deserialize_demo_task_ListTaskResponse,
  },
};

exports.TaskSvcClient = grpc.makeGenericClientConstructor(TaskSvcService);
