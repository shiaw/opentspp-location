// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/originaldata/java/DelOvertimeParkResult.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.originaldata;

public final class LCDelOvertimeParkResult {
  private LCDelOvertimeParkResult() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DelOvertimeParkResultOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 statusCode = 1;
    boolean hasStatusCode();
    int getStatusCode();
  }
  public static final class DelOvertimeParkResult extends
      com.google.protobuf.GeneratedMessage
      implements DelOvertimeParkResultOrBuilder {
    // Use DelOvertimeParkResult.newBuilder() to construct.
    private DelOvertimeParkResult(Builder builder) {
      super(builder);
    }
    private DelOvertimeParkResult(boolean noInit) {}
    
    private static final DelOvertimeParkResult defaultInstance;
    public static DelOvertimeParkResult getDefaultInstance() {
      return defaultInstance;
    }
    
    public DelOvertimeParkResult getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCDelOvertimeParkResult.internal_static_DelOvertimeParkResult_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCDelOvertimeParkResult.internal_static_DelOvertimeParkResult_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 statusCode = 1;
    public static final int STATUSCODE_FIELD_NUMBER = 1;
    private int statusCode_;
    public boolean hasStatusCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getStatusCode() {
      return statusCode_;
    }
    
    private void initFields() {
      statusCode_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasStatusCode()) {
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
        output.writeInt32(1, statusCode_);
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
          .computeInt32Size(1, statusCode_);
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
    
    public static DelOvertimeParkResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static DelOvertimeParkResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static DelOvertimeParkResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static DelOvertimeParkResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static DelOvertimeParkResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static DelOvertimeParkResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static DelOvertimeParkResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static DelOvertimeParkResult parseDelimitedFrom(
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
    public static DelOvertimeParkResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static DelOvertimeParkResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(DelOvertimeParkResult prototype) {
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
       implements DelOvertimeParkResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCDelOvertimeParkResult.internal_static_DelOvertimeParkResult_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCDelOvertimeParkResult.internal_static_DelOvertimeParkResult_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCDelOvertimeParkResult.DelOvertimeParkResult.newBuilder()
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
        statusCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DelOvertimeParkResult.getDescriptor();
      }
      
      public DelOvertimeParkResult getDefaultInstanceForType() {
        return DelOvertimeParkResult.getDefaultInstance();
      }
      
      public DelOvertimeParkResult build() {
        DelOvertimeParkResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private DelOvertimeParkResult buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        DelOvertimeParkResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public DelOvertimeParkResult buildPartial() {
        DelOvertimeParkResult result = new DelOvertimeParkResult(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.statusCode_ = statusCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof DelOvertimeParkResult) {
          return mergeFrom((DelOvertimeParkResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(DelOvertimeParkResult other) {
        if (other == DelOvertimeParkResult.getDefaultInstance()) return this;
        if (other.hasStatusCode()) {
          setStatusCode(other.getStatusCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasStatusCode()) {
          
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
              bitField0_ |= 0x00000001;
              statusCode_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 statusCode = 1;
      private int statusCode_ ;
      public boolean hasStatusCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getStatusCode() {
        return statusCode_;
      }
      public Builder setStatusCode(int value) {
        bitField0_ |= 0x00000001;
        statusCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearStatusCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        statusCode_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:DelOvertimeParkResult)
    }
    
    static {
      defaultInstance = new DelOvertimeParkResult(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:DelOvertimeParkResult)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_DelOvertimeParkResult_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DelOvertimeParkResult_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nCcore/proto/webservice/originaldata/jav" +
      "a/DelOvertimeParkResult.proto\"+\n\025DelOver" +
      "timeParkResult\022\022\n\nstatusCode\030\001 \002(\005Ba\nFco" +
      "m.navinfo.opentsp.platform.location.prot" +
      "ocol.webservice.originaldataB\027LCDelOvert" +
      "imeParkResult"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_DelOvertimeParkResult_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_DelOvertimeParkResult_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_DelOvertimeParkResult_descriptor,
              new String[] { "StatusCode", },
              DelOvertimeParkResult.class,
              DelOvertimeParkResult.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
