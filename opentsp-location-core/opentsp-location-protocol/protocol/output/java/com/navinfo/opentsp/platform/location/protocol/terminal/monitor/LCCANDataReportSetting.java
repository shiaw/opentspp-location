// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/monitor/java/CANDataReportSetting.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.monitor;

public final class LCCANDataReportSetting {
  private LCCANDataReportSetting() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CANDataReportSettingOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int64 reportStrategy = 1;
    boolean hasReportStrategy();
    long getReportStrategy();
    
    // optional int64 reportPlan = 2;
    boolean hasReportPlan();
    long getReportPlan();
    
    // optional int64 reportInterval = 3;
    boolean hasReportInterval();
    long getReportInterval();
    
    // optional int32 engineType = 4;
    boolean hasEngineType();
    int getEngineType();
    
    // optional int32 vehType = 5;
    boolean hasVehType();
    int getVehType();
  }
  public static final class CANDataReportSetting extends
      com.google.protobuf.GeneratedMessage
      implements CANDataReportSettingOrBuilder {
    // Use CANDataReportSetting.newBuilder() to construct.
    private CANDataReportSetting(Builder builder) {
      super(builder);
    }
    private CANDataReportSetting(boolean noInit) {}
    
    private static final CANDataReportSetting defaultInstance;
    public static CANDataReportSetting getDefaultInstance() {
      return defaultInstance;
    }
    
    public CANDataReportSetting getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.internal_static_CANDataReportSetting_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.internal_static_CANDataReportSetting_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int64 reportStrategy = 1;
    public static final int REPORTSTRATEGY_FIELD_NUMBER = 1;
    private long reportStrategy_;
    public boolean hasReportStrategy() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getReportStrategy() {
      return reportStrategy_;
    }
    
    // optional int64 reportPlan = 2;
    public static final int REPORTPLAN_FIELD_NUMBER = 2;
    private long reportPlan_;
    public boolean hasReportPlan() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getReportPlan() {
      return reportPlan_;
    }
    
    // optional int64 reportInterval = 3;
    public static final int REPORTINTERVAL_FIELD_NUMBER = 3;
    private long reportInterval_;
    public boolean hasReportInterval() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getReportInterval() {
      return reportInterval_;
    }
    
    // optional int32 engineType = 4;
    public static final int ENGINETYPE_FIELD_NUMBER = 4;
    private int engineType_;
    public boolean hasEngineType() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getEngineType() {
      return engineType_;
    }
    
    // optional int32 vehType = 5;
    public static final int VEHTYPE_FIELD_NUMBER = 5;
    private int vehType_;
    public boolean hasVehType() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getVehType() {
      return vehType_;
    }
    
    private void initFields() {
      reportStrategy_ = 0L;
      reportPlan_ = 0L;
      reportInterval_ = 0L;
      engineType_ = 0;
      vehType_ = 0;
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
        output.writeInt64(1, reportStrategy_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, reportPlan_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, reportInterval_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, engineType_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, vehType_);
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
          .computeInt64Size(1, reportStrategy_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, reportPlan_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, reportInterval_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, engineType_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, vehType_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.internal_static_CANDataReportSetting_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.internal_static_CANDataReportSetting_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting.newBuilder()
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
        reportStrategy_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        reportPlan_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        reportInterval_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        engineType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        vehType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting build() {
        com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting result = new com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.reportStrategy_ = reportStrategy_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.reportPlan_ = reportPlan_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.reportInterval_ = reportInterval_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.engineType_ = engineType_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.vehType_ = vehType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting.getDefaultInstance()) return this;
        if (other.hasReportStrategy()) {
          setReportStrategy(other.getReportStrategy());
        }
        if (other.hasReportPlan()) {
          setReportPlan(other.getReportPlan());
        }
        if (other.hasReportInterval()) {
          setReportInterval(other.getReportInterval());
        }
        if (other.hasEngineType()) {
          setEngineType(other.getEngineType());
        }
        if (other.hasVehType()) {
          setVehType(other.getVehType());
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
              reportStrategy_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              reportPlan_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              reportInterval_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              engineType_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              vehType_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int64 reportStrategy = 1;
      private long reportStrategy_ ;
      public boolean hasReportStrategy() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getReportStrategy() {
        return reportStrategy_;
      }
      public Builder setReportStrategy(long value) {
        bitField0_ |= 0x00000001;
        reportStrategy_ = value;
        onChanged();
        return this;
      }
      public Builder clearReportStrategy() {
        bitField0_ = (bitField0_ & ~0x00000001);
        reportStrategy_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 reportPlan = 2;
      private long reportPlan_ ;
      public boolean hasReportPlan() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getReportPlan() {
        return reportPlan_;
      }
      public Builder setReportPlan(long value) {
        bitField0_ |= 0x00000002;
        reportPlan_ = value;
        onChanged();
        return this;
      }
      public Builder clearReportPlan() {
        bitField0_ = (bitField0_ & ~0x00000002);
        reportPlan_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 reportInterval = 3;
      private long reportInterval_ ;
      public boolean hasReportInterval() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getReportInterval() {
        return reportInterval_;
      }
      public Builder setReportInterval(long value) {
        bitField0_ |= 0x00000004;
        reportInterval_ = value;
        onChanged();
        return this;
      }
      public Builder clearReportInterval() {
        bitField0_ = (bitField0_ & ~0x00000004);
        reportInterval_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int32 engineType = 4;
      private int engineType_ ;
      public boolean hasEngineType() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getEngineType() {
        return engineType_;
      }
      public Builder setEngineType(int value) {
        bitField0_ |= 0x00000008;
        engineType_ = value;
        onChanged();
        return this;
      }
      public Builder clearEngineType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        engineType_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 vehType = 5;
      private int vehType_ ;
      public boolean hasVehType() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getVehType() {
        return vehType_;
      }
      public Builder setVehType(int value) {
        bitField0_ |= 0x00000010;
        vehType_ = value;
        onChanged();
        return this;
      }
      public Builder clearVehType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        vehType_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:CANDataReportSetting)
    }
    
    static {
      defaultInstance = new CANDataReportSetting(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:CANDataReportSetting)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_CANDataReportSetting_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CANDataReportSetting_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;core/proto/terminal/monitor/java/CANDa" +
      "taReportSetting.proto\"\177\n\024CANDataReportSe" +
      "tting\022\026\n\016reportStrategy\030\001 \001(\003\022\022\n\nreportP" +
      "lan\030\002 \001(\003\022\026\n\016reportInterval\030\003 \001(\003\022\022\n\neng" +
      "ineType\030\004 \001(\005\022\017\n\007vehType\030\005 \001(\005BY\n?com.na" +
      "vinfo.opentsp.platform.location.protocol" +
      ".terminal.monitorB\026LCCANDataReportSettin" +
      "g"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_CANDataReportSetting_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_CANDataReportSetting_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_CANDataReportSetting_descriptor,
              new java.lang.String[] { "ReportStrategy", "ReportPlan", "ReportInterval", "EngineType", "VehType", },
              com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting.class,
              com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCCANDataReportSetting.CANDataReportSetting.Builder.class);
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
