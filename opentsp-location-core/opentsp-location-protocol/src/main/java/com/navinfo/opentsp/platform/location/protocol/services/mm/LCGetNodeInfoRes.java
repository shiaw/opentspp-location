// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/services/mm/java/GetNodeInfoRes.proto

package com.navinfo.opentsp.platform.location.protocol.services.mm;

public final class LCGetNodeInfoRes {
  private LCGetNodeInfoRes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetNodeInfoResOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .NodeInfo nodeInfo = 1;
    java.util.List<LCNodeInfo.NodeInfo>
        getNodeInfoList();
    LCNodeInfo.NodeInfo getNodeInfo(int index);
    int getNodeInfoCount();
    java.util.List<? extends LCNodeInfo.NodeInfoOrBuilder>
        getNodeInfoOrBuilderList();
    LCNodeInfo.NodeInfoOrBuilder getNodeInfoOrBuilder(
            int index);
  }
  public static final class GetNodeInfoRes extends
      com.google.protobuf.GeneratedMessage
      implements GetNodeInfoResOrBuilder {
    // Use GetNodeInfoRes.newBuilder() to construct.
    private GetNodeInfoRes(Builder builder) {
      super(builder);
    }
    private GetNodeInfoRes(boolean noInit) {}
    
    private static final GetNodeInfoRes defaultInstance;
    public static GetNodeInfoRes getDefaultInstance() {
      return defaultInstance;
    }
    
    public GetNodeInfoRes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCGetNodeInfoRes.internal_static_GetNodeInfoRes_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCGetNodeInfoRes.internal_static_GetNodeInfoRes_fieldAccessorTable;
    }
    
    // repeated .NodeInfo nodeInfo = 1;
    public static final int NODEINFO_FIELD_NUMBER = 1;
    private java.util.List<LCNodeInfo.NodeInfo> nodeInfo_;
    public java.util.List<LCNodeInfo.NodeInfo> getNodeInfoList() {
      return nodeInfo_;
    }
    public java.util.List<? extends LCNodeInfo.NodeInfoOrBuilder>
        getNodeInfoOrBuilderList() {
      return nodeInfo_;
    }
    public int getNodeInfoCount() {
      return nodeInfo_.size();
    }
    public LCNodeInfo.NodeInfo getNodeInfo(int index) {
      return nodeInfo_.get(index);
    }
    public LCNodeInfo.NodeInfoOrBuilder getNodeInfoOrBuilder(
        int index) {
      return nodeInfo_.get(index);
    }
    
    private void initFields() {
      nodeInfo_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      for (int i = 0; i < getNodeInfoCount(); i++) {
        if (!getNodeInfo(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < nodeInfo_.size(); i++) {
        output.writeMessage(1, nodeInfo_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < nodeInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, nodeInfo_.get(i));
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
    
    public static GetNodeInfoRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static GetNodeInfoRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static GetNodeInfoRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static GetNodeInfoRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static GetNodeInfoRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static GetNodeInfoRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static GetNodeInfoRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static GetNodeInfoRes parseDelimitedFrom(
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
    public static GetNodeInfoRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static GetNodeInfoRes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(GetNodeInfoRes prototype) {
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
       implements GetNodeInfoResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCGetNodeInfoRes.internal_static_GetNodeInfoRes_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCGetNodeInfoRes.internal_static_GetNodeInfoRes_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.services.mm.LCGetNodeInfoRes.GetNodeInfoRes.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getNodeInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (nodeInfoBuilder_ == null) {
          nodeInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          nodeInfoBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GetNodeInfoRes.getDescriptor();
      }
      
      public GetNodeInfoRes getDefaultInstanceForType() {
        return GetNodeInfoRes.getDefaultInstance();
      }
      
      public GetNodeInfoRes build() {
        GetNodeInfoRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private GetNodeInfoRes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        GetNodeInfoRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public GetNodeInfoRes buildPartial() {
        GetNodeInfoRes result = new GetNodeInfoRes(this);
        int from_bitField0_ = bitField0_;
        if (nodeInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            nodeInfo_ = java.util.Collections.unmodifiableList(nodeInfo_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.nodeInfo_ = nodeInfo_;
        } else {
          result.nodeInfo_ = nodeInfoBuilder_.build();
        }
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof GetNodeInfoRes) {
          return mergeFrom((GetNodeInfoRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(GetNodeInfoRes other) {
        if (other == GetNodeInfoRes.getDefaultInstance()) return this;
        if (nodeInfoBuilder_ == null) {
          if (!other.nodeInfo_.isEmpty()) {
            if (nodeInfo_.isEmpty()) {
              nodeInfo_ = other.nodeInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNodeInfoIsMutable();
              nodeInfo_.addAll(other.nodeInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.nodeInfo_.isEmpty()) {
            if (nodeInfoBuilder_.isEmpty()) {
              nodeInfoBuilder_.dispose();
              nodeInfoBuilder_ = null;
              nodeInfo_ = other.nodeInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
              nodeInfoBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getNodeInfoFieldBuilder() : null;
            } else {
              nodeInfoBuilder_.addAllMessages(other.nodeInfo_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        for (int i = 0; i < getNodeInfoCount(); i++) {
          if (!getNodeInfo(i).isInitialized()) {
            
            return false;
          }
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
            case 10: {
              LCNodeInfo.NodeInfo.Builder subBuilder = LCNodeInfo.NodeInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addNodeInfo(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .NodeInfo nodeInfo = 1;
      private java.util.List<LCNodeInfo.NodeInfo> nodeInfo_ =
        java.util.Collections.emptyList();
      private void ensureNodeInfoIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          nodeInfo_ = new java.util.ArrayList<LCNodeInfo.NodeInfo>(nodeInfo_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          LCNodeInfo.NodeInfo, LCNodeInfo.NodeInfo.Builder, LCNodeInfo.NodeInfoOrBuilder> nodeInfoBuilder_;
      
      public java.util.List<LCNodeInfo.NodeInfo> getNodeInfoList() {
        if (nodeInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nodeInfo_);
        } else {
          return nodeInfoBuilder_.getMessageList();
        }
      }
      public int getNodeInfoCount() {
        if (nodeInfoBuilder_ == null) {
          return nodeInfo_.size();
        } else {
          return nodeInfoBuilder_.getCount();
        }
      }
      public LCNodeInfo.NodeInfo getNodeInfo(int index) {
        if (nodeInfoBuilder_ == null) {
          return nodeInfo_.get(index);
        } else {
          return nodeInfoBuilder_.getMessage(index);
        }
      }
      public Builder setNodeInfo(
          int index, LCNodeInfo.NodeInfo value) {
        if (nodeInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodeInfoIsMutable();
          nodeInfo_.set(index, value);
          onChanged();
        } else {
          nodeInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setNodeInfo(
          int index, LCNodeInfo.NodeInfo.Builder builderForValue) {
        if (nodeInfoBuilder_ == null) {
          ensureNodeInfoIsMutable();
          nodeInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          nodeInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addNodeInfo(LCNodeInfo.NodeInfo value) {
        if (nodeInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodeInfoIsMutable();
          nodeInfo_.add(value);
          onChanged();
        } else {
          nodeInfoBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addNodeInfo(
          int index, LCNodeInfo.NodeInfo value) {
        if (nodeInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodeInfoIsMutable();
          nodeInfo_.add(index, value);
          onChanged();
        } else {
          nodeInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addNodeInfo(
          LCNodeInfo.NodeInfo.Builder builderForValue) {
        if (nodeInfoBuilder_ == null) {
          ensureNodeInfoIsMutable();
          nodeInfo_.add(builderForValue.build());
          onChanged();
        } else {
          nodeInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addNodeInfo(
          int index, LCNodeInfo.NodeInfo.Builder builderForValue) {
        if (nodeInfoBuilder_ == null) {
          ensureNodeInfoIsMutable();
          nodeInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          nodeInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllNodeInfo(
          Iterable<? extends LCNodeInfo.NodeInfo> values) {
        if (nodeInfoBuilder_ == null) {
          ensureNodeInfoIsMutable();
          super.addAll(values, nodeInfo_);
          onChanged();
        } else {
          nodeInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearNodeInfo() {
        if (nodeInfoBuilder_ == null) {
          nodeInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          nodeInfoBuilder_.clear();
        }
        return this;
      }
      public Builder removeNodeInfo(int index) {
        if (nodeInfoBuilder_ == null) {
          ensureNodeInfoIsMutable();
          nodeInfo_.remove(index);
          onChanged();
        } else {
          nodeInfoBuilder_.remove(index);
        }
        return this;
      }
      public LCNodeInfo.NodeInfo.Builder getNodeInfoBuilder(
          int index) {
        return getNodeInfoFieldBuilder().getBuilder(index);
      }
      public LCNodeInfo.NodeInfoOrBuilder getNodeInfoOrBuilder(
          int index) {
        if (nodeInfoBuilder_ == null) {
          return nodeInfo_.get(index);  } else {
          return nodeInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends LCNodeInfo.NodeInfoOrBuilder>
           getNodeInfoOrBuilderList() {
        if (nodeInfoBuilder_ != null) {
          return nodeInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nodeInfo_);
        }
      }
      public LCNodeInfo.NodeInfo.Builder addNodeInfoBuilder() {
        return getNodeInfoFieldBuilder().addBuilder(
            LCNodeInfo.NodeInfo.getDefaultInstance());
      }
      public LCNodeInfo.NodeInfo.Builder addNodeInfoBuilder(
          int index) {
        return getNodeInfoFieldBuilder().addBuilder(
            index, LCNodeInfo.NodeInfo.getDefaultInstance());
      }
      public java.util.List<LCNodeInfo.NodeInfo.Builder>
           getNodeInfoBuilderList() {
        return getNodeInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          LCNodeInfo.NodeInfo, LCNodeInfo.NodeInfo.Builder, LCNodeInfo.NodeInfoOrBuilder>
          getNodeInfoFieldBuilder() {
        if (nodeInfoBuilder_ == null) {
          nodeInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              LCNodeInfo.NodeInfo, LCNodeInfo.NodeInfo.Builder, LCNodeInfo.NodeInfoOrBuilder>(
                  nodeInfo_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          nodeInfo_ = null;
        }
        return nodeInfoBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:GetNodeInfoRes)
    }
    
    static {
      defaultInstance = new GetNodeInfoRes(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:GetNodeInfoRes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_GetNodeInfoRes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetNodeInfoRes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n0core/proto/services/mm/java/GetNodeInf" +
      "oRes.proto\032*core/proto/services/mm/java/" +
      "NodeInfo.proto\"-\n\016GetNodeInfoRes\022\033\n\010node" +
      "Info\030\001 \003(\0132\t.NodeInfoBN\n:com.navinfo.ope" +
      "ntsp.platform.location.protocol.services" +
      ".mmB\020LCGetNodeInfoRes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_GetNodeInfoRes_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_GetNodeInfoRes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_GetNodeInfoRes_descriptor,
              new String[] { "NodeInfo", },
              GetNodeInfoRes.class,
              GetNodeInfoRes.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          LCNodeInfo.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
