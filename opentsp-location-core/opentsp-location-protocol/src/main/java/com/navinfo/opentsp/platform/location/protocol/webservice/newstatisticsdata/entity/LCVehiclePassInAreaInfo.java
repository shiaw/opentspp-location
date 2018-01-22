// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/newstatisticsdata/entity/VehiclePassInAreaInfo.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity;

public final class LCVehiclePassInAreaInfo {
  private LCVehiclePassInAreaInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface VehiclePassInAreaInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 districtCodes = 1;
    boolean hasDistrictCodes();
    int getDistrictCodes();
    
    // repeated .LastestVehicleInfo vehicleInfo = 2;
    java.util.List<LCLastestVehicleInfo.LastestVehicleInfo>
        getVehicleInfoList();
    LCLastestVehicleInfo.LastestVehicleInfo getVehicleInfo(int index);
    int getVehicleInfoCount();
    java.util.List<? extends LCLastestVehicleInfo.LastestVehicleInfoOrBuilder>
        getVehicleInfoOrBuilderList();
    LCLastestVehicleInfo.LastestVehicleInfoOrBuilder getVehicleInfoOrBuilder(
            int index);
  }
  public static final class VehiclePassInAreaInfo extends
      com.google.protobuf.GeneratedMessage
      implements VehiclePassInAreaInfoOrBuilder {
    // Use VehiclePassInAreaInfo.newBuilder() to construct.
    private VehiclePassInAreaInfo(Builder builder) {
      super(builder);
    }
    private VehiclePassInAreaInfo(boolean noInit) {}
    
    private static final VehiclePassInAreaInfo defaultInstance;
    public static VehiclePassInAreaInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public VehiclePassInAreaInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCVehiclePassInAreaInfo.internal_static_VehiclePassInAreaInfo_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCVehiclePassInAreaInfo.internal_static_VehiclePassInAreaInfo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 districtCodes = 1;
    public static final int DISTRICTCODES_FIELD_NUMBER = 1;
    private int districtCodes_;
    public boolean hasDistrictCodes() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getDistrictCodes() {
      return districtCodes_;
    }
    
    // repeated .LastestVehicleInfo vehicleInfo = 2;
    public static final int VEHICLEINFO_FIELD_NUMBER = 2;
    private java.util.List<LCLastestVehicleInfo.LastestVehicleInfo> vehicleInfo_;
    public java.util.List<LCLastestVehicleInfo.LastestVehicleInfo> getVehicleInfoList() {
      return vehicleInfo_;
    }
    public java.util.List<? extends LCLastestVehicleInfo.LastestVehicleInfoOrBuilder>
        getVehicleInfoOrBuilderList() {
      return vehicleInfo_;
    }
    public int getVehicleInfoCount() {
      return vehicleInfo_.size();
    }
    public LCLastestVehicleInfo.LastestVehicleInfo getVehicleInfo(int index) {
      return vehicleInfo_.get(index);
    }
    public LCLastestVehicleInfo.LastestVehicleInfoOrBuilder getVehicleInfoOrBuilder(
        int index) {
      return vehicleInfo_.get(index);
    }
    
    private void initFields() {
      districtCodes_ = 0;
      vehicleInfo_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasDistrictCodes()) {
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
        output.writeInt32(1, districtCodes_);
      }
      for (int i = 0; i < vehicleInfo_.size(); i++) {
        output.writeMessage(2, vehicleInfo_.get(i));
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
          .computeInt32Size(1, districtCodes_);
      }
      for (int i = 0; i < vehicleInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, vehicleInfo_.get(i));
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
    
    public static VehiclePassInAreaInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static VehiclePassInAreaInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static VehiclePassInAreaInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static VehiclePassInAreaInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static VehiclePassInAreaInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static VehiclePassInAreaInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static VehiclePassInAreaInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static VehiclePassInAreaInfo parseDelimitedFrom(
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
    public static VehiclePassInAreaInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static VehiclePassInAreaInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(VehiclePassInAreaInfo prototype) {
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
       implements VehiclePassInAreaInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCVehiclePassInAreaInfo.internal_static_VehiclePassInAreaInfo_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCVehiclePassInAreaInfo.internal_static_VehiclePassInAreaInfo_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getVehicleInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        districtCodes_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (vehicleInfoBuilder_ == null) {
          vehicleInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          vehicleInfoBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return VehiclePassInAreaInfo.getDescriptor();
      }
      
      public VehiclePassInAreaInfo getDefaultInstanceForType() {
        return VehiclePassInAreaInfo.getDefaultInstance();
      }
      
      public VehiclePassInAreaInfo build() {
        VehiclePassInAreaInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private VehiclePassInAreaInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        VehiclePassInAreaInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public VehiclePassInAreaInfo buildPartial() {
        VehiclePassInAreaInfo result = new VehiclePassInAreaInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.districtCodes_ = districtCodes_;
        if (vehicleInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            vehicleInfo_ = java.util.Collections.unmodifiableList(vehicleInfo_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.vehicleInfo_ = vehicleInfo_;
        } else {
          result.vehicleInfo_ = vehicleInfoBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof VehiclePassInAreaInfo) {
          return mergeFrom((VehiclePassInAreaInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(VehiclePassInAreaInfo other) {
        if (other == VehiclePassInAreaInfo.getDefaultInstance()) return this;
        if (other.hasDistrictCodes()) {
          setDistrictCodes(other.getDistrictCodes());
        }
        if (vehicleInfoBuilder_ == null) {
          if (!other.vehicleInfo_.isEmpty()) {
            if (vehicleInfo_.isEmpty()) {
              vehicleInfo_ = other.vehicleInfo_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureVehicleInfoIsMutable();
              vehicleInfo_.addAll(other.vehicleInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.vehicleInfo_.isEmpty()) {
            if (vehicleInfoBuilder_.isEmpty()) {
              vehicleInfoBuilder_.dispose();
              vehicleInfoBuilder_ = null;
              vehicleInfo_ = other.vehicleInfo_;
              bitField0_ = (bitField0_ & ~0x00000002);
              vehicleInfoBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getVehicleInfoFieldBuilder() : null;
            } else {
              vehicleInfoBuilder_.addAllMessages(other.vehicleInfo_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasDistrictCodes()) {
          
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
              districtCodes_ = input.readInt32();
              break;
            }
            case 18: {
              LCLastestVehicleInfo.LastestVehicleInfo.Builder subBuilder = LCLastestVehicleInfo.LastestVehicleInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addVehicleInfo(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 districtCodes = 1;
      private int districtCodes_ ;
      public boolean hasDistrictCodes() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getDistrictCodes() {
        return districtCodes_;
      }
      public Builder setDistrictCodes(int value) {
        bitField0_ |= 0x00000001;
        districtCodes_ = value;
        onChanged();
        return this;
      }
      public Builder clearDistrictCodes() {
        bitField0_ = (bitField0_ & ~0x00000001);
        districtCodes_ = 0;
        onChanged();
        return this;
      }
      
      // repeated .LastestVehicleInfo vehicleInfo = 2;
      private java.util.List<LCLastestVehicleInfo.LastestVehicleInfo> vehicleInfo_ =
        java.util.Collections.emptyList();
      private void ensureVehicleInfoIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          vehicleInfo_ = new java.util.ArrayList<LCLastestVehicleInfo.LastestVehicleInfo>(vehicleInfo_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          LCLastestVehicleInfo.LastestVehicleInfo, LCLastestVehicleInfo.LastestVehicleInfo.Builder, LCLastestVehicleInfo.LastestVehicleInfoOrBuilder> vehicleInfoBuilder_;
      
      public java.util.List<LCLastestVehicleInfo.LastestVehicleInfo> getVehicleInfoList() {
        if (vehicleInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(vehicleInfo_);
        } else {
          return vehicleInfoBuilder_.getMessageList();
        }
      }
      public int getVehicleInfoCount() {
        if (vehicleInfoBuilder_ == null) {
          return vehicleInfo_.size();
        } else {
          return vehicleInfoBuilder_.getCount();
        }
      }
      public LCLastestVehicleInfo.LastestVehicleInfo getVehicleInfo(int index) {
        if (vehicleInfoBuilder_ == null) {
          return vehicleInfo_.get(index);
        } else {
          return vehicleInfoBuilder_.getMessage(index);
        }
      }
      public Builder setVehicleInfo(
          int index, LCLastestVehicleInfo.LastestVehicleInfo value) {
        if (vehicleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVehicleInfoIsMutable();
          vehicleInfo_.set(index, value);
          onChanged();
        } else {
          vehicleInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setVehicleInfo(
          int index, LCLastestVehicleInfo.LastestVehicleInfo.Builder builderForValue) {
        if (vehicleInfoBuilder_ == null) {
          ensureVehicleInfoIsMutable();
          vehicleInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          vehicleInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addVehicleInfo(LCLastestVehicleInfo.LastestVehicleInfo value) {
        if (vehicleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVehicleInfoIsMutable();
          vehicleInfo_.add(value);
          onChanged();
        } else {
          vehicleInfoBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addVehicleInfo(
          int index, LCLastestVehicleInfo.LastestVehicleInfo value) {
        if (vehicleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVehicleInfoIsMutable();
          vehicleInfo_.add(index, value);
          onChanged();
        } else {
          vehicleInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addVehicleInfo(
          LCLastestVehicleInfo.LastestVehicleInfo.Builder builderForValue) {
        if (vehicleInfoBuilder_ == null) {
          ensureVehicleInfoIsMutable();
          vehicleInfo_.add(builderForValue.build());
          onChanged();
        } else {
          vehicleInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addVehicleInfo(
          int index, LCLastestVehicleInfo.LastestVehicleInfo.Builder builderForValue) {
        if (vehicleInfoBuilder_ == null) {
          ensureVehicleInfoIsMutable();
          vehicleInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          vehicleInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllVehicleInfo(
          Iterable<? extends LCLastestVehicleInfo.LastestVehicleInfo> values) {
        if (vehicleInfoBuilder_ == null) {
          ensureVehicleInfoIsMutable();
          super.addAll(values, vehicleInfo_);
          onChanged();
        } else {
          vehicleInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearVehicleInfo() {
        if (vehicleInfoBuilder_ == null) {
          vehicleInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          vehicleInfoBuilder_.clear();
        }
        return this;
      }
      public Builder removeVehicleInfo(int index) {
        if (vehicleInfoBuilder_ == null) {
          ensureVehicleInfoIsMutable();
          vehicleInfo_.remove(index);
          onChanged();
        } else {
          vehicleInfoBuilder_.remove(index);
        }
        return this;
      }
      public LCLastestVehicleInfo.LastestVehicleInfo.Builder getVehicleInfoBuilder(
          int index) {
        return getVehicleInfoFieldBuilder().getBuilder(index);
      }
      public LCLastestVehicleInfo.LastestVehicleInfoOrBuilder getVehicleInfoOrBuilder(
          int index) {
        if (vehicleInfoBuilder_ == null) {
          return vehicleInfo_.get(index);  } else {
          return vehicleInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends LCLastestVehicleInfo.LastestVehicleInfoOrBuilder>
           getVehicleInfoOrBuilderList() {
        if (vehicleInfoBuilder_ != null) {
          return vehicleInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(vehicleInfo_);
        }
      }
      public LCLastestVehicleInfo.LastestVehicleInfo.Builder addVehicleInfoBuilder() {
        return getVehicleInfoFieldBuilder().addBuilder(
            LCLastestVehicleInfo.LastestVehicleInfo.getDefaultInstance());
      }
      public LCLastestVehicleInfo.LastestVehicleInfo.Builder addVehicleInfoBuilder(
          int index) {
        return getVehicleInfoFieldBuilder().addBuilder(
            index, LCLastestVehicleInfo.LastestVehicleInfo.getDefaultInstance());
      }
      public java.util.List<LCLastestVehicleInfo.LastestVehicleInfo.Builder>
           getVehicleInfoBuilderList() {
        return getVehicleInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          LCLastestVehicleInfo.LastestVehicleInfo, LCLastestVehicleInfo.LastestVehicleInfo.Builder, LCLastestVehicleInfo.LastestVehicleInfoOrBuilder>
          getVehicleInfoFieldBuilder() {
        if (vehicleInfoBuilder_ == null) {
          vehicleInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              LCLastestVehicleInfo.LastestVehicleInfo, LCLastestVehicleInfo.LastestVehicleInfo.Builder, LCLastestVehicleInfo.LastestVehicleInfoOrBuilder>(
                  vehicleInfo_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          vehicleInfo_ = null;
        }
        return vehicleInfoBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:VehiclePassInAreaInfo)
    }
    
    static {
      defaultInstance = new VehiclePassInAreaInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:VehiclePassInAreaInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_VehiclePassInAreaInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_VehiclePassInAreaInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nJcore/proto/webservice/newstatisticsdat" +
      "a/entity/VehiclePassInAreaInfo.proto\032Gco" +
      "re/proto/webservice/newstatisticsdata/en" +
      "tity/LastestVehicleInfo.proto\"X\n\025Vehicle" +
      "PassInAreaInfo\022\025\n\rdistrictCodes\030\001 \002(\005\022(\n" +
      "\013vehicleInfo\030\002 \003(\0132\023.LastestVehicleInfoB" +
      "m\nRcom.navinfo.opentsp.platform.location" +
      ".protocol.webservice.newstatisticsdata.e" +
      "ntityB\027LCVehiclePassInAreaInfo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_VehiclePassInAreaInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_VehiclePassInAreaInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_VehiclePassInAreaInfo_descriptor,
              new String[] { "DistrictCodes", "VehicleInfo", },
              VehiclePassInAreaInfo.class,
              VehiclePassInAreaInfo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          LCLastestVehicleInfo.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
