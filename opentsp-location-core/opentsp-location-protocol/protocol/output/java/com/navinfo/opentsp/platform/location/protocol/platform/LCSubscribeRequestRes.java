// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/platform/java/SubscribeRequestRes.proto

package com.navinfo.opentsp.platform.location.protocol.platform;

public final class LCSubscribeRequestRes {
  private LCSubscribeRequestRes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SubscribeRequestResOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 serialNumber = 1;
    boolean hasSerialNumber();
    int getSerialNumber();
    
    // repeated .RPNodeData datas = 2;
    java.util.List<com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData> 
        getDatasList();
    com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData getDatas(int index);
    int getDatasCount();
    java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeDataOrBuilder> 
        getDatasOrBuilderList();
    com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeDataOrBuilder getDatasOrBuilder(
        int index);
    
    // repeated int64 terminalIdentify = 3;
    java.util.List<java.lang.Long> getTerminalIdentifyList();
    int getTerminalIdentifyCount();
    long getTerminalIdentify(int index);
  }
  public static final class SubscribeRequestRes extends
      com.google.protobuf.GeneratedMessage
      implements SubscribeRequestResOrBuilder {
    // Use SubscribeRequestRes.newBuilder() to construct.
    private SubscribeRequestRes(Builder builder) {
      super(builder);
    }
    private SubscribeRequestRes(boolean noInit) {}
    
    private static final SubscribeRequestRes defaultInstance;
    public static SubscribeRequestRes getDefaultInstance() {
      return defaultInstance;
    }
    
    public SubscribeRequestRes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.internal_static_SubscribeRequestRes_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.internal_static_SubscribeRequestRes_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 serialNumber = 1;
    public static final int SERIALNUMBER_FIELD_NUMBER = 1;
    private int serialNumber_;
    public boolean hasSerialNumber() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getSerialNumber() {
      return serialNumber_;
    }
    
    // repeated .RPNodeData datas = 2;
    public static final int DATAS_FIELD_NUMBER = 2;
    private java.util.List<com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData> datas_;
    public java.util.List<com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData> getDatasList() {
      return datas_;
    }
    public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeDataOrBuilder> 
        getDatasOrBuilderList() {
      return datas_;
    }
    public int getDatasCount() {
      return datas_.size();
    }
    public com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData getDatas(int index) {
      return datas_.get(index);
    }
    public com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeDataOrBuilder getDatasOrBuilder(
        int index) {
      return datas_.get(index);
    }
    
    // repeated int64 terminalIdentify = 3;
    public static final int TERMINALIDENTIFY_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Long> terminalIdentify_;
    public java.util.List<java.lang.Long>
        getTerminalIdentifyList() {
      return terminalIdentify_;
    }
    public int getTerminalIdentifyCount() {
      return terminalIdentify_.size();
    }
    public long getTerminalIdentify(int index) {
      return terminalIdentify_.get(index);
    }
    
    private void initFields() {
      serialNumber_ = 0;
      datas_ = java.util.Collections.emptyList();
      terminalIdentify_ = java.util.Collections.emptyList();;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSerialNumber()) {
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
        output.writeInt32(1, serialNumber_);
      }
      for (int i = 0; i < datas_.size(); i++) {
        output.writeMessage(2, datas_.get(i));
      }
      for (int i = 0; i < terminalIdentify_.size(); i++) {
        output.writeInt64(3, terminalIdentify_.get(i));
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
          .computeInt32Size(1, serialNumber_);
      }
      for (int i = 0; i < datas_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, datas_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < terminalIdentify_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt64SizeNoTag(terminalIdentify_.get(i));
        }
        size += dataSize;
        size += 1 * getTerminalIdentifyList().size();
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
    
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.internal_static_SubscribeRequestRes_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.internal_static_SubscribeRequestRes_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes.newBuilder()
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
        serialNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (datasBuilder_ == null) {
          datas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          datasBuilder_.clear();
        }
        terminalIdentify_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes build() {
        com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes result = new com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.serialNumber_ = serialNumber_;
        if (datasBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            datas_ = java.util.Collections.unmodifiableList(datas_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.datas_ = datas_;
        } else {
          result.datas_ = datasBuilder_.build();
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          terminalIdentify_ = java.util.Collections.unmodifiableList(terminalIdentify_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.terminalIdentify_ = terminalIdentify_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes.getDefaultInstance()) return this;
        if (other.hasSerialNumber()) {
          setSerialNumber(other.getSerialNumber());
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
        if (!other.terminalIdentify_.isEmpty()) {
          if (terminalIdentify_.isEmpty()) {
            terminalIdentify_ = other.terminalIdentify_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureTerminalIdentifyIsMutable();
            terminalIdentify_.addAll(other.terminalIdentify_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSerialNumber()) {
          
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
              bitField0_ |= 0x00000001;
              serialNumber_ = input.readInt32();
              break;
            }
            case 18: {
              com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addDatas(subBuilder.buildPartial());
              break;
            }
            case 24: {
              ensureTerminalIdentifyIsMutable();
              terminalIdentify_.add(input.readInt64());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addTerminalIdentify(input.readInt64());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 serialNumber = 1;
      private int serialNumber_ ;
      public boolean hasSerialNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getSerialNumber() {
        return serialNumber_;
      }
      public Builder setSerialNumber(int value) {
        bitField0_ |= 0x00000001;
        serialNumber_ = value;
        onChanged();
        return this;
      }
      public Builder clearSerialNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        serialNumber_ = 0;
        onChanged();
        return this;
      }
      
      // repeated .RPNodeData datas = 2;
      private java.util.List<com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData> datas_ =
        java.util.Collections.emptyList();
      private void ensureDatasIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          datas_ = new java.util.ArrayList<com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData>(datas_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData, com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.Builder, com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeDataOrBuilder> datasBuilder_;
      
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData> getDatasList() {
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
      public com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData getDatas(int index) {
        if (datasBuilder_ == null) {
          return datas_.get(index);
        } else {
          return datasBuilder_.getMessage(index);
        }
      }
      public Builder setDatas(
          int index, com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData value) {
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
          int index, com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.Builder builderForValue) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          datas_.set(index, builderForValue.build());
          onChanged();
        } else {
          datasBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addDatas(com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData value) {
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
          int index, com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData value) {
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
          com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.Builder builderForValue) {
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
          int index, com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.Builder builderForValue) {
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
          java.lang.Iterable<? extends com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData> values) {
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
      public com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.Builder getDatasBuilder(
          int index) {
        return getDatasFieldBuilder().getBuilder(index);
      }
      public com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeDataOrBuilder getDatasOrBuilder(
          int index) {
        if (datasBuilder_ == null) {
          return datas_.get(index);  } else {
          return datasBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeDataOrBuilder> 
           getDatasOrBuilderList() {
        if (datasBuilder_ != null) {
          return datasBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(datas_);
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.Builder addDatasBuilder() {
        return getDatasFieldBuilder().addBuilder(
            com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.getDefaultInstance());
      }
      public com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.Builder addDatasBuilder(
          int index) {
        return getDatasFieldBuilder().addBuilder(
            index, com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.getDefaultInstance());
      }
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.Builder> 
           getDatasBuilderList() {
        return getDatasFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData, com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.Builder, com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeDataOrBuilder> 
          getDatasFieldBuilder() {
        if (datasBuilder_ == null) {
          datasBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData, com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeData.Builder, com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.RPNodeDataOrBuilder>(
                  datas_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          datas_ = null;
        }
        return datasBuilder_;
      }
      
      // repeated int64 terminalIdentify = 3;
      private java.util.List<java.lang.Long> terminalIdentify_ = java.util.Collections.emptyList();;
      private void ensureTerminalIdentifyIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          terminalIdentify_ = new java.util.ArrayList<java.lang.Long>(terminalIdentify_);
          bitField0_ |= 0x00000004;
         }
      }
      public java.util.List<java.lang.Long>
          getTerminalIdentifyList() {
        return java.util.Collections.unmodifiableList(terminalIdentify_);
      }
      public int getTerminalIdentifyCount() {
        return terminalIdentify_.size();
      }
      public long getTerminalIdentify(int index) {
        return terminalIdentify_.get(index);
      }
      public Builder setTerminalIdentify(
          int index, long value) {
        ensureTerminalIdentifyIsMutable();
        terminalIdentify_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addTerminalIdentify(long value) {
        ensureTerminalIdentifyIsMutable();
        terminalIdentify_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllTerminalIdentify(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureTerminalIdentifyIsMutable();
        super.addAll(values, terminalIdentify_);
        onChanged();
        return this;
      }
      public Builder clearTerminalIdentify() {
        terminalIdentify_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:SubscribeRequestRes)
    }
    
    static {
      defaultInstance = new SubscribeRequestRes(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:SubscribeRequestRes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_SubscribeRequestRes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SubscribeRequestRes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2core/proto/platform/java/SubscribeRequ" +
      "estRes.proto\032)core/proto/platform/java/R" +
      "PNodeData.proto\"a\n\023SubscribeRequestRes\022\024" +
      "\n\014serialNumber\030\001 \002(\005\022\032\n\005datas\030\002 \003(\0132\013.RP" +
      "NodeData\022\030\n\020terminalIdentify\030\003 \003(\003BP\n7co" +
      "m.navinfo.opentsp.platform.location.prot" +
      "ocol.platformB\025LCSubscribeRequestRes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_SubscribeRequestRes_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_SubscribeRequestRes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_SubscribeRequestRes_descriptor,
              new java.lang.String[] { "SerialNumber", "Datas", "TerminalIdentify", },
              com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes.class,
              com.navinfo.opentsp.platform.location.protocol.platform.LCSubscribeRequestRes.SubscribeRequestRes.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.platform.LCRPNodeData.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}