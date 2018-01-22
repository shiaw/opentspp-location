// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/dataaccess/common/java/AreaData.proto

package com.navinfo.opentsp.platform.location.protocol.dataaccess.common;

public final class LCAreaData {
  private LCAreaData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AreaDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 dataSN = 1;
    boolean hasDataSN();
    int getDataSN();
    
    // optional int64 dataStatus = 2;
    boolean hasDataStatus();
    long getDataStatus();
    
    // optional int32 longitude = 3;
    boolean hasLongitude();
    int getLongitude();
    
    // optional int32 latitude = 4;
    boolean hasLatitude();
    int getLatitude();
    
    // optional int32 radiusLength = 5;
    boolean hasRadiusLength();
    int getRadiusLength();
  }
  public static final class AreaData extends
      com.google.protobuf.GeneratedMessage
      implements AreaDataOrBuilder {
    // Use AreaData.newBuilder() to construct.
    private AreaData(Builder builder) {
      super(builder);
    }
    private AreaData(boolean noInit) {}
    
    private static final AreaData defaultInstance;
    public static AreaData getDefaultInstance() {
      return defaultInstance;
    }
    
    public AreaData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.internal_static_AreaData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.internal_static_AreaData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 dataSN = 1;
    public static final int DATASN_FIELD_NUMBER = 1;
    private int dataSN_;
    public boolean hasDataSN() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getDataSN() {
      return dataSN_;
    }
    
    // optional int64 dataStatus = 2;
    public static final int DATASTATUS_FIELD_NUMBER = 2;
    private long dataStatus_;
    public boolean hasDataStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getDataStatus() {
      return dataStatus_;
    }
    
    // optional int32 longitude = 3;
    public static final int LONGITUDE_FIELD_NUMBER = 3;
    private int longitude_;
    public boolean hasLongitude() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getLongitude() {
      return longitude_;
    }
    
    // optional int32 latitude = 4;
    public static final int LATITUDE_FIELD_NUMBER = 4;
    private int latitude_;
    public boolean hasLatitude() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getLatitude() {
      return latitude_;
    }
    
    // optional int32 radiusLength = 5;
    public static final int RADIUSLENGTH_FIELD_NUMBER = 5;
    private int radiusLength_;
    public boolean hasRadiusLength() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getRadiusLength() {
      return radiusLength_;
    }
    
    private void initFields() {
      dataSN_ = 0;
      dataStatus_ = 0L;
      longitude_ = 0;
      latitude_ = 0;
      radiusLength_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasDataSN()) {
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
        output.writeInt32(1, dataSN_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, dataStatus_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, longitude_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, latitude_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, radiusLength_);
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
          .computeInt32Size(1, dataSN_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, dataStatus_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, longitude_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, latitude_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, radiusLength_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.internal_static_AreaData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.internal_static_AreaData_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData.newBuilder()
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
        dataSN_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        dataStatus_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        longitude_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        latitude_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        radiusLength_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData build() {
        com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData result = new com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.dataSN_ = dataSN_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.dataStatus_ = dataStatus_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.longitude_ = longitude_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.latitude_ = latitude_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.radiusLength_ = radiusLength_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData.getDefaultInstance()) return this;
        if (other.hasDataSN()) {
          setDataSN(other.getDataSN());
        }
        if (other.hasDataStatus()) {
          setDataStatus(other.getDataStatus());
        }
        if (other.hasLongitude()) {
          setLongitude(other.getLongitude());
        }
        if (other.hasLatitude()) {
          setLatitude(other.getLatitude());
        }
        if (other.hasRadiusLength()) {
          setRadiusLength(other.getRadiusLength());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasDataSN()) {
          
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
              dataSN_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              dataStatus_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              longitude_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              latitude_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              radiusLength_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 dataSN = 1;
      private int dataSN_ ;
      public boolean hasDataSN() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getDataSN() {
        return dataSN_;
      }
      public Builder setDataSN(int value) {
        bitField0_ |= 0x00000001;
        dataSN_ = value;
        onChanged();
        return this;
      }
      public Builder clearDataSN() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dataSN_ = 0;
        onChanged();
        return this;
      }
      
      // optional int64 dataStatus = 2;
      private long dataStatus_ ;
      public boolean hasDataStatus() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getDataStatus() {
        return dataStatus_;
      }
      public Builder setDataStatus(long value) {
        bitField0_ |= 0x00000002;
        dataStatus_ = value;
        onChanged();
        return this;
      }
      public Builder clearDataStatus() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dataStatus_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int32 longitude = 3;
      private int longitude_ ;
      public boolean hasLongitude() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getLongitude() {
        return longitude_;
      }
      public Builder setLongitude(int value) {
        bitField0_ |= 0x00000004;
        longitude_ = value;
        onChanged();
        return this;
      }
      public Builder clearLongitude() {
        bitField0_ = (bitField0_ & ~0x00000004);
        longitude_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 latitude = 4;
      private int latitude_ ;
      public boolean hasLatitude() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getLatitude() {
        return latitude_;
      }
      public Builder setLatitude(int value) {
        bitField0_ |= 0x00000008;
        latitude_ = value;
        onChanged();
        return this;
      }
      public Builder clearLatitude() {
        bitField0_ = (bitField0_ & ~0x00000008);
        latitude_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 radiusLength = 5;
      private int radiusLength_ ;
      public boolean hasRadiusLength() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getRadiusLength() {
        return radiusLength_;
      }
      public Builder setRadiusLength(int value) {
        bitField0_ |= 0x00000010;
        radiusLength_ = value;
        onChanged();
        return this;
      }
      public Builder clearRadiusLength() {
        bitField0_ = (bitField0_ & ~0x00000010);
        radiusLength_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:AreaData)
    }
    
    static {
      defaultInstance = new AreaData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:AreaData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_AreaData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AreaData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0core/proto/dataaccess/common/java/Area" +
      "Data.proto\"i\n\010AreaData\022\016\n\006dataSN\030\001 \002(\005\022\022" +
      "\n\ndataStatus\030\002 \001(\003\022\021\n\tlongitude\030\003 \001(\005\022\020\n" +
      "\010latitude\030\004 \001(\005\022\024\n\014radiusLength\030\005 \001(\005BN\n" +
      "@com.navinfo.opentsp.platform.location.p" +
      "rotocol.dataaccess.commonB\nLCAreaData"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_AreaData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_AreaData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_AreaData_descriptor,
              new java.lang.String[] { "DataSN", "DataStatus", "Longitude", "Latitude", "RadiusLength", },
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData.class,
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaData.AreaData.Builder.class);
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
