// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/statisticsdata/entity/OvertimeParkingData.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity;

public final class LCOvertimeParkingData {
  private LCOvertimeParkingData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface OvertimeParkingDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string _id = 1;
    boolean hasId();
    String getId();
    
    // required int64 terminalId = 2;
    boolean hasTerminalId();
    long getTerminalId();
    
    // required int64 areaId = 3;
    boolean hasAreaId();
    long getAreaId();
    
    // required int64 beginDate = 4;
    boolean hasBeginDate();
    long getBeginDate();
    
    // required int64 endDate = 5;
    boolean hasEndDate();
    long getEndDate();
    
    // required int32 continuousTime = 6;
    boolean hasContinuousTime();
    int getContinuousTime();
    
    // required int32 limitParking = 7;
    boolean hasLimitParking();
    int getLimitParking();
    
    // optional int32 beginLat = 8;
    boolean hasBeginLat();
    int getBeginLat();
    
    // optional int32 beginLng = 9;
    boolean hasBeginLng();
    int getBeginLng();
    
    // optional int32 endLat = 10;
    boolean hasEndLat();
    int getEndLat();
    
    // optional int32 endLng = 11;
    boolean hasEndLng();
    int getEndLng();
  }
  public static final class OvertimeParkingData extends
      com.google.protobuf.GeneratedMessage
      implements OvertimeParkingDataOrBuilder {
    // Use OvertimeParkingData.newBuilder() to construct.
    private OvertimeParkingData(Builder builder) {
      super(builder);
    }
    private OvertimeParkingData(boolean noInit) {}
    
    private static final OvertimeParkingData defaultInstance;
    public static OvertimeParkingData getDefaultInstance() {
      return defaultInstance;
    }
    
    public OvertimeParkingData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.internal_static_OvertimeParkingData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.internal_static_OvertimeParkingData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string _id = 1;
    public static final int _ID_FIELD_NUMBER = 1;
    private java.lang.Object Id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getId() {
      java.lang.Object ref = Id_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          Id_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = Id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        Id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int64 terminalId = 2;
    public static final int TERMINALID_FIELD_NUMBER = 2;
    private long terminalId_;
    public boolean hasTerminalId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getTerminalId() {
      return terminalId_;
    }
    
    // required int64 areaId = 3;
    public static final int AREAID_FIELD_NUMBER = 3;
    private long areaId_;
    public boolean hasAreaId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getAreaId() {
      return areaId_;
    }
    
    // required int64 beginDate = 4;
    public static final int BEGINDATE_FIELD_NUMBER = 4;
    private long beginDate_;
    public boolean hasBeginDate() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public long getBeginDate() {
      return beginDate_;
    }
    
    // required int64 endDate = 5;
    public static final int ENDDATE_FIELD_NUMBER = 5;
    private long endDate_;
    public boolean hasEndDate() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public long getEndDate() {
      return endDate_;
    }
    
    // required int32 continuousTime = 6;
    public static final int CONTINUOUSTIME_FIELD_NUMBER = 6;
    private int continuousTime_;
    public boolean hasContinuousTime() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getContinuousTime() {
      return continuousTime_;
    }
    
    // required int32 limitParking = 7;
    public static final int LIMITPARKING_FIELD_NUMBER = 7;
    private int limitParking_;
    public boolean hasLimitParking() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getLimitParking() {
      return limitParking_;
    }
    
    // optional int32 beginLat = 8;
    public static final int BEGINLAT_FIELD_NUMBER = 8;
    private int beginLat_;
    public boolean hasBeginLat() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public int getBeginLat() {
      return beginLat_;
    }
    
    // optional int32 beginLng = 9;
    public static final int BEGINLNG_FIELD_NUMBER = 9;
    private int beginLng_;
    public boolean hasBeginLng() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public int getBeginLng() {
      return beginLng_;
    }
    
    // optional int32 endLat = 10;
    public static final int ENDLAT_FIELD_NUMBER = 10;
    private int endLat_;
    public boolean hasEndLat() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    public int getEndLat() {
      return endLat_;
    }
    
    // optional int32 endLng = 11;
    public static final int ENDLNG_FIELD_NUMBER = 11;
    private int endLng_;
    public boolean hasEndLng() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    public int getEndLng() {
      return endLng_;
    }
    
    private void initFields() {
      Id_ = "";
      terminalId_ = 0L;
      areaId_ = 0L;
      beginDate_ = 0L;
      endDate_ = 0L;
      continuousTime_ = 0;
      limitParking_ = 0;
      beginLat_ = 0;
      beginLng_ = 0;
      endLat_ = 0;
      endLng_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTerminalId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAreaId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBeginDate()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEndDate()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasContinuousTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLimitParking()) {
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
        output.writeBytes(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, terminalId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, areaId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, beginDate_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, endDate_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, continuousTime_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, limitParking_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(8, beginLat_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(9, beginLng_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeInt32(10, endLat_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeInt32(11, endLng_);
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
          .computeBytesSize(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, terminalId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, areaId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, beginDate_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, endDate_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, continuousTime_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, limitParking_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, beginLat_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, beginLng_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, endLat_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, endLng_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.internal_static_OvertimeParkingData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.internal_static_OvertimeParkingData_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData.newBuilder()
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
        Id_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        terminalId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        areaId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        beginDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        endDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        continuousTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        limitParking_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        beginLat_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        beginLng_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        endLat_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        endLng_ = 0;
        bitField0_ = (bitField0_ & ~0x00000400);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData build() {
        com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData result = new com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.Id_ = Id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.terminalId_ = terminalId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.areaId_ = areaId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.beginDate_ = beginDate_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.endDate_ = endDate_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.continuousTime_ = continuousTime_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.limitParking_ = limitParking_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.beginLat_ = beginLat_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.beginLng_ = beginLng_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.endLat_ = endLat_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.endLng_ = endLng_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasTerminalId()) {
          setTerminalId(other.getTerminalId());
        }
        if (other.hasAreaId()) {
          setAreaId(other.getAreaId());
        }
        if (other.hasBeginDate()) {
          setBeginDate(other.getBeginDate());
        }
        if (other.hasEndDate()) {
          setEndDate(other.getEndDate());
        }
        if (other.hasContinuousTime()) {
          setContinuousTime(other.getContinuousTime());
        }
        if (other.hasLimitParking()) {
          setLimitParking(other.getLimitParking());
        }
        if (other.hasBeginLat()) {
          setBeginLat(other.getBeginLat());
        }
        if (other.hasBeginLng()) {
          setBeginLng(other.getBeginLng());
        }
        if (other.hasEndLat()) {
          setEndLat(other.getEndLat());
        }
        if (other.hasEndLng()) {
          setEndLng(other.getEndLng());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasTerminalId()) {
          
          return false;
        }
        if (!hasAreaId()) {
          
          return false;
        }
        if (!hasBeginDate()) {
          
          return false;
        }
        if (!hasEndDate()) {
          
          return false;
        }
        if (!hasContinuousTime()) {
          
          return false;
        }
        if (!hasLimitParking()) {
          
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
            case 10: {
              bitField0_ |= 0x00000001;
              Id_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              terminalId_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              areaId_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              beginDate_ = input.readInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              endDate_ = input.readInt64();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              continuousTime_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              limitParking_ = input.readInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              beginLat_ = input.readInt32();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              beginLng_ = input.readInt32();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              endLat_ = input.readInt32();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000400;
              endLng_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string _id = 1;
      private java.lang.Object Id_ = "";
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getId() {
        java.lang.Object ref = Id_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          Id_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        Id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        Id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      void setId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        Id_ = value;
        onChanged();
      }
      
      // required int64 terminalId = 2;
      private long terminalId_ ;
      public boolean hasTerminalId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getTerminalId() {
        return terminalId_;
      }
      public Builder setTerminalId(long value) {
        bitField0_ |= 0x00000002;
        terminalId_ = value;
        onChanged();
        return this;
      }
      public Builder clearTerminalId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        terminalId_ = 0L;
        onChanged();
        return this;
      }
      
      // required int64 areaId = 3;
      private long areaId_ ;
      public boolean hasAreaId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getAreaId() {
        return areaId_;
      }
      public Builder setAreaId(long value) {
        bitField0_ |= 0x00000004;
        areaId_ = value;
        onChanged();
        return this;
      }
      public Builder clearAreaId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        areaId_ = 0L;
        onChanged();
        return this;
      }
      
      // required int64 beginDate = 4;
      private long beginDate_ ;
      public boolean hasBeginDate() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public long getBeginDate() {
        return beginDate_;
      }
      public Builder setBeginDate(long value) {
        bitField0_ |= 0x00000008;
        beginDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearBeginDate() {
        bitField0_ = (bitField0_ & ~0x00000008);
        beginDate_ = 0L;
        onChanged();
        return this;
      }
      
      // required int64 endDate = 5;
      private long endDate_ ;
      public boolean hasEndDate() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public long getEndDate() {
        return endDate_;
      }
      public Builder setEndDate(long value) {
        bitField0_ |= 0x00000010;
        endDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndDate() {
        bitField0_ = (bitField0_ & ~0x00000010);
        endDate_ = 0L;
        onChanged();
        return this;
      }
      
      // required int32 continuousTime = 6;
      private int continuousTime_ ;
      public boolean hasContinuousTime() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getContinuousTime() {
        return continuousTime_;
      }
      public Builder setContinuousTime(int value) {
        bitField0_ |= 0x00000020;
        continuousTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearContinuousTime() {
        bitField0_ = (bitField0_ & ~0x00000020);
        continuousTime_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 limitParking = 7;
      private int limitParking_ ;
      public boolean hasLimitParking() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getLimitParking() {
        return limitParking_;
      }
      public Builder setLimitParking(int value) {
        bitField0_ |= 0x00000040;
        limitParking_ = value;
        onChanged();
        return this;
      }
      public Builder clearLimitParking() {
        bitField0_ = (bitField0_ & ~0x00000040);
        limitParking_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 beginLat = 8;
      private int beginLat_ ;
      public boolean hasBeginLat() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public int getBeginLat() {
        return beginLat_;
      }
      public Builder setBeginLat(int value) {
        bitField0_ |= 0x00000080;
        beginLat_ = value;
        onChanged();
        return this;
      }
      public Builder clearBeginLat() {
        bitField0_ = (bitField0_ & ~0x00000080);
        beginLat_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 beginLng = 9;
      private int beginLng_ ;
      public boolean hasBeginLng() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public int getBeginLng() {
        return beginLng_;
      }
      public Builder setBeginLng(int value) {
        bitField0_ |= 0x00000100;
        beginLng_ = value;
        onChanged();
        return this;
      }
      public Builder clearBeginLng() {
        bitField0_ = (bitField0_ & ~0x00000100);
        beginLng_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 endLat = 10;
      private int endLat_ ;
      public boolean hasEndLat() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      public int getEndLat() {
        return endLat_;
      }
      public Builder setEndLat(int value) {
        bitField0_ |= 0x00000200;
        endLat_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndLat() {
        bitField0_ = (bitField0_ & ~0x00000200);
        endLat_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 endLng = 11;
      private int endLng_ ;
      public boolean hasEndLng() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      public int getEndLng() {
        return endLng_;
      }
      public Builder setEndLng(int value) {
        bitField0_ |= 0x00000400;
        endLng_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndLng() {
        bitField0_ = (bitField0_ & ~0x00000400);
        endLng_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:OvertimeParkingData)
    }
    
    static {
      defaultInstance = new OvertimeParkingData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:OvertimeParkingData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_OvertimeParkingData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_OvertimeParkingData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEcore/proto/webservice/statisticsdata/e" +
      "ntity/OvertimeParkingData.proto\"\334\001\n\023Over" +
      "timeParkingData\022\013\n\003_id\030\001 \002(\t\022\022\n\nterminal" +
      "Id\030\002 \002(\003\022\016\n\006areaId\030\003 \002(\003\022\021\n\tbeginDate\030\004 " +
      "\002(\003\022\017\n\007endDate\030\005 \002(\003\022\026\n\016continuousTime\030\006" +
      " \002(\005\022\024\n\014limitParking\030\007 \002(\005\022\020\n\010beginLat\030\010" +
      " \001(\005\022\020\n\010beginLng\030\t \001(\005\022\016\n\006endLat\030\n \001(\005\022\016" +
      "\n\006endLng\030\013 \001(\005Bh\nOcom.navinfo.opentsp.pl" +
      "atform.location.protocol.webservice.stat" +
      "isticsdata.entityB\025LCOvertimeParkingData"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_OvertimeParkingData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_OvertimeParkingData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_OvertimeParkingData_descriptor,
              new java.lang.String[] { "Id", "TerminalId", "AreaId", "BeginDate", "EndDate", "ContinuousTime", "LimitParking", "BeginLat", "BeginLng", "EndLat", "EndLng", },
              com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData.class,
              com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOvertimeParkingData.OvertimeParkingData.Builder.class);
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
