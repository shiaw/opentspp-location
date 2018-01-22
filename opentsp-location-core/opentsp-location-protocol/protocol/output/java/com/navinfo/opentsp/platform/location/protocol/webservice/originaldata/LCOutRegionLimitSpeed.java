// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/originaldata/java/OutRegionLimitSpeed.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.originaldata;

public final class LCOutRegionLimitSpeed {
  private LCOutRegionLimitSpeed() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface OutRegionLimitSpeedOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 statusCode = 1;
    boolean hasStatusCode();
    int getStatusCode();
    
    // optional int32 totalRecords = 2;
    boolean hasTotalRecords();
    int getTotalRecords();
    
    // repeated .LimitSpeedRecord record = 3;
    java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord> 
        getRecordList();
    com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord getRecord(int index);
    int getRecordCount();
    java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecordOrBuilder> 
        getRecordOrBuilderList();
    com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecordOrBuilder getRecordOrBuilder(
        int index);
  }
  public static final class OutRegionLimitSpeed extends
      com.google.protobuf.GeneratedMessage
      implements OutRegionLimitSpeedOrBuilder {
    // Use OutRegionLimitSpeed.newBuilder() to construct.
    private OutRegionLimitSpeed(Builder builder) {
      super(builder);
    }
    private OutRegionLimitSpeed(boolean noInit) {}
    
    private static final OutRegionLimitSpeed defaultInstance;
    public static OutRegionLimitSpeed getDefaultInstance() {
      return defaultInstance;
    }
    
    public OutRegionLimitSpeed getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.internal_static_OutRegionLimitSpeed_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.internal_static_OutRegionLimitSpeed_fieldAccessorTable;
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
    
    // repeated .LimitSpeedRecord record = 3;
    public static final int RECORD_FIELD_NUMBER = 3;
    private java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord> record_;
    public java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord> getRecordList() {
      return record_;
    }
    public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecordOrBuilder> 
        getRecordOrBuilderList() {
      return record_;
    }
    public int getRecordCount() {
      return record_.size();
    }
    public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord getRecord(int index) {
      return record_.get(index);
    }
    public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecordOrBuilder getRecordOrBuilder(
        int index) {
      return record_.get(index);
    }
    
    private void initFields() {
      statusCode_ = 0;
      totalRecords_ = 0;
      record_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasStatusCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getRecordCount(); i++) {
        if (!getRecord(i).isInitialized()) {
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
      for (int i = 0; i < record_.size(); i++) {
        output.writeMessage(3, record_.get(i));
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
      for (int i = 0; i < record_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, record_.get(i));
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
    
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.internal_static_OutRegionLimitSpeed_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.internal_static_OutRegionLimitSpeed_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getRecordFieldBuilder();
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
        if (recordBuilder_ == null) {
          record_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          recordBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed build() {
        com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed result = new com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed(this);
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
        if (recordBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            record_ = java.util.Collections.unmodifiableList(record_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.record_ = record_;
        } else {
          result.record_ = recordBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed.getDefaultInstance()) return this;
        if (other.hasStatusCode()) {
          setStatusCode(other.getStatusCode());
        }
        if (other.hasTotalRecords()) {
          setTotalRecords(other.getTotalRecords());
        }
        if (recordBuilder_ == null) {
          if (!other.record_.isEmpty()) {
            if (record_.isEmpty()) {
              record_ = other.record_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureRecordIsMutable();
              record_.addAll(other.record_);
            }
            onChanged();
          }
        } else {
          if (!other.record_.isEmpty()) {
            if (recordBuilder_.isEmpty()) {
              recordBuilder_.dispose();
              recordBuilder_ = null;
              record_ = other.record_;
              bitField0_ = (bitField0_ & ~0x00000004);
              recordBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getRecordFieldBuilder() : null;
            } else {
              recordBuilder_.addAllMessages(other.record_);
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
        for (int i = 0; i < getRecordCount(); i++) {
          if (!getRecord(i).isInitialized()) {
            
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
              com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addRecord(subBuilder.buildPartial());
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
      
      // repeated .LimitSpeedRecord record = 3;
      private java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord> record_ =
        java.util.Collections.emptyList();
      private void ensureRecordIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          record_ = new java.util.ArrayList<com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord>(record_);
          bitField0_ |= 0x00000004;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord, com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.Builder, com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecordOrBuilder> recordBuilder_;
      
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord> getRecordList() {
        if (recordBuilder_ == null) {
          return java.util.Collections.unmodifiableList(record_);
        } else {
          return recordBuilder_.getMessageList();
        }
      }
      public int getRecordCount() {
        if (recordBuilder_ == null) {
          return record_.size();
        } else {
          return recordBuilder_.getCount();
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord getRecord(int index) {
        if (recordBuilder_ == null) {
          return record_.get(index);
        } else {
          return recordBuilder_.getMessage(index);
        }
      }
      public Builder setRecord(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord value) {
        if (recordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordIsMutable();
          record_.set(index, value);
          onChanged();
        } else {
          recordBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setRecord(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.Builder builderForValue) {
        if (recordBuilder_ == null) {
          ensureRecordIsMutable();
          record_.set(index, builderForValue.build());
          onChanged();
        } else {
          recordBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addRecord(com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord value) {
        if (recordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordIsMutable();
          record_.add(value);
          onChanged();
        } else {
          recordBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addRecord(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord value) {
        if (recordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordIsMutable();
          record_.add(index, value);
          onChanged();
        } else {
          recordBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addRecord(
          com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.Builder builderForValue) {
        if (recordBuilder_ == null) {
          ensureRecordIsMutable();
          record_.add(builderForValue.build());
          onChanged();
        } else {
          recordBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addRecord(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.Builder builderForValue) {
        if (recordBuilder_ == null) {
          ensureRecordIsMutable();
          record_.add(index, builderForValue.build());
          onChanged();
        } else {
          recordBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllRecord(
          java.lang.Iterable<? extends com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord> values) {
        if (recordBuilder_ == null) {
          ensureRecordIsMutable();
          super.addAll(values, record_);
          onChanged();
        } else {
          recordBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearRecord() {
        if (recordBuilder_ == null) {
          record_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          recordBuilder_.clear();
        }
        return this;
      }
      public Builder removeRecord(int index) {
        if (recordBuilder_ == null) {
          ensureRecordIsMutable();
          record_.remove(index);
          onChanged();
        } else {
          recordBuilder_.remove(index);
        }
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.Builder getRecordBuilder(
          int index) {
        return getRecordFieldBuilder().getBuilder(index);
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecordOrBuilder getRecordOrBuilder(
          int index) {
        if (recordBuilder_ == null) {
          return record_.get(index);  } else {
          return recordBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecordOrBuilder> 
           getRecordOrBuilderList() {
        if (recordBuilder_ != null) {
          return recordBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(record_);
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.Builder addRecordBuilder() {
        return getRecordFieldBuilder().addBuilder(
            com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.getDefaultInstance());
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.Builder addRecordBuilder(
          int index) {
        return getRecordFieldBuilder().addBuilder(
            index, com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.getDefaultInstance());
      }
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.Builder> 
           getRecordBuilderList() {
        return getRecordFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord, com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.Builder, com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecordOrBuilder> 
          getRecordFieldBuilder() {
        if (recordBuilder_ == null) {
          recordBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord, com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecord.Builder, com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.LimitSpeedRecordOrBuilder>(
                  record_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          record_ = null;
        }
        return recordBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:OutRegionLimitSpeed)
    }
    
    static {
      defaultInstance = new OutRegionLimitSpeed(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:OutRegionLimitSpeed)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_OutRegionLimitSpeed_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_OutRegionLimitSpeed_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAcore/proto/webservice/originaldata/jav" +
      "a/OutRegionLimitSpeed.proto\032>core/proto/" +
      "webservice/originaldata/java/LimitSpeedR" +
      "ecord.proto\"b\n\023OutRegionLimitSpeed\022\022\n\nst" +
      "atusCode\030\001 \002(\005\022\024\n\014totalRecords\030\002 \001(\005\022!\n\006" +
      "record\030\003 \003(\0132\021.LimitSpeedRecordB_\nFcom.n" +
      "avinfo.opentsp.platform.location.protoco" +
      "l.webservice.originaldataB\025LCOutRegionLi" +
      "mitSpeed"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_OutRegionLimitSpeed_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_OutRegionLimitSpeed_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_OutRegionLimitSpeed_descriptor,
              new java.lang.String[] { "StatusCode", "TotalRecords", "Record", },
              com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed.class,
              com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCOutRegionLimitSpeed.OutRegionLimitSpeed.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCLimitSpeedRecord.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
