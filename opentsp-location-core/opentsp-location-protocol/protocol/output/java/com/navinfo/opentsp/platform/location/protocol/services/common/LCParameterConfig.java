// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/services/common/java/ParameterConfig.proto

package com.navinfo.opentsp.platform.location.protocol.services.common;

public final class LCParameterConfig {
  private LCParameterConfig() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ParameterConfigOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .ParameterConfig.ParameterType types = 1;
    boolean hasTypes();
    com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.ParameterType getTypes();
    
    // required int32 values = 2;
    boolean hasValues();
    int getValues();
  }
  public static final class ParameterConfig extends
      com.google.protobuf.GeneratedMessage
      implements ParameterConfigOrBuilder {
    // Use ParameterConfig.newBuilder() to construct.
    private ParameterConfig(Builder builder) {
      super(builder);
    }
    private ParameterConfig(boolean noInit) {}
    
    private static final ParameterConfig defaultInstance;
    public static ParameterConfig getDefaultInstance() {
      return defaultInstance;
    }
    
    public ParameterConfig getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.internal_static_ParameterConfig_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.internal_static_ParameterConfig_fieldAccessorTable;
    }
    
    public enum ParameterType
        implements com.google.protobuf.ProtocolMessageEnum {
      all_reconnectTimes(0, 1),
      all_reconnectInterval(1, 2),
      all_nodeNumber(2, 3),
      all_nodeDistrict(3, 4),
      all_heartbeatInterval(4, 5),
      ta_pictureDataTimeoutThreshold(5, 16),
      ta_pictureProcessInterval(6, 17),
      ta_commandTimeoutThreshold(7, 18),
      ta_commandProcessInterval(8, 19),
      ta_commonCacheProcessInterval(9, 20),
      ta_patchDataThreshold(10, 21),
      dp_terminalSettingThreshold(11, 48),
      dp_dataSaveThreshold(12, 49),
      dp_removeInvalidDataThreshold(13, 50),
      dp_terminalSetProcessInterval(14, 51),
      dp_dpAndTaGuaranteeInterval(15, 52),
      dp_removeInvalidDataInterval(16, 53),
      dp_commonDataProcessInterval(17, 54),
      en_threadNumber(18, 80),
      ;
      
      public static final int all_reconnectTimes_VALUE = 1;
      public static final int all_reconnectInterval_VALUE = 2;
      public static final int all_nodeNumber_VALUE = 3;
      public static final int all_nodeDistrict_VALUE = 4;
      public static final int all_heartbeatInterval_VALUE = 5;
      public static final int ta_pictureDataTimeoutThreshold_VALUE = 16;
      public static final int ta_pictureProcessInterval_VALUE = 17;
      public static final int ta_commandTimeoutThreshold_VALUE = 18;
      public static final int ta_commandProcessInterval_VALUE = 19;
      public static final int ta_commonCacheProcessInterval_VALUE = 20;
      public static final int ta_patchDataThreshold_VALUE = 21;
      public static final int dp_terminalSettingThreshold_VALUE = 48;
      public static final int dp_dataSaveThreshold_VALUE = 49;
      public static final int dp_removeInvalidDataThreshold_VALUE = 50;
      public static final int dp_terminalSetProcessInterval_VALUE = 51;
      public static final int dp_dpAndTaGuaranteeInterval_VALUE = 52;
      public static final int dp_removeInvalidDataInterval_VALUE = 53;
      public static final int dp_commonDataProcessInterval_VALUE = 54;
      public static final int en_threadNumber_VALUE = 80;
      
      
      public final int getNumber() { return value; }
      
      public static ParameterType valueOf(int value) {
        switch (value) {
          case 1: return all_reconnectTimes;
          case 2: return all_reconnectInterval;
          case 3: return all_nodeNumber;
          case 4: return all_nodeDistrict;
          case 5: return all_heartbeatInterval;
          case 16: return ta_pictureDataTimeoutThreshold;
          case 17: return ta_pictureProcessInterval;
          case 18: return ta_commandTimeoutThreshold;
          case 19: return ta_commandProcessInterval;
          case 20: return ta_commonCacheProcessInterval;
          case 21: return ta_patchDataThreshold;
          case 48: return dp_terminalSettingThreshold;
          case 49: return dp_dataSaveThreshold;
          case 50: return dp_removeInvalidDataThreshold;
          case 51: return dp_terminalSetProcessInterval;
          case 52: return dp_dpAndTaGuaranteeInterval;
          case 53: return dp_removeInvalidDataInterval;
          case 54: return dp_commonDataProcessInterval;
          case 80: return en_threadNumber;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<ParameterType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<ParameterType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ParameterType>() {
              public ParameterType findValueByNumber(int number) {
                return ParameterType.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final ParameterType[] VALUES = {
        all_reconnectTimes, all_reconnectInterval, all_nodeNumber, all_nodeDistrict, all_heartbeatInterval, ta_pictureDataTimeoutThreshold, ta_pictureProcessInterval, ta_commandTimeoutThreshold, ta_commandProcessInterval, ta_commonCacheProcessInterval, ta_patchDataThreshold, dp_terminalSettingThreshold, dp_dataSaveThreshold, dp_removeInvalidDataThreshold, dp_terminalSetProcessInterval, dp_dpAndTaGuaranteeInterval, dp_removeInvalidDataInterval, dp_commonDataProcessInterval, en_threadNumber, 
      };
      
      public static ParameterType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private ParameterType(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:ParameterConfig.ParameterType)
    }
    
    private int bitField0_;
    // required .ParameterConfig.ParameterType types = 1;
    public static final int TYPES_FIELD_NUMBER = 1;
    private com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.ParameterType types_;
    public boolean hasTypes() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.ParameterType getTypes() {
      return types_;
    }
    
    // required int32 values = 2;
    public static final int VALUES_FIELD_NUMBER = 2;
    private int values_;
    public boolean hasValues() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getValues() {
      return values_;
    }
    
    private void initFields() {
      types_ = com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.ParameterType.all_reconnectTimes;
      values_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTypes()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasValues()) {
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
        output.writeEnum(1, types_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, values_);
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
          .computeEnumSize(1, types_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, values_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.internal_static_ParameterConfig_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.internal_static_ParameterConfig_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.newBuilder()
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
        types_ = com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.ParameterType.all_reconnectTimes;
        bitField0_ = (bitField0_ & ~0x00000001);
        values_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig build() {
        com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig result = new com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.types_ = types_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.values_ = values_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.getDefaultInstance()) return this;
        if (other.hasTypes()) {
          setTypes(other.getTypes());
        }
        if (other.hasValues()) {
          setValues(other.getValues());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTypes()) {
          
          return false;
        }
        if (!hasValues()) {
          
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
              int rawValue = input.readEnum();
              com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.ParameterType value = com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.ParameterType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                types_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              values_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .ParameterConfig.ParameterType types = 1;
      private com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.ParameterType types_ = com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.ParameterType.all_reconnectTimes;
      public boolean hasTypes() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.ParameterType getTypes() {
        return types_;
      }
      public Builder setTypes(com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.ParameterType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        types_ = value;
        onChanged();
        return this;
      }
      public Builder clearTypes() {
        bitField0_ = (bitField0_ & ~0x00000001);
        types_ = com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.ParameterType.all_reconnectTimes;
        onChanged();
        return this;
      }
      
      // required int32 values = 2;
      private int values_ ;
      public boolean hasValues() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getValues() {
        return values_;
      }
      public Builder setValues(int value) {
        bitField0_ |= 0x00000002;
        values_ = value;
        onChanged();
        return this;
      }
      public Builder clearValues() {
        bitField0_ = (bitField0_ & ~0x00000002);
        values_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:ParameterConfig)
    }
    
    static {
      defaultInstance = new ParameterConfig(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ParameterConfig)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ParameterConfig_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ParameterConfig_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5core/proto/services/common/java/Parame" +
      "terConfig.proto\"\225\005\n\017ParameterConfig\022-\n\005t" +
      "ypes\030\001 \002(\0162\036.ParameterConfig.ParameterTy" +
      "pe\022\016\n\006values\030\002 \002(\005\"\302\004\n\rParameterType\022\026\n\022" +
      "all_reconnectTimes\020\001\022\031\n\025all_reconnectInt" +
      "erval\020\002\022\022\n\016all_nodeNumber\020\003\022\024\n\020all_nodeD" +
      "istrict\020\004\022\031\n\025all_heartbeatInterval\020\005\022\"\n\036" +
      "ta_pictureDataTimeoutThreshold\020\020\022\035\n\031ta_p" +
      "ictureProcessInterval\020\021\022\036\n\032ta_commandTim" +
      "eoutThreshold\020\022\022\035\n\031ta_commandProcessInte",
      "rval\020\023\022!\n\035ta_commonCacheProcessInterval\020" +
      "\024\022\031\n\025ta_patchDataThreshold\020\025\022\037\n\033dp_termi" +
      "nalSettingThreshold\0200\022\030\n\024dp_dataSaveThre" +
      "shold\0201\022!\n\035dp_removeInvalidDataThreshold" +
      "\0202\022!\n\035dp_terminalSetProcessInterval\0203\022\037\n" +
      "\033dp_dpAndTaGuaranteeInterval\0204\022 \n\034dp_rem" +
      "oveInvalidDataInterval\0205\022 \n\034dp_commonDat" +
      "aProcessInterval\0206\022\023\n\017en_threadNumber\020PB" +
      "S\n>com.navinfo.opentsp.platform.location" +
      ".protocol.services.commonB\021LCParameterCo",
      "nfig"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ParameterConfig_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ParameterConfig_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ParameterConfig_descriptor,
              new java.lang.String[] { "Types", "Values", },
              com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.class,
              com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.Builder.class);
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
