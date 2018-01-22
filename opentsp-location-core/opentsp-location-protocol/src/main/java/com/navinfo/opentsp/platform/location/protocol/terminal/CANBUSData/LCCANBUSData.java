// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/CANBUSData/CANBUSData.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData;

public final class LCCANBUSData {
  private LCCANBUSData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CANBUSDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 CANId = 1;
    boolean hasCANId();
    long getCANId();
    
    // required bool collectType = 2;
    boolean hasCollectType();
    boolean getCollectType();
    
    // required bool frameType = 3;
    boolean hasFrameType();
    boolean getFrameType();
    
    // required .CANChannel channel = 4;
    boolean hasChannel();
    LCCANChannel.CANChannel getChannel();
    
    // required bytes CANData = 5;
    boolean hasCANData();
    com.google.protobuf.ByteString getCANData();
  }
  public static final class CANBUSData extends
      com.google.protobuf.GeneratedMessage
      implements CANBUSDataOrBuilder {
    // Use CANBUSData.newBuilder() to construct.
    private CANBUSData(Builder builder) {
      super(builder);
    }
    private CANBUSData(boolean noInit) {}
    
    private static final CANBUSData defaultInstance;
    public static CANBUSData getDefaultInstance() {
      return defaultInstance;
    }
    
    public CANBUSData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCCANBUSData.internal_static_CANBUSData_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCCANBUSData.internal_static_CANBUSData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 CANId = 1;
    public static final int CANID_FIELD_NUMBER = 1;
    private long cANId_;
    public boolean hasCANId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getCANId() {
      return cANId_;
    }
    
    // required bool collectType = 2;
    public static final int COLLECTTYPE_FIELD_NUMBER = 2;
    private boolean collectType_;
    public boolean hasCollectType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public boolean getCollectType() {
      return collectType_;
    }
    
    // required bool frameType = 3;
    public static final int FRAMETYPE_FIELD_NUMBER = 3;
    private boolean frameType_;
    public boolean hasFrameType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public boolean getFrameType() {
      return frameType_;
    }
    
    // required .CANChannel channel = 4;
    public static final int CHANNEL_FIELD_NUMBER = 4;
    private LCCANChannel.CANChannel channel_;
    public boolean hasChannel() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public LCCANChannel.CANChannel getChannel() {
      return channel_;
    }
    
    // required bytes CANData = 5;
    public static final int CANDATA_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString cANData_;
    public boolean hasCANData() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public com.google.protobuf.ByteString getCANData() {
      return cANData_;
    }
    
    private void initFields() {
      cANId_ = 0L;
      collectType_ = false;
      frameType_ = false;
      channel_ = LCCANChannel.CANChannel.CAN_01;
      cANData_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasCANId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCollectType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFrameType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasChannel()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCANData()) {
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
        output.writeInt64(1, cANId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, collectType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, frameType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, channel_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, cANData_);
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
          .computeInt64Size(1, cANId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, collectType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, frameType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, channel_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, cANData_);
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
    
    public static CANBUSData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static CANBUSData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static CANBUSData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static CANBUSData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static CANBUSData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static CANBUSData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static CANBUSData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static CANBUSData parseDelimitedFrom(
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
    public static CANBUSData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static CANBUSData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(CANBUSData prototype) {
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
       implements CANBUSDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCCANBUSData.internal_static_CANBUSData_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCCANBUSData.internal_static_CANBUSData_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.LCCANBUSData.CANBUSData.newBuilder()
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
        cANId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        collectType_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        frameType_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        channel_ = LCCANChannel.CANChannel.CAN_01;
        bitField0_ = (bitField0_ & ~0x00000008);
        cANData_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CANBUSData.getDescriptor();
      }
      
      public CANBUSData getDefaultInstanceForType() {
        return CANBUSData.getDefaultInstance();
      }
      
      public CANBUSData build() {
        CANBUSData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private CANBUSData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        CANBUSData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public CANBUSData buildPartial() {
        CANBUSData result = new CANBUSData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.cANId_ = cANId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.collectType_ = collectType_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.frameType_ = frameType_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.channel_ = channel_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.cANData_ = cANData_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CANBUSData) {
          return mergeFrom((CANBUSData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(CANBUSData other) {
        if (other == CANBUSData.getDefaultInstance()) return this;
        if (other.hasCANId()) {
          setCANId(other.getCANId());
        }
        if (other.hasCollectType()) {
          setCollectType(other.getCollectType());
        }
        if (other.hasFrameType()) {
          setFrameType(other.getFrameType());
        }
        if (other.hasChannel()) {
          setChannel(other.getChannel());
        }
        if (other.hasCANData()) {
          setCANData(other.getCANData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasCANId()) {
          
          return false;
        }
        if (!hasCollectType()) {
          
          return false;
        }
        if (!hasFrameType()) {
          
          return false;
        }
        if (!hasChannel()) {
          
          return false;
        }
        if (!hasCANData()) {
          
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
              cANId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              collectType_ = input.readBool();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              frameType_ = input.readBool();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              LCCANChannel.CANChannel value = LCCANChannel.CANChannel.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                channel_ = value;
              }
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              cANData_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 CANId = 1;
      private long cANId_ ;
      public boolean hasCANId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getCANId() {
        return cANId_;
      }
      public Builder setCANId(long value) {
        bitField0_ |= 0x00000001;
        cANId_ = value;
        onChanged();
        return this;
      }
      public Builder clearCANId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cANId_ = 0L;
        onChanged();
        return this;
      }
      
      // required bool collectType = 2;
      private boolean collectType_ ;
      public boolean hasCollectType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public boolean getCollectType() {
        return collectType_;
      }
      public Builder setCollectType(boolean value) {
        bitField0_ |= 0x00000002;
        collectType_ = value;
        onChanged();
        return this;
      }
      public Builder clearCollectType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        collectType_ = false;
        onChanged();
        return this;
      }
      
      // required bool frameType = 3;
      private boolean frameType_ ;
      public boolean hasFrameType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public boolean getFrameType() {
        return frameType_;
      }
      public Builder setFrameType(boolean value) {
        bitField0_ |= 0x00000004;
        frameType_ = value;
        onChanged();
        return this;
      }
      public Builder clearFrameType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        frameType_ = false;
        onChanged();
        return this;
      }
      
      // required .CANChannel channel = 4;
      private LCCANChannel.CANChannel channel_ = LCCANChannel.CANChannel.CAN_01;
      public boolean hasChannel() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public LCCANChannel.CANChannel getChannel() {
        return channel_;
      }
      public Builder setChannel(LCCANChannel.CANChannel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        channel_ = value;
        onChanged();
        return this;
      }
      public Builder clearChannel() {
        bitField0_ = (bitField0_ & ~0x00000008);
        channel_ = LCCANChannel.CANChannel.CAN_01;
        onChanged();
        return this;
      }
      
      // required bytes CANData = 5;
      private com.google.protobuf.ByteString cANData_ = com.google.protobuf.ByteString.EMPTY;
      public boolean hasCANData() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public com.google.protobuf.ByteString getCANData() {
        return cANData_;
      }
      public Builder setCANData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        cANData_ = value;
        onChanged();
        return this;
      }
      public Builder clearCANData() {
        bitField0_ = (bitField0_ & ~0x00000010);
        cANData_ = getDefaultInstance().getCANData();
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:CANBUSData)
    }
    
    static {
      defaultInstance = new CANBUSData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:CANBUSData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_CANBUSData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CANBUSData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n/core/proto/terminal/CANBUSData/CANBUSD" +
      "ata.proto\032/core/proto/terminal/CANBUSDat" +
      "a/CANChannel.proto\"r\n\nCANBUSData\022\r\n\005CANI" +
      "d\030\001 \002(\003\022\023\n\013collectType\030\002 \002(\010\022\021\n\tframeTyp" +
      "e\030\003 \002(\010\022\034\n\007channel\030\004 \002(\0162\013.CANChannel\022\017\n" +
      "\007CANData\030\005 \002(\014BR\nBcom.navinfo.opentsp.pl" +
      "atform.location.protocol.terminal.CANBUS" +
      "DataB\014LCCANBUSData"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_CANBUSData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_CANBUSData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_CANBUSData_descriptor,
              new String[] { "CANId", "CollectType", "FrameType", "Channel", "CANData", },
              CANBUSData.class,
              CANBUSData.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          LCCANChannel.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
