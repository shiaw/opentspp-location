// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/dataaccess/common/java/VehiclePassTimes.proto

package com.navinfo.opentsp.platform.location.protocol.dataaccess.common;

public final class LCVehiclePassTimes {
  private LCVehiclePassTimes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface VehiclePassTimesOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 areaId = 1;
    boolean hasAreaId();
    long getAreaId();
  }
  public static final class VehiclePassTimes extends
      com.google.protobuf.GeneratedMessage
      implements VehiclePassTimesOrBuilder {
    // Use VehiclePassTimes.newBuilder() to construct.
    private VehiclePassTimes(Builder builder) {
      super(builder);
    }
    private VehiclePassTimes(boolean noInit) {}
    
    private static final VehiclePassTimes defaultInstance;
    public static VehiclePassTimes getDefaultInstance() {
      return defaultInstance;
    }
    
    public VehiclePassTimes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.internal_static_VehiclePassTimes_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.internal_static_VehiclePassTimes_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 areaId = 1;
    public static final int AREAID_FIELD_NUMBER = 1;
    private long areaId_;
    public boolean hasAreaId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getAreaId() {
      return areaId_;
    }
    
    private void initFields() {
      areaId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasAreaId()) {
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
        output.writeInt64(1, areaId_);
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
          .computeInt64Size(1, areaId_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.internal_static_VehiclePassTimes_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.internal_static_VehiclePassTimes_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes.newBuilder()
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
        areaId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes build() {
        com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes result = new com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.areaId_ = areaId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes.getDefaultInstance()) return this;
        if (other.hasAreaId()) {
          setAreaId(other.getAreaId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasAreaId()) {
          
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
              areaId_ = input.readInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 areaId = 1;
      private long areaId_ ;
      public boolean hasAreaId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getAreaId() {
        return areaId_;
      }
      public Builder setAreaId(long value) {
        bitField0_ |= 0x00000001;
        areaId_ = value;
        onChanged();
        return this;
      }
      public Builder clearAreaId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        areaId_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:VehiclePassTimes)
    }
    
    static {
      defaultInstance = new VehiclePassTimes(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:VehiclePassTimes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_VehiclePassTimes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_VehiclePassTimes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8core/proto/dataaccess/common/java/Vehi" +
      "clePassTimes.proto\"\"\n\020VehiclePassTimes\022\016" +
      "\n\006areaId\030\001 \002(\003BV\n@com.navinfo.opentsp.pl" +
      "atform.location.protocol.dataaccess.comm" +
      "onB\022LCVehiclePassTimes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_VehiclePassTimes_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_VehiclePassTimes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_VehiclePassTimes_descriptor,
              new java.lang.String[] { "AreaId", },
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes.class,
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCVehiclePassTimes.VehiclePassTimes.Builder.class);
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
