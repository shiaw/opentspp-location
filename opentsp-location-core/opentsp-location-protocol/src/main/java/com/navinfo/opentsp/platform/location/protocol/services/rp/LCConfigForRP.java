// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/services/rp/java/ConfigForRP.proto

package com.navinfo.opentsp.platform.location.protocol.services.rp;

public final class LCConfigForRP {
  private LCConfigForRP() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ConfigForRPOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string dpIP = 1;
    boolean hasDpIP();
    String getDpIP();
    
    // required int32 dpPort = 2;
    boolean hasDpPort();
    int getDpPort();
    
    // required string rpForServerIP = 3;
    boolean hasRpForServerIP();
    String getRpForServerIP();
    
    // required int32 rpForServerPort = 4;
    boolean hasRpForServerPort();
    int getRpForServerPort();
    
    // required string daIP = 5;
    boolean hasDaIP();
    String getDaIP();
    
    // required int32 daPort = 6;
    boolean hasDaPort();
    int getDaPort();
    
    // repeated .ParameterConfig paras = 7;
    java.util.List<com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig> 
        getParasList();
    com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig getParas(int index);
    int getParasCount();
    java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfigOrBuilder> 
        getParasOrBuilderList();
    com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfigOrBuilder getParasOrBuilder(
            int index);
  }
  public static final class ConfigForRP extends
      com.google.protobuf.GeneratedMessage
      implements ConfigForRPOrBuilder {
    // Use ConfigForRP.newBuilder() to construct.
    private ConfigForRP(Builder builder) {
      super(builder);
    }
    private ConfigForRP(boolean noInit) {}
    
    private static final ConfigForRP defaultInstance;
    public static ConfigForRP getDefaultInstance() {
      return defaultInstance;
    }
    
    public ConfigForRP getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCConfigForRP.internal_static_ConfigForRP_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCConfigForRP.internal_static_ConfigForRP_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string dpIP = 1;
    public static final int DPIP_FIELD_NUMBER = 1;
    private Object dpIP_;
    public boolean hasDpIP() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getDpIP() {
      Object ref = dpIP_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          dpIP_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getDpIPBytes() {
      Object ref = dpIP_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        dpIP_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 dpPort = 2;
    public static final int DPPORT_FIELD_NUMBER = 2;
    private int dpPort_;
    public boolean hasDpPort() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getDpPort() {
      return dpPort_;
    }
    
    // required string rpForServerIP = 3;
    public static final int RPFORSERVERIP_FIELD_NUMBER = 3;
    private Object rpForServerIP_;
    public boolean hasRpForServerIP() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getRpForServerIP() {
      Object ref = rpForServerIP_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          rpForServerIP_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getRpForServerIPBytes() {
      Object ref = rpForServerIP_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        rpForServerIP_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 rpForServerPort = 4;
    public static final int RPFORSERVERPORT_FIELD_NUMBER = 4;
    private int rpForServerPort_;
    public boolean hasRpForServerPort() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getRpForServerPort() {
      return rpForServerPort_;
    }
    
    // required string daIP = 5;
    public static final int DAIP_FIELD_NUMBER = 5;
    private Object daIP_;
    public boolean hasDaIP() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getDaIP() {
      Object ref = daIP_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          daIP_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getDaIPBytes() {
      Object ref = daIP_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        daIP_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 daPort = 6;
    public static final int DAPORT_FIELD_NUMBER = 6;
    private int daPort_;
    public boolean hasDaPort() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getDaPort() {
      return daPort_;
    }
    
    // repeated .ParameterConfig paras = 7;
    public static final int PARAS_FIELD_NUMBER = 7;
    private java.util.List<com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig> paras_;
    public java.util.List<com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig> getParasList() {
      return paras_;
    }
    public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfigOrBuilder> 
        getParasOrBuilderList() {
      return paras_;
    }
    public int getParasCount() {
      return paras_.size();
    }
    public com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig getParas(int index) {
      return paras_.get(index);
    }
    public com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfigOrBuilder getParasOrBuilder(
        int index) {
      return paras_.get(index);
    }
    
    private void initFields() {
      dpIP_ = "";
      dpPort_ = 0;
      rpForServerIP_ = "";
      rpForServerPort_ = 0;
      daIP_ = "";
      daPort_ = 0;
      paras_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasDpIP()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDpPort()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRpForServerIP()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRpForServerPort()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDaIP()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDaPort()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getDpIPBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, dpPort_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getRpForServerIPBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, rpForServerPort_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getDaIPBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, daPort_);
      }
      for (int i = 0; i < paras_.size(); i++) {
        output.writeMessage(7, paras_.get(i));
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
          .computeBytesSize(1, getDpIPBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, dpPort_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getRpForServerIPBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, rpForServerPort_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getDaIPBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, daPort_);
      }
      for (int i = 0; i < paras_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, paras_.get(i));
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
    
    public static ConfigForRP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static ConfigForRP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static ConfigForRP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static ConfigForRP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static ConfigForRP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static ConfigForRP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static ConfigForRP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static ConfigForRP parseDelimitedFrom(
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
    public static ConfigForRP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static ConfigForRP parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ConfigForRP prototype) {
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
       implements ConfigForRPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCConfigForRP.internal_static_ConfigForRP_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCConfigForRP.internal_static_ConfigForRP_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.services.rp.LCConfigForRP.ConfigForRP.newBuilder()
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
        dpIP_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        dpPort_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        rpForServerIP_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        rpForServerPort_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        daIP_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        daPort_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        if (parasBuilder_ == null) {
          paras_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
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
        return ConfigForRP.getDescriptor();
      }
      
      public ConfigForRP getDefaultInstanceForType() {
        return ConfigForRP.getDefaultInstance();
      }
      
      public ConfigForRP build() {
        ConfigForRP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private ConfigForRP buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        ConfigForRP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public ConfigForRP buildPartial() {
        ConfigForRP result = new ConfigForRP(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.dpIP_ = dpIP_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.dpPort_ = dpPort_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.rpForServerIP_ = rpForServerIP_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.rpForServerPort_ = rpForServerPort_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.daIP_ = daIP_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.daPort_ = daPort_;
        if (parasBuilder_ == null) {
          if (((bitField0_ & 0x00000040) == 0x00000040)) {
            paras_ = java.util.Collections.unmodifiableList(paras_);
            bitField0_ = (bitField0_ & ~0x00000040);
          }
          result.paras_ = paras_;
        } else {
          result.paras_ = parasBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ConfigForRP) {
          return mergeFrom((ConfigForRP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(ConfigForRP other) {
        if (other == ConfigForRP.getDefaultInstance()) return this;
        if (other.hasDpIP()) {
          setDpIP(other.getDpIP());
        }
        if (other.hasDpPort()) {
          setDpPort(other.getDpPort());
        }
        if (other.hasRpForServerIP()) {
          setRpForServerIP(other.getRpForServerIP());
        }
        if (other.hasRpForServerPort()) {
          setRpForServerPort(other.getRpForServerPort());
        }
        if (other.hasDaIP()) {
          setDaIP(other.getDaIP());
        }
        if (other.hasDaPort()) {
          setDaPort(other.getDaPort());
        }
        if (parasBuilder_ == null) {
          if (!other.paras_.isEmpty()) {
            if (paras_.isEmpty()) {
              paras_ = other.paras_;
              bitField0_ = (bitField0_ & ~0x00000040);
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
              bitField0_ = (bitField0_ & ~0x00000040);
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
        if (!hasDpIP()) {
          
          return false;
        }
        if (!hasDpPort()) {
          
          return false;
        }
        if (!hasRpForServerIP()) {
          
          return false;
        }
        if (!hasRpForServerPort()) {
          
          return false;
        }
        if (!hasDaIP()) {
          
          return false;
        }
        if (!hasDaPort()) {
          
          return false;
        }
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
              bitField0_ |= 0x00000001;
              dpIP_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              dpPort_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              rpForServerIP_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              rpForServerPort_ = input.readInt32();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              daIP_ = input.readBytes();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              daPort_ = input.readInt32();
              break;
            }
            case 58: {
              com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addParas(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string dpIP = 1;
      private Object dpIP_ = "";
      public boolean hasDpIP() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getDpIP() {
        Object ref = dpIP_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          dpIP_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setDpIP(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        dpIP_ = value;
        onChanged();
        return this;
      }
      public Builder clearDpIP() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dpIP_ = getDefaultInstance().getDpIP();
        onChanged();
        return this;
      }
      void setDpIP(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        dpIP_ = value;
        onChanged();
      }
      
      // required int32 dpPort = 2;
      private int dpPort_ ;
      public boolean hasDpPort() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getDpPort() {
        return dpPort_;
      }
      public Builder setDpPort(int value) {
        bitField0_ |= 0x00000002;
        dpPort_ = value;
        onChanged();
        return this;
      }
      public Builder clearDpPort() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dpPort_ = 0;
        onChanged();
        return this;
      }
      
      // required string rpForServerIP = 3;
      private Object rpForServerIP_ = "";
      public boolean hasRpForServerIP() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getRpForServerIP() {
        Object ref = rpForServerIP_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          rpForServerIP_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setRpForServerIP(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        rpForServerIP_ = value;
        onChanged();
        return this;
      }
      public Builder clearRpForServerIP() {
        bitField0_ = (bitField0_ & ~0x00000004);
        rpForServerIP_ = getDefaultInstance().getRpForServerIP();
        onChanged();
        return this;
      }
      void setRpForServerIP(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        rpForServerIP_ = value;
        onChanged();
      }
      
      // required int32 rpForServerPort = 4;
      private int rpForServerPort_ ;
      public boolean hasRpForServerPort() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getRpForServerPort() {
        return rpForServerPort_;
      }
      public Builder setRpForServerPort(int value) {
        bitField0_ |= 0x00000008;
        rpForServerPort_ = value;
        onChanged();
        return this;
      }
      public Builder clearRpForServerPort() {
        bitField0_ = (bitField0_ & ~0x00000008);
        rpForServerPort_ = 0;
        onChanged();
        return this;
      }
      
      // required string daIP = 5;
      private Object daIP_ = "";
      public boolean hasDaIP() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getDaIP() {
        Object ref = daIP_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          daIP_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setDaIP(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        daIP_ = value;
        onChanged();
        return this;
      }
      public Builder clearDaIP() {
        bitField0_ = (bitField0_ & ~0x00000010);
        daIP_ = getDefaultInstance().getDaIP();
        onChanged();
        return this;
      }
      void setDaIP(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        daIP_ = value;
        onChanged();
      }
      
      // required int32 daPort = 6;
      private int daPort_ ;
      public boolean hasDaPort() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getDaPort() {
        return daPort_;
      }
      public Builder setDaPort(int value) {
        bitField0_ |= 0x00000020;
        daPort_ = value;
        onChanged();
        return this;
      }
      public Builder clearDaPort() {
        bitField0_ = (bitField0_ & ~0x00000020);
        daPort_ = 0;
        onChanged();
        return this;
      }
      
      // repeated .ParameterConfig paras = 7;
      private java.util.List<com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig> paras_ =
        java.util.Collections.emptyList();
      private void ensureParasIsMutable() {
        if (!((bitField0_ & 0x00000040) == 0x00000040)) {
          paras_ = new java.util.ArrayList<com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig>(paras_);
          bitField0_ |= 0x00000040;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig, com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.Builder, com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfigOrBuilder> parasBuilder_;
      
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig> getParasList() {
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
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig getParas(int index) {
        if (parasBuilder_ == null) {
          return paras_.get(index);
        } else {
          return parasBuilder_.getMessage(index);
        }
      }
      public Builder setParas(
          int index, com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig value) {
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
          int index, com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.Builder builderForValue) {
        if (parasBuilder_ == null) {
          ensureParasIsMutable();
          paras_.set(index, builderForValue.build());
          onChanged();
        } else {
          parasBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addParas(com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig value) {
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
          int index, com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig value) {
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
          com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.Builder builderForValue) {
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
          int index, com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.Builder builderForValue) {
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
          Iterable<? extends com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig> values) {
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
          bitField0_ = (bitField0_ & ~0x00000040);
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
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.Builder getParasBuilder(
          int index) {
        return getParasFieldBuilder().getBuilder(index);
      }
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfigOrBuilder getParasOrBuilder(
          int index) {
        if (parasBuilder_ == null) {
          return paras_.get(index);  } else {
          return parasBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfigOrBuilder> 
           getParasOrBuilderList() {
        if (parasBuilder_ != null) {
          return parasBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(paras_);
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.Builder addParasBuilder() {
        return getParasFieldBuilder().addBuilder(
            com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.getDefaultInstance());
      }
      public com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.Builder addParasBuilder(
          int index) {
        return getParasFieldBuilder().addBuilder(
            index, com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.getDefaultInstance());
      }
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.Builder> 
           getParasBuilderList() {
        return getParasFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig, com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.Builder, com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfigOrBuilder> 
          getParasFieldBuilder() {
        if (parasBuilder_ == null) {
          parasBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig, com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfig.Builder, com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.ParameterConfigOrBuilder>(
                  paras_,
                  ((bitField0_ & 0x00000040) == 0x00000040),
                  getParentForChildren(),
                  isClean());
          paras_ = null;
        }
        return parasBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:ConfigForRP)
    }
    
    static {
      defaultInstance = new ConfigForRP(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ConfigForRP)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ConfigForRP_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ConfigForRP_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n-core/proto/services/rp/java/ConfigForR" +
      "P.proto\0325core/proto/services/common/java" +
      "/ParameterConfig.proto\"\232\001\n\013ConfigForRP\022\014" +
      "\n\004dpIP\030\001 \002(\t\022\016\n\006dpPort\030\002 \002(\005\022\025\n\rrpForSer" +
      "verIP\030\003 \002(\t\022\027\n\017rpForServerPort\030\004 \002(\005\022\014\n\004" +
      "daIP\030\005 \002(\t\022\016\n\006daPort\030\006 \002(\005\022\037\n\005paras\030\007 \003(" +
      "\0132\020.ParameterConfigBK\n:com.navinfo.opent" +
      "sp.platform.location.protocol.services.r" +
      "pB\rLCConfigForRP"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ConfigForRP_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ConfigForRP_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ConfigForRP_descriptor,
              new String[] { "DpIP", "DpPort", "RpForServerIP", "RpForServerPort", "DaIP", "DaPort", "Paras", },
              ConfigForRP.class,
              ConfigForRP.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.services.common.LCParameterConfig.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
