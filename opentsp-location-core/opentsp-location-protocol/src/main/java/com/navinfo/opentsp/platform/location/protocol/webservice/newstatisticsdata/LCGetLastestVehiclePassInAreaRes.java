// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/newstatisticsdata/java/GetLastestVehiclePassInAreaRes.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata;

public final class LCGetLastestVehiclePassInAreaRes {
  private LCGetLastestVehiclePassInAreaRes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetLastestVehiclePassInAreaResOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 statusCode = 1;
    boolean hasStatusCode();
    int getStatusCode();
    
    // optional int32 totalRecords = 2;
    boolean hasTotalRecords();
    int getTotalRecords();
    
    // repeated .VehiclePassInAreaInfo infos = 3;
    java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo> 
        getInfosList();
    com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo getInfos(int index);
    int getInfosCount();
    java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfoOrBuilder> 
        getInfosOrBuilderList();
    com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfoOrBuilder getInfosOrBuilder(
            int index);
  }
  public static final class GetLastestVehiclePassInAreaRes extends
      com.google.protobuf.GeneratedMessage
      implements GetLastestVehiclePassInAreaResOrBuilder {
    // Use GetLastestVehiclePassInAreaRes.newBuilder() to construct.
    private GetLastestVehiclePassInAreaRes(Builder builder) {
      super(builder);
    }
    private GetLastestVehiclePassInAreaRes(boolean noInit) {}
    
    private static final GetLastestVehiclePassInAreaRes defaultInstance;
    public static GetLastestVehiclePassInAreaRes getDefaultInstance() {
      return defaultInstance;
    }
    
    public GetLastestVehiclePassInAreaRes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCGetLastestVehiclePassInAreaRes.internal_static_GetLastestVehiclePassInAreaRes_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCGetLastestVehiclePassInAreaRes.internal_static_GetLastestVehiclePassInAreaRes_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 statusCode = 1;
    public static final int STATUSCODE_FIELD_NUMBER = 1;
    private int statusCode_;
    public boolean hasStatusCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getStatusCode() {
      return statusCode_;
    }
    
    // optional int32 totalRecords = 2;
    public static final int TOTALRECORDS_FIELD_NUMBER = 2;
    private int totalRecords_;
    public boolean hasTotalRecords() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getTotalRecords() {
      return totalRecords_;
    }
    
    // repeated .VehiclePassInAreaInfo infos = 3;
    public static final int INFOS_FIELD_NUMBER = 3;
    private java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo> infos_;
    public java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo> getInfosList() {
      return infos_;
    }
    public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfoOrBuilder> 
        getInfosOrBuilderList() {
      return infos_;
    }
    public int getInfosCount() {
      return infos_.size();
    }
    public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo getInfos(int index) {
      return infos_.get(index);
    }
    public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfoOrBuilder getInfosOrBuilder(
        int index) {
      return infos_.get(index);
    }
    
    private void initFields() {
      statusCode_ = 0;
      totalRecords_ = 0;
      infos_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasStatusCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getInfosCount(); i++) {
        if (!getInfos(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, statusCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, totalRecords_);
      }
      for (int i = 0; i < infos_.size(); i++) {
        output.writeMessage(3, infos_.get(i));
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
          .computeInt32Size(1, statusCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, totalRecords_);
      }
      for (int i = 0; i < infos_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, infos_.get(i));
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
    
    public static GetLastestVehiclePassInAreaRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static GetLastestVehiclePassInAreaRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static GetLastestVehiclePassInAreaRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static GetLastestVehiclePassInAreaRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static GetLastestVehiclePassInAreaRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static GetLastestVehiclePassInAreaRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static GetLastestVehiclePassInAreaRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static GetLastestVehiclePassInAreaRes parseDelimitedFrom(
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
    public static GetLastestVehiclePassInAreaRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static GetLastestVehiclePassInAreaRes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(GetLastestVehiclePassInAreaRes prototype) {
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
       implements GetLastestVehiclePassInAreaResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCGetLastestVehiclePassInAreaRes.internal_static_GetLastestVehiclePassInAreaRes_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCGetLastestVehiclePassInAreaRes.internal_static_GetLastestVehiclePassInAreaRes_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCGetLastestVehiclePassInAreaRes.GetLastestVehiclePassInAreaRes.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getInfosFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        statusCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        totalRecords_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (infosBuilder_ == null) {
          infos_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          infosBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GetLastestVehiclePassInAreaRes.getDescriptor();
      }
      
      public GetLastestVehiclePassInAreaRes getDefaultInstanceForType() {
        return GetLastestVehiclePassInAreaRes.getDefaultInstance();
      }
      
      public GetLastestVehiclePassInAreaRes build() {
        GetLastestVehiclePassInAreaRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private GetLastestVehiclePassInAreaRes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        GetLastestVehiclePassInAreaRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public GetLastestVehiclePassInAreaRes buildPartial() {
        GetLastestVehiclePassInAreaRes result = new GetLastestVehiclePassInAreaRes(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.statusCode_ = statusCode_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.totalRecords_ = totalRecords_;
        if (infosBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            infos_ = java.util.Collections.unmodifiableList(infos_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.infos_ = infos_;
        } else {
          result.infos_ = infosBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof GetLastestVehiclePassInAreaRes) {
          return mergeFrom((GetLastestVehiclePassInAreaRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(GetLastestVehiclePassInAreaRes other) {
        if (other == GetLastestVehiclePassInAreaRes.getDefaultInstance()) return this;
        if (other.hasStatusCode()) {
          setStatusCode(other.getStatusCode());
        }
        if (other.hasTotalRecords()) {
          setTotalRecords(other.getTotalRecords());
        }
        if (infosBuilder_ == null) {
          if (!other.infos_.isEmpty()) {
            if (infos_.isEmpty()) {
              infos_ = other.infos_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureInfosIsMutable();
              infos_.addAll(other.infos_);
            }
            onChanged();
          }
        } else {
          if (!other.infos_.isEmpty()) {
            if (infosBuilder_.isEmpty()) {
              infosBuilder_.dispose();
              infosBuilder_ = null;
              infos_ = other.infos_;
              bitField0_ = (bitField0_ & ~0x00000004);
              infosBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getInfosFieldBuilder() : null;
            } else {
              infosBuilder_.addAllMessages(other.infos_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasStatusCode()) {
          
          return false;
        }
        for (int i = 0; i < getInfosCount(); i++) {
          if (!getInfos(i).isInitialized()) {
            
            return false;
          }
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
              statusCode_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              totalRecords_ = input.readInt32();
              break;
            }
            case 26: {
              com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addInfos(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 statusCode = 1;
      private int statusCode_ ;
      public boolean hasStatusCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getStatusCode() {
        return statusCode_;
      }
      public Builder setStatusCode(int value) {
        bitField0_ |= 0x00000001;
        statusCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearStatusCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        statusCode_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 totalRecords = 2;
      private int totalRecords_ ;
      public boolean hasTotalRecords() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getTotalRecords() {
        return totalRecords_;
      }
      public Builder setTotalRecords(int value) {
        bitField0_ |= 0x00000002;
        totalRecords_ = value;
        onChanged();
        return this;
      }
      public Builder clearTotalRecords() {
        bitField0_ = (bitField0_ & ~0x00000002);
        totalRecords_ = 0;
        onChanged();
        return this;
      }
      
      // repeated .VehiclePassInAreaInfo infos = 3;
      private java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo> infos_ =
        java.util.Collections.emptyList();
      private void ensureInfosIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          infos_ = new java.util.ArrayList<com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo>(infos_);
          bitField0_ |= 0x00000004;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo, com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.Builder, com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfoOrBuilder> infosBuilder_;
      
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo> getInfosList() {
        if (infosBuilder_ == null) {
          return java.util.Collections.unmodifiableList(infos_);
        } else {
          return infosBuilder_.getMessageList();
        }
      }
      public int getInfosCount() {
        if (infosBuilder_ == null) {
          return infos_.size();
        } else {
          return infosBuilder_.getCount();
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo getInfos(int index) {
        if (infosBuilder_ == null) {
          return infos_.get(index);
        } else {
          return infosBuilder_.getMessage(index);
        }
      }
      public Builder setInfos(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo value) {
        if (infosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfosIsMutable();
          infos_.set(index, value);
          onChanged();
        } else {
          infosBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setInfos(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.Builder builderForValue) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          infos_.set(index, builderForValue.build());
          onChanged();
        } else {
          infosBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addInfos(com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo value) {
        if (infosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfosIsMutable();
          infos_.add(value);
          onChanged();
        } else {
          infosBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addInfos(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo value) {
        if (infosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfosIsMutable();
          infos_.add(index, value);
          onChanged();
        } else {
          infosBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addInfos(
          com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.Builder builderForValue) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          infos_.add(builderForValue.build());
          onChanged();
        } else {
          infosBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addInfos(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.Builder builderForValue) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          infos_.add(index, builderForValue.build());
          onChanged();
        } else {
          infosBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllInfos(
          Iterable<? extends com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo> values) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          super.addAll(values, infos_);
          onChanged();
        } else {
          infosBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearInfos() {
        if (infosBuilder_ == null) {
          infos_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          infosBuilder_.clear();
        }
        return this;
      }
      public Builder removeInfos(int index) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          infos_.remove(index);
          onChanged();
        } else {
          infosBuilder_.remove(index);
        }
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.Builder getInfosBuilder(
          int index) {
        return getInfosFieldBuilder().getBuilder(index);
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfoOrBuilder getInfosOrBuilder(
          int index) {
        if (infosBuilder_ == null) {
          return infos_.get(index);  } else {
          return infosBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfoOrBuilder> 
           getInfosOrBuilderList() {
        if (infosBuilder_ != null) {
          return infosBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(infos_);
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.Builder addInfosBuilder() {
        return getInfosFieldBuilder().addBuilder(
            com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.getDefaultInstance());
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.Builder addInfosBuilder(
          int index) {
        return getInfosFieldBuilder().addBuilder(
            index, com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.getDefaultInstance());
      }
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.Builder> 
           getInfosBuilderList() {
        return getInfosFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo, com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.Builder, com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfoOrBuilder> 
          getInfosFieldBuilder() {
        if (infosBuilder_ == null) {
          infosBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo, com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfo.Builder, com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.VehiclePassInAreaInfoOrBuilder>(
                  infos_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          infos_ = null;
        }
        return infosBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:GetLastestVehiclePassInAreaRes)
    }
    
    static {
      defaultInstance = new GetLastestVehiclePassInAreaRes(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:GetLastestVehiclePassInAreaRes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_GetLastestVehiclePassInAreaRes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetLastestVehiclePassInAreaRes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nQcore/proto/webservice/newstatisticsdat" +
      "a/java/GetLastestVehiclePassInAreaRes.pr" +
      "oto\032Jcore/proto/webservice/newstatistics" +
      "data/entity/VehiclePassInAreaInfo.proto\"" +
      "q\n\036GetLastestVehiclePassInAreaRes\022\022\n\nsta" +
      "tusCode\030\001 \002(\005\022\024\n\014totalRecords\030\002 \001(\005\022%\n\005i" +
      "nfos\030\003 \003(\0132\026.VehiclePassInAreaInfoBo\nKco" +
      "m.navinfo.opentsp.platform.location.prot" +
      "ocol.webservice.newstatisticsdataB LCGet" +
      "LastestVehiclePassInAreaRes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_GetLastestVehiclePassInAreaRes_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_GetLastestVehiclePassInAreaRes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_GetLastestVehiclePassInAreaRes_descriptor,
              new String[] { "StatusCode", "TotalRecords", "Infos", },
              GetLastestVehiclePassInAreaRes.class,
              GetLastestVehiclePassInAreaRes.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCVehiclePassInAreaInfo.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
