// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/nodecluster/java/ConfigForEncrypt.proto

package com.navinfo.opentsp.platform.location.protocol.nodecluster;

public final class LCConfigForEncrypt {
  private LCConfigForEncrypt() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ConfigForEncryptOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .ParameterConfig paras = 1;
    java.util.List<com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig> 
        getParasList();
    com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig getParas(int index);
    int getParasCount();
    java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfigOrBuilder> 
        getParasOrBuilderList();
    com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfigOrBuilder getParasOrBuilder(
        int index);
  }
  public static final class ConfigForEncrypt extends
      com.google.protobuf.GeneratedMessage
      implements ConfigForEncryptOrBuilder {
    // Use ConfigForEncrypt.newBuilder() to construct.
    private ConfigForEncrypt(Builder builder) {
      super(builder);
    }
    private ConfigForEncrypt(boolean noInit) {}
    
    private static final ConfigForEncrypt defaultInstance;
    public static ConfigForEncrypt getDefaultInstance() {
      return defaultInstance;
    }
    
    public ConfigForEncrypt getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.internal_static_ConfigForEncrypt_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.internal_static_ConfigForEncrypt_fieldAccessorTable;
    }
    
    // repeated .ParameterConfig paras = 1;
    public static final int PARAS_FIELD_NUMBER = 1;
    private java.util.List<com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig> paras_;
    public java.util.List<com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig> getParasList() {
      return paras_;
    }
    public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfigOrBuilder> 
        getParasOrBuilderList() {
      return paras_;
    }
    public int getParasCount() {
      return paras_.size();
    }
    public com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig getParas(int index) {
      return paras_.get(index);
    }
    public com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfigOrBuilder getParasOrBuilder(
        int index) {
      return paras_.get(index);
    }
    
    private void initFields() {
      paras_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      for (int i = 0; i < getParasCount(); i++) {
        if (!getParas(i).isInitialized()) {
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
      for (int i = 0; i < paras_.size(); i++) {
        output.writeMessage(1, paras_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < paras_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, paras_.get(i));
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
    
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncryptOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.internal_static_ConfigForEncrypt_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.internal_static_ConfigForEncrypt_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getParasFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (parasBuilder_ == null) {
          paras_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          parasBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt build() {
        com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt result = new com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt(this);
        int from_bitField0_ = bitField0_;
        if (parasBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            paras_ = java.util.Collections.unmodifiableList(paras_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.paras_ = paras_;
        } else {
          result.paras_ = parasBuilder_.build();
        }
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt.getDefaultInstance()) return this;
        if (parasBuilder_ == null) {
          if (!other.paras_.isEmpty()) {
            if (paras_.isEmpty()) {
              paras_ = other.paras_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureParasIsMutable();
              paras_.addAll(other.paras_);
            }
            onChanged();
          }
        } else {
          if (!other.paras_.isEmpty()) {
            if (parasBuilder_.isEmpty()) {
              parasBuilder_.dispose();
              parasBuilder_ = null;
              paras_ = other.paras_;
              bitField0_ = (bitField0_ & ~0x00000001);
              parasBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getParasFieldBuilder() : null;
            } else {
              parasBuilder_.addAllMessages(other.paras_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        for (int i = 0; i < getParasCount(); i++) {
          if (!getParas(i).isInitialized()) {
            
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
            case 10: {
              com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addParas(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .ParameterConfig paras = 1;
      private java.util.List<com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig> paras_ =
        java.util.Collections.emptyList();
      private void ensureParasIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          paras_ = new java.util.ArrayList<com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig>(paras_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig, com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.Builder, com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfigOrBuilder> parasBuilder_;
      
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig> getParasList() {
        if (parasBuilder_ == null) {
          return java.util.Collections.unmodifiableList(paras_);
        } else {
          return parasBuilder_.getMessageList();
        }
      }
      public int getParasCount() {
        if (parasBuilder_ == null) {
          return paras_.size();
        } else {
          return parasBuilder_.getCount();
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig getParas(int index) {
        if (parasBuilder_ == null) {
          return paras_.get(index);
        } else {
          return parasBuilder_.getMessage(index);
        }
      }
      public Builder setParas(
          int index, com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig value) {
        if (parasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureParasIsMutable();
          paras_.set(index, value);
          onChanged();
        } else {
          parasBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setParas(
          int index, com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.Builder builderForValue) {
        if (parasBuilder_ == null) {
          ensureParasIsMutable();
          paras_.set(index, builderForValue.build());
          onChanged();
        } else {
          parasBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addParas(com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig value) {
        if (parasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureParasIsMutable();
          paras_.add(value);
          onChanged();
        } else {
          parasBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addParas(
          int index, com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig value) {
        if (parasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureParasIsMutable();
          paras_.add(index, value);
          onChanged();
        } else {
          parasBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addParas(
          com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.Builder builderForValue) {
        if (parasBuilder_ == null) {
          ensureParasIsMutable();
          paras_.add(builderForValue.build());
          onChanged();
        } else {
          parasBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addParas(
          int index, com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.Builder builderForValue) {
        if (parasBuilder_ == null) {
          ensureParasIsMutable();
          paras_.add(index, builderForValue.build());
          onChanged();
        } else {
          parasBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllParas(
          java.lang.Iterable<? extends com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig> values) {
        if (parasBuilder_ == null) {
          ensureParasIsMutable();
          super.addAll(values, paras_);
          onChanged();
        } else {
          parasBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearParas() {
        if (parasBuilder_ == null) {
          paras_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          parasBuilder_.clear();
        }
        return this;
      }
      public Builder removeParas(int index) {
        if (parasBuilder_ == null) {
          ensureParasIsMutable();
          paras_.remove(index);
          onChanged();
        } else {
          parasBuilder_.remove(index);
        }
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.Builder getParasBuilder(
          int index) {
        return getParasFieldBuilder().getBuilder(index);
      }
      public com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfigOrBuilder getParasOrBuilder(
          int index) {
        if (parasBuilder_ == null) {
          return paras_.get(index);  } else {
          return parasBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfigOrBuilder> 
           getParasOrBuilderList() {
        if (parasBuilder_ != null) {
          return parasBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(paras_);
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.Builder addParasBuilder() {
        return getParasFieldBuilder().addBuilder(
            com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.getDefaultInstance());
      }
      public com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.Builder addParasBuilder(
          int index) {
        return getParasFieldBuilder().addBuilder(
            index, com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.getDefaultInstance());
      }
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.Builder> 
           getParasBuilderList() {
        return getParasFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig, com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.Builder, com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfigOrBuilder> 
          getParasFieldBuilder() {
        if (parasBuilder_ == null) {
          parasBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig, com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfig.Builder, com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.ParameterConfigOrBuilder>(
                  paras_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          paras_ = null;
        }
        return parasBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:ConfigForEncrypt)
    }
    
    static {
      defaultInstance = new ConfigForEncrypt(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ConfigForEncrypt)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ConfigForEncrypt_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ConfigForEncrypt_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2core/proto/nodecluster/java/ConfigForE" +
      "ncrypt.proto\0328core/proto/nodecluster/com" +
      "mon/java/ParameterConfig.proto\"3\n\020Config" +
      "ForEncrypt\022\037\n\005paras\030\001 \003(\0132\020.ParameterCon" +
      "figBP\n:com.navinfo.opentsp.platform.loca" +
      "tion.protocol.nodeclusterB\022LCConfigForEn" +
      "crypt"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ConfigForEncrypt_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ConfigForEncrypt_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ConfigForEncrypt_descriptor,
              new java.lang.String[] { "Paras", },
              com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt.class,
              com.navinfo.opentsp.platform.location.protocol.nodecluster.LCConfigForEncrypt.ConfigForEncrypt.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCParameterConfig.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
