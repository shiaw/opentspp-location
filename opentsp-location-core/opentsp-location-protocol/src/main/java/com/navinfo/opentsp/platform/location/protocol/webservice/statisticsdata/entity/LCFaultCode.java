// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/statisticsdata/entity/FaultCode.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity;

public final class LCFaultCode {
  private LCFaultCode() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface FaultCodeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 terminalId = 1;
    boolean hasTerminalId();
    long getTerminalId();
    
    // required int32 spn = 2;
    boolean hasSpn();
    int getSpn();
    
    // required int32 fmi = 3;
    boolean hasFmi();
    int getFmi();
    
    // optional int64 beginDate = 4;
    boolean hasBeginDate();
    long getBeginDate();
    
    // optional int32 continuousTime = 5;
    boolean hasContinuousTime();
    int getContinuousTime();
    
    // optional int32 beginLon = 6;
    boolean hasBeginLon();
    int getBeginLon();
    
    // optional int32 beginLat = 7;
    boolean hasBeginLat();
    int getBeginLat();
    
    // optional int32 endLon = 8;
    boolean hasEndLon();
    int getEndLon();
    
    // optional int32 endLat = 9;
    boolean hasEndLat();
    int getEndLat();
  }
  public static final class FaultCode extends
      com.google.protobuf.GeneratedMessage
      implements FaultCodeOrBuilder {
    // Use FaultCode.newBuilder() to construct.
    private FaultCode(Builder builder) {
      super(builder);
    }
    private FaultCode(boolean noInit) {}
    
    private static final FaultCode defaultInstance;
    public static FaultCode getDefaultInstance() {
      return defaultInstance;
    }
    
    public FaultCode getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCFaultCode.internal_static_FaultCode_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCFaultCode.internal_static_FaultCode_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 terminalId = 1;
    public static final int TERMINALID_FIELD_NUMBER = 1;
    private long terminalId_;
    public boolean hasTerminalId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getTerminalId() {
      return terminalId_;
    }
    
    // required int32 spn = 2;
    public static final int SPN_FIELD_NUMBER = 2;
    private int spn_;
    public boolean hasSpn() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getSpn() {
      return spn_;
    }
    
    // required int32 fmi = 3;
    public static final int FMI_FIELD_NUMBER = 3;
    private int fmi_;
    public boolean hasFmi() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getFmi() {
      return fmi_;
    }
    
    // optional int64 beginDate = 4;
    public static final int BEGINDATE_FIELD_NUMBER = 4;
    private long beginDate_;
    public boolean hasBeginDate() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public long getBeginDate() {
      return beginDate_;
    }
    
    // optional int32 continuousTime = 5;
    public static final int CONTINUOUSTIME_FIELD_NUMBER = 5;
    private int continuousTime_;
    public boolean hasContinuousTime() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getContinuousTime() {
      return continuousTime_;
    }
    
    // optional int32 beginLon = 6;
    public static final int BEGINLON_FIELD_NUMBER = 6;
    private int beginLon_;
    public boolean hasBeginLon() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getBeginLon() {
      return beginLon_;
    }
    
    // optional int32 beginLat = 7;
    public static final int BEGINLAT_FIELD_NUMBER = 7;
    private int beginLat_;
    public boolean hasBeginLat() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getBeginLat() {
      return beginLat_;
    }
    
    // optional int32 endLon = 8;
    public static final int ENDLON_FIELD_NUMBER = 8;
    private int endLon_;
    public boolean hasEndLon() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public int getEndLon() {
      return endLon_;
    }
    
    // optional int32 endLat = 9;
    public static final int ENDLAT_FIELD_NUMBER = 9;
    private int endLat_;
    public boolean hasEndLat() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public int getEndLat() {
      return endLat_;
    }
    
    private void initFields() {
      terminalId_ = 0L;
      spn_ = 0;
      fmi_ = 0;
      beginDate_ = 0L;
      continuousTime_ = 0;
      beginLon_ = 0;
      beginLat_ = 0;
      endLon_ = 0;
      endLat_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTerminalId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSpn()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFmi()) {
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
        output.writeInt64(1, terminalId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, spn_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, fmi_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, beginDate_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, continuousTime_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, beginLon_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, beginLat_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(8, endLon_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(9, endLat_);
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
          .computeInt64Size(1, terminalId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, spn_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, fmi_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, beginDate_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, continuousTime_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, beginLon_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, beginLat_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, endLon_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, endLat_);
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
    
    public static FaultCode parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static FaultCode parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static FaultCode parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static FaultCode parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static FaultCode parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static FaultCode parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static FaultCode parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static FaultCode parseDelimitedFrom(
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
    public static FaultCode parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static FaultCode parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(FaultCode prototype) {
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
       implements FaultCodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCFaultCode.internal_static_FaultCode_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCFaultCode.internal_static_FaultCode_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCFaultCode.FaultCode.newBuilder()
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
        terminalId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        spn_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        fmi_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        beginDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        continuousTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        beginLon_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        beginLat_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        endLon_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        endLat_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return FaultCode.getDescriptor();
      }
      
      public FaultCode getDefaultInstanceForType() {
        return FaultCode.getDefaultInstance();
      }
      
      public FaultCode build() {
        FaultCode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private FaultCode buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        FaultCode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public FaultCode buildPartial() {
        FaultCode result = new FaultCode(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.terminalId_ = terminalId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.spn_ = spn_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.fmi_ = fmi_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.beginDate_ = beginDate_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.continuousTime_ = continuousTime_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.beginLon_ = beginLon_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.beginLat_ = beginLat_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.endLon_ = endLon_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.endLat_ = endLat_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof FaultCode) {
          return mergeFrom((FaultCode)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(FaultCode other) {
        if (other == FaultCode.getDefaultInstance()) return this;
        if (other.hasTerminalId()) {
          setTerminalId(other.getTerminalId());
        }
        if (other.hasSpn()) {
          setSpn(other.getSpn());
        }
        if (other.hasFmi()) {
          setFmi(other.getFmi());
        }
        if (other.hasBeginDate()) {
          setBeginDate(other.getBeginDate());
        }
        if (other.hasContinuousTime()) {
          setContinuousTime(other.getContinuousTime());
        }
        if (other.hasBeginLon()) {
          setBeginLon(other.getBeginLon());
        }
        if (other.hasBeginLat()) {
          setBeginLat(other.getBeginLat());
        }
        if (other.hasEndLon()) {
          setEndLon(other.getEndLon());
        }
        if (other.hasEndLat()) {
          setEndLat(other.getEndLat());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTerminalId()) {
          
          return false;
        }
        if (!hasSpn()) {
          
          return false;
        }
        if (!hasFmi()) {
          
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
              terminalId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              spn_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              fmi_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              beginDate_ = input.readInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              continuousTime_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              beginLon_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              beginLat_ = input.readInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              endLon_ = input.readInt32();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              endLat_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 terminalId = 1;
      private long terminalId_ ;
      public boolean hasTerminalId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getTerminalId() {
        return terminalId_;
      }
      public Builder setTerminalId(long value) {
        bitField0_ |= 0x00000001;
        terminalId_ = value;
        onChanged();
        return this;
      }
      public Builder clearTerminalId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        terminalId_ = 0L;
        onChanged();
        return this;
      }
      
      // required int32 spn = 2;
      private int spn_ ;
      public boolean hasSpn() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getSpn() {
        return spn_;
      }
      public Builder setSpn(int value) {
        bitField0_ |= 0x00000002;
        spn_ = value;
        onChanged();
        return this;
      }
      public Builder clearSpn() {
        bitField0_ = (bitField0_ & ~0x00000002);
        spn_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 fmi = 3;
      private int fmi_ ;
      public boolean hasFmi() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getFmi() {
        return fmi_;
      }
      public Builder setFmi(int value) {
        bitField0_ |= 0x00000004;
        fmi_ = value;
        onChanged();
        return this;
      }
      public Builder clearFmi() {
        bitField0_ = (bitField0_ & ~0x00000004);
        fmi_ = 0;
        onChanged();
        return this;
      }
      
      // optional int64 beginDate = 4;
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
      
      // optional int32 continuousTime = 5;
      private int continuousTime_ ;
      public boolean hasContinuousTime() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getContinuousTime() {
        return continuousTime_;
      }
      public Builder setContinuousTime(int value) {
        bitField0_ |= 0x00000010;
        continuousTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearContinuousTime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        continuousTime_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 beginLon = 6;
      private int beginLon_ ;
      public boolean hasBeginLon() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getBeginLon() {
        return beginLon_;
      }
      public Builder setBeginLon(int value) {
        bitField0_ |= 0x00000020;
        beginLon_ = value;
        onChanged();
        return this;
      }
      public Builder clearBeginLon() {
        bitField0_ = (bitField0_ & ~0x00000020);
        beginLon_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 beginLat = 7;
      private int beginLat_ ;
      public boolean hasBeginLat() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getBeginLat() {
        return beginLat_;
      }
      public Builder setBeginLat(int value) {
        bitField0_ |= 0x00000040;
        beginLat_ = value;
        onChanged();
        return this;
      }
      public Builder clearBeginLat() {
        bitField0_ = (bitField0_ & ~0x00000040);
        beginLat_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 endLon = 8;
      private int endLon_ ;
      public boolean hasEndLon() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public int getEndLon() {
        return endLon_;
      }
      public Builder setEndLon(int value) {
        bitField0_ |= 0x00000080;
        endLon_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndLon() {
        bitField0_ = (bitField0_ & ~0x00000080);
        endLon_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 endLat = 9;
      private int endLat_ ;
      public boolean hasEndLat() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public int getEndLat() {
        return endLat_;
      }
      public Builder setEndLat(int value) {
        bitField0_ |= 0x00000100;
        endLat_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndLat() {
        bitField0_ = (bitField0_ & ~0x00000100);
        endLat_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:FaultCode)
    }
    
    static {
      defaultInstance = new FaultCode(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:FaultCode)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_FaultCode_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_FaultCode_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n;core/proto/webservice/statisticsdata/e" +
      "ntity/FaultCode.proto\"\250\001\n\tFaultCode\022\022\n\nt" +
      "erminalId\030\001 \002(\003\022\013\n\003spn\030\002 \002(\005\022\013\n\003fmi\030\003 \002(" +
      "\005\022\021\n\tbeginDate\030\004 \001(\003\022\026\n\016continuousTime\030\005" +
      " \001(\005\022\020\n\010beginLon\030\006 \001(\005\022\020\n\010beginLat\030\007 \001(\005" +
      "\022\016\n\006endLon\030\010 \001(\005\022\016\n\006endLat\030\t \001(\005B^\nOcom." +
      "navinfo.opentsp.platform.location.protoc" +
      "ol.webservice.statisticsdata.entityB\013LCF" +
      "aultCode"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_FaultCode_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_FaultCode_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_FaultCode_descriptor,
              new String[] { "TerminalId", "Spn", "Fmi", "BeginDate", "ContinuousTime", "BeginLon", "BeginLat", "EndLon", "EndLat", },
              FaultCode.class,
              FaultCode.Builder.class);
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
