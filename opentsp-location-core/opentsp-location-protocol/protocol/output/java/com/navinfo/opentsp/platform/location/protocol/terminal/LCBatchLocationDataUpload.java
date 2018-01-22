// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/java/BatchLocationDataUpload.proto

package com.navinfo.opentsp.platform.location.protocol.terminal;

public final class LCBatchLocationDataUpload {
  private LCBatchLocationDataUpload() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BatchLocationDataUploadOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .LocationDataType types = 1;
    boolean hasTypes();
    com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.LocationDataType getTypes();
    
    // repeated .LocationData datas = 2;
    java.util.List<com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData> 
        getDatasList();
    com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData getDatas(int index);
    int getDatasCount();
    java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder> 
        getDatasOrBuilderList();
    com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder getDatasOrBuilder(
        int index);
  }
  public static final class BatchLocationDataUpload extends
      com.google.protobuf.GeneratedMessage
      implements BatchLocationDataUploadOrBuilder {
    // Use BatchLocationDataUpload.newBuilder() to construct.
    private BatchLocationDataUpload(Builder builder) {
      super(builder);
    }
    private BatchLocationDataUpload(boolean noInit) {}
    
    private static final BatchLocationDataUpload defaultInstance;
    public static BatchLocationDataUpload getDefaultInstance() {
      return defaultInstance;
    }
    
    public BatchLocationDataUpload getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.internal_static_BatchLocationDataUpload_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.internal_static_BatchLocationDataUpload_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .LocationDataType types = 1;
    public static final int TYPES_FIELD_NUMBER = 1;
    private com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.LocationDataType types_;
    public boolean hasTypes() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.LocationDataType getTypes() {
      return types_;
    }
    
    // repeated .LocationData datas = 2;
    public static final int DATAS_FIELD_NUMBER = 2;
    private java.util.List<com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData> datas_;
    public java.util.List<com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData> getDatasList() {
      return datas_;
    }
    public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder> 
        getDatasOrBuilderList() {
      return datas_;
    }
    public int getDatasCount() {
      return datas_.size();
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData getDatas(int index) {
      return datas_.get(index);
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder getDatasOrBuilder(
        int index) {
      return datas_.get(index);
    }
    
    private void initFields() {
      types_ = com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.LocationDataType.normal;
      datas_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTypes()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getDatasCount(); i++) {
        if (!getDatas(i).isInitialized()) {
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
        output.writeEnum(1, types_.getNumber());
      }
      for (int i = 0; i < datas_.size(); i++) {
        output.writeMessage(2, datas_.get(i));
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
          .computeEnumSize(1, types_.getNumber());
      }
      for (int i = 0; i < datas_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, datas_.get(i));
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
    
    public static com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUploadOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.internal_static_BatchLocationDataUpload_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.internal_static_BatchLocationDataUpload_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getDatasFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        types_ = com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.LocationDataType.normal;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (datasBuilder_ == null) {
          datas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          datasBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload build() {
        com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload result = new com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.types_ = types_;
        if (datasBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            datas_ = java.util.Collections.unmodifiableList(datas_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.datas_ = datas_;
        } else {
          result.datas_ = datasBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload.getDefaultInstance()) return this;
        if (other.hasTypes()) {
          setTypes(other.getTypes());
        }
        if (datasBuilder_ == null) {
          if (!other.datas_.isEmpty()) {
            if (datas_.isEmpty()) {
              datas_ = other.datas_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureDatasIsMutable();
              datas_.addAll(other.datas_);
            }
            onChanged();
          }
        } else {
          if (!other.datas_.isEmpty()) {
            if (datasBuilder_.isEmpty()) {
              datasBuilder_.dispose();
              datasBuilder_ = null;
              datas_ = other.datas_;
              bitField0_ = (bitField0_ & ~0x00000002);
              datasBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getDatasFieldBuilder() : null;
            } else {
              datasBuilder_.addAllMessages(other.datas_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTypes()) {
          
          return false;
        }
        for (int i = 0; i < getDatasCount(); i++) {
          if (!getDatas(i).isInitialized()) {
            
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
              int rawValue = input.readEnum();
              com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.LocationDataType value = com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.LocationDataType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                types_ = value;
              }
              break;
            }
            case 18: {
              com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addDatas(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .LocationDataType types = 1;
      private com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.LocationDataType types_ = com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.LocationDataType.normal;
      public boolean hasTypes() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.LocationDataType getTypes() {
        return types_;
      }
      public Builder setTypes(com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.LocationDataType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        types_ = value;
        onChanged();
        return this;
      }
      public Builder clearTypes() {
        bitField0_ = (bitField0_ & ~0x00000001);
        types_ = com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.LocationDataType.normal;
        onChanged();
        return this;
      }
      
      // repeated .LocationData datas = 2;
      private java.util.List<com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData> datas_ =
        java.util.Collections.emptyList();
      private void ensureDatasIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          datas_ = new java.util.ArrayList<com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData>(datas_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder> datasBuilder_;
      
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData> getDatasList() {
        if (datasBuilder_ == null) {
          return java.util.Collections.unmodifiableList(datas_);
        } else {
          return datasBuilder_.getMessageList();
        }
      }
      public int getDatasCount() {
        if (datasBuilder_ == null) {
          return datas_.size();
        } else {
          return datasBuilder_.getCount();
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData getDatas(int index) {
        if (datasBuilder_ == null) {
          return datas_.get(index);
        } else {
          return datasBuilder_.getMessage(index);
        }
      }
      public Builder setDatas(
          int index, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData value) {
        if (datasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDatasIsMutable();
          datas_.set(index, value);
          onChanged();
        } else {
          datasBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setDatas(
          int index, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder builderForValue) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          datas_.set(index, builderForValue.build());
          onChanged();
        } else {
          datasBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addDatas(com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData value) {
        if (datasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDatasIsMutable();
          datas_.add(value);
          onChanged();
        } else {
          datasBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addDatas(
          int index, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData value) {
        if (datasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDatasIsMutable();
          datas_.add(index, value);
          onChanged();
        } else {
          datasBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addDatas(
          com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder builderForValue) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          datas_.add(builderForValue.build());
          onChanged();
        } else {
          datasBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addDatas(
          int index, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder builderForValue) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          datas_.add(index, builderForValue.build());
          onChanged();
        } else {
          datasBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllDatas(
          java.lang.Iterable<? extends com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData> values) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          super.addAll(values, datas_);
          onChanged();
        } else {
          datasBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearDatas() {
        if (datasBuilder_ == null) {
          datas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          datasBuilder_.clear();
        }
        return this;
      }
      public Builder removeDatas(int index) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          datas_.remove(index);
          onChanged();
        } else {
          datasBuilder_.remove(index);
        }
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder getDatasBuilder(
          int index) {
        return getDatasFieldBuilder().getBuilder(index);
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder getDatasOrBuilder(
          int index) {
        if (datasBuilder_ == null) {
          return datas_.get(index);  } else {
          return datasBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder> 
           getDatasOrBuilderList() {
        if (datasBuilder_ != null) {
          return datasBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(datas_);
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder addDatasBuilder() {
        return getDatasFieldBuilder().addBuilder(
            com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.getDefaultInstance());
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder addDatasBuilder(
          int index) {
        return getDatasFieldBuilder().addBuilder(
            index, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.getDefaultInstance());
      }
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder> 
           getDatasBuilderList() {
        return getDatasFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder> 
          getDatasFieldBuilder() {
        if (datasBuilder_ == null) {
          datasBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder>(
                  datas_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          datas_ = null;
        }
        return datasBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:BatchLocationDataUpload)
    }
    
    static {
      defaultInstance = new BatchLocationDataUpload(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:BatchLocationDataUpload)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_BatchLocationDataUpload_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BatchLocationDataUpload_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6core/proto/terminal/java/BatchLocation" +
      "DataUpload.proto\032-core/proto/common/java" +
      "/LocationDataType.proto\032)core/proto/comm" +
      "on/java/LocationData.proto\"Y\n\027BatchLocat" +
      "ionDataUpload\022 \n\005types\030\001 \002(\0162\021.LocationD" +
      "ataType\022\034\n\005datas\030\002 \003(\0132\r.LocationDataBT\n" +
      "7com.navinfo.opentsp.platform.location.p" +
      "rotocol.terminalB\031LCBatchLocationDataUpl" +
      "oad"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_BatchLocationDataUpload_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_BatchLocationDataUpload_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_BatchLocationDataUpload_descriptor,
              new java.lang.String[] { "Types", "Datas", },
              com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload.class,
              com.navinfo.opentsp.platform.location.protocol.terminal.LCBatchLocationDataUpload.BatchLocationDataUpload.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.getDescriptor(),
          com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}