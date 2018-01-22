// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/CANBUSData/Report/UreaTankInfo.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report;

public final class LCUreaTankInfo {
  private LCUreaTankInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UreaTankInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional float ureaTankLevel = 1;
    boolean hasUreaTankLevel();
    float getUreaTankLevel();
    
    // optional int32 ureaTankTemperature = 2;
    boolean hasUreaTankTemperature();
    int getUreaTankTemperature();
  }
  public static final class UreaTankInfo extends
      com.google.protobuf.GeneratedMessage
      implements UreaTankInfoOrBuilder {
    // Use UreaTankInfo.newBuilder() to construct.
    private UreaTankInfo(Builder builder) {
      super(builder);
    }
    private UreaTankInfo(boolean noInit) {}
    
    private static final UreaTankInfo defaultInstance;
    public static UreaTankInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public UreaTankInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCUreaTankInfo.internal_static_UreaTankInfo_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCUreaTankInfo.internal_static_UreaTankInfo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional float ureaTankLevel = 1;
    public static final int UREATANKLEVEL_FIELD_NUMBER = 1;
    private float ureaTankLevel_;
    public boolean hasUreaTankLevel() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public float getUreaTankLevel() {
      return ureaTankLevel_;
    }
    
    // optional int32 ureaTankTemperature = 2;
    public static final int UREATANKTEMPERATURE_FIELD_NUMBER = 2;
    private int ureaTankTemperature_;
    public boolean hasUreaTankTemperature() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getUreaTankTemperature() {
      return ureaTankTemperature_;
    }
    
    private void initFields() {
      ureaTankLevel_ = 0F;
      ureaTankTemperature_ = 0;
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
        output.writeFloat(1, ureaTankLevel_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, ureaTankTemperature_);
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
          .computeFloatSize(1, ureaTankLevel_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, ureaTankTemperature_);
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
    
    public static UreaTankInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static UreaTankInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static UreaTankInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static UreaTankInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static UreaTankInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static UreaTankInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static UreaTankInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static UreaTankInfo parseDelimitedFrom(
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
    public static UreaTankInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static UreaTankInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(UreaTankInfo prototype) {
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
       implements UreaTankInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCUreaTankInfo.internal_static_UreaTankInfo_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCUreaTankInfo.internal_static_UreaTankInfo_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCUreaTankInfo.UreaTankInfo.newBuilder()
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
        ureaTankLevel_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000001);
        ureaTankTemperature_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return UreaTankInfo.getDescriptor();
      }
      
      public UreaTankInfo getDefaultInstanceForType() {
        return UreaTankInfo.getDefaultInstance();
      }
      
      public UreaTankInfo build() {
        UreaTankInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private UreaTankInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        UreaTankInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public UreaTankInfo buildPartial() {
        UreaTankInfo result = new UreaTankInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.ureaTankLevel_ = ureaTankLevel_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.ureaTankTemperature_ = ureaTankTemperature_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof UreaTankInfo) {
          return mergeFrom((UreaTankInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(UreaTankInfo other) {
        if (other == UreaTankInfo.getDefaultInstance()) return this;
        if (other.hasUreaTankLevel()) {
          setUreaTankLevel(other.getUreaTankLevel());
        }
        if (other.hasUreaTankTemperature()) {
          setUreaTankTemperature(other.getUreaTankTemperature());
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
            case 13: {
              bitField0_ |= 0x00000001;
              ureaTankLevel_ = input.readFloat();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              ureaTankTemperature_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional float ureaTankLevel = 1;
      private float ureaTankLevel_ ;
      public boolean hasUreaTankLevel() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public float getUreaTankLevel() {
        return ureaTankLevel_;
      }
      public Builder setUreaTankLevel(float value) {
        bitField0_ |= 0x00000001;
        ureaTankLevel_ = value;
        onChanged();
        return this;
      }
      public Builder clearUreaTankLevel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ureaTankLevel_ = 0F;
        onChanged();
        return this;
      }
      
      // optional int32 ureaTankTemperature = 2;
      private int ureaTankTemperature_ ;
      public boolean hasUreaTankTemperature() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getUreaTankTemperature() {
        return ureaTankTemperature_;
      }
      public Builder setUreaTankTemperature(int value) {
        bitField0_ |= 0x00000002;
        ureaTankTemperature_ = value;
        onChanged();
        return this;
      }
      public Builder clearUreaTankTemperature() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ureaTankTemperature_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:UreaTankInfo)
    }
    
    static {
      defaultInstance = new UreaTankInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:UreaTankInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_UreaTankInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_UreaTankInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n8core/proto/terminal/CANBUSData/Report/" +
      "UreaTankInfo.proto\"B\n\014UreaTankInfo\022\025\n\rur" +
      "eaTankLevel\030\001 \001(\002\022\033\n\023ureaTankTemperature" +
      "\030\002 \001(\005B[\nIcom.navinfo.opentsp.platform.l" +
      "ocation.protocol.terminal.CANBUSData.Rep" +
      "ortB\016LCUreaTankInfo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_UreaTankInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_UreaTankInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_UreaTankInfo_descriptor,
              new String[] { "UreaTankLevel", "UreaTankTemperature", },
              UreaTankInfo.class,
              UreaTankInfo.Builder.class);
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
