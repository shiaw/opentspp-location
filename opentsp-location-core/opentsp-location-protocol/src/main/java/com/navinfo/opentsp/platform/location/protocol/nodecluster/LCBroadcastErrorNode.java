// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/nodecluster/java/BroadcastErrorNode.proto

package com.navinfo.opentsp.platform.location.protocol.nodecluster;

public final class LCBroadcastErrorNode {
  private LCBroadcastErrorNode() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BroadcastErrorNodeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int64 errorNodeCode = 1;
    boolean hasErrorNodeCode();
    long getErrorNodeCode();
    
    // optional int64 replaceNodeCode = 2;
    boolean hasReplaceNodeCode();
    long getReplaceNodeCode();
  }
  public static final class BroadcastErrorNode extends
      com.google.protobuf.GeneratedMessage
      implements BroadcastErrorNodeOrBuilder {
    // Use BroadcastErrorNode.newBuilder() to construct.
    private BroadcastErrorNode(Builder builder) {
      super(builder);
    }
    private BroadcastErrorNode(boolean noInit) {}
    
    private static final BroadcastErrorNode defaultInstance;
    public static BroadcastErrorNode getDefaultInstance() {
      return defaultInstance;
    }
    
    public BroadcastErrorNode getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCBroadcastErrorNode.internal_static_BroadcastErrorNode_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCBroadcastErrorNode.internal_static_BroadcastErrorNode_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int64 errorNodeCode = 1;
    public static final int ERRORNODECODE_FIELD_NUMBER = 1;
    private long errorNodeCode_;
    public boolean hasErrorNodeCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getErrorNodeCode() {
      return errorNodeCode_;
    }
    
    // optional int64 replaceNodeCode = 2;
    public static final int REPLACENODECODE_FIELD_NUMBER = 2;
    private long replaceNodeCode_;
    public boolean hasReplaceNodeCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getReplaceNodeCode() {
      return replaceNodeCode_;
    }
    
    private void initFields() {
      errorNodeCode_ = 0L;
      replaceNodeCode_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, errorNodeCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, replaceNodeCode_);
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
          .computeInt64Size(1, errorNodeCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, replaceNodeCode_);
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
    
    public static BroadcastErrorNode parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static BroadcastErrorNode parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static BroadcastErrorNode parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static BroadcastErrorNode parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static BroadcastErrorNode parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static BroadcastErrorNode parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static BroadcastErrorNode parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static BroadcastErrorNode parseDelimitedFrom(
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
    public static BroadcastErrorNode parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static BroadcastErrorNode parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(BroadcastErrorNode prototype) {
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
       implements BroadcastErrorNodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCBroadcastErrorNode.internal_static_BroadcastErrorNode_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCBroadcastErrorNode.internal_static_BroadcastErrorNode_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.nodecluster.LCBroadcastErrorNode.BroadcastErrorNode.newBuilder()
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
        errorNodeCode_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        replaceNodeCode_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BroadcastErrorNode.getDescriptor();
      }
      
      public BroadcastErrorNode getDefaultInstanceForType() {
        return BroadcastErrorNode.getDefaultInstance();
      }
      
      public BroadcastErrorNode build() {
        BroadcastErrorNode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private BroadcastErrorNode buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        BroadcastErrorNode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public BroadcastErrorNode buildPartial() {
        BroadcastErrorNode result = new BroadcastErrorNode(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.errorNodeCode_ = errorNodeCode_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.replaceNodeCode_ = replaceNodeCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BroadcastErrorNode) {
          return mergeFrom((BroadcastErrorNode)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(BroadcastErrorNode other) {
        if (other == BroadcastErrorNode.getDefaultInstance()) return this;
        if (other.hasErrorNodeCode()) {
          setErrorNodeCode(other.getErrorNodeCode());
        }
        if (other.hasReplaceNodeCode()) {
          setReplaceNodeCode(other.getReplaceNodeCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
              bitField0_ |= 0x00000001;
              errorNodeCode_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              replaceNodeCode_ = input.readInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int64 errorNodeCode = 1;
      private long errorNodeCode_ ;
      public boolean hasErrorNodeCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getErrorNodeCode() {
        return errorNodeCode_;
      }
      public Builder setErrorNodeCode(long value) {
        bitField0_ |= 0x00000001;
        errorNodeCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearErrorNodeCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        errorNodeCode_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 replaceNodeCode = 2;
      private long replaceNodeCode_ ;
      public boolean hasReplaceNodeCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getReplaceNodeCode() {
        return replaceNodeCode_;
      }
      public Builder setReplaceNodeCode(long value) {
        bitField0_ |= 0x00000002;
        replaceNodeCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearReplaceNodeCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        replaceNodeCode_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:BroadcastErrorNode)
    }
    
    static {
      defaultInstance = new BroadcastErrorNode(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:BroadcastErrorNode)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_BroadcastErrorNode_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BroadcastErrorNode_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n4core/proto/nodecluster/java/BroadcastE" +
      "rrorNode.proto\0323core/proto/common/java/P" +
      "latformResponseResult.proto\"D\n\022Broadcast" +
      "ErrorNode\022\025\n\rerrorNodeCode\030\001 \001(\003\022\027\n\017repl" +
      "aceNodeCode\030\002 \001(\003BR\n:com.navinfo.opentsp" +
      ".platform.location.protocol.nodeclusterB" +
      "\024LCBroadcastErrorNode"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_BroadcastErrorNode_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_BroadcastErrorNode_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_BroadcastErrorNode_descriptor,
              new String[] { "ErrorNodeCode", "ReplaceNodeCode", },
              BroadcastErrorNode.class,
              BroadcastErrorNode.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
