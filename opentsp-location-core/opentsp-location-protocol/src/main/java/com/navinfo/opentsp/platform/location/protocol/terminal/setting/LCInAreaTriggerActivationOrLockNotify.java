// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/setting/java/InAreaTriggerActivationOrLockNotify.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.setting;

public final class LCInAreaTriggerActivationOrLockNotify {
  private LCInAreaTriggerActivationOrLockNotify() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface InAreaTriggerActivationOrLockNotifyOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 status = 1;
    boolean hasStatus();
    int getStatus();
    
    // repeated .AreaInfo areaInfo = 2;
    java.util.List<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo> 
        getAreaInfoList();
    com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo getAreaInfo(int index);
    int getAreaInfoCount();
    java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder> 
        getAreaInfoOrBuilderList();
    com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder getAreaInfoOrBuilder(
            int index);
  }
  public static final class InAreaTriggerActivationOrLockNotify extends
      com.google.protobuf.GeneratedMessage
      implements InAreaTriggerActivationOrLockNotifyOrBuilder {
    // Use InAreaTriggerActivationOrLockNotify.newBuilder() to construct.
    private InAreaTriggerActivationOrLockNotify(Builder builder) {
      super(builder);
    }
    private InAreaTriggerActivationOrLockNotify(boolean noInit) {}
    
    private static final InAreaTriggerActivationOrLockNotify defaultInstance;
    public static InAreaTriggerActivationOrLockNotify getDefaultInstance() {
      return defaultInstance;
    }
    
    public InAreaTriggerActivationOrLockNotify getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCInAreaTriggerActivationOrLockNotify.internal_static_InAreaTriggerActivationOrLockNotify_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCInAreaTriggerActivationOrLockNotify.internal_static_InAreaTriggerActivationOrLockNotify_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 status = 1;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getStatus() {
      return status_;
    }
    
    // repeated .AreaInfo areaInfo = 2;
    public static final int AREAINFO_FIELD_NUMBER = 2;
    private java.util.List<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo> areaInfo_;
    public java.util.List<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo> getAreaInfoList() {
      return areaInfo_;
    }
    public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder> 
        getAreaInfoOrBuilderList() {
      return areaInfo_;
    }
    public int getAreaInfoCount() {
      return areaInfo_.size();
    }
    public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo getAreaInfo(int index) {
      return areaInfo_.get(index);
    }
    public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder getAreaInfoOrBuilder(
        int index) {
      return areaInfo_.get(index);
    }
    
    private void initFields() {
      status_ = 0;
      areaInfo_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getAreaInfoCount(); i++) {
        if (!getAreaInfo(i).isInitialized()) {
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
        output.writeInt32(1, status_);
      }
      for (int i = 0; i < areaInfo_.size(); i++) {
        output.writeMessage(2, areaInfo_.get(i));
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
          .computeInt32Size(1, status_);
      }
      for (int i = 0; i < areaInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, areaInfo_.get(i));
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
    
    public static InAreaTriggerActivationOrLockNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static InAreaTriggerActivationOrLockNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static InAreaTriggerActivationOrLockNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static InAreaTriggerActivationOrLockNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static InAreaTriggerActivationOrLockNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static InAreaTriggerActivationOrLockNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static InAreaTriggerActivationOrLockNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static InAreaTriggerActivationOrLockNotify parseDelimitedFrom(
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
    public static InAreaTriggerActivationOrLockNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static InAreaTriggerActivationOrLockNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(InAreaTriggerActivationOrLockNotify prototype) {
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
       implements InAreaTriggerActivationOrLockNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCInAreaTriggerActivationOrLockNotify.internal_static_InAreaTriggerActivationOrLockNotify_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCInAreaTriggerActivationOrLockNotify.internal_static_InAreaTriggerActivationOrLockNotify_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.setting.LCInAreaTriggerActivationOrLockNotify.InAreaTriggerActivationOrLockNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getAreaInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (areaInfoBuilder_ == null) {
          areaInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          areaInfoBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return InAreaTriggerActivationOrLockNotify.getDescriptor();
      }
      
      public InAreaTriggerActivationOrLockNotify getDefaultInstanceForType() {
        return InAreaTriggerActivationOrLockNotify.getDefaultInstance();
      }
      
      public InAreaTriggerActivationOrLockNotify build() {
        InAreaTriggerActivationOrLockNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private InAreaTriggerActivationOrLockNotify buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        InAreaTriggerActivationOrLockNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public InAreaTriggerActivationOrLockNotify buildPartial() {
        InAreaTriggerActivationOrLockNotify result = new InAreaTriggerActivationOrLockNotify(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (areaInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            areaInfo_ = java.util.Collections.unmodifiableList(areaInfo_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.areaInfo_ = areaInfo_;
        } else {
          result.areaInfo_ = areaInfoBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof InAreaTriggerActivationOrLockNotify) {
          return mergeFrom((InAreaTriggerActivationOrLockNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(InAreaTriggerActivationOrLockNotify other) {
        if (other == InAreaTriggerActivationOrLockNotify.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (areaInfoBuilder_ == null) {
          if (!other.areaInfo_.isEmpty()) {
            if (areaInfo_.isEmpty()) {
              areaInfo_ = other.areaInfo_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureAreaInfoIsMutable();
              areaInfo_.addAll(other.areaInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.areaInfo_.isEmpty()) {
            if (areaInfoBuilder_.isEmpty()) {
              areaInfoBuilder_.dispose();
              areaInfoBuilder_ = null;
              areaInfo_ = other.areaInfo_;
              bitField0_ = (bitField0_ & ~0x00000002);
              areaInfoBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getAreaInfoFieldBuilder() : null;
            } else {
              areaInfoBuilder_.addAllMessages(other.areaInfo_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasStatus()) {
          
          return false;
        }
        for (int i = 0; i < getAreaInfoCount(); i++) {
          if (!getAreaInfo(i).isInitialized()) {
            
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
              status_ = input.readInt32();
              break;
            }
            case 18: {
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addAreaInfo(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 status = 1;
      private int status_ ;
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getStatus() {
        return status_;
      }
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        onChanged();
        return this;
      }
      
      // repeated .AreaInfo areaInfo = 2;
      private java.util.List<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo> areaInfo_ =
        java.util.Collections.emptyList();
      private void ensureAreaInfoIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          areaInfo_ = new java.util.ArrayList<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo>(areaInfo_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder> areaInfoBuilder_;
      
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo> getAreaInfoList() {
        if (areaInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(areaInfo_);
        } else {
          return areaInfoBuilder_.getMessageList();
        }
      }
      public int getAreaInfoCount() {
        if (areaInfoBuilder_ == null) {
          return areaInfo_.size();
        } else {
          return areaInfoBuilder_.getCount();
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo getAreaInfo(int index) {
        if (areaInfoBuilder_ == null) {
          return areaInfo_.get(index);
        } else {
          return areaInfoBuilder_.getMessage(index);
        }
      }
      public Builder setAreaInfo(
          int index, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo value) {
        if (areaInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAreaInfoIsMutable();
          areaInfo_.set(index, value);
          onChanged();
        } else {
          areaInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setAreaInfo(
          int index, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder builderForValue) {
        if (areaInfoBuilder_ == null) {
          ensureAreaInfoIsMutable();
          areaInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          areaInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAreaInfo(com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo value) {
        if (areaInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAreaInfoIsMutable();
          areaInfo_.add(value);
          onChanged();
        } else {
          areaInfoBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addAreaInfo(
          int index, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo value) {
        if (areaInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAreaInfoIsMutable();
          areaInfo_.add(index, value);
          onChanged();
        } else {
          areaInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addAreaInfo(
          com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder builderForValue) {
        if (areaInfoBuilder_ == null) {
          ensureAreaInfoIsMutable();
          areaInfo_.add(builderForValue.build());
          onChanged();
        } else {
          areaInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addAreaInfo(
          int index, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder builderForValue) {
        if (areaInfoBuilder_ == null) {
          ensureAreaInfoIsMutable();
          areaInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          areaInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllAreaInfo(
          Iterable<? extends com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo> values) {
        if (areaInfoBuilder_ == null) {
          ensureAreaInfoIsMutable();
          super.addAll(values, areaInfo_);
          onChanged();
        } else {
          areaInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearAreaInfo() {
        if (areaInfoBuilder_ == null) {
          areaInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          areaInfoBuilder_.clear();
        }
        return this;
      }
      public Builder removeAreaInfo(int index) {
        if (areaInfoBuilder_ == null) {
          ensureAreaInfoIsMutable();
          areaInfo_.remove(index);
          onChanged();
        } else {
          areaInfoBuilder_.remove(index);
        }
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder getAreaInfoBuilder(
          int index) {
        return getAreaInfoFieldBuilder().getBuilder(index);
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder getAreaInfoOrBuilder(
          int index) {
        if (areaInfoBuilder_ == null) {
          return areaInfo_.get(index);  } else {
          return areaInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder> 
           getAreaInfoOrBuilderList() {
        if (areaInfoBuilder_ != null) {
          return areaInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(areaInfo_);
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder addAreaInfoBuilder() {
        return getAreaInfoFieldBuilder().addBuilder(
            com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.getDefaultInstance());
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder addAreaInfoBuilder(
          int index) {
        return getAreaInfoFieldBuilder().addBuilder(
            index, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.getDefaultInstance());
      }
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder> 
           getAreaInfoBuilderList() {
        return getAreaInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder> 
          getAreaInfoFieldBuilder() {
        if (areaInfoBuilder_ == null) {
          areaInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfo.Builder, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.AreaInfoOrBuilder>(
                  areaInfo_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          areaInfo_ = null;
        }
        return areaInfoBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:InAreaTriggerActivationOrLockNotify)
    }
    
    static {
      defaultInstance = new InAreaTriggerActivationOrLockNotify(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:InAreaTriggerActivationOrLockNotify)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_InAreaTriggerActivationOrLockNotify_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_InAreaTriggerActivationOrLockNotify_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nJcore/proto/terminal/setting/java/InAre" +
      "aTriggerActivationOrLockNotify.proto\0320co" +
      "re/proto/dataaccess/common/java/AreaInfo" +
      ".proto\"R\n#InAreaTriggerActivationOrLockN" +
      "otify\022\016\n\006status\030\001 \002(\005\022\033\n\010areaInfo\030\002 \003(\0132" +
      "\t.AreaInfoBh\n?com.navinfo.opentsp.platfo" +
      "rm.location.protocol.terminal.settingB%L" +
      "CInAreaTriggerActivationOrLockNotify"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_InAreaTriggerActivationOrLockNotify_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_InAreaTriggerActivationOrLockNotify_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_InAreaTriggerActivationOrLockNotify_descriptor,
              new String[] { "Status", "AreaInfo", },
              InAreaTriggerActivationOrLockNotify.class,
              InAreaTriggerActivationOrLockNotify.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCAreaInfo.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}