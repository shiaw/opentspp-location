// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/statisticsdata/java/ResAreaINOUTAlarmRecoreds.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata;

public final class LCResAreaINOUTAlarmRecoreds {
  private LCResAreaINOUTAlarmRecoreds() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ResAreaINOUTAlarmRecoredsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 statusCode = 1;
    boolean hasStatusCode();
    int getStatusCode();
    
    // optional int32 totalRecords = 2;
    boolean hasTotalRecords();
    int getTotalRecords();
    
    // repeated .AreaInOutData dataList = 3;
    java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData> 
        getDataListList();
    com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData getDataList(int index);
    int getDataListCount();
    java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutDataOrBuilder> 
        getDataListOrBuilderList();
    com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutDataOrBuilder getDataListOrBuilder(
        int index);
  }
  public static final class ResAreaINOUTAlarmRecoreds extends
      com.google.protobuf.GeneratedMessage
      implements ResAreaINOUTAlarmRecoredsOrBuilder {
    // Use ResAreaINOUTAlarmRecoreds.newBuilder() to construct.
    private ResAreaINOUTAlarmRecoreds(Builder builder) {
      super(builder);
    }
    private ResAreaINOUTAlarmRecoreds(boolean noInit) {}
    
    private static final ResAreaINOUTAlarmRecoreds defaultInstance;
    public static ResAreaINOUTAlarmRecoreds getDefaultInstance() {
      return defaultInstance;
    }
    
    public ResAreaINOUTAlarmRecoreds getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.internal_static_ResAreaINOUTAlarmRecoreds_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.internal_static_ResAreaINOUTAlarmRecoreds_fieldAccessorTable;
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
    
    // repeated .AreaInOutData dataList = 3;
    public static final int DATALIST_FIELD_NUMBER = 3;
    private java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData> dataList_;
    public java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData> getDataListList() {
      return dataList_;
    }
    public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutDataOrBuilder> 
        getDataListOrBuilderList() {
      return dataList_;
    }
    public int getDataListCount() {
      return dataList_.size();
    }
    public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData getDataList(int index) {
      return dataList_.get(index);
    }
    public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutDataOrBuilder getDataListOrBuilder(
        int index) {
      return dataList_.get(index);
    }
    
    private void initFields() {
      statusCode_ = 0;
      totalRecords_ = 0;
      dataList_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasStatusCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getDataListCount(); i++) {
        if (!getDataList(i).isInitialized()) {
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
      for (int i = 0; i < dataList_.size(); i++) {
        output.writeMessage(3, dataList_.get(i));
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
      for (int i = 0; i < dataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, dataList_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoredsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.internal_static_ResAreaINOUTAlarmRecoreds_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.internal_static_ResAreaINOUTAlarmRecoreds_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getDataListFieldBuilder();
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
        if (dataListBuilder_ == null) {
          dataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          dataListBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds build() {
        com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds result = new com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds(this);
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
        if (dataListBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            dataList_ = java.util.Collections.unmodifiableList(dataList_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.dataList_ = dataList_;
        } else {
          result.dataList_ = dataListBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds.getDefaultInstance()) return this;
        if (other.hasStatusCode()) {
          setStatusCode(other.getStatusCode());
        }
        if (other.hasTotalRecords()) {
          setTotalRecords(other.getTotalRecords());
        }
        if (dataListBuilder_ == null) {
          if (!other.dataList_.isEmpty()) {
            if (dataList_.isEmpty()) {
              dataList_ = other.dataList_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureDataListIsMutable();
              dataList_.addAll(other.dataList_);
            }
            onChanged();
          }
        } else {
          if (!other.dataList_.isEmpty()) {
            if (dataListBuilder_.isEmpty()) {
              dataListBuilder_.dispose();
              dataListBuilder_ = null;
              dataList_ = other.dataList_;
              bitField0_ = (bitField0_ & ~0x00000004);
              dataListBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getDataListFieldBuilder() : null;
            } else {
              dataListBuilder_.addAllMessages(other.dataList_);
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
        for (int i = 0; i < getDataListCount(); i++) {
          if (!getDataList(i).isInitialized()) {
            
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
              com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addDataList(subBuilder.buildPartial());
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
      
      // repeated .AreaInOutData dataList = 3;
      private java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData> dataList_ =
        java.util.Collections.emptyList();
      private void ensureDataListIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          dataList_ = new java.util.ArrayList<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData>(dataList_);
          bitField0_ |= 0x00000004;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.Builder, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutDataOrBuilder> dataListBuilder_;
      
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData> getDataListList() {
        if (dataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(dataList_);
        } else {
          return dataListBuilder_.getMessageList();
        }
      }
      public int getDataListCount() {
        if (dataListBuilder_ == null) {
          return dataList_.size();
        } else {
          return dataListBuilder_.getCount();
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData getDataList(int index) {
        if (dataListBuilder_ == null) {
          return dataList_.get(index);
        } else {
          return dataListBuilder_.getMessage(index);
        }
      }
      public Builder setDataList(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData value) {
        if (dataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDataListIsMutable();
          dataList_.set(index, value);
          onChanged();
        } else {
          dataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setDataList(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.Builder builderForValue) {
        if (dataListBuilder_ == null) {
          ensureDataListIsMutable();
          dataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          dataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addDataList(com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData value) {
        if (dataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDataListIsMutable();
          dataList_.add(value);
          onChanged();
        } else {
          dataListBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addDataList(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData value) {
        if (dataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDataListIsMutable();
          dataList_.add(index, value);
          onChanged();
        } else {
          dataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addDataList(
          com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.Builder builderForValue) {
        if (dataListBuilder_ == null) {
          ensureDataListIsMutable();
          dataList_.add(builderForValue.build());
          onChanged();
        } else {
          dataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addDataList(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.Builder builderForValue) {
        if (dataListBuilder_ == null) {
          ensureDataListIsMutable();
          dataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          dataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllDataList(
          java.lang.Iterable<? extends com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData> values) {
        if (dataListBuilder_ == null) {
          ensureDataListIsMutable();
          super.addAll(values, dataList_);
          onChanged();
        } else {
          dataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearDataList() {
        if (dataListBuilder_ == null) {
          dataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          dataListBuilder_.clear();
        }
        return this;
      }
      public Builder removeDataList(int index) {
        if (dataListBuilder_ == null) {
          ensureDataListIsMutable();
          dataList_.remove(index);
          onChanged();
        } else {
          dataListBuilder_.remove(index);
        }
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.Builder getDataListBuilder(
          int index) {
        return getDataListFieldBuilder().getBuilder(index);
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutDataOrBuilder getDataListOrBuilder(
          int index) {
        if (dataListBuilder_ == null) {
          return dataList_.get(index);  } else {
          return dataListBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutDataOrBuilder> 
           getDataListOrBuilderList() {
        if (dataListBuilder_ != null) {
          return dataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(dataList_);
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.Builder addDataListBuilder() {
        return getDataListFieldBuilder().addBuilder(
            com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.getDefaultInstance());
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.Builder addDataListBuilder(
          int index) {
        return getDataListFieldBuilder().addBuilder(
            index, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.getDefaultInstance());
      }
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.Builder> 
           getDataListBuilderList() {
        return getDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.Builder, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutDataOrBuilder> 
          getDataListFieldBuilder() {
        if (dataListBuilder_ == null) {
          dataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutData.Builder, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.AreaInOutDataOrBuilder>(
                  dataList_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          dataList_ = null;
        }
        return dataListBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:ResAreaINOUTAlarmRecoreds)
    }
    
    static {
      defaultInstance = new ResAreaINOUTAlarmRecoreds(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ResAreaINOUTAlarmRecoreds)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ResAreaINOUTAlarmRecoreds_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ResAreaINOUTAlarmRecoreds_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIcore/proto/webservice/statisticsdata/j" +
      "ava/ResAreaINOUTAlarmRecoreds.proto\032?cor" +
      "e/proto/webservice/statisticsdata/entity" +
      "/AreaInOutData.proto\"g\n\031ResAreaINOUTAlar" +
      "mRecoreds\022\022\n\nstatusCode\030\001 \002(\005\022\024\n\014totalRe" +
      "cords\030\002 \001(\005\022 \n\010dataList\030\003 \003(\0132\016.AreaInOu" +
      "tDataBg\nHcom.navinfo.opentsp.platform.lo" +
      "cation.protocol.webservice.statisticsdat" +
      "aB\033LCResAreaINOUTAlarmRecoreds"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ResAreaINOUTAlarmRecoreds_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ResAreaINOUTAlarmRecoreds_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ResAreaINOUTAlarmRecoreds_descriptor,
              new java.lang.String[] { "StatusCode", "TotalRecords", "DataList", },
              com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds.class,
              com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCResAreaINOUTAlarmRecoreds.ResAreaINOUTAlarmRecoreds.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCAreaInOutData.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
