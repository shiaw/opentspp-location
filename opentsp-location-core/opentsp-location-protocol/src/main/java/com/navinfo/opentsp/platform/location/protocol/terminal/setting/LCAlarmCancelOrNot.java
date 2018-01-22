// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/setting/java/AlarmCancelOrNot.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.setting;

public final class LCAlarmCancelOrNot {
  private LCAlarmCancelOrNot() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AlarmCancelOrNotOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 alarmType = 1;
    boolean hasAlarmType();
    long getAlarmType();
    
    // required bool isCancel = 2;
    boolean hasIsCancel();
    boolean getIsCancel();
  }
  public static final class AlarmCancelOrNot extends
      com.google.protobuf.GeneratedMessage
      implements AlarmCancelOrNotOrBuilder {
    // Use AlarmCancelOrNot.newBuilder() to construct.
    private AlarmCancelOrNot(Builder builder) {
      super(builder);
    }
    private AlarmCancelOrNot(boolean noInit) {}
    
    private static final AlarmCancelOrNot defaultInstance;
    public static AlarmCancelOrNot getDefaultInstance() {
      return defaultInstance;
    }
    
    public AlarmCancelOrNot getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCAlarmCancelOrNot.internal_static_AlarmCancelOrNot_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCAlarmCancelOrNot.internal_static_AlarmCancelOrNot_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 alarmType = 1;
    public static final int ALARMTYPE_FIELD_NUMBER = 1;
    private long alarmType_;
    public boolean hasAlarmType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getAlarmType() {
      return alarmType_;
    }
    
    // required bool isCancel = 2;
    public static final int ISCANCEL_FIELD_NUMBER = 2;
    private boolean isCancel_;
    public boolean hasIsCancel() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public boolean getIsCancel() {
      return isCancel_;
    }
    
    private void initFields() {
      alarmType_ = 0L;
      isCancel_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasAlarmType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIsCancel()) {
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
        output.writeInt64(1, alarmType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, isCancel_);
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
          .computeInt64Size(1, alarmType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isCancel_);
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
    
    public static AlarmCancelOrNot parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static AlarmCancelOrNot parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static AlarmCancelOrNot parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static AlarmCancelOrNot parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static AlarmCancelOrNot parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static AlarmCancelOrNot parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static AlarmCancelOrNot parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static AlarmCancelOrNot parseDelimitedFrom(
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
    public static AlarmCancelOrNot parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static AlarmCancelOrNot parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(AlarmCancelOrNot prototype) {
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
       implements AlarmCancelOrNotOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCAlarmCancelOrNot.internal_static_AlarmCancelOrNot_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCAlarmCancelOrNot.internal_static_AlarmCancelOrNot_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.setting.LCAlarmCancelOrNot.AlarmCancelOrNot.newBuilder()
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
        alarmType_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        isCancel_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AlarmCancelOrNot.getDescriptor();
      }
      
      public AlarmCancelOrNot getDefaultInstanceForType() {
        return AlarmCancelOrNot.getDefaultInstance();
      }
      
      public AlarmCancelOrNot build() {
        AlarmCancelOrNot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private AlarmCancelOrNot buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        AlarmCancelOrNot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public AlarmCancelOrNot buildPartial() {
        AlarmCancelOrNot result = new AlarmCancelOrNot(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.alarmType_ = alarmType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.isCancel_ = isCancel_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AlarmCancelOrNot) {
          return mergeFrom((AlarmCancelOrNot)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(AlarmCancelOrNot other) {
        if (other == AlarmCancelOrNot.getDefaultInstance()) return this;
        if (other.hasAlarmType()) {
          setAlarmType(other.getAlarmType());
        }
        if (other.hasIsCancel()) {
          setIsCancel(other.getIsCancel());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasAlarmType()) {
          
          return false;
        }
        if (!hasIsCancel()) {
          
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
              alarmType_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              isCancel_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 alarmType = 1;
      private long alarmType_ ;
      public boolean hasAlarmType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getAlarmType() {
        return alarmType_;
      }
      public Builder setAlarmType(long value) {
        bitField0_ |= 0x00000001;
        alarmType_ = value;
        onChanged();
        return this;
      }
      public Builder clearAlarmType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        alarmType_ = 0L;
        onChanged();
        return this;
      }
      
      // required bool isCancel = 2;
      private boolean isCancel_ ;
      public boolean hasIsCancel() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public boolean getIsCancel() {
        return isCancel_;
      }
      public Builder setIsCancel(boolean value) {
        bitField0_ |= 0x00000002;
        isCancel_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsCancel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isCancel_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:AlarmCancelOrNot)
    }
    
    static {
      defaultInstance = new AlarmCancelOrNot(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:AlarmCancelOrNot)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_AlarmCancelOrNot_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AlarmCancelOrNot_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n7core/proto/terminal/setting/java/Alarm" +
      "CancelOrNot.proto\"7\n\020AlarmCancelOrNot\022\021\n" +
      "\talarmType\030\001 \002(\003\022\020\n\010isCancel\030\002 \002(\010BU\n?co" +
      "m.navinfo.opentsp.platform.location.prot" +
      "ocol.terminal.settingB\022LCAlarmCancelOrNo" +
      "t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_AlarmCancelOrNot_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_AlarmCancelOrNot_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_AlarmCancelOrNot_descriptor,
              new String[] { "AlarmType", "IsCancel", },
              AlarmCancelOrNot.class,
              AlarmCancelOrNot.Builder.class);
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
