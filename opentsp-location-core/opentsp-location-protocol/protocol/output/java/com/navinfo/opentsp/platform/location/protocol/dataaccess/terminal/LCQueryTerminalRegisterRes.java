// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/dataaccess/terminal/java/QueryTerminalRegisterRes.proto

package com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal;

public final class LCQueryTerminalRegisterRes {
  private LCQueryTerminalRegisterRes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface QueryTerminalRegisterResOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 serialNumber = 1;
    boolean hasSerialNumber();
    int getSerialNumber();
    
    // required .PlatformResponseResult results = 2;
    boolean hasResults();
    com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult getResults();
    
    // optional .TerminalRegisterSave info = 3;
    boolean hasInfo();
    com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave getInfo();
    com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSaveOrBuilder getInfoOrBuilder();
  }
  public static final class QueryTerminalRegisterRes extends
      com.google.protobuf.GeneratedMessage
      implements QueryTerminalRegisterResOrBuilder {
    // Use QueryTerminalRegisterRes.newBuilder() to construct.
    private QueryTerminalRegisterRes(Builder builder) {
      super(builder);
    }
    private QueryTerminalRegisterRes(boolean noInit) {}
    
    private static final QueryTerminalRegisterRes defaultInstance;
    public static QueryTerminalRegisterRes getDefaultInstance() {
      return defaultInstance;
    }
    
    public QueryTerminalRegisterRes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.internal_static_QueryTerminalRegisterRes_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.internal_static_QueryTerminalRegisterRes_fieldAccessorTable;
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
    
    // required .PlatformResponseResult results = 2;
    public static final int RESULTS_FIELD_NUMBER = 2;
    private com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult results_;
    public boolean hasResults() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult getResults() {
      return results_;
    }
    
    // optional .TerminalRegisterSave info = 3;
    public static final int INFO_FIELD_NUMBER = 3;
    private com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave info_;
    public boolean hasInfo() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave getInfo() {
      return info_;
    }
    public com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSaveOrBuilder getInfoOrBuilder() {
      return info_;
    }
    
    private void initFields() {
      serialNumber_ = 0;
      results_ = com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult.failure;
      info_ = com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSerialNumber()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasResults()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasInfo()) {
        if (!getInfo().isInitialized()) {
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
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, results_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, info_);
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
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, results_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, info_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.internal_static_QueryTerminalRegisterRes_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.internal_static_QueryTerminalRegisterRes_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        serialNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        results_ = com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult.failure;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (infoBuilder_ == null) {
          info_ = com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.getDefaultInstance();
        } else {
          infoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes build() {
        com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes result = new com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.serialNumber_ = serialNumber_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.results_ = results_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (infoBuilder_ == null) {
          result.info_ = info_;
        } else {
          result.info_ = infoBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes.getDefaultInstance()) return this;
        if (other.hasSerialNumber()) {
          setSerialNumber(other.getSerialNumber());
        }
        if (other.hasResults()) {
          setResults(other.getResults());
        }
        if (other.hasInfo()) {
          mergeInfo(other.getInfo());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSerialNumber()) {
          
          return false;
        }
        if (!hasResults()) {
          
          return false;
        }
        if (hasInfo()) {
          if (!getInfo().isInitialized()) {
            
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
            case 16: {
              int rawValue = input.readEnum();
              com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult value = com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                results_ = value;
              }
              break;
            }
            case 26: {
              com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.newBuilder();
              if (hasInfo()) {
                subBuilder.mergeFrom(getInfo());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setInfo(subBuilder.buildPartial());
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
      
      // required .PlatformResponseResult results = 2;
      private com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult results_ = com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult.failure;
      public boolean hasResults() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult getResults() {
        return results_;
      }
      public Builder setResults(com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        results_ = value;
        onChanged();
        return this;
      }
      public Builder clearResults() {
        bitField0_ = (bitField0_ & ~0x00000002);
        results_ = com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult.failure;
        onChanged();
        return this;
      }
      
      // optional .TerminalRegisterSave info = 3;
      private com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave info_ = com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave, com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.Builder, com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSaveOrBuilder> infoBuilder_;
      public boolean hasInfo() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave getInfo() {
        if (infoBuilder_ == null) {
          return info_;
        } else {
          return infoBuilder_.getMessage();
        }
      }
      public Builder setInfo(com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave value) {
        if (infoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          info_ = value;
          onChanged();
        } else {
          infoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder setInfo(
          com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.Builder builderForValue) {
        if (infoBuilder_ == null) {
          info_ = builderForValue.build();
          onChanged();
        } else {
          infoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder mergeInfo(com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave value) {
        if (infoBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              info_ != com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.getDefaultInstance()) {
            info_ =
              com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.newBuilder(info_).mergeFrom(value).buildPartial();
          } else {
            info_ = value;
          }
          onChanged();
        } else {
          infoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder clearInfo() {
        if (infoBuilder_ == null) {
          info_ = com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.getDefaultInstance();
          onChanged();
        } else {
          infoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.Builder getInfoBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getInfoFieldBuilder().getBuilder();
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSaveOrBuilder getInfoOrBuilder() {
        if (infoBuilder_ != null) {
          return infoBuilder_.getMessageOrBuilder();
        } else {
          return info_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave, com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.Builder, com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSaveOrBuilder> 
          getInfoFieldBuilder() {
        if (infoBuilder_ == null) {
          infoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave, com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSave.Builder, com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.TerminalRegisterSaveOrBuilder>(
                  info_,
                  getParentForChildren(),
                  isClean());
          info_ = null;
        }
        return infoBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:QueryTerminalRegisterRes)
    }
    
    static {
      defaultInstance = new QueryTerminalRegisterRes(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:QueryTerminalRegisterRes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_QueryTerminalRegisterRes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_QueryTerminalRegisterRes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBcore/proto/dataaccess/terminal/java/Qu" +
      "eryTerminalRegisterRes.proto\0323core/proto" +
      "/common/java/PlatformResponseResult.prot" +
      "o\032>core/proto/dataaccess/terminal/java/T" +
      "erminalRegisterSave.proto\"\177\n\030QueryTermin" +
      "alRegisterRes\022\024\n\014serialNumber\030\001 \002(\005\022(\n\007r" +
      "esults\030\002 \002(\0162\027.PlatformResponseResult\022#\n" +
      "\004info\030\003 \001(\0132\025.TerminalRegisterSaveB`\nBco" +
      "m.navinfo.opentsp.platform.location.prot" +
      "ocol.dataaccess.terminalB\032LCQueryTermina",
      "lRegisterRes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_QueryTerminalRegisterRes_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_QueryTerminalRegisterRes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_QueryTerminalRegisterRes_descriptor,
              new java.lang.String[] { "SerialNumber", "Results", "Info", },
              com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes.class,
              com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCQueryTerminalRegisterRes.QueryTerminalRegisterRes.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.getDescriptor(),
          com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCTerminalRegisterSave.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
