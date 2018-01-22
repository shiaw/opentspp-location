// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/services/common/java/ReportServerIdentify.proto

package com.navinfo.opentsp.platform.location.protocol.services.common;

public final class LCReportServerIdentify {
  private LCReportServerIdentify() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ReportServerIdentifyOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .NodeType type = 1;
    boolean hasType();
    com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.NodeType getType();
    
    // required int32 nodeCode = 2;
    boolean hasNodeCode();
    int getNodeCode();
  }
  public static final class ReportServerIdentify extends
      com.google.protobuf.GeneratedMessage
      implements ReportServerIdentifyOrBuilder {
    // Use ReportServerIdentify.newBuilder() to construct.
    private ReportServerIdentify(Builder builder) {
      super(builder);
    }
    private ReportServerIdentify(boolean noInit) {}
    
    private static final ReportServerIdentify defaultInstance;
    public static ReportServerIdentify getDefaultInstance() {
      return defaultInstance;
    }
    
    public ReportServerIdentify getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.internal_static_ReportServerIdentify_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.internal_static_ReportServerIdentify_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .NodeType type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.NodeType type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.NodeType getType() {
      return type_;
    }
    
    // required int32 nodeCode = 2;
    public static final int NODECODE_FIELD_NUMBER = 2;
    private int nodeCode_;
    public boolean hasNodeCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getNodeCode() {
      return nodeCode_;
    }
    
    private void initFields() {
      type_ = com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.NodeType.ta_jt808_2011;
      nodeCode_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNodeCode()) {
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
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, nodeCode_);
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
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, nodeCode_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.internal_static_ReportServerIdentify_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.internal_static_ReportServerIdentify_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify.newBuilder()
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
        type_ = com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.NodeType.ta_jt808_2011;
        bitField0_ = (bitField0_ & ~0x00000001);
        nodeCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify build() {
        com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify result = new com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.nodeCode_ = nodeCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasNodeCode()) {
          setNodeCode(other.getNodeCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (!hasNodeCode()) {
          
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
              com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.NodeType value = com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.NodeType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              nodeCode_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .NodeType type = 1;
      private com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.NodeType type_ = com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.NodeType.ta_jt808_2011;
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.NodeType getType() {
        return type_;
      }
      public Builder setType(com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.NodeType value) {
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
        type_ = com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.NodeType.ta_jt808_2011;
        onChanged();
        return this;
      }
      
      // required int32 nodeCode = 2;
      private int nodeCode_ ;
      public boolean hasNodeCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getNodeCode() {
        return nodeCode_;
      }
      public Builder setNodeCode(int value) {
        bitField0_ |= 0x00000002;
        nodeCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearNodeCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        nodeCode_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:ReportServerIdentify)
    }
    
    static {
      defaultInstance = new ReportServerIdentify(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ReportServerIdentify)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ReportServerIdentify_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ReportServerIdentify_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:core/proto/services/common/java/Report" +
      "ServerIdentify.proto\032.core/proto/service" +
      "s/common/java/NodeType.proto\"A\n\024ReportSe" +
      "rverIdentify\022\027\n\004type\030\001 \002(\0162\t.NodeType\022\020\n" +
      "\010nodeCode\030\002 \002(\005BX\n>com.navinfo.opentsp.p" +
      "latform.location.protocol.services.commo" +
      "nB\026LCReportServerIdentify"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ReportServerIdentify_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ReportServerIdentify_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ReportServerIdentify_descriptor,
              new java.lang.String[] { "Type", "NodeCode", },
              com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify.class,
              com.navinfo.opentsp.platform.location.protocol.services.common.LCReportServerIdentify.ReportServerIdentify.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.services.common.LCNodeType.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
