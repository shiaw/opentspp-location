// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/statisticsdata/java/TerminalOnlineRecords.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata;

public final class LCTerminalOnlineRecords {
  private LCTerminalOnlineRecords() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TerminalOnlineRecordsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 statusCode = 1;
    boolean hasStatusCode();
    int getStatusCode();
    
    // optional int32 totalRecords = 2;
    boolean hasTotalRecords();
    int getTotalRecords();
    
    // repeated .OnlinePercentage percentages = 3;
    java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage> 
        getPercentagesList();
    com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage getPercentages(int index);
    int getPercentagesCount();
    java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentageOrBuilder> 
        getPercentagesOrBuilderList();
    com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentageOrBuilder getPercentagesOrBuilder(
            int index);
  }
  public static final class TerminalOnlineRecords extends
      com.google.protobuf.GeneratedMessage
      implements TerminalOnlineRecordsOrBuilder {
    // Use TerminalOnlineRecords.newBuilder() to construct.
    private TerminalOnlineRecords(Builder builder) {
      super(builder);
    }
    private TerminalOnlineRecords(boolean noInit) {}
    
    private static final TerminalOnlineRecords defaultInstance;
    public static TerminalOnlineRecords getDefaultInstance() {
      return defaultInstance;
    }
    
    public TerminalOnlineRecords getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCTerminalOnlineRecords.internal_static_TerminalOnlineRecords_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCTerminalOnlineRecords.internal_static_TerminalOnlineRecords_fieldAccessorTable;
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
    
    // repeated .OnlinePercentage percentages = 3;
    public static final int PERCENTAGES_FIELD_NUMBER = 3;
    private java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage> percentages_;
    public java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage> getPercentagesList() {
      return percentages_;
    }
    public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentageOrBuilder> 
        getPercentagesOrBuilderList() {
      return percentages_;
    }
    public int getPercentagesCount() {
      return percentages_.size();
    }
    public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage getPercentages(int index) {
      return percentages_.get(index);
    }
    public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentageOrBuilder getPercentagesOrBuilder(
        int index) {
      return percentages_.get(index);
    }
    
    private void initFields() {
      statusCode_ = 0;
      totalRecords_ = 0;
      percentages_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasStatusCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getPercentagesCount(); i++) {
        if (!getPercentages(i).isInitialized()) {
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
      for (int i = 0; i < percentages_.size(); i++) {
        output.writeMessage(3, percentages_.get(i));
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
      for (int i = 0; i < percentages_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, percentages_.get(i));
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
    
    public static TerminalOnlineRecords parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TerminalOnlineRecords parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TerminalOnlineRecords parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TerminalOnlineRecords parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TerminalOnlineRecords parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TerminalOnlineRecords parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static TerminalOnlineRecords parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static TerminalOnlineRecords parseDelimitedFrom(
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
    public static TerminalOnlineRecords parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TerminalOnlineRecords parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(TerminalOnlineRecords prototype) {
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
       implements TerminalOnlineRecordsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCTerminalOnlineRecords.internal_static_TerminalOnlineRecords_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCTerminalOnlineRecords.internal_static_TerminalOnlineRecords_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.LCTerminalOnlineRecords.TerminalOnlineRecords.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPercentagesFieldBuilder();
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
        if (percentagesBuilder_ == null) {
          percentages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          percentagesBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TerminalOnlineRecords.getDescriptor();
      }
      
      public TerminalOnlineRecords getDefaultInstanceForType() {
        return TerminalOnlineRecords.getDefaultInstance();
      }
      
      public TerminalOnlineRecords build() {
        TerminalOnlineRecords result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private TerminalOnlineRecords buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        TerminalOnlineRecords result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public TerminalOnlineRecords buildPartial() {
        TerminalOnlineRecords result = new TerminalOnlineRecords(this);
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
        if (percentagesBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            percentages_ = java.util.Collections.unmodifiableList(percentages_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.percentages_ = percentages_;
        } else {
          result.percentages_ = percentagesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TerminalOnlineRecords) {
          return mergeFrom((TerminalOnlineRecords)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(TerminalOnlineRecords other) {
        if (other == TerminalOnlineRecords.getDefaultInstance()) return this;
        if (other.hasStatusCode()) {
          setStatusCode(other.getStatusCode());
        }
        if (other.hasTotalRecords()) {
          setTotalRecords(other.getTotalRecords());
        }
        if (percentagesBuilder_ == null) {
          if (!other.percentages_.isEmpty()) {
            if (percentages_.isEmpty()) {
              percentages_ = other.percentages_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensurePercentagesIsMutable();
              percentages_.addAll(other.percentages_);
            }
            onChanged();
          }
        } else {
          if (!other.percentages_.isEmpty()) {
            if (percentagesBuilder_.isEmpty()) {
              percentagesBuilder_.dispose();
              percentagesBuilder_ = null;
              percentages_ = other.percentages_;
              bitField0_ = (bitField0_ & ~0x00000004);
              percentagesBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPercentagesFieldBuilder() : null;
            } else {
              percentagesBuilder_.addAllMessages(other.percentages_);
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
        for (int i = 0; i < getPercentagesCount(); i++) {
          if (!getPercentages(i).isInitialized()) {
            
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
              com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addPercentages(subBuilder.buildPartial());
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
      
      // repeated .OnlinePercentage percentages = 3;
      private java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage> percentages_ =
        java.util.Collections.emptyList();
      private void ensurePercentagesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          percentages_ = new java.util.ArrayList<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage>(percentages_);
          bitField0_ |= 0x00000004;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.Builder, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentageOrBuilder> percentagesBuilder_;
      
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage> getPercentagesList() {
        if (percentagesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(percentages_);
        } else {
          return percentagesBuilder_.getMessageList();
        }
      }
      public int getPercentagesCount() {
        if (percentagesBuilder_ == null) {
          return percentages_.size();
        } else {
          return percentagesBuilder_.getCount();
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage getPercentages(int index) {
        if (percentagesBuilder_ == null) {
          return percentages_.get(index);
        } else {
          return percentagesBuilder_.getMessage(index);
        }
      }
      public Builder setPercentages(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage value) {
        if (percentagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePercentagesIsMutable();
          percentages_.set(index, value);
          onChanged();
        } else {
          percentagesBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setPercentages(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.Builder builderForValue) {
        if (percentagesBuilder_ == null) {
          ensurePercentagesIsMutable();
          percentages_.set(index, builderForValue.build());
          onChanged();
        } else {
          percentagesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addPercentages(com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage value) {
        if (percentagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePercentagesIsMutable();
          percentages_.add(value);
          onChanged();
        } else {
          percentagesBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addPercentages(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage value) {
        if (percentagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePercentagesIsMutable();
          percentages_.add(index, value);
          onChanged();
        } else {
          percentagesBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addPercentages(
          com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.Builder builderForValue) {
        if (percentagesBuilder_ == null) {
          ensurePercentagesIsMutable();
          percentages_.add(builderForValue.build());
          onChanged();
        } else {
          percentagesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addPercentages(
          int index, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.Builder builderForValue) {
        if (percentagesBuilder_ == null) {
          ensurePercentagesIsMutable();
          percentages_.add(index, builderForValue.build());
          onChanged();
        } else {
          percentagesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllPercentages(
          Iterable<? extends com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage> values) {
        if (percentagesBuilder_ == null) {
          ensurePercentagesIsMutable();
          super.addAll(values, percentages_);
          onChanged();
        } else {
          percentagesBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearPercentages() {
        if (percentagesBuilder_ == null) {
          percentages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          percentagesBuilder_.clear();
        }
        return this;
      }
      public Builder removePercentages(int index) {
        if (percentagesBuilder_ == null) {
          ensurePercentagesIsMutable();
          percentages_.remove(index);
          onChanged();
        } else {
          percentagesBuilder_.remove(index);
        }
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.Builder getPercentagesBuilder(
          int index) {
        return getPercentagesFieldBuilder().getBuilder(index);
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentageOrBuilder getPercentagesOrBuilder(
          int index) {
        if (percentagesBuilder_ == null) {
          return percentages_.get(index);  } else {
          return percentagesBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentageOrBuilder> 
           getPercentagesOrBuilderList() {
        if (percentagesBuilder_ != null) {
          return percentagesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(percentages_);
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.Builder addPercentagesBuilder() {
        return getPercentagesFieldBuilder().addBuilder(
            com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.getDefaultInstance());
      }
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.Builder addPercentagesBuilder(
          int index) {
        return getPercentagesFieldBuilder().addBuilder(
            index, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.getDefaultInstance());
      }
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.Builder> 
           getPercentagesBuilderList() {
        return getPercentagesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.Builder, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentageOrBuilder> 
          getPercentagesFieldBuilder() {
        if (percentagesBuilder_ == null) {
          percentagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentage.Builder, com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.OnlinePercentageOrBuilder>(
                  percentages_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          percentages_ = null;
        }
        return percentagesBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:TerminalOnlineRecords)
    }
    
    static {
      defaultInstance = new TerminalOnlineRecords(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:TerminalOnlineRecords)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TerminalOnlineRecords_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TerminalOnlineRecords_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nEcore/proto/webservice/statisticsdata/j" +
      "ava/TerminalOnlineRecords.proto\032Bcore/pr" +
      "oto/webservice/statisticsdata/entity/Onl" +
      "inePercentage.proto\"i\n\025TerminalOnlineRec" +
      "ords\022\022\n\nstatusCode\030\001 \002(\005\022\024\n\014totalRecords" +
      "\030\002 \001(\005\022&\n\013percentages\030\003 \003(\0132\021.OnlinePerc" +
      "entageBc\nHcom.navinfo.opentsp.platform.l" +
      "ocation.protocol.webservice.statisticsda" +
      "taB\027LCTerminalOnlineRecords"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TerminalOnlineRecords_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TerminalOnlineRecords_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TerminalOnlineRecords_descriptor,
              new String[] { "StatusCode", "TotalRecords", "Percentages", },
              TerminalOnlineRecords.class,
              TerminalOnlineRecords.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCOnlinePercentage.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
