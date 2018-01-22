// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/setting/parameter/java/OvertimeParking.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter;

public final class LCOvertimeParking {
  private LCOvertimeParking() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface OvertimeParkingOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 parkingLimit = 1;
    boolean hasParkingLimit();
    int getParkingLimit();
  }
  public static final class OvertimeParking extends
      com.google.protobuf.GeneratedMessage
      implements OvertimeParkingOrBuilder {
    // Use OvertimeParking.newBuilder() to construct.
    private OvertimeParking(Builder builder) {
      super(builder);
    }
    private OvertimeParking(boolean noInit) {}
    
    private static final OvertimeParking defaultInstance;
    public static OvertimeParking getDefaultInstance() {
      return defaultInstance;
    }
    
    public OvertimeParking getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCOvertimeParking.internal_static_OvertimeParking_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCOvertimeParking.internal_static_OvertimeParking_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 parkingLimit = 1;
    public static final int PARKINGLIMIT_FIELD_NUMBER = 1;
    private int parkingLimit_;
    public boolean hasParkingLimit() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getParkingLimit() {
      return parkingLimit_;
    }
    
    private void initFields() {
      parkingLimit_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasParkingLimit()) {
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
        output.writeInt32(1, parkingLimit_);
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
          .computeInt32Size(1, parkingLimit_);
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
    
    public static OvertimeParking parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static OvertimeParking parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static OvertimeParking parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static OvertimeParking parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static OvertimeParking parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static OvertimeParking parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static OvertimeParking parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static OvertimeParking parseDelimitedFrom(
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
    public static OvertimeParking parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static OvertimeParking parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(OvertimeParking prototype) {
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
       implements OvertimeParkingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCOvertimeParking.internal_static_OvertimeParking_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCOvertimeParking.internal_static_OvertimeParking_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCOvertimeParking.OvertimeParking.newBuilder()
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
        parkingLimit_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return OvertimeParking.getDescriptor();
      }
      
      public OvertimeParking getDefaultInstanceForType() {
        return OvertimeParking.getDefaultInstance();
      }
      
      public OvertimeParking build() {
        OvertimeParking result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private OvertimeParking buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        OvertimeParking result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public OvertimeParking buildPartial() {
        OvertimeParking result = new OvertimeParking(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.parkingLimit_ = parkingLimit_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof OvertimeParking) {
          return mergeFrom((OvertimeParking)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(OvertimeParking other) {
        if (other == OvertimeParking.getDefaultInstance()) return this;
        if (other.hasParkingLimit()) {
          setParkingLimit(other.getParkingLimit());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasParkingLimit()) {
          
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
              parkingLimit_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 parkingLimit = 1;
      private int parkingLimit_ ;
      public boolean hasParkingLimit() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getParkingLimit() {
        return parkingLimit_;
      }
      public Builder setParkingLimit(int value) {
        bitField0_ |= 0x00000001;
        parkingLimit_ = value;
        onChanged();
        return this;
      }
      public Builder clearParkingLimit() {
        bitField0_ = (bitField0_ & ~0x00000001);
        parkingLimit_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:OvertimeParking)
    }
    
    static {
      defaultInstance = new OvertimeParking(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:OvertimeParking)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_OvertimeParking_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_OvertimeParking_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n@core/proto/terminal/setting/parameter/" +
      "java/OvertimeParking.proto\"\'\n\017OvertimePa" +
      "rking\022\024\n\014parkingLimit\030\001 \002(\005B^\nIcom.navin" +
      "fo.opentsp.platform.location.protocol.te" +
      "rminal.setting.parameterB\021LCOvertimePark" +
      "ing"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_OvertimeParking_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_OvertimeParking_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_OvertimeParking_descriptor,
              new String[] { "ParkingLimit", },
              OvertimeParking.class,
              OvertimeParking.Builder.class);
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
