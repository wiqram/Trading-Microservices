// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.14.0
// source: protos/igapi/igapi.proto

package igapi

import (
	proto "github.com/golang/protobuf/proto"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

//The request containing any user identifier, the instrument to deal on and direction of trade, buy long or sell short
type OpenTradeRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserId string `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	Epic   string `protobuf:"bytes,2,opt,name=epic,proto3" json:"epic,omitempty"`
	Buy    bool   `protobuf:"varint,3,opt,name=buy,proto3" json:"buy,omitempty"`
}

func (x *OpenTradeRequest) Reset() {
	*x = OpenTradeRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_igapi_igapi_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *OpenTradeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*OpenTradeRequest) ProtoMessage() {}

func (x *OpenTradeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_protos_igapi_igapi_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use OpenTradeRequest.ProtoReflect.Descriptor instead.
func (*OpenTradeRequest) Descriptor() ([]byte, []int) {
	return file_protos_igapi_igapi_proto_rawDescGZIP(), []int{0}
}

func (x *OpenTradeRequest) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *OpenTradeRequest) GetEpic() string {
	if x != nil {
		return x.Epic
	}
	return ""
}

func (x *OpenTradeRequest) GetBuy() bool {
	if x != nil {
		return x.Buy
	}
	return false
}

//response containing transId and price at which the trade was executed
type TradeResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TransactionId string `protobuf:"bytes,1,opt,name=transactionId,proto3" json:"transactionId,omitempty"`
	TradePrice    int32  `protobuf:"varint,2,opt,name=tradePrice,proto3" json:"tradePrice,omitempty"`
}

func (x *TradeResponse) Reset() {
	*x = TradeResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_igapi_igapi_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TradeResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TradeResponse) ProtoMessage() {}

func (x *TradeResponse) ProtoReflect() protoreflect.Message {
	mi := &file_protos_igapi_igapi_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TradeResponse.ProtoReflect.Descriptor instead.
func (*TradeResponse) Descriptor() ([]byte, []int) {
	return file_protos_igapi_igapi_proto_rawDescGZIP(), []int{1}
}

func (x *TradeResponse) GetTransactionId() string {
	if x != nil {
		return x.TransactionId
	}
	return ""
}

func (x *TradeResponse) GetTradePrice() int32 {
	if x != nil {
		return x.TradePrice
	}
	return 0
}

var File_protos_igapi_igapi_proto protoreflect.FileDescriptor

var file_protos_igapi_igapi_proto_rawDesc = []byte{
	0x0a, 0x18, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x69, 0x67, 0x61, 0x70, 0x69, 0x2f, 0x69,
	0x67, 0x61, 0x70, 0x69, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0a, 0x64, 0x65, 0x6d, 0x6f,
	0x5f, 0x69, 0x67, 0x61, 0x70, 0x69, 0x22, 0x51, 0x0a, 0x10, 0x4f, 0x70, 0x65, 0x6e, 0x54, 0x72,
	0x61, 0x64, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x17, 0x0a, 0x07, 0x75, 0x73,
	0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x75, 0x73, 0x65,
	0x72, 0x49, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x65, 0x70, 0x69, 0x63, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x04, 0x65, 0x70, 0x69, 0x63, 0x12, 0x10, 0x0a, 0x03, 0x62, 0x75, 0x79, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x08, 0x52, 0x03, 0x62, 0x75, 0x79, 0x22, 0x55, 0x0a, 0x0d, 0x54, 0x72, 0x61,
	0x64, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x24, 0x0a, 0x0d, 0x74, 0x72,
	0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0d, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64,
	0x12, 0x1e, 0x0a, 0x0a, 0x74, 0x72, 0x61, 0x64, 0x65, 0x50, 0x72, 0x69, 0x63, 0x65, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x05, 0x52, 0x0a, 0x74, 0x72, 0x61, 0x64, 0x65, 0x50, 0x72, 0x69, 0x63, 0x65,
	0x32, 0x4f, 0x0a, 0x05, 0x49, 0x67, 0x53, 0x76, 0x63, 0x12, 0x46, 0x0a, 0x0b, 0x74, 0x72, 0x61,
	0x64, 0x65, 0x41, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x1c, 0x2e, 0x64, 0x65, 0x6d, 0x6f, 0x5f,
	0x69, 0x67, 0x61, 0x70, 0x69, 0x2e, 0x4f, 0x70, 0x65, 0x6e, 0x54, 0x72, 0x61, 0x64, 0x65, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x19, 0x2e, 0x64, 0x65, 0x6d, 0x6f, 0x5f, 0x69, 0x67,
	0x61, 0x70, 0x69, 0x2e, 0x54, 0x72, 0x61, 0x64, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x42, 0x6a, 0x0a, 0x26, 0x63, 0x6f, 0x6d, 0x2e, 0x69, 0x67, 0x67, 0x72, 0x6f, 0x75, 0x70,
	0x2e, 0x77, 0x65, 0x62, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x61, 0x6d, 0x70, 0x6c, 0x65, 0x73, 0x2e,
	0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x42, 0x05, 0x49, 0x67, 0x61,
	0x70, 0x69, 0x50, 0x01, 0x5a, 0x37, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x77, 0x69, 0x71, 0x72, 0x61, 0x6d, 0x2f, 0x49, 0x47, 0x2d, 0x54, 0x72, 0x61, 0x64, 0x69,
	0x6e, 0x67, 0x2d, 0x4d, 0x69, 0x63, 0x72, 0x6f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73,
	0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x69, 0x67, 0x61, 0x70, 0x69, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_protos_igapi_igapi_proto_rawDescOnce sync.Once
	file_protos_igapi_igapi_proto_rawDescData = file_protos_igapi_igapi_proto_rawDesc
)

func file_protos_igapi_igapi_proto_rawDescGZIP() []byte {
	file_protos_igapi_igapi_proto_rawDescOnce.Do(func() {
		file_protos_igapi_igapi_proto_rawDescData = protoimpl.X.CompressGZIP(file_protos_igapi_igapi_proto_rawDescData)
	})
	return file_protos_igapi_igapi_proto_rawDescData
}

var file_protos_igapi_igapi_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_protos_igapi_igapi_proto_goTypes = []interface{}{
	(*OpenTradeRequest)(nil), // 0: demo_igapi.OpenTradeRequest
	(*TradeResponse)(nil),    // 1: demo_igapi.TradeResponse
}
var file_protos_igapi_igapi_proto_depIdxs = []int32{
	0, // 0: demo_igapi.IgSvc.tradeAction:input_type -> demo_igapi.OpenTradeRequest
	1, // 1: demo_igapi.IgSvc.tradeAction:output_type -> demo_igapi.TradeResponse
	1, // [1:2] is the sub-list for method output_type
	0, // [0:1] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_protos_igapi_igapi_proto_init() }
func file_protos_igapi_igapi_proto_init() {
	if File_protos_igapi_igapi_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_protos_igapi_igapi_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*OpenTradeRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_protos_igapi_igapi_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TradeResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_protos_igapi_igapi_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_protos_igapi_igapi_proto_goTypes,
		DependencyIndexes: file_protos_igapi_igapi_proto_depIdxs,
		MessageInfos:      file_protos_igapi_igapi_proto_msgTypes,
	}.Build()
	File_protos_igapi_igapi_proto = out.File
	file_protos_igapi_igapi_proto_rawDesc = nil
	file_protos_igapi_igapi_proto_goTypes = nil
	file_protos_igapi_igapi_proto_depIdxs = nil
}