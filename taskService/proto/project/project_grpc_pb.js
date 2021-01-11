// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var project_project_pb = require('../project/project_pb.js');

function serialize_demo_project_CreateProjectRequest(arg) {
  if (!(arg instanceof project_project_pb.CreateProjectRequest)) {
    throw new Error('Expected argument of type demo_project.CreateProjectRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_demo_project_CreateProjectRequest(buffer_arg) {
  return project_project_pb.CreateProjectRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_demo_project_CreateTagRequest(arg) {
  if (!(arg instanceof project_project_pb.CreateTagRequest)) {
    throw new Error('Expected argument of type demo_project.CreateTagRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_demo_project_CreateTagRequest(buffer_arg) {
  return project_project_pb.CreateTagRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_demo_project_GetProjectRequest(arg) {
  if (!(arg instanceof project_project_pb.GetProjectRequest)) {
    throw new Error('Expected argument of type demo_project.GetProjectRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_demo_project_GetProjectRequest(buffer_arg) {
  return project_project_pb.GetProjectRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_demo_project_ProjectResponse(arg) {
  if (!(arg instanceof project_project_pb.ProjectResponse)) {
    throw new Error('Expected argument of type demo_project.ProjectResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_demo_project_ProjectResponse(buffer_arg) {
  return project_project_pb.ProjectResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_demo_project_TagResponse(arg) {
  if (!(arg instanceof project_project_pb.TagResponse)) {
    throw new Error('Expected argument of type demo_project.TagResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_demo_project_TagResponse(buffer_arg) {
  return project_project_pb.TagResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ProjectSvcService = exports.ProjectSvcService = {
  createProject: {
    path: '/demo_project.ProjectSvc/createProject',
    requestStream: false,
    responseStream: false,
    requestType: project_project_pb.CreateProjectRequest,
    responseType: project_project_pb.ProjectResponse,
    requestSerialize: serialize_demo_project_CreateProjectRequest,
    requestDeserialize: deserialize_demo_project_CreateProjectRequest,
    responseSerialize: serialize_demo_project_ProjectResponse,
    responseDeserialize: deserialize_demo_project_ProjectResponse,
  },
  createTag: {
    path: '/demo_project.ProjectSvc/createTag',
    requestStream: false,
    responseStream: false,
    requestType: project_project_pb.CreateTagRequest,
    responseType: project_project_pb.TagResponse,
    requestSerialize: serialize_demo_project_CreateTagRequest,
    requestDeserialize: deserialize_demo_project_CreateTagRequest,
    responseSerialize: serialize_demo_project_TagResponse,
    responseDeserialize: deserialize_demo_project_TagResponse,
  },
  getProject: {
    path: '/demo_project.ProjectSvc/getProject',
    requestStream: false,
    responseStream: false,
    requestType: project_project_pb.GetProjectRequest,
    responseType: project_project_pb.ProjectResponse,
    requestSerialize: serialize_demo_project_GetProjectRequest,
    requestDeserialize: deserialize_demo_project_GetProjectRequest,
    responseSerialize: serialize_demo_project_ProjectResponse,
    responseDeserialize: deserialize_demo_project_ProjectResponse,
  },
};

exports.ProjectSvcClient = grpc.makeGenericClientConstructor(ProjectSvcService);
