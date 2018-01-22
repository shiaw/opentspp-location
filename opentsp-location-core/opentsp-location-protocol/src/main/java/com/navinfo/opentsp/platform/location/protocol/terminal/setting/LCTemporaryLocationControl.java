// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/setting/java/TemporaryLocationControl.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.setting;

public final class LCTemporaryLocationControl {
  private LCTemporaryLocationControl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TemporaryLocationControlOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 intervalTime = 1;
    boolean hasIntervalTime();
    int getIntervalTime();
    
    // required int32 locationTime = 2;
    boolean hasLocationTime();
    int getLocationTime();
  }
  public static final class TemporaryLocationControl extends
      com.google.protobuf.GeneratedMessage
      implements TemporaryLocationControlOrBuilder {
    // Use TemporaryLocationControl.newBuilder() to construct.
    private TemporaryLocationControl(Builder builder) {
      super(builder);
    }
    private TemporaryLocationControl(boolean noInit) {}
    
    private static final TemporaryLocationControl defaultInstance;
    public static TemporaryLocationControl getDefaultInstance() {
      return defaultInstance;
    }
    
    public TemporaryLocationControl getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCTemporaryLocationControl.internal_static_TemporaryLocationControl_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCTemporaryLocationControl.internal_static_TemporaryLocationControl_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 intervalTime = 1;
    public static final int INTERVALTIME_FIELD_NUMBER = 1;
    private int intervalTime_;
    public boolean hasIntervalTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getIntervalTime() {
      return intervalTime_;
    }
    
    // required int32 locationTime = 2;
    public static final int LOCATIONTIME_FIELD_NUMBER = 2;
    private int locationTime_;
    public boolean hasLocationTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getLocationTime() {
      return locationTime_;
    }
    
    private void initFields() {
      intervalTime_ = 0;
      locationTime_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasIntervalTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLocationTime()) {
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
        output.writeInt32(1, intervalTime_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, locationTime_);
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
          .computeInt32Size(1, intervalTime_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, locationTime_);
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
    
    public static TemporaryLocationControl parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TemporaryLocationControl parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TemporaryLocationControl parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TemporaryLocationControl parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TemporaryLocationControl parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TemporaryLocationControl parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static TemporaryLocationControl parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static TemporaryLocationControl parseDelimitedFrom(
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
    public static TemporaryLocationControl parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TemporaryLocationControl parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(TemporaryLocationControl prototype) {
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
       implements TemporaryLocationControlOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCTemporaryLocationControl.internal_static_TemporaryLocationControl_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCTemporaryLocationControl.internal_static_TemporaryLocationControl_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.setting.LCTemporaryLocationControl.TemporaryLocationControl.newBuilder()
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
        intervalTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        locationTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TemporaryLocationControl.getDescriptor();
      }
      
      public TemporaryLocationControl getDefaultInstanceForType() {
        return TemporaryLocationControl.getDefaultInstance();
      }
      
      public TemporaryLocationControl build() {
        TemporaryLocationControl result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private TemporaryLocationControl buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        TemporaryLocationControl result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public TemporaryLocationControl buildPartial() {
        TemporaryLocationControl result = new TemporaryLocationControl(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.intervalTime_ = intervalTime_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.locationTime_ = locationTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TemporaryLocationControl) {
          return mergeFrom((TemporaryLocationControl)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(TemporaryLocationControl other) {
        if (other == TemporaryLocationControl.getDefaultInstance()) return this;
        if (other.hasIntervalTime()) {
          setIntervalTime(other.getIntervalTime());
        }
        if (other.hasLocationTime()) {
          setLocationTime(other.getLocationTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasIntervalTime()) {
          
          return false;
        }
        if (!hasLocationTime()) {
          
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
              intervalTime_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              locationTime_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 intervalTime = 1;
      private int intervalTime_ ;
      public boolean hasIntervalTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getIntervalTime() {
        return intervalTime_;
      }
      public Builder setIntervalTime(int value) {
        bitField0_ |= 0x00000001;
        intervalTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearIntervalTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        intervalTime_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 locationTime = 2;
      private int locationTime_ ;
      public boolean hasLocationTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getLocationTime() {
        return locationTime_;
      }
      public Builder setLocationTime(int value) {
        bitField0_ |= 0x00000002;
        locationTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearLocationTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        locationTime_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:TemporaryLocationControl)
    }
    
    static {
      defaultInstance = new TemporaryLocationControl(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:TemporaryLocationControl)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TemporaryLocationControl_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TemporaryLocationControl_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n?core/proto/terminal/setting/java/Tempo" +
      "raryLocationControl.proto\"F\n\030TemporaryLo" +
      "cationControl\022\024\n\014intervalTime\030\001 \002(\005\022\024\n\014l" +
      "ocationTime\030\002 \002(\005B]\n?com.navinfo.opentsp" +
      ".platform.location.protocol.terminal.set" +
      "tingB\032LCTemporaryLocationControl"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TemporaryLocationControl_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TemporaryLocationControl_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TemporaryLocationControl_descriptor,
              new String[] { "IntervalTime", "LocationTime", },
              TemporaryLocationControl.class,
              TemporaryLocationControl.Builder.class);
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
