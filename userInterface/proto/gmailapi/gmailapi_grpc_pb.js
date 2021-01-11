// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var gmailapi_gmailapi_pb = require('../gmailapi/gmailapi_pb.js');

function serialize_gmailapi_SubscriptionRequest(arg) {
  if (!(arg instanceof gmailapi_gmailapi_pb.SubscriptionRequest)) {
    throw new Error('Expected argument of type gmailapi.SubscriptionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gmailapi_SubscriptionRequest(buffer_arg) {
  return gmailapi_gmailapi_pb.SubscriptionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gmailapi_SubscriptionResponse(arg) {
  if (!(arg instanceof gmailapi_gmailapi_pb.SubscriptionResponse)) {
    throw new Error('Expected argument of type gmailapi.SubscriptionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gmailapi_SubscriptionResponse(buffer_arg) {
  return gmailapi_gmailapi_pb.SubscriptionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var GmailapiSvcService = exports.GmailapiSvcService = {
  subscribeToMail: {
    path: '/gmailapi.GmailapiSvc/subscribeToMail',
    requestStream: false,
    responseStream: false,
    requestType: gmailapi_gmailapi_pb.SubscriptionRequest,
    responseType: gmailapi_gmailapi_pb.SubscriptionResponse,
    requestSerialize: serialize_gmailapi_SubscriptionRequest,
    requestDeserialize: deserialize_gmailapi_SubscriptionRequest,
    responseSerialize: serialize_gmailapi_SubscriptionResponse,
    responseDeserialize: deserialize_gmailapi_SubscriptionResponse,
  },
};

exports.GmailapiSvcClient = grpc.makeGenericClientConstructor(GmailapiSvcService);
