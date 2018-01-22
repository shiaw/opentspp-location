// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/newstatisticsdata/entity/MileageConsumptionRes.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity;

public final class LCMileageConsumptionRes {
  private LCMileageConsumptionRes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MileageConsumptionResOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 terminalID = 1;
    boolean hasTerminalID();
    long getTerminalID();
    
    // optional int64 mileage = 2;
    boolean hasMileage();
    long getMileage();
    
    // optional int32 staticDate = 3;
    boolean hasStaticDate();
    int getStaticDate();
    
    // optional float oilConsumption = 4;
    boolean hasOilConsumption();
    float getOilConsumption();
    
    // optional int64 beginMileage = 5;
    boolean hasBeginMileage();
    long getBeginMileage();
    
    // optional int64 endMileage = 6;
    boolean hasEndMileage();
    long getEndMileage();
    
    // optional int64 startDate = 7;
    boolean hasStartDate();
    long getStartDate();
    
    // optional int64 endDate = 8;
    boolean hasEndDate();
    long getEndDate();
    
    // optional int32 beginLat = 9;
    boolean hasBeginLat();
    int getBeginLat();
    
    // optional int32 beginLng = 10;
    boolean hasBeginLng();
    int getBeginLng();
    
    // optional int32 endLat = 11;
    boolean hasEndLat();
    int getEndLat();
    
    // optional int32 endLng = 12;
    boolean hasEndLng();
    int getEndLng();
    
