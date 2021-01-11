// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package igapi

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion7

// IgSvcClient is the client API for IgSvc service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type IgSvcClient interface {
	TradeAction(ctx context.Context, in *OpenTradeRequest, opts ...grpc.CallOption) (*TradeResponse, error)
}

type igSvcClient struct {
	cc grpc.ClientConnInterface
}

func NewIgSvcClient(cc grpc.ClientConnInterface) IgSvcClient {
	return &igSvcClient{cc}
}

func (c *igSvcClient) TradeAction(ctx context.Context, in *OpenTradeRequest, opts ...grpc.CallOption) (*TradeResponse, error) {
	out := new(TradeResponse)
	err := c.cc.Invoke(ctx, "/demo_igapi.IgSvc/tradeAction", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// IgSvcServer is the server API for IgSvc service.
// All implementations must embed UnimplementedIgSvcServer
// for forward compatibility
type IgSvcServer interface {
	TradeAction(context.Context, *OpenTradeRequest) (*TradeResponse, error)
	mustEmbedUnimplementedIgSvcServer()
}

// UnimplementedIgSvcServer must be embedded to have forward compatible implementations.
type UnimplementedIgSvcServer struct {
}

func (UnimplementedIgSvcServer) TradeAction(context.Context, *OpenTradeRequest) (*TradeResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method TradeAction not implemented")
}
func (UnimplementedIgSvcServer) mustEmbedUnimplementedIgSvcServer() {}

// UnsafeIgSvcServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to IgSvcServer will
// result in compilation errors.
type UnsafeIgSvcServer interface {
	mustEmbedUnimplementedIgSvcServer()
}

func RegisterIgSvcServer(s grpc.ServiceRegistrar, srv IgSvcServer) {
	s.RegisterService(&_IgSvc_serviceDesc, srv)
}

func _IgSvc_TradeAction_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(OpenTradeRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IgSvcServer).TradeAction(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/demo_igapi.IgSvc/tradeAction",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IgSvcServer).TradeAction(ctx, req.(*OpenTradeRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _IgSvc_serviceDesc = grpc.ServiceDesc{
	ServiceName: "demo_igapi.IgSvc",
	HandlerType: (*IgSvcServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "tradeAction",
			Handler:    _IgSvc_TradeAction_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "igapi/igapi.proto",
}