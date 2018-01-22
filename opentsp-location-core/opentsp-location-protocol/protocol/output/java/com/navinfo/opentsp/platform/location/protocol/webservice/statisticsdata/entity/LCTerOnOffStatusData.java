// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/statisticsdata/entity/TerOnOffStatusData.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity;

public final class LCTerOnOffStatusData {
  private LCTerOnOffStatusData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TerOnOffStatusDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 terminalID = 1;
    boolean hasTerminalID();
    long getTerminalID();
    
    // required int32 onlineStatus = 2;
    boolean hasOnlineStatus();
    int getOnlineStatus();
    
    // required int64 startDate = 3;
    boolean hasStartDate();
    long getStartDate();
    
    // required int64 endDate = 4;
    boolean hasEndDate();
    long getEndDate();
    
    // required int32 continuousTimes = 5;
    boolean hasContinuousTimes();
    int getContinuousTimes();
  }
  public static final class TerOnOffStatusData extends
      com.google.protobuf.GeneratedMessage
      implements TerOnOffStatusDataOrBuilder {
    // Use TerOnOffStatusData.newBuilder() to construct.
    private TerOnOffStatusData(Builder builder) {
      super(builder);
    }
    private TerOnOffStatusData(boolean noInit) {}
    
    private static final TerOnOffStatusData defaultInstance;
    public static TerOnOffStatusData getDefaultInstance() {
      return defaultInstance;
    }
    
    public TerOnOffStatusData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.internal_static_TerOnOffStatusData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.internal_static_TerOnOffStatusData_fieldAccessorTable;
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
    
    // required int32 onlineStatus = 2;
    public static final int ONLINESTATUS_FIELD_NUMBER = 2;
    private int onlineStatus_;
    public boolean hasOnlineStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getOnlineStatus() {
      return onlineStatus_;
    }
    
    // required int64 startDate = 3;
    public static final int STARTDATE_FIELD_NUMBER = 3;
    private long startDate_;
    public boolean hasStartDate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getStartDate() {
      return startDate_;
    }
    
    // required int64 endDate = 4;
    public static final int ENDDATE_FIELD_NUMBER = 4;
    private long endDate_;
    public boolean hasEndDate() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public long getEndDate() {
      return endDate_;
    }
    
    // required int32 continuousTimes = 5;
    public static final int CONTINUOUSTIMES_FIELD_NUMBER = 5;
    private int continuousTimes_;
    public boolean hasContinuousTimes() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getContinuousTimes() {
      return continuousTimes_;
    }
    
    private void initFields() {
      terminalID_ = 0L;
      onlineStatus_ = 0;
      startDate_ = 0L;
      endDate_ = 0L;
      continuousTimes_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTerminalID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOnlineStatus()) {
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
        output.writeInt32(2, onlineStatus_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, startDate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, endDate_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, continuousTimes_);
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
          .computeInt32Size(2, onlineStatus_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, startDate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, endDate_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, continuousTimes_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.internal_static_TerOnOffStatusData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.internal_static_TerOnOffStatusData_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData.newBuilder()
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
        onlineStatus_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        startDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        endDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        continuousTimes_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData build() {
        com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData result = new com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.terminalID_ = terminalID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.onlineStatus_ = onlineStatus_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.startDate_ = startDate_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.endDate_ = endDate_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.continuousTimes_ = continuousTimes_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData.getDefaultInstance()) return this;
        if (other.hasTerminalID()) {
          setTerminalID(other.getTerminalID());
        }
        if (other.hasOnlineStatus()) {
          setOnlineStatus(other.getOnlineStatus());
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
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTerminalID()) {
          
          return false;
        }
        if (!hasOnlineStatus()) {
          
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
              onlineStatus_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              startDate_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              endDate_ = input.readInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              continuousTimes_ = input.readInt32();
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
      
      // required int32 onlineStatus = 2;
      private int onlineStatus_ ;
      public boolean hasOnlineStatus() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getOnlineStatus() {
        return onlineStatus_;
      }
      public Builder setOnlineStatus(int value) {
        bitField0_ |= 0x00000002;
        onlineStatus_ = value;
        onChanged();
        return this;
      }
      public Builder clearOnlineStatus() {
        bitField0_ = (bitField0_ & ~0x00000002);
        onlineStatus_ = 0;
        onChanged();
        return this;
      }
      
      // required int64 startDate = 3;
      private long startDate_ ;
      public boolean hasStartDate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getStartDate() {
        return startDate_;
      }
      public Builder setStartDate(long value) {
        bitField0_ |= 0x00000004;
        startDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearStartDate() {
        bitField0_ = (bitField0_ & ~0x00000004);
        startDate_ = 0L;
        onChanged();
        return this;
      }
      
      // required int64 endDate = 4;
      private long endDate_ ;
      public boolean hasEndDate() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public long getEndDate() {
        return endDate_;
      }
      public Builder setEndDate(long value) {
        bitField0_ |= 0x00000008;
        endDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndDate() {
        bitField0_ = (bitField0_ & ~0x00000008);
        endDate_ = 0L;
        onChanged();
        return this;
      }
      
      // required int32 continuousTimes = 5;
      private int continuousTimes_ ;
      public boolean hasContinuousTimes() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getContinuousTimes() {
        return continuousTimes_;
      }
      public Builder setContinuousTimes(int value) {
        bitField0_ |= 0x00000010;
        continuousTimes_ = value;
        onChanged();
        return this;
      }
      public Builder clearContinuousTimes() {
        bitField0_ = (bitField0_ & ~0x00000010);
        continuousTimes_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:TerOnOffStatusData)
    }
    
    static {
      defaultInstance = new TerOnOffStatusData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:TerOnOffStatusData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TerOnOffStatusData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TerOnOffStatusData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDcore/proto/webservice/statisticsdata/e" +
      "ntity/TerOnOffStatusData.proto\"{\n\022TerOnO" +
      "ffStatusData\022\022\n\nterminalID\030\001 \002(\003\022\024\n\014onli" +
      "neStatus\030\002 \002(\005\022\021\n\tstartDate\030\003 \002(\003\022\017\n\007end" +
      "Date\030\004 \002(\003\022\027\n\017continuousTimes\030\005 \002(\005Bg\nOc" +
      "om.navinfo.opentsp.platform.location.pro" +
      "tocol.webservice.statisticsdata.entityB\024" +
      "LCTerOnOffStatusData"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TerOnOffStatusData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TerOnOffStatusData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TerOnOffStatusData_descriptor,
              new java.lang.String[] { "TerminalID", "OnlineStatus", "StartDate", "EndDate", "ContinuousTimes", },
              com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData.class,
              com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCTerOnOffStatusData.TerOnOffStatusData.Builder.class);
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
