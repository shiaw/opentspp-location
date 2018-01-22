// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/statisticsdata/entity/ACCStatusData.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity;

public final class LCACCStatusData {
  private LCACCStatusData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ACCStatusDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 terminalID = 1;
    boolean hasTerminalID();
    long getTerminalID();
    
    // required int64 startDate = 2;
    boolean hasStartDate();
    long getStartDate();
    
    // required int64 endDate = 3;
    boolean hasEndDate();
    long getEndDate();
    
    // required int32 continuousTimes = 4;
    boolean hasContinuousTimes();
    int getContinuousTimes();
    
    // required int32 beginLat = 5;
    boolean hasBeginLat();
    int getBeginLat();
    
    // required int32 beginLng = 6;
    boolean hasBeginLng();
    int getBeginLng();
    
    // required int32 endLat = 7;
    boolean hasEndLat();
    int getEndLat();
    
    // required int32 endLng = 8;
    boolean hasEndLng();
    int getEndLng();
    
    // required int32 accStatus = 9;
    boolean hasAccStatus();
    int getAccStatus();
  }
  public static final class ACCStatusData extends
      com.google.protobuf.GeneratedMessage
      implements ACCStatusDataOrBuilder {
    // Use ACCStatusData.newBuilder() to construct.
    private ACCStatusData(Builder builder) {
      super(builder);
    }
    private ACCStatusData(boolean noInit) {}
    
    private static final ACCStatusData defaultInstance;
    public static ACCStatusData getDefaultInstance() {
      return defaultInstance;
    }
    
    public ACCStatusData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCACCStatusData.internal_static_ACCStatusData_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCACCStatusData.internal_static_ACCStatusData_fieldAccessorTable;
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
    
    // required int64 startDate = 2;
    public static final int STARTDATE_FIELD_NUMBER = 2;
    private long startDate_;
    public boolean hasStartDate() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getStartDate() {
      return startDate_;
    }
    
    // required int64 endDate = 3;
    public static final int ENDDATE_FIELD_NUMBER = 3;
    private long endDate_;
    public boolean hasEndDate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getEndDate() {
      return endDate_;
    }
    
    // required int32 continuousTimes = 4;
    public static final int CONTINUOUSTIMES_FIELD_NUMBER = 4;
    private int continuousTimes_;
    public boolean hasContinuousTimes() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getContinuousTimes() {
      return continuousTimes_;
    }
    
    // required int32 beginLat = 5;
    public static final int BEGINLAT_FIELD_NUMBER = 5;
    private int beginLat_;
    public boolean hasBeginLat() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getBeginLat() {
      return beginLat_;
    }
    
    // required int32 beginLng = 6;
    public static final int BEGINLNG_FIELD_NUMBER = 6;
    private int beginLng_;
    public boolean hasBeginLng() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getBeginLng() {
      return beginLng_;
    }
    
    // required int32 endLat = 7;
    public static final int ENDLAT_FIELD_NUMBER = 7;
    private int endLat_;
    public boolean hasEndLat() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getEndLat() {
      return endLat_;
    }
    
    // required int32 endLng = 8;
    public static final int ENDLNG_FIELD_NUMBER = 8;
    private int endLng_;
    public boolean hasEndLng() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public int getEndLng() {
      return endLng_;
    }
    
    // required int32 accStatus = 9;
    public static final int ACCSTATUS_FIELD_NUMBER = 9;
    private int accStatus_;
    public boolean hasAccStatus() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public int getAccStatus() {
      return accStatus_;
    }
    
    private void initFields() {
      terminalID_ = 0L;
      startDate_ = 0L;
      endDate_ = 0L;
      continuousTimes_ = 0;
      beginLat_ = 0;
      beginLng_ = 0;
      endLat_ = 0;
      endLng_ = 0;
      accStatus_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTerminalID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStartDate()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEndDate()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasContinuousTimes()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBeginLat()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBeginLng()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEndLat()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEndLng()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAccStatus()) {
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
        output.writeInt64(2, startDate_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, endDate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, continuousTimes_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, beginLat_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, beginLng_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, endLat_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(8, endLng_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(9, accStatus_);
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
          .computeInt64Size(2, startDate_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, endDate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, continuousTimes_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, beginLat_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, beginLng_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, endLat_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, endLng_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, accStatus_);
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
    
    public static ACCStatusData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static ACCStatusData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static ACCStatusData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static ACCStatusData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static ACCStatusData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static ACCStatusData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static ACCStatusData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static ACCStatusData parseDelimitedFrom(
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
    public static ACCStatusData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static ACCStatusData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ACCStatusData prototype) {
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
       implements ACCStatusDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCACCStatusData.internal_static_ACCStatusData_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCACCStatusData.internal_static_ACCStatusData_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCACCStatusData.ACCStatusData.newBuilder()
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
        startDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        endDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        continuousTimes_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        beginLat_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        beginLng_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        endLat_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        endLng_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        accStatus_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ACCStatusData.getDescriptor();
      }
      
      public ACCStatusData getDefaultInstanceForType() {
        return ACCStatusData.getDefaultInstance();
      }
      
      public ACCStatusData build() {
        ACCStatusData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private ACCStatusData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        ACCStatusData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public ACCStatusData buildPartial() {
        ACCStatusData result = new ACCStatusData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.terminalID_ = terminalID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.startDate_ = startDate_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.endDate_ = endDate_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.continuousTimes_ = continuousTimes_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.beginLat_ = beginLat_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.beginLng_ = beginLng_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.endLat_ = endLat_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.endLng_ = endLng_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.accStatus_ = accStatus_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ACCStatusData) {
          return mergeFrom((ACCStatusData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(ACCStatusData other) {
        if (other == ACCStatusData.getDefaultInstance()) return this;
        if (other.hasTerminalID()) {
          setTerminalID(other.getTerminalID());
        }
        if (other.hasStartDate()) {
          setStartDate(other.getStartDate());
        }
        if (other.hasEndDate()) {
          setEndDate(other.getEndDate());
        }
        if (other.hasContinuousTimes()) {
          setContinuousTimes(other.getContinuousTimes());
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
        if (other.hasAccStatus()) {
          setAccStatus(other.getAccStatus());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTerminalID()) {
          
          return false;
        }
        if (!hasStartDate()) {
          
          return false;
        }
        if (!hasEndDate()) {
          
          return false;
        }
        if (!hasContinuousTimes()) {
          
          return false;
        }
        if (!hasBeginLat()) {
          
          return false;
        }
        if (!hasBeginLng()) {
          
          return false;
        }
        if (!hasEndLat()) {
          
          return false;
        }
        if (!hasEndLng()) {
          
          return false;
        }
        if (!hasAccStatus()) {
          
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
              startDate_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              endDate_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              continuousTimes_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              beginLat_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              beginLng_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              endLat_ = input.readInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              endLng_ = input.readInt32();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              accStatus_ = input.readInt32();
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
      
      // required int64 startDate = 2;
      private long startDate_ ;
      public boolean hasStartDate() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getStartDate() {
        return startDate_;
      }
      public Builder setStartDate(long value) {
        bitField0_ |= 0x00000002;
        startDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearStartDate() {
        bitField0_ = (bitField0_ & ~0x00000002);
        startDate_ = 0L;
        onChanged();
        return this;
      }
      
      // required int64 endDate = 3;
      private long endDate_ ;
      public boolean hasEndDate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getEndDate() {
        return endDate_;
      }
      public Builder setEndDate(long value) {
        bitField0_ |= 0x00000004;
        endDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndDate() {
        bitField0_ = (bitField0_ & ~0x00000004);
        endDate_ = 0L;
        onChanged();
        return this;
      }
      
      // required int32 continuousTimes = 4;
      private int continuousTimes_ ;
      public boolean hasContinuousTimes() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getContinuousTimes() {
        return continuousTimes_;
      }
      public Builder setContinuousTimes(int value) {
        bitField0_ |= 0x00000008;
        continuousTimes_ = value;
        onChanged();
        return this;
      }
      public Builder clearContinuousTimes() {
        bitField0_ = (bitField0_ & ~0x00000008);
        continuousTimes_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 beginLat = 5;
      private int beginLat_ ;
      public boolean hasBeginLat() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getBeginLat() {
        return beginLat_;
      }
      public Builder setBeginLat(int value) {
        bitField0_ |= 0x00000010;
        beginLat_ = value;
        onChanged();
        return this;
      }
      public Builder clearBeginLat() {
        bitField0_ = (bitField0_ & ~0x00000010);
        beginLat_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 beginLng = 6;
      private int beginLng_ ;
      public boolean hasBeginLng() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getBeginLng() {
        return beginLng_;
      }
      public Builder setBeginLng(int value) {
        bitField0_ |= 0x00000020;
        beginLng_ = value;
        onChanged();
        return this;
      }
      public Builder clearBeginLng() {
        bitField0_ = (bitField0_ & ~0x00000020);
        beginLng_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 endLat = 7;
      private int endLat_ ;
      public boolean hasEndLat() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getEndLat() {
        return endLat_;
      }
      public Builder setEndLat(int value) {
        bitField0_ |= 0x00000040;
        endLat_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndLat() {
        bitField0_ = (bitField0_ & ~0x00000040);
        endLat_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 endLng = 8;
      private int endLng_ ;
      public boolean hasEndLng() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public int getEndLng() {
        return endLng_;
      }
      public Builder setEndLng(int value) {
        bitField0_ |= 0x00000080;
        endLng_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndLng() {
        bitField0_ = (bitField0_ & ~0x00000080);
        endLng_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 accStatus = 9;
      private int accStatus_ ;
      public boolean hasAccStatus() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public int getAccStatus() {
        return accStatus_;
      }
      public Builder setAccStatus(int value) {
        bitField0_ |= 0x00000100;
        accStatus_ = value;
        onChanged();
        return this;
      }
      public Builder clearAccStatus() {
        bitField0_ = (bitField0_ & ~0x00000100);
        accStatus_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:ACCStatusData)
    }
    
    static {
      defaultInstance = new ACCStatusData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ACCStatusData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ACCStatusData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ACCStatusData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n?core/proto/webservice/statisticsdata/e" +
      "ntity/ACCStatusData.proto\"\267\001\n\rACCStatusD" +
      "ata\022\022\n\nterminalID\030\001 \002(\003\022\021\n\tstartDate\030\002 \002" +
      "(\003\022\017\n\007endDate\030\003 \002(\003\022\027\n\017continuousTimes\030\004" +
      " \002(\005\022\020\n\010beginLat\030\005 \002(\005\022\020\n\010beginLng\030\006 \002(\005" +
      "\022\016\n\006endLat\030\007 \002(\005\022\016\n\006endLng\030\010 \002(\005\022\021\n\taccS" +
      "tatus\030\t \002(\005Bb\nOcom.navinfo.opentsp.platf" +
      "orm.location.protocol.webservice.statist" +
      "icsdata.entityB\017LCACCStatusData"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ACCStatusData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ACCStatusData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ACCStatusData_descriptor,
              new String[] { "TerminalID", "StartDate", "EndDate", "ContinuousTimes", "BeginLat", "BeginLng", "EndLat", "EndLng", "AccStatus", },
              ACCStatusData.class,
              ACCStatusData.Builder.class);
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
