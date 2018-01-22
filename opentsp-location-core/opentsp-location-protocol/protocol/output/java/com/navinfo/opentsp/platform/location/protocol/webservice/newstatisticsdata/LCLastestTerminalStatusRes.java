// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/newstatisticsdata/java/LastestTerminalStatusRes.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata;

public final class LCLastestTerminalStatusRes {
  private LCLastestTerminalStatusRes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LastestTerminalStatusResOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 statusCode = 1;
    boolean hasStatusCode();
    int getStatusCode();
    
    // repeated .LastestTerminalStatus status = 2;
    java.util.List<com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus> 
        getStatusList();
    com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus getStatus(int index);
    int getStatusCount();
    java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatusOrBuilder> 
        getStatusOrBuilderList();
    com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatusOrBuilder getStatusOrBuilder(
        int index);
  }
  public static final class LastestTerminalStatusRes extends
      com.google.protobuf.GeneratedMessage
      implements LastestTerminalStatusResOrBuilder {
    // Use LastestTerminalStatusRes.newBuilder() to construct.
    private LastestTerminalStatusRes(Builder builder) {
      super(builder);
    }
    private LastestTerminalStatusRes(boolean noInit) {}
    
    private static final LastestTerminalStatusRes defaultInstance;
    public static LastestTerminalStatusRes getDefaultInstance() {
      return defaultInstance;
    }
    
    public LastestTerminalStatusRes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.internal_static_LastestTerminalStatusRes_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.internal_static_LastestTerminalStatusRes_fieldAccessorTable;
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
    
    // repeated .LastestTerminalStatus status = 2;
    public static final int STATUS_FIELD_NUMBER = 2;
    private java.util.List<com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus> status_;
    public java.util.List<com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus> getStatusList() {
      return status_;
    }
    public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatusOrBuilder> 
        getStatusOrBuilderList() {
      return status_;
    }
    public int getStatusCount() {
      return status_.size();
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus getStatus(int index) {
      return status_.get(index);
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatusOrBuilder getStatusOrBuilder(
        int index) {
      return status_.get(index);
    }
    
    private void initFields() {
      statusCode_ = 0;
      status_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasStatusCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getStatusCount(); i++) {
        if (!getStatus(i).isInitialized()) {
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
      for (int i = 0; i < status_.size(); i++) {
        output.writeMessage(2, status_.get(i));
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
      for (int i = 0; i < status_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, status_.get(i));
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
    
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.internal_static_LastestTerminalStatusRes_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.internal_static_LastestTerminalStatusRes_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getStatusFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        statusCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (statusBuilder_ == null) {
          status_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          statusBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes build() {
        com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes result = new com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.statusCode_ = statusCode_;
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            status_ = java.util.Collections.unmodifiableList(status_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes.getDefaultInstance()) return this;
        if (other.hasStatusCode()) {
          setStatusCode(other.getStatusCode());
        }
        if (statusBuilder_ == null) {
          if (!other.status_.isEmpty()) {
            if (status_.isEmpty()) {
              status_ = other.status_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureStatusIsMutable();
              status_.addAll(other.status_);
            }
            onChanged();
          }
        } else {
          if (!other.status_.isEmpty()) {
            if (statusBuilder_.isEmpty()) {
              statusBuilder_.dispose();
              statusBuilder_ = null;
              status_ = other.status_;
              bitField0_ = (bitField0_ & ~0x00000002);
              statusBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStatusFieldBuilder() : null;
            } else {
              statusBuilder_.addAllMessages(other.status_);
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
        for (int i = 0; i < getStatusCount(); i++) {
          if (!getStatus(i).isInitialized()) {
            
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
            case 18: {
              com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addStatus(subBuilder.buildPartial());
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
      
      // repeated .LastestTerminalStatus status = 2;
      private java.util.List<com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus> status_ =
        java.util.Collections.emptyList();
      private void ensureStatusIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          status_ = new java.util.ArrayList<com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus>(status_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus, com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatusOrBuilder> statusBuilder_;
      
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus> getStatusList() {
        if (statusBuilder_ == null) {
          return java.util.Collections.unmodifiableList(status_);
        } else {
          return statusBuilder_.getMessageList();
        }
      }
      public int getStatusCount() {
        if (statusBuilder_ == null) {
          return status_.size();
        } else {
          return statusBuilder_.getCount();
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus getStatus(int index) {
        if (statusBuilder_ == null) {
          return status_.get(index);
        } else {
          return statusBuilder_.getMessage(index);
        }
      }
      public Builder setStatus(
          int index, com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatusIsMutable();
          status_.set(index, value);
          onChanged();
        } else {
          statusBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setStatus(
          int index, com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.Builder builderForValue) {
        if (statusBuilder_ == null) {
          ensureStatusIsMutable();
          status_.set(index, builderForValue.build());
          onChanged();
        } else {
          statusBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addStatus(com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatusIsMutable();
          status_.add(value);
          onChanged();
        } else {
          statusBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addStatus(
          int index, com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatusIsMutable();
          status_.add(index, value);
          onChanged();
        } else {
          statusBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addStatus(
          com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.Builder builderForValue) {
        if (statusBuilder_ == null) {
          ensureStatusIsMutable();
          status_.add(builderForValue.build());
          onChanged();
        } else {
          statusBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addStatus(
          int index, com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.Builder builderForValue) {
        if (statusBuilder_ == null) {
          ensureStatusIsMutable();
          status_.add(index, builderForValue.build());
          onChanged();
        } else {
          statusBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllStatus(
          java.lang.Iterable<? extends com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus> values) {
        if (statusBuilder_ == null) {
          ensureStatusIsMutable();
          super.addAll(values, status_);
          onChanged();
        } else {
          statusBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        return this;
      }
      public Builder removeStatus(int index) {
        if (statusBuilder_ == null) {
          ensureStatusIsMutable();
          status_.remove(index);
          onChanged();
        } else {
          statusBuilder_.remove(index);
        }
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.Builder getStatusBuilder(
          int index) {
        return getStatusFieldBuilder().getBuilder(index);
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatusOrBuilder getStatusOrBuilder(
          int index) {
        if (statusBuilder_ == null) {
          return status_.get(index);  } else {
          return statusBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatusOrBuilder> 
           getStatusOrBuilderList() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(status_);
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.Builder addStatusBuilder() {
        return getStatusFieldBuilder().addBuilder(
            com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.getDefaultInstance());
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.Builder addStatusBuilder(
          int index) {
        return getStatusFieldBuilder().addBuilder(
            index, com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.getDefaultInstance());
      }
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.Builder> 
           getStatusBuilderList() {
        return getStatusFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus, com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatusOrBuilder> 
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus, com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatus.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.LastestTerminalStatusOrBuilder>(
                  status_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          status_ = null;
        }
        return statusBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:LastestTerminalStatusRes)
    }
    
    static {
      defaultInstance = new LastestTerminalStatusRes(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:LastestTerminalStatusRes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_LastestTerminalStatusRes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_LastestTerminalStatusRes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nKcore/proto/webservice/newstatisticsdat" +
      "a/java/LastestTerminalStatusRes.proto\0322c" +
      "ore/proto/common/java/LastestTerminalSta" +
      "tus.proto\"V\n\030LastestTerminalStatusRes\022\022\n" +
      "\nstatusCode\030\001 \002(\005\022&\n\006status\030\002 \003(\0132\026.Last" +
      "estTerminalStatusBi\nKcom.navinfo.opentsp" +
      ".platform.location.protocol.webservice.n" +
      "ewstatisticsdataB\032LCLastestTerminalStatu" +
      "sRes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_LastestTerminalStatusRes_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_LastestTerminalStatusRes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_LastestTerminalStatusRes_descriptor,
              new java.lang.String[] { "StatusCode", "Status", },
              com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes.class,
              com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.LCLastestTerminalStatusRes.LastestTerminalStatusRes.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.common.LCLastestTerminalStatus.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
