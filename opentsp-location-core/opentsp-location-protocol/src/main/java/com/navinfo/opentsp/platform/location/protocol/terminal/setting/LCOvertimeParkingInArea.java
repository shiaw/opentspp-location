// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/setting/java/OvertimeParkingInArea.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.setting;

public final class LCOvertimeParkingInArea {
  private LCOvertimeParkingInArea() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface OvertimeParkingInAreaOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .AreaInfo areaInfo = 1;
    boolean hasAreaInfo();
    com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo getAreaInfo();
    com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder getAreaInfoOrBuilder();
    
    // required int32 parkingTime = 2;
    boolean hasParkingTime();
    int getParkingTime();
    
    // optional bool saveSign = 3;
    boolean hasSaveSign();
    boolean getSaveSign();
    
    // optional int32 parkingTimeForNotify = 4;
    boolean hasParkingTimeForNotify();
    int getParkingTimeForNotify();
  }
  public static final class OvertimeParkingInArea extends
      com.google.protobuf.GeneratedMessage
      implements OvertimeParkingInAreaOrBuilder {
    // Use OvertimeParkingInArea.newBuilder() to construct.
    private OvertimeParkingInArea(Builder builder) {
      super(builder);
    }
    private OvertimeParkingInArea(boolean noInit) {}
    
    private static final OvertimeParkingInArea defaultInstance;
    public static OvertimeParkingInArea getDefaultInstance() {
      return defaultInstance;
    }
    
    public OvertimeParkingInArea getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCOvertimeParkingInArea.internal_static_OvertimeParkingInArea_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCOvertimeParkingInArea.internal_static_OvertimeParkingInArea_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .AreaInfo areaInfo = 1;
    public static final int AREAINFO_FIELD_NUMBER = 1;
    private com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo areaInfo_;
    public boolean hasAreaInfo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo getAreaInfo() {
      return areaInfo_;
    }
    public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder getAreaInfoOrBuilder() {
      return areaInfo_;
    }
    
    // required int32 parkingTime = 2;
    public static final int PARKINGTIME_FIELD_NUMBER = 2;
    private int parkingTime_;
    public boolean hasParkingTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getParkingTime() {
      return parkingTime_;
    }
    
    // optional bool saveSign = 3;
    public static final int SAVESIGN_FIELD_NUMBER = 3;
    private boolean saveSign_;
    public boolean hasSaveSign() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public boolean getSaveSign() {
      return saveSign_;
    }
    
    // optional int32 parkingTimeForNotify = 4;
    public static final int PARKINGTIMEFORNOTIFY_FIELD_NUMBER = 4;
    private int parkingTimeForNotify_;
    public boolean hasParkingTimeForNotify() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getParkingTimeForNotify() {
      return parkingTimeForNotify_;
    }
    
    private void initFields() {
      areaInfo_ = com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.getDefaultInstance();
      parkingTime_ = 0;
      saveSign_ = false;
      parkingTimeForNotify_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasAreaInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasParkingTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getAreaInfo().isInitialized()) {
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
        output.writeMessage(1, areaInfo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, parkingTime_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, saveSign_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, parkingTimeForNotify_);
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
          .computeMessageSize(1, areaInfo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, parkingTime_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, saveSign_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, parkingTimeForNotify_);
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
    
    public static OvertimeParkingInArea parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static OvertimeParkingInArea parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static OvertimeParkingInArea parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static OvertimeParkingInArea parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static OvertimeParkingInArea parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static OvertimeParkingInArea parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static OvertimeParkingInArea parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static OvertimeParkingInArea parseDelimitedFrom(
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
    public static OvertimeParkingInArea parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static OvertimeParkingInArea parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(OvertimeParkingInArea prototype) {
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
       implements OvertimeParkingInAreaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCOvertimeParkingInArea.internal_static_OvertimeParkingInArea_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCOvertimeParkingInArea.internal_static_OvertimeParkingInArea_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.setting.LCOvertimeParkingInArea.OvertimeParkingInArea.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getAreaInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (areaInfoBuilder_ == null) {
          areaInfo_ = com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.getDefaultInstance();
        } else {
          areaInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        parkingTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        saveSign_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        parkingTimeForNotify_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return OvertimeParkingInArea.getDescriptor();
      }
      
      public OvertimeParkingInArea getDefaultInstanceForType() {
        return OvertimeParkingInArea.getDefaultInstance();
      }
      
      public OvertimeParkingInArea build() {
        OvertimeParkingInArea result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private OvertimeParkingInArea buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        OvertimeParkingInArea result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public OvertimeParkingInArea buildPartial() {
        OvertimeParkingInArea result = new OvertimeParkingInArea(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (areaInfoBuilder_ == null) {
          result.areaInfo_ = areaInfo_;
        } else {
          result.areaInfo_ = areaInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.parkingTime_ = parkingTime_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.saveSign_ = saveSign_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.parkingTimeForNotify_ = parkingTimeForNotify_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof OvertimeParkingInArea) {
          return mergeFrom((OvertimeParkingInArea)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(OvertimeParkingInArea other) {
        if (other == OvertimeParkingInArea.getDefaultInstance()) return this;
        if (other.hasAreaInfo()) {
          mergeAreaInfo(other.getAreaInfo());
        }
        if (other.hasParkingTime()) {
          setParkingTime(other.getParkingTime());
        }
        if (other.hasSaveSign()) {
          setSaveSign(other.getSaveSign());
        }
        if (other.hasParkingTimeForNotify()) {
          setParkingTimeForNotify(other.getParkingTimeForNotify());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasAreaInfo()) {
          
          return false;
        }
        if (!hasParkingTime()) {
          
          return false;
        }
        if (!getAreaInfo().isInitialized()) {
          
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
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.newBuilder();
              if (hasAreaInfo()) {
                subBuilder.mergeFrom(getAreaInfo());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setAreaInfo(subBuilder.buildPartial());
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              parkingTime_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              saveSign_ = input.readBool();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              parkingTimeForNotify_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .AreaInfo areaInfo = 1;
      private com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo areaInfo_ = com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder> areaInfoBuilder_;
      public boolean hasAreaInfo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo getAreaInfo() {
        if (areaInfoBuilder_ == null) {
          return areaInfo_;
        } else {
          return areaInfoBuilder_.getMessage();
        }
      }
      public Builder setAreaInfo(com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo value) {
        if (areaInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          areaInfo_ = value;
          onChanged();
        } else {
          areaInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder setAreaInfo(
          com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder builderForValue) {
        if (areaInfoBuilder_ == null) {
          areaInfo_ = builderForValue.build();
          onChanged();
        } else {
          areaInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder mergeAreaInfo(com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo value) {
        if (areaInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              areaInfo_ != com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.getDefaultInstance()) {
            areaInfo_ =
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.newBuilder(areaInfo_).mergeFrom(value).buildPartial();
          } else {
            areaInfo_ = value;
          }
          onChanged();
        } else {
          areaInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder clearAreaInfo() {
        if (areaInfoBuilder_ == null) {
          areaInfo_ = com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.getDefaultInstance();
          onChanged();
        } else {
          areaInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder getAreaInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getAreaInfoFieldBuilder().getBuilder();
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder getAreaInfoOrBuilder() {
        if (areaInfoBuilder_ != null) {
          return areaInfoBuilder_.getMessageOrBuilder();
        } else {
          return areaInfo_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder> 
          getAreaInfoFieldBuilder() {
        if (areaInfoBuilder_ == null) {
          areaInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder>(
                  areaInfo_,
                  getParentForChildren(),
                  isClean());
          areaInfo_ = null;
        }
        return areaInfoBuilder_;
      }
      
      // required int32 parkingTime = 2;
      private int parkingTime_ ;
      public boolean hasParkingTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getParkingTime() {
        return parkingTime_;
      }
      public Builder setParkingTime(int value) {
        bitField0_ |= 0x00000002;
        parkingTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearParkingTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        parkingTime_ = 0;
        onChanged();
        return this;
      }
      
      // optional bool saveSign = 3;
      private boolean saveSign_ ;
      public boolean hasSaveSign() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public boolean getSaveSign() {
        return saveSign_;
      }
      public Builder setSaveSign(boolean value) {
        bitField0_ |= 0x00000004;
        saveSign_ = value;
        onChanged();
        return this;
      }
      public Builder clearSaveSign() {
        bitField0_ = (bitField0_ & ~0x00000004);
        saveSign_ = false;
        onChanged();
        return this;
      }
      
      // optional int32 parkingTimeForNotify = 4;
      private int parkingTimeForNotify_ ;
      public boolean hasParkingTimeForNotify() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getParkingTimeForNotify() {
        return parkingTimeForNotify_;
      }
      public Builder setParkingTimeForNotify(int value) {
        bitField0_ |= 0x00000008;
        parkingTimeForNotify_ = value;
        onChanged();
        return this;
      }
      public Builder clearParkingTimeForNotify() {
        bitField0_ = (bitField0_ & ~0x00000008);
        parkingTimeForNotify_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:OvertimeParkingInArea)
    }
    
    static {
      defaultInstance = new OvertimeParkingInArea(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:OvertimeParkingInArea)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_OvertimeParkingInArea_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_OvertimeParkingInArea_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n<core/proto/terminal/setting/java/Overt" +
      "imeParkingInArea.proto\0320core/proto/dataa" +
      "ccess/common/java/AreaInfo.proto\"y\n\025Over" +
      "timeParkingInArea\022\033\n\010areaInfo\030\001 \002(\0132\t.Ar" +
      "eaInfo\022\023\n\013parkingTime\030\002 \002(\005\022\020\n\010saveSign\030" +
      "\003 \001(\010\022\034\n\024parkingTimeForNotify\030\004 \001(\005BZ\n?c" +
      "om.navinfo.opentsp.platform.location.pro" +
      "tocol.terminal.settingB\027LCOvertimeParkin" +
      "gInArea"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_OvertimeParkingInArea_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_OvertimeParkingInArea_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_OvertimeParkingInArea_descriptor,
              new String[] { "AreaInfo", "ParkingTime", "SaveSign", "ParkingTimeForNotify", },
              OvertimeParkingInArea.class,
              OvertimeParkingInArea.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