    // optional float oilValue = 13;
    boolean hasOilValue();
    float getOilValue();
  }
  public static final class MileageConsumptionRes extends
      com.google.protobuf.GeneratedMessage
      implements MileageConsumptionResOrBuilder {
    // Use MileageConsumptionRes.newBuilder() to construct.
    private MileageConsumptionRes(Builder builder) {
      super(builder);
    }
    private MileageConsumptionRes(boolean noInit) {}
    
    private static final MileageConsumptionRes defaultInstance;
    public static MileageConsumptionRes getDefaultInstance() {
      return defaultInstance;
    }
    
    public MileageConsumptionRes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCMileageConsumptionRes.internal_static_MileageConsumptionRes_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCMileageConsumptionRes.internal_static_MileageConsumptionRes_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 terminalID = 1;
    public static final int TERMINALID_FIELD_NUMBER = 1;
    private long terminalID_;
    public boolean hasTerminalID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getTerminalID() {
      return terminalID_;
    }
    
    // optional int64 mileage = 2;
    public static final int MILEAGE_FIELD_NUMBER = 2;
    private long mileage_;
    public boolean hasMileage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getMileage() {
      return mileage_;
    }
    
    // optional int32 staticDate = 3;
    public static final int STATICDATE_FIELD_NUMBER = 3;
    private int staticDate_;
    public boolean hasStaticDate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getStaticDate() {
      return staticDate_;
    }
    
    // optional float oilConsumption = 4;
    public static final int OILCONSUMPTION_FIELD_NUMBER = 4;
    private float oilConsumption_;
    public boolean hasOilConsumption() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public float getOilConsumption() {
      return oilConsumption_;
    }
    
    // optional int64 beginMileage = 5;
    public static final int BEGINMILEAGE_FIELD_NUMBER = 5;
    private long beginMileage_;
    public boolean hasBeginMileage() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public long getBeginMileage() {
      return beginMileage_;
    }
    
    // optional int64 endMileage = 6;
    public static final int ENDMILEAGE_FIELD_NUMBER = 6;
    private long endMileage_;
    public boolean hasEndMileage() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public long getEndMileage() {
      return endMileage_;
    }
    
    // optional int64 startDate = 7;
    public static final int STARTDATE_FIELD_NUMBER = 7;
    private long startDate_;
    public boolean hasStartDate() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public long getStartDate() {
      return startDate_;
    }
    
    // optional int64 endDate = 8;
    public static final int ENDDATE_FIELD_NUMBER = 8;
    private long endDate_;
    public boolean hasEndDate() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public long getEndDate() {
      return endDate_;
    }
    
    // optional int32 beginLat = 9;
    public static final int BEGINLAT_FIELD_NUMBER = 9;
    private int beginLat_;
    public boolean hasBeginLat() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public int getBeginLat() {
      return beginLat_;
    }
    
    // optional int32 beginLng = 10;
    public static final int BEGINLNG_FIELD_NUMBER = 10;
    private int beginLng_;
    public boolean hasBeginLng() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    public int getBeginLng() {
      return beginLng_;
    }
    
    // optional int32 endLat = 11;
    public static final int ENDLAT_FIELD_NUMBER = 11;
    private int endLat_;
    public boolean hasEndLat() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    public int getEndLat() {
      return endLat_;
    }
    
    // optional int32 endLng = 12;
    public static final int ENDLNG_FIELD_NUMBER = 12;
    private int endLng_;
    public boolean hasEndLng() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    public int getEndLng() {
      return endLng_;
    }
    
    // optional float oilValue = 13;
    public static final int OILVALUE_FIELD_NUMBER = 13;
    private float oilValue_;
    public boolean hasOilValue() {
      return ((bitField0_ & 0x00001000) == 0x00001000);
    }
    public float getOilValue() {
      return oilValue_;
    }
    
    private void initFields() {
      terminalID_ = 0L;
      mileage_ = 0L;
      staticDate_ = 0;
      oilConsumption_ = 0F;
      beginMileage_ = 0L;
      endMileage_ = 0L;
      startDate_ = 0L;
      endDate_ = 0L;
      beginLat_ = 0;
      beginLng_ = 0;
      endLat_ = 0;
      endLng_ = 0;
      oilValue_ = 0F;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTerminalID()) {
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
        output.writeInt64(1, terminalID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, mileage_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, staticDate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeFloat(4, oilConsumption_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, beginMileage_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(6, endMileage_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt64(7, startDate_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt64(8, endDate_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(9, beginLat_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeInt32(10, beginLng_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeInt32(11, endLat_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeInt32(12, endLng_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        output.writeFloat(13, oilValue_);
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
          .computeInt64Size(1, terminalID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, mileage_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, staticDate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, oilConsumption_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, beginMileage_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, endMileage_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, startDate_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(8, endDate_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, beginLat_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, beginLng_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, endLat_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, endLng_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, oilValue_);
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
    
    public static MileageConsumptionRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static MileageConsumptionRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static MileageConsumptionRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static MileageConsumptionRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static MileageConsumptionRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static MileageConsumptionRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static MileageConsumptionRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static MileageConsumptionRes parseDelimitedFrom(
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
    public static MileageConsumptionRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static MileageConsumptionRes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MileageConsumptionRes prototype) {
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
       implements MileageConsumptionResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCMileageConsumptionRes.internal_static_MileageConsumptionRes_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCMileageConsumptionRes.internal_static_MileageConsumptionRes_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCMileageConsumptionRes.MileageConsumptionRes.newBuilder()
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
        terminalID_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        mileage_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        staticDate_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        oilConsumption_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000008);
        beginMileage_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        endMileage_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        startDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        endDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        beginLat_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        beginLng_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        endLat_ = 0;
        bitField0_ = (bitField0_ & ~0x00000400);
        endLng_ = 0;
        bitField0_ = (bitField0_ & ~0x00000800);
        oilValue_ = 0F;
        bitField0_ = (bitField0_ & ~0x00001000);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MileageConsumptionRes.getDescriptor();
      }
      
      public MileageConsumptionRes getDefaultInstanceForType() {
        return MileageConsumptionRes.getDefaultInstance();
      }
      
      public MileageConsumptionRes build() {
        MileageConsumptionRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private MileageConsumptionRes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        MileageConsumptionRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public MileageConsumptionRes buildPartial() {
        MileageConsumptionRes result = new MileageConsumptionRes(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.terminalID_ = terminalID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.mileage_ = mileage_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.staticDate_ = staticDate_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.oilConsumption_ = oilConsumption_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.beginMileage_ = beginMileage_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.endMileage_ = endMileage_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.startDate_ = startDate_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.endDate_ = endDate_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.beginLat_ = beginLat_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.beginLng_ = beginLng_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.endLat_ = endLat_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        result.endLng_ = endLng_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00001000;
        }
        result.oilValue_ = oilValue_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MileageConsumptionRes) {
          return mergeFrom((MileageConsumptionRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(MileageConsumptionRes other) {
        if (other == MileageConsumptionRes.getDefaultInstance()) return this;
        if (other.hasTerminalID()) {
          setTerminalID(other.getTerminalID());
        }
        if (other.hasMileage()) {
          setMileage(other.getMileage());
        }
        if (other.hasStaticDate()) {
          setStaticDate(other.getStaticDate());
        }
        if (other.hasOilConsumption()) {
          setOilConsumption(other.getOilConsumption());
        }
        if (other.hasBeginMileage()) {
          setBeginMileage(other.getBeginMileage());
        }
        if (other.hasEndMileage()) {
          setEndMileage(other.getEndMileage());
        }
        if (other.hasStartDate()) {
          setStartDate(other.getStartDate());
        }
        if (other.hasEndDate()) {
          setEndDate(other.getEndDate());
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
        if (other.hasOilValue()) {
          setOilValue(other.getOilValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTerminalID()) {
          
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
              terminalID_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              mileage_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              staticDate_ = input.readInt32();
              break;
            }
            case 37: {
              bitField0_ |= 0x00000008;
              oilConsumption_ = input.readFloat();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              beginMileage_ = input.readInt64();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              endMileage_ = input.readInt64();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              startDate_ = input.readInt64();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              endDate_ = input.readInt64();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              beginLat_ = input.readInt32();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              beginLng_ = input.readInt32();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000400;
              endLat_ = input.readInt32();
              break;
            }
            case 96: {
              bitField0_ |= 0x00000800;
              endLng_ = input.readInt32();
              break;
            }
            case 109: {
              bitField0_ |= 0x00001000;
              oilValue_ = input.readFloat();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 terminalID = 1;
      private long terminalID_ ;
      public boolean hasTerminalID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getTerminalID() {
        return terminalID_;
      }
      public Builder setTerminalID(long value) {
        bitField0_ |= 0x00000001;
        terminalID_ = value;
        onChanged();
        return this;
      }
      public Builder clearTerminalID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        terminalID_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 mileage = 2;
      private long mileage_ ;
      public boolean hasMileage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getMileage() {
        return mileage_;
      }
      public Builder setMileage(long value) {
        bitField0_ |= 0x00000002;
        mileage_ = value;
        onChanged();
        return this;
      }
      public Builder clearMileage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mileage_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int32 staticDate = 3;
      private int staticDate_ ;
      public boolean hasStaticDate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getStaticDate() {
        return staticDate_;
      }
      public Builder setStaticDate(int value) {
        bitField0_ |= 0x00000004;
        staticDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearStaticDate() {
        bitField0_ = (bitField0_ & ~0x00000004);
        staticDate_ = 0;
        onChanged();
        return this;
      }
      
      // optional float oilConsumption = 4;
      private float oilConsumption_ ;
      public boolean hasOilConsumption() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public float getOilConsumption() {
        return oilConsumption_;
      }
      public Builder setOilConsumption(float value) {
        bitField0_ |= 0x00000008;
        oilConsumption_ = value;
        onChanged();
        return this;
      }
      public Builder clearOilConsumption() {
        bitField0_ = (bitField0_ & ~0x00000008);
        oilConsumption_ = 0F;
        onChanged();
        return this;
      }
      
      // optional int64 beginMileage = 5;
      private long beginMileage_ ;
      public boolean hasBeginMileage() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public long getBeginMileage() {
        return beginMileage_;
      }
      public Builder setBeginMileage(long value) {
        bitField0_ |= 0x00000010;
        beginMileage_ = value;
        onChanged();
        return this;
      }
      public Builder clearBeginMileage() {
        bitField0_ = (bitField0_ & ~0x00000010);
        beginMileage_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 endMileage = 6;
      private long endMileage_ ;
      public boolean hasEndMileage() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public long getEndMileage() {
        return endMileage_;
      }
      public Builder setEndMileage(long value) {
        bitField0_ |= 0x00000020;
        endMileage_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndMileage() {
        bitField0_ = (bitField0_ & ~0x00000020);
        endMileage_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 startDate = 7;
      private long startDate_ ;
      public boolean hasStartDate() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public long getStartDate() {
        return startDate_;
      }
      public Builder setStartDate(long value) {
        bitField0_ |= 0x00000040;
        startDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearStartDate() {
        bitField0_ = (bitField0_ & ~0x00000040);
        startDate_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 endDate = 8;
      private long endDate_ ;
      public boolean hasEndDate() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public long getEndDate() {
        return endDate_;
      }
      public Builder setEndDate(long value) {
        bitField0_ |= 0x00000080;
        endDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndDate() {
        bitField0_ = (bitField0_ & ~0x00000080);
        endDate_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int32 beginLat = 9;
      private int beginLat_ ;
      public boolean hasBeginLat() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public int getBeginLat() {
        return beginLat_;
      }
      public Builder setBeginLat(int value) {
        bitField0_ |= 0x00000100;
        beginLat_ = value;
        onChanged();
        return this;
      }
      public Builder clearBeginLat() {
        bitField0_ = (bitField0_ & ~0x00000100);
        beginLat_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 beginLng = 10;
      private int beginLng_ ;
      public boolean hasBeginLng() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      public int getBeginLng() {
        return beginLng_;
      }
      public Builder setBeginLng(int value) {
        bitField0_ |= 0x00000200;
        beginLng_ = value;
        onChanged();
        return this;
      }
      public Builder clearBeginLng() {
        bitField0_ = (bitField0_ & ~0x00000200);
        beginLng_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 endLat = 11;
      private int endLat_ ;
      public boolean hasEndLat() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      public int getEndLat() {
        return endLat_;
      }
      public Builder setEndLat(int value) {
        bitField0_ |= 0x00000400;
        endLat_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndLat() {
        bitField0_ = (bitField0_ & ~0x00000400);
        endLat_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 endLng = 12;
      private int endLng_ ;
      public boolean hasEndLng() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      public int getEndLng() {
        return endLng_;
      }
      public Builder setEndLng(int value) {
        bitField0_ |= 0x00000800;
        endLng_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndLng() {
        bitField0_ = (bitField0_ & ~0x00000800);
        endLng_ = 0;
        onChanged();
        return this;
      }
      
      // optional float oilValue = 13;
      private float oilValue_ ;
      public boolean hasOilValue() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      public float getOilValue() {
        return oilValue_;
      }
      public Builder setOilValue(float value) {
        bitField0_ |= 0x00001000;
        oilValue_ = value;
        onChanged();
        return this;
      }
      public Builder clearOilValue() {
        bitField0_ = (bitField0_ & ~0x00001000);
        oilValue_ = 0F;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:MileageConsumptionRes)
    }
    
    static {
      defaultInstance = new MileageConsumptionRes(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:MileageConsumptionRes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MileageConsumptionRes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MileageConsumptionRes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nJcore/proto/webservice/newstatisticsdat" +
      "a/entity/MileageConsumptionRes.proto\"\214\002\n" +
      "\025MileageConsumptionRes\022\022\n\nterminalID\030\001 \002" +
      "(\003\022\017\n\007mileage\030\002 \001(\003\022\022\n\nstaticDate\030\003 \001(\005\022" +
      "\026\n\016oilConsumption\030\004 \001(\002\022\024\n\014beginMileage\030" +
      "\005 \001(\003\022\022\n\nendMileage\030\006 \001(\003\022\021\n\tstartDate\030\007" +
      " \001(\003\022\017\n\007endDate\030\010 \001(\003\022\020\n\010beginLat\030\t \001(\005\022" +
      "\020\n\010beginLng\030\n \001(\005\022\016\n\006endLat\030\013 \001(\005\022\016\n\006end" +
      "Lng\030\014 \001(\005\022\020\n\010oilValue\030\r \001(\002Bm\nRcom.navin" +
      "fo.opentsp.platform.location.protocol.we",
      "bservice.newstatisticsdata.entityB\027LCMil" +
      "eageConsumptionRes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_MileageConsumptionRes_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_MileageConsumptionRes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MileageConsumptionRes_descriptor,
              new String[] { "TerminalID", "Mileage", "StaticDate", "OilConsumption", "BeginMileage", "EndMileage", "StartDate", "EndDate", "BeginLat", "BeginLng", "EndLat", "EndLng", "OilValue", },
              MileageConsumptionRes.class,
              MileageConsumptionRes.Builder.class);
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
