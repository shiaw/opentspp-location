// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/nodecluster/java/RequestNewNode.proto

package com.navinfo.opentsp.platform.location.protocol.nodecluster;

public final class LCRequestNewNode {
  private LCRequestNewNode() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RequestNewNodeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .NodeType type = 1;
    boolean hasType();
    com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.NodeType getType();
  }
  public static final class RequestNewNode extends
      com.google.protobuf.GeneratedMessage
      implements RequestNewNodeOrBuilder {
    // Use RequestNewNode.newBuilder() to construct.
    private RequestNewNode(Builder builder) {
      super(builder);
    }
    private RequestNewNode(boolean noInit) {}
    
    private static final RequestNewNode defaultInstance;
    public static RequestNewNode getDefaultInstance() {
      return defaultInstance;
    }
    
    public RequestNewNode getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCRequestNewNode.internal_static_RequestNewNode_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCRequestNewNode.internal_static_RequestNewNode_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .NodeType type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.NodeType type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.NodeType getType() {
      return type_;
    }
    
    private void initFields() {
      type_ = com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.NodeType.ta;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, type_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static RequestNewNode parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static RequestNewNode parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static RequestNewNode parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static RequestNewNode parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static RequestNewNode parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static RequestNewNode parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static RequestNewNode parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static RequestNewNode parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static RequestNewNode parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static RequestNewNode parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(RequestNewNode prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements RequestNewNodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCRequestNewNode.internal_static_RequestNewNode_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCRequestNewNode.internal_static_RequestNewNode_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.nodecluster.LCRequestNewNode.RequestNewNode.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        type_ = com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.NodeType.ta;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RequestNewNode.getDescriptor();
      }
      
      public RequestNewNode getDefaultInstanceForType() {
        return RequestNewNode.getDefaultInstance();
      }
      
      public RequestNewNode build() {
        RequestNewNode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private RequestNewNode buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        RequestNewNode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public RequestNewNode buildPartial() {
        RequestNewNode result = new RequestNewNode(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestNewNode) {
          return mergeFrom((RequestNewNode)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(RequestNewNode other) {
        if (other == RequestNewNode.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.NodeType value = com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.NodeType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .NodeType type = 1;
      private com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.NodeType type_ = com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.NodeType.ta;
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.NodeType getType() {
        return type_;
      }
      public Builder setType(com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.NodeType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.NodeType.ta;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:RequestNewNode)
    }
    
    static {
      defaultInstance = new RequestNewNode(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:RequestNewNode)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestNewNode_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RequestNewNode_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n0core/proto/nodecluster/java/RequestNew" +
      "Node.proto\0321core/proto/nodecluster/commo" +
      "n/java/NodeType.proto\")\n\016RequestNewNode\022" +
      "\027\n\004type\030\001 \002(\0162\t.NodeTypeBN\n:com.navinfo." +
      "opentsp.platform.location.protocol.nodec" +
      "lusterB\020LCRequestNewNode"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_RequestNewNode_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_RequestNewNode_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_RequestNewNode_descriptor,
              new String[] { "Type", },
              RequestNewNode.class,
              RequestNewNode.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCNodeType.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}