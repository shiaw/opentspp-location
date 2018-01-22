// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/newstatisticsdata/entity/StagnationTimeoutCancelOrNotResult.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity;

public final class LCStagnationTimeoutCancelOrNotResult {
  private LCStagnationTimeoutCancelOrNotResult() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface StagnationTimeoutCancelOrNotResultOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 statusCode = 1;
    boolean hasStatusCode();
    int getStatusCode();
  }
  public static final class StagnationTimeoutCancelOrNotResult extends
      com.google.protobuf.GeneratedMessage
      implements StagnationTimeoutCancelOrNotResultOrBuilder {
    // Use StagnationTimeoutCancelOrNotResult.newBuilder() to construct.
    private StagnationTimeoutCancelOrNotResult(Builder builder) {
      super(builder);
    }
    private StagnationTimeoutCancelOrNotResult(boolean noInit) {}
    
    private static final StagnationTimeoutCancelOrNotResult defaultInstance;
    public static StagnationTimeoutCancelOrNotResult getDefaultInstance() {
      return defaultInstance;
    }
    
    public StagnationTimeoutCancelOrNotResult getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.internal_static_StagnationTimeoutCancelOrNotResult_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.internal_static_StagnationTimeoutCancelOrNotResult_fieldAccessorTable;
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
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.internal_static_StagnationTimeoutCancelOrNotResult_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.internal_static_StagnationTimeoutCancelOrNotResult_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult.newBuilder()
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
        return com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult build() {
        com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult result = new com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult(this);
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
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult.getDefaultInstance()) return this;
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
      
      // @@protoc_insertion_point(builder_scope:StagnationTimeoutCancelOrNotResult)
    }
    
    static {
      defaultInstance = new StagnationTimeoutCancelOrNotResult(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:StagnationTimeoutCancelOrNotResult)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_StagnationTimeoutCancelOrNotResult_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_StagnationTimeoutCancelOrNotResult_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nWcore/proto/webservice/newstatisticsdat" +
      "a/entity/StagnationTimeoutCancelOrNotRes" +
      "ult.proto\"8\n\"StagnationTimeoutCancelOrNo" +
      "tResult\022\022\n\nstatusCode\030\001 \002(\005Bz\nRcom.navin" +
      "fo.opentsp.platform.location.protocol.we" +
      "bservice.newstatisticsdata.entityB$LCSta" +
      "gnationTimeoutCancelOrNotResult"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_StagnationTimeoutCancelOrNotResult_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_StagnationTimeoutCancelOrNotResult_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_StagnationTimeoutCancelOrNotResult_descriptor,
              new java.lang.String[] { "StatusCode", },
              com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult.class,
              com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCStagnationTimeoutCancelOrNotResult.StagnationTimeoutCancelOrNotResult.Builder.class);
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
