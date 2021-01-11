// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package project

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion7

// ProjectSvcClient is the client API for ProjectSvc service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type ProjectSvcClient interface {
	CreateProject(ctx context.Context, in *CreateProjectRequest, opts ...grpc.CallOption) (*ProjectResponse, error)
	CreateTag(ctx context.Context, in *CreateTagRequest, opts ...grpc.CallOption) (*TagResponse, error)
	GetProject(ctx context.Context, in *GetProjectRequest, opts ...grpc.CallOption) (*ProjectResponse, error)
}

type projectSvcClient struct {
	cc grpc.ClientConnInterface
}

func NewProjectSvcClient(cc grpc.ClientConnInterface) ProjectSvcClient {
	return &projectSvcClient{cc}
}

func (c *projectSvcClient) CreateProject(ctx context.Context, in *CreateProjectRequest, opts ...grpc.CallOption) (*ProjectResponse, error) {
	out := new(ProjectResponse)
	err := c.cc.Invoke(ctx, "/demo_project.ProjectSvc/createProject", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *projectSvcClient) CreateTag(ctx context.Context, in *CreateTagRequest, opts ...grpc.CallOption) (*TagResponse, error) {
	out := new(TagResponse)
	err := c.cc.Invoke(ctx, "/demo_project.ProjectSvc/createTag", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *projectSvcClient) GetProject(ctx context.Context, in *GetProjectRequest, opts ...grpc.CallOption) (*ProjectResponse, error) {
	out := new(ProjectResponse)
	err := c.cc.Invoke(ctx, "/demo_project.ProjectSvc/getProject", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ProjectSvcServer is the server API for ProjectSvc service.
// All implementations must embed UnimplementedProjectSvcServer
// for forward compatibility
type ProjectSvcServer interface {
	CreateProject(context.Context, *CreateProjectRequest) (*ProjectResponse, error)
	CreateTag(context.Context, *CreateTagRequest) (*TagResponse, error)
	GetProject(context.Context, *GetProjectRequest) (*ProjectResponse, error)
	mustEmbedUnimplementedProjectSvcServer()
}

// UnimplementedProjectSvcServer must be embedded to have forward compatible implementations.
type UnimplementedProjectSvcServer struct {
}

func (UnimplementedProjectSvcServer) CreateProject(context.Context, *CreateProjectRequest) (*ProjectResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateProject not implemented")
}
func (UnimplementedProjectSvcServer) CreateTag(context.Context, *CreateTagRequest) (*TagResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateTag not implemented")
}
func (UnimplementedProjectSvcServer) GetProject(context.Context, *GetProjectRequest) (*ProjectResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetProject not implemented")
}
func (UnimplementedProjectSvcServer) mustEmbedUnimplementedProjectSvcServer() {}

// UnsafeProjectSvcServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to ProjectSvcServer will
// result in compilation errors.
type UnsafeProjectSvcServer interface {
	mustEmbedUnimplementedProjectSvcServer()
}

func RegisterProjectSvcServer(s grpc.ServiceRegistrar, srv ProjectSvcServer) {
	s.RegisterService(&_ProjectSvc_serviceDesc, srv)
}

func _ProjectSvc_CreateProject_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateProjectRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ProjectSvcServer).CreateProject(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/demo_project.ProjectSvc/createProject",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ProjectSvcServer).CreateProject(ctx, req.(*CreateProjectRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ProjectSvc_CreateTag_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateTagRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ProjectSvcServer).CreateTag(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/demo_project.ProjectSvc/createTag",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ProjectSvcServer).CreateTag(ctx, req.(*CreateTagRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ProjectSvc_GetProject_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetProjectRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ProjectSvcServer).GetProject(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/demo_project.ProjectSvc/getProject",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ProjectSvcServer).GetProject(ctx, req.(*GetProjectRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _ProjectSvc_serviceDesc = grpc.ServiceDesc{
	ServiceName: "demo_project.ProjectSvc",
	HandlerType: (*ProjectSvcServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "createProject",
			Handler:    _ProjectSvc_CreateProject_Handler,
		},
		{
			MethodName: "createTag",
			Handler:    _ProjectSvc_CreateTag_Handler,
		},
		{
			MethodName: "getProject",
			Handler:    _ProjectSvc_GetProject_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "protos/project/project.proto",
}
