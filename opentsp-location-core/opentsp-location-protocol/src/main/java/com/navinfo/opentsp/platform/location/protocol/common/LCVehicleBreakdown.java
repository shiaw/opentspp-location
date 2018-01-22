// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/common/java/VehicleBreakdown.proto

package com.navinfo.opentsp.platform.location.protocol.common;

public final class LCVehicleBreakdown {
  private LCVehicleBreakdown() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface VehicleBreakdownOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 breakdownSPNValue = 1;
    boolean hasBreakdownSPNValue();
    int getBreakdownSPNValue();
    
    // required int32 breakdownFMIValue = 2;
    boolean hasBreakdownFMIValue();
    int getBreakdownFMIValue();
    
    // optional int32 spnChangeMode = 3;
    boolean hasSpnChangeMode();
    int getSpnChangeMode();
    
    // optional int32 faultsCount = 4;
    boolean hasFaultsCount();
    int getFaultsCount();
    
    // optional int32 faultType = 5;
    boolean hasFaultType();
    int getFaultType();
  }
  public static final class VehicleBreakdown extends
      com.google.protobuf.GeneratedMessage
      implements VehicleBreakdownOrBuilder {
    // Use VehicleBreakdown.newBuilder() to construct.
    private VehicleBreakdown(Builder builder) {
      super(builder);
    }
    private VehicleBreakdown(boolean noInit) {}
    
    private static final VehicleBreakdown defaultInstance;
    public static VehicleBreakdown getDefaultInstance() {
      return defaultInstance;
    }
    
    public VehicleBreakdown getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCVehicleBreakdown.internal_static_VehicleBreakdown_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCVehicleBreakdown.internal_static_VehicleBreakdown_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 breakdownSPNValue = 1;
    public static final int BREAKDOWNSPNVALUE_FIELD_NUMBER = 1;
    private int breakdownSPNValue_;
    public boolean hasBreakdownSPNValue() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getBreakdownSPNValue() {
      return breakdownSPNValue_;
    }
    
    // required int32 breakdownFMIValue = 2;
    public static final int BREAKDOWNFMIVALUE_FIELD_NUMBER = 2;
    private int breakdownFMIValue_;
    public boolean hasBreakdownFMIValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getBreakdownFMIValue() {
      return breakdownFMIValue_;
    }
    
    // optional int32 spnChangeMode = 3;
    public static final int SPNCHANGEMODE_FIELD_NUMBER = 3;
    private int spnChangeMode_;
    public boolean hasSpnChangeMode() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getSpnChangeMode() {
      return spnChangeMode_;
    }
    
    // optional int32 faultsCount = 4;
    public static final int FAULTSCOUNT_FIELD_NUMBER = 4;
    private int faultsCount_;
    public boolean hasFaultsCount() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getFaultsCount() {
      return faultsCount_;
    }
    
    // optional int32 faultType = 5;
    public static final int FAULTTYPE_FIELD_NUMBER = 5;
    private int faultType_;
    public boolean hasFaultType() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getFaultType() {
      return faultType_;
    }
    
    private void initFields() {
      breakdownSPNValue_ = 0;
      breakdownFMIValue_ = 0;
      spnChangeMode_ = 0;
      faultsCount_ = 0;
      faultType_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasBreakdownSPNValue()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBreakdownFMIValue()) {
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
        output.writeInt32(1, breakdownSPNValue_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, breakdownFMIValue_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, spnChangeMode_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, faultsCount_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, faultType_);
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
          .computeInt32Size(1, breakdownSPNValue_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, breakdownFMIValue_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, spnChangeMode_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, faultsCount_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, faultType_);
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
    
    public static VehicleBreakdown parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static VehicleBreakdown parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static VehicleBreakdown parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static VehicleBreakdown parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static VehicleBreakdown parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static VehicleBreakdown parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static VehicleBreakdown parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static VehicleBreakdown parseDelimitedFrom(
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
    public static VehicleBreakdown parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static VehicleBreakdown parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(VehicleBreakdown prototype) {
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
       implements VehicleBreakdownOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCVehicleBreakdown.internal_static_VehicleBreakdown_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCVehicleBreakdown.internal_static_VehicleBreakdown_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.common.LCVehicleBreakdown.VehicleBreakdown.newBuilder()
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
        breakdownSPNValue_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        breakdownFMIValue_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        spnChangeMode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        faultsCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        faultType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return VehicleBreakdown.getDescriptor();
      }
      
      public VehicleBreakdown getDefaultInstanceForType() {
        return VehicleBreakdown.getDefaultInstance();
      }
      
      public VehicleBreakdown build() {
        VehicleBreakdown result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private VehicleBreakdown buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        VehicleBreakdown result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public VehicleBreakdown buildPartial() {
        VehicleBreakdown result = new VehicleBreakdown(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.breakdownSPNValue_ = breakdownSPNValue_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.breakdownFMIValue_ = breakdownFMIValue_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.spnChangeMode_ = spnChangeMode_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.faultsCount_ = faultsCount_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.faultType_ = faultType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof VehicleBreakdown) {
          return mergeFrom((VehicleBreakdown)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(VehicleBreakdown other) {
        if (other == VehicleBreakdown.getDefaultInstance()) return this;
        if (other.hasBreakdownSPNValue()) {
          setBreakdownSPNValue(other.getBreakdownSPNValue());
        }
        if (other.hasBreakdownFMIValue()) {
          setBreakdownFMIValue(other.getBreakdownFMIValue());
        }
        if (other.hasSpnChangeMode()) {
          setSpnChangeMode(other.getSpnChangeMode());
        }
        if (other.hasFaultsCount()) {
          setFaultsCount(other.getFaultsCount());
        }
        if (other.hasFaultType()) {
          setFaultType(other.getFaultType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasBreakdownSPNValue()) {
          
          return false;
        }
        if (!hasBreakdownFMIValue()) {
          
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
              breakdownSPNValue_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              breakdownFMIValue_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              spnChangeMode_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              faultsCount_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              faultType_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 breakdownSPNValue = 1;
      private int breakdownSPNValue_ ;
      public boolean hasBreakdownSPNValue() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getBreakdownSPNValue() {
        return breakdownSPNValue_;
      }
      public Builder setBreakdownSPNValue(int value) {
        bitField0_ |= 0x00000001;
        breakdownSPNValue_ = value;
        onChanged();
        return this;
      }
      public Builder clearBreakdownSPNValue() {
        bitField0_ = (bitField0_ & ~0x00000001);
        breakdownSPNValue_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 breakdownFMIValue = 2;
      private int breakdownFMIValue_ ;
      public boolean hasBreakdownFMIValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getBreakdownFMIValue() {
        return breakdownFMIValue_;
      }
      public Builder setBreakdownFMIValue(int value) {
        bitField0_ |= 0x00000002;
        breakdownFMIValue_ = value;
        onChanged();
        return this;
      }
      public Builder clearBreakdownFMIValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        breakdownFMIValue_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 spnChangeMode = 3;
      private int spnChangeMode_ ;
      public boolean hasSpnChangeMode() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getSpnChangeMode() {
        return spnChangeMode_;
      }
      public Builder setSpnChangeMode(int value) {
        bitField0_ |= 0x00000004;
        spnChangeMode_ = value;
        onChanged();
        return this;
      }
      public Builder clearSpnChangeMode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        spnChangeMode_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 faultsCount = 4;
      private int faultsCount_ ;
      public boolean hasFaultsCount() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getFaultsCount() {
        return faultsCount_;
      }
      public Builder setFaultsCount(int value) {
        bitField0_ |= 0x00000008;
        faultsCount_ = value;
        onChanged();
        return this;
      }
      public Builder clearFaultsCount() {
        bitField0_ = (bitField0_ & ~0x00000008);
        faultsCount_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 faultType = 5;
      private int faultType_ ;
      public boolean hasFaultType() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getFaultType() {
        return faultType_;
      }
      public Builder setFaultType(int value) {
        bitField0_ |= 0x00000010;
        faultType_ = value;
        onChanged();
        return this;
      }
      public Builder clearFaultType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        faultType_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:VehicleBreakdown)
    }
    
    static {
      defaultInstance = new VehicleBreakdown(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:VehicleBreakdown)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_VehicleBreakdown_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_VehicleBreakdown_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n-core/proto/common/java/VehicleBreakdow" +
      "n.proto\"\207\001\n\020VehicleBreakdown\022\031\n\021breakdow" +
      "nSPNValue\030\001 \002(\005\022\031\n\021breakdownFMIValue\030\002 \002" +
      "(\005\022\025\n\rspnChangeMode\030\003 \001(\005\022\023\n\013faultsCount" +
      "\030\004 \001(\005\022\021\n\tfaultType\030\005 \001(\005BK\n5com.navinfo" +
      ".opentsp.platform.location.protocol.comm" +
      "onB\022LCVehicleBreakdown"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_VehicleBreakdown_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_VehicleBreakdown_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_VehicleBreakdown_descriptor,
              new String[] { "BreakdownSPNValue", "BreakdownFMIValue", "SpnChangeMode", "FaultsCount", "FaultType", },
              VehicleBreakdown.class,
              VehicleBreakdown.Builder.class);
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
