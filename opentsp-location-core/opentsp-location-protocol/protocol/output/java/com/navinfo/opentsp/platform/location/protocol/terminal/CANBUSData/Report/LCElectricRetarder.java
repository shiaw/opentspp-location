// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/CANBUSData/Report/ElectricRetarder.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report;

public final class LCElectricRetarder {
  private LCElectricRetarder() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum RetarderTorqueMode
      implements com.google.protobuf.ProtocolMessageEnum {
    noRequest(0, 0),
    ASR(1, 5),
    Transmission(2, 6),
    DR(3, 10),
    VM(4, 14),
    ;
    
    public static final int noRequest_VALUE = 0;
    public static final int ASR_VALUE = 5;
    public static final int Transmission_VALUE = 6;
    public static final int DR_VALUE = 10;
    public static final int VM_VALUE = 14;
    
    
    public final int getNumber() { return value; }
    
    public static RetarderTorqueMode valueOf(int value) {
      switch (value) {
        case 0: return noRequest;
        case 5: return ASR;
        case 6: return Transmission;
        case 10: return DR;
        case 14: return VM;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<RetarderTorqueMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<RetarderTorqueMode>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RetarderTorqueMode>() {
            public RetarderTorqueMode findValueByNumber(int number) {
              return RetarderTorqueMode.valueOf(number);
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
      return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final RetarderTorqueMode[] VALUES = {
      noRequest, ASR, Transmission, DR, VM, 
    };
    
    public static RetarderTorqueMode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private RetarderTorqueMode(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:RetarderTorqueMode)
  }
  
  public interface ElectricRetarderOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional .RetarderTorqueMode mode = 1;
    boolean hasMode();
    com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.RetarderTorqueMode getMode();
    
    // optional int32 actualTorquePercent = 2;
    boolean hasActualTorquePercent();
    int getActualTorquePercent();
    
    // optional int32 intendedTorquePercent = 3;
    boolean hasIntendedTorquePercent();
    int getIntendedTorquePercent();
    
    // optional int32 retarderAddress = 4;
    boolean hasRetarderAddress();
    int getRetarderAddress();
    
    // optional int32 demandTorquePercent = 5;
    boolean hasDemandTorquePercent();
    int getDemandTorquePercent();
    
    // optional int32 switchTorquePercent = 6;
    boolean hasSwitchTorquePercent();
    int getSwitchTorquePercent();
    
    // optional int32 maxRetarderTorquePercent = 7;
    boolean hasMaxRetarderTorquePercent();
    int getMaxRetarderTorquePercent();
  }
  public static final class ElectricRetarder extends
      com.google.protobuf.GeneratedMessage
      implements ElectricRetarderOrBuilder {
    // Use ElectricRetarder.newBuilder() to construct.
    private ElectricRetarder(Builder builder) {
      super(builder);
    }
    private ElectricRetarder(boolean noInit) {}
    
    private static final ElectricRetarder defaultInstance;
    public static ElectricRetarder getDefaultInstance() {
      return defaultInstance;
    }
    
    public ElectricRetarder getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.internal_static_ElectricRetarder_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.internal_static_ElectricRetarder_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional .RetarderTorqueMode mode = 1;
    public static final int MODE_FIELD_NUMBER = 1;
    private com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.RetarderTorqueMode mode_;
    public boolean hasMode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.RetarderTorqueMode getMode() {
      return mode_;
    }
    
    // optional int32 actualTorquePercent = 2;
    public static final int ACTUALTORQUEPERCENT_FIELD_NUMBER = 2;
    private int actualTorquePercent_;
    public boolean hasActualTorquePercent() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getActualTorquePercent() {
      return actualTorquePercent_;
    }
    
    // optional int32 intendedTorquePercent = 3;
    public static final int INTENDEDTORQUEPERCENT_FIELD_NUMBER = 3;
    private int intendedTorquePercent_;
    public boolean hasIntendedTorquePercent() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getIntendedTorquePercent() {
      return intendedTorquePercent_;
    }
    
    // optional int32 retarderAddress = 4;
    public static final int RETARDERADDRESS_FIELD_NUMBER = 4;
    private int retarderAddress_;
    public boolean hasRetarderAddress() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getRetarderAddress() {
      return retarderAddress_;
    }
    
    // optional int32 demandTorquePercent = 5;
    public static final int DEMANDTORQUEPERCENT_FIELD_NUMBER = 5;
    private int demandTorquePercent_;
    public boolean hasDemandTorquePercent() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getDemandTorquePercent() {
      return demandTorquePercent_;
    }
    
    // optional int32 switchTorquePercent = 6;
    public static final int SWITCHTORQUEPERCENT_FIELD_NUMBER = 6;
    private int switchTorquePercent_;
    public boolean hasSwitchTorquePercent() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getSwitchTorquePercent() {
      return switchTorquePercent_;
    }
    
    // optional int32 maxRetarderTorquePercent = 7;
    public static final int MAXRETARDERTORQUEPERCENT_FIELD_NUMBER = 7;
    private int maxRetarderTorquePercent_;
    public boolean hasMaxRetarderTorquePercent() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getMaxRetarderTorquePercent() {
      return maxRetarderTorquePercent_;
    }
    
    private void initFields() {
      mode_ = com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.RetarderTorqueMode.noRequest;
      actualTorquePercent_ = 0;
      intendedTorquePercent_ = 0;
      retarderAddress_ = 0;
      demandTorquePercent_ = 0;
      switchTorquePercent_ = 0;
      maxRetarderTorquePercent_ = 0;
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
        output.writeEnum(1, mode_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, actualTorquePercent_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, intendedTorquePercent_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, retarderAddress_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, demandTorquePercent_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, switchTorquePercent_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, maxRetarderTorquePercent_);
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
          .computeEnumSize(1, mode_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, actualTorquePercent_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, intendedTorquePercent_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retarderAddress_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, demandTorquePercent_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, switchTorquePercent_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, maxRetarderTorquePercent_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.internal_static_ElectricRetarder_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.internal_static_ElectricRetarder_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder.newBuilder()
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
        mode_ = com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.RetarderTorqueMode.noRequest;
        bitField0_ = (bitField0_ & ~0x00000001);
        actualTorquePercent_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        intendedTorquePercent_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        retarderAddress_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        demandTorquePercent_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        switchTorquePercent_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        maxRetarderTorquePercent_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder build() {
        com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder result = new com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.mode_ = mode_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.actualTorquePercent_ = actualTorquePercent_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.intendedTorquePercent_ = intendedTorquePercent_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.retarderAddress_ = retarderAddress_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.demandTorquePercent_ = demandTorquePercent_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.switchTorquePercent_ = switchTorquePercent_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.maxRetarderTorquePercent_ = maxRetarderTorquePercent_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder.getDefaultInstance()) return this;
        if (other.hasMode()) {
          setMode(other.getMode());
        }
        if (other.hasActualTorquePercent()) {
          setActualTorquePercent(other.getActualTorquePercent());
        }
        if (other.hasIntendedTorquePercent()) {
          setIntendedTorquePercent(other.getIntendedTorquePercent());
        }
        if (other.hasRetarderAddress()) {
          setRetarderAddress(other.getRetarderAddress());
        }
        if (other.hasDemandTorquePercent()) {
          setDemandTorquePercent(other.getDemandTorquePercent());
        }
        if (other.hasSwitchTorquePercent()) {
          setSwitchTorquePercent(other.getSwitchTorquePercent());
        }
        if (other.hasMaxRetarderTorquePercent()) {
          setMaxRetarderTorquePercent(other.getMaxRetarderTorquePercent());
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
              int rawValue = input.readEnum();
              com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.RetarderTorqueMode value = com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.RetarderTorqueMode.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                mode_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              actualTorquePercent_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              intendedTorquePercent_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              retarderAddress_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              demandTorquePercent_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              switchTorquePercent_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              maxRetarderTorquePercent_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional .RetarderTorqueMode mode = 1;
      private com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.RetarderTorqueMode mode_ = com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.RetarderTorqueMode.noRequest;
      public boolean hasMode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.RetarderTorqueMode getMode() {
        return mode_;
      }
      public Builder setMode(com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.RetarderTorqueMode value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        mode_ = value;
        onChanged();
        return this;
      }
      public Builder clearMode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        mode_ = com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.RetarderTorqueMode.noRequest;
        onChanged();
        return this;
      }
      
      // optional int32 actualTorquePercent = 2;
      private int actualTorquePercent_ ;
      public boolean hasActualTorquePercent() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getActualTorquePercent() {
        return actualTorquePercent_;
      }
      public Builder setActualTorquePercent(int value) {
        bitField0_ |= 0x00000002;
        actualTorquePercent_ = value;
        onChanged();
        return this;
      }
      public Builder clearActualTorquePercent() {
        bitField0_ = (bitField0_ & ~0x00000002);
        actualTorquePercent_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 intendedTorquePercent = 3;
      private int intendedTorquePercent_ ;
      public boolean hasIntendedTorquePercent() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getIntendedTorquePercent() {
        return intendedTorquePercent_;
      }
      public Builder setIntendedTorquePercent(int value) {
        bitField0_ |= 0x00000004;
        intendedTorquePercent_ = value;
        onChanged();
        return this;
      }
      public Builder clearIntendedTorquePercent() {
        bitField0_ = (bitField0_ & ~0x00000004);
        intendedTorquePercent_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 retarderAddress = 4;
      private int retarderAddress_ ;
      public boolean hasRetarderAddress() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getRetarderAddress() {
        return retarderAddress_;
      }
      public Builder setRetarderAddress(int value) {
        bitField0_ |= 0x00000008;
        retarderAddress_ = value;
        onChanged();
        return this;
      }
      public Builder clearRetarderAddress() {
        bitField0_ = (bitField0_ & ~0x00000008);
        retarderAddress_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 demandTorquePercent = 5;
      private int demandTorquePercent_ ;
      public boolean hasDemandTorquePercent() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getDemandTorquePercent() {
        return demandTorquePercent_;
      }
      public Builder setDemandTorquePercent(int value) {
        bitField0_ |= 0x00000010;
        demandTorquePercent_ = value;
        onChanged();
        return this;
      }
      public Builder clearDemandTorquePercent() {
        bitField0_ = (bitField0_ & ~0x00000010);
        demandTorquePercent_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 switchTorquePercent = 6;
      private int switchTorquePercent_ ;
      public boolean hasSwitchTorquePercent() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getSwitchTorquePercent() {
        return switchTorquePercent_;
      }
      public Builder setSwitchTorquePercent(int value) {
        bitField0_ |= 0x00000020;
        switchTorquePercent_ = value;
        onChanged();
        return this;
      }
      public Builder clearSwitchTorquePercent() {
        bitField0_ = (bitField0_ & ~0x00000020);
        switchTorquePercent_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 maxRetarderTorquePercent = 7;
      private int maxRetarderTorquePercent_ ;
      public boolean hasMaxRetarderTorquePercent() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getMaxRetarderTorquePercent() {
        return maxRetarderTorquePercent_;
      }
      public Builder setMaxRetarderTorquePercent(int value) {
        bitField0_ |= 0x00000040;
        maxRetarderTorquePercent_ = value;
        onChanged();
        return this;
      }
      public Builder clearMaxRetarderTorquePercent() {
        bitField0_ = (bitField0_ & ~0x00000040);
        maxRetarderTorquePercent_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:ElectricRetarder)
    }
    
    static {
      defaultInstance = new ElectricRetarder(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ElectricRetarder)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ElectricRetarder_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ElectricRetarder_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<core/proto/terminal/CANBUSData/Report/" +
      "ElectricRetarder.proto\"\346\001\n\020ElectricRetar" +
      "der\022!\n\004mode\030\001 \001(\0162\023.RetarderTorqueMode\022\033" +
      "\n\023actualTorquePercent\030\002 \001(\005\022\035\n\025intendedT" +
      "orquePercent\030\003 \001(\005\022\027\n\017retarderAddress\030\004 " +
      "\001(\005\022\033\n\023demandTorquePercent\030\005 \001(\005\022\033\n\023swit" +
      "chTorquePercent\030\006 \001(\005\022 \n\030maxRetarderTorq" +
      "uePercent\030\007 \001(\005*N\n\022RetarderTorqueMode\022\r\n" +
      "\tnoRequest\020\000\022\007\n\003ASR\020\005\022\020\n\014Transmission\020\006\022" +
      "\006\n\002DR\020\n\022\006\n\002VM\020\016B_\nIcom.navinfo.opentsp.p",
      "latform.location.protocol.terminal.CANBU" +
      "SData.ReportB\022LCElectricRetarder"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ElectricRetarder_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ElectricRetarder_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ElectricRetarder_descriptor,
              new java.lang.String[] { "Mode", "ActualTorquePercent", "IntendedTorquePercent", "RetarderAddress", "DemandTorquePercent", "SwitchTorquePercent", "MaxRetarderTorquePercent", },
              com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder.class,
              com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCElectricRetarder.ElectricRetarder.Builder.class);
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