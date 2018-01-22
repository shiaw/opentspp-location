// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/setting/parameter/java/AlarmTriggeredSetting.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter;

public final class LCAlarmTriggeredSetting {
  private LCAlarmTriggeredSetting() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AlarmTriggeredSettingOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int64 alarmMask = 1;
    boolean hasAlarmMask();
    long getAlarmMask();
    
    // optional int64 alarmSmsSwitch = 2;
    boolean hasAlarmSmsSwitch();
    long getAlarmSmsSwitch();
    
    // optional int64 alarmPhotoSwitch = 3;
    boolean hasAlarmPhotoSwitch();
    long getAlarmPhotoSwitch();
    
    // optional int64 alarmPhotoSave = 4;
    boolean hasAlarmPhotoSave();
    long getAlarmPhotoSave();
    
    // optional int64 alarmKeyStatus = 5;
    boolean hasAlarmKeyStatus();
    long getAlarmKeyStatus();
  }
  public static final class AlarmTriggeredSetting extends
      com.google.protobuf.GeneratedMessage
      implements AlarmTriggeredSettingOrBuilder {
    // Use AlarmTriggeredSetting.newBuilder() to construct.
    private AlarmTriggeredSetting(Builder builder) {
      super(builder);
    }
    private AlarmTriggeredSetting(boolean noInit) {}
    
    private static final AlarmTriggeredSetting defaultInstance;
    public static AlarmTriggeredSetting getDefaultInstance() {
      return defaultInstance;
    }
    
    public AlarmTriggeredSetting getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCAlarmTriggeredSetting.internal_static_AlarmTriggeredSetting_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCAlarmTriggeredSetting.internal_static_AlarmTriggeredSetting_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int64 alarmMask = 1;
    public static final int ALARMMASK_FIELD_NUMBER = 1;
    private long alarmMask_;
    public boolean hasAlarmMask() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getAlarmMask() {
      return alarmMask_;
    }
    
    // optional int64 alarmSmsSwitch = 2;
    public static final int ALARMSMSSWITCH_FIELD_NUMBER = 2;
    private long alarmSmsSwitch_;
    public boolean hasAlarmSmsSwitch() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getAlarmSmsSwitch() {
      return alarmSmsSwitch_;
    }
    
    // optional int64 alarmPhotoSwitch = 3;
    public static final int ALARMPHOTOSWITCH_FIELD_NUMBER = 3;
    private long alarmPhotoSwitch_;
    public boolean hasAlarmPhotoSwitch() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getAlarmPhotoSwitch() {
      return alarmPhotoSwitch_;
    }
    
    // optional int64 alarmPhotoSave = 4;
    public static final int ALARMPHOTOSAVE_FIELD_NUMBER = 4;
    private long alarmPhotoSave_;
    public boolean hasAlarmPhotoSave() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public long getAlarmPhotoSave() {
      return alarmPhotoSave_;
    }
    
    // optional int64 alarmKeyStatus = 5;
    public static final int ALARMKEYSTATUS_FIELD_NUMBER = 5;
    private long alarmKeyStatus_;
    public boolean hasAlarmKeyStatus() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public long getAlarmKeyStatus() {
      return alarmKeyStatus_;
    }
    
    private void initFields() {
      alarmMask_ = 0L;
      alarmSmsSwitch_ = 0L;
      alarmPhotoSwitch_ = 0L;
      alarmPhotoSave_ = 0L;
      alarmKeyStatus_ = 0L;
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
        output.writeInt64(1, alarmMask_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, alarmSmsSwitch_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, alarmPhotoSwitch_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, alarmPhotoSave_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, alarmKeyStatus_);
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
          .computeInt64Size(1, alarmMask_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, alarmSmsSwitch_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, alarmPhotoSwitch_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, alarmPhotoSave_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, alarmKeyStatus_);
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
    
    public static AlarmTriggeredSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static AlarmTriggeredSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static AlarmTriggeredSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static AlarmTriggeredSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static AlarmTriggeredSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static AlarmTriggeredSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static AlarmTriggeredSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static AlarmTriggeredSetting parseDelimitedFrom(
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
    public static AlarmTriggeredSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static AlarmTriggeredSetting parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(AlarmTriggeredSetting prototype) {
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
       implements AlarmTriggeredSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCAlarmTriggeredSetting.internal_static_AlarmTriggeredSetting_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCAlarmTriggeredSetting.internal_static_AlarmTriggeredSetting_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCAlarmTriggeredSetting.AlarmTriggeredSetting.newBuilder()
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
        alarmMask_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        alarmSmsSwitch_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        alarmPhotoSwitch_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        alarmPhotoSave_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        alarmKeyStatus_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AlarmTriggeredSetting.getDescriptor();
      }
      
      public AlarmTriggeredSetting getDefaultInstanceForType() {
        return AlarmTriggeredSetting.getDefaultInstance();
      }
      
      public AlarmTriggeredSetting build() {
        AlarmTriggeredSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private AlarmTriggeredSetting buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        AlarmTriggeredSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public AlarmTriggeredSetting buildPartial() {
        AlarmTriggeredSetting result = new AlarmTriggeredSetting(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.alarmMask_ = alarmMask_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.alarmSmsSwitch_ = alarmSmsSwitch_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.alarmPhotoSwitch_ = alarmPhotoSwitch_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.alarmPhotoSave_ = alarmPhotoSave_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.alarmKeyStatus_ = alarmKeyStatus_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AlarmTriggeredSetting) {
          return mergeFrom((AlarmTriggeredSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(AlarmTriggeredSetting other) {
        if (other == AlarmTriggeredSetting.getDefaultInstance()) return this;
        if (other.hasAlarmMask()) {
          setAlarmMask(other.getAlarmMask());
        }
        if (other.hasAlarmSmsSwitch()) {
          setAlarmSmsSwitch(other.getAlarmSmsSwitch());
        }
        if (other.hasAlarmPhotoSwitch()) {
          setAlarmPhotoSwitch(other.getAlarmPhotoSwitch());
        }
        if (other.hasAlarmPhotoSave()) {
          setAlarmPhotoSave(other.getAlarmPhotoSave());
        }
        if (other.hasAlarmKeyStatus()) {
          setAlarmKeyStatus(other.getAlarmKeyStatus());
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
              alarmMask_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              alarmSmsSwitch_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              alarmPhotoSwitch_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              alarmPhotoSave_ = input.readInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              alarmKeyStatus_ = input.readInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int64 alarmMask = 1;
      private long alarmMask_ ;
      public boolean hasAlarmMask() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getAlarmMask() {
        return alarmMask_;
      }
      public Builder setAlarmMask(long value) {
        bitField0_ |= 0x00000001;
        alarmMask_ = value;
        onChanged();
        return this;
      }
      public Builder clearAlarmMask() {
        bitField0_ = (bitField0_ & ~0x00000001);
        alarmMask_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 alarmSmsSwitch = 2;
      private long alarmSmsSwitch_ ;
      public boolean hasAlarmSmsSwitch() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getAlarmSmsSwitch() {
        return alarmSmsSwitch_;
      }
      public Builder setAlarmSmsSwitch(long value) {
        bitField0_ |= 0x00000002;
        alarmSmsSwitch_ = value;
        onChanged();
        return this;
      }
      public Builder clearAlarmSmsSwitch() {
        bitField0_ = (bitField0_ & ~0x00000002);
        alarmSmsSwitch_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 alarmPhotoSwitch = 3;
      private long alarmPhotoSwitch_ ;
      public boolean hasAlarmPhotoSwitch() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getAlarmPhotoSwitch() {
        return alarmPhotoSwitch_;
      }
      public Builder setAlarmPhotoSwitch(long value) {
        bitField0_ |= 0x00000004;
        alarmPhotoSwitch_ = value;
        onChanged();
        return this;
      }
      public Builder clearAlarmPhotoSwitch() {
        bitField0_ = (bitField0_ & ~0x00000004);
        alarmPhotoSwitch_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 alarmPhotoSave = 4;
      private long alarmPhotoSave_ ;
      public boolean hasAlarmPhotoSave() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public long getAlarmPhotoSave() {
        return alarmPhotoSave_;
      }
      public Builder setAlarmPhotoSave(long value) {
        bitField0_ |= 0x00000008;
        alarmPhotoSave_ = value;
        onChanged();
        return this;
      }
      public Builder clearAlarmPhotoSave() {
        bitField0_ = (bitField0_ & ~0x00000008);
        alarmPhotoSave_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 alarmKeyStatus = 5;
      private long alarmKeyStatus_ ;
      public boolean hasAlarmKeyStatus() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public long getAlarmKeyStatus() {
        return alarmKeyStatus_;
      }
      public Builder setAlarmKeyStatus(long value) {
        bitField0_ |= 0x00000010;
        alarmKeyStatus_ = value;
        onChanged();
        return this;
      }
      public Builder clearAlarmKeyStatus() {
        bitField0_ = (bitField0_ & ~0x00000010);
        alarmKeyStatus_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:AlarmTriggeredSetting)
    }
    
    static {
      defaultInstance = new AlarmTriggeredSetting(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:AlarmTriggeredSetting)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_AlarmTriggeredSetting_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AlarmTriggeredSetting_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nFcore/proto/terminal/setting/parameter/" +
      "java/AlarmTriggeredSetting.proto\"\214\001\n\025Ala" +
      "rmTriggeredSetting\022\021\n\talarmMask\030\001 \001(\003\022\026\n" +
      "\016alarmSmsSwitch\030\002 \001(\003\022\030\n\020alarmPhotoSwitc" +
      "h\030\003 \001(\003\022\026\n\016alarmPhotoSave\030\004 \001(\003\022\026\n\016alarm" +
      "KeyStatus\030\005 \001(\003Bd\nIcom.navinfo.opentsp.p" +
      "latform.location.protocol.terminal.setti" +
      "ng.parameterB\027LCAlarmTriggeredSetting"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_AlarmTriggeredSetting_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_AlarmTriggeredSetting_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_AlarmTriggeredSetting_descriptor,
              new String[] { "AlarmMask", "AlarmSmsSwitch", "AlarmPhotoSwitch", "AlarmPhotoSave", "AlarmKeyStatus", },
              AlarmTriggeredSetting.class,
              AlarmTriggeredSetting.Builder.class);
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
