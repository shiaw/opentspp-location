// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/dataaccess/common/java/MessageBroadcastSave.proto

package com.navinfo.opentsp.platform.location.protocol.dataaccess.common;

public final class LCMessageBroadcastSave {
  private LCMessageBroadcastSave() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MessageBroadcastSaveOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 terminalId = 1;
    boolean hasTerminalId();
    long getTerminalId();
    
    // required int64 areaIdentify = 2;
    boolean hasAreaIdentify();
    long getAreaIdentify();
    
    // optional int64 broadcastDate = 3;
    boolean hasBroadcastDate();
    long getBroadcastDate();
    
    // optional string broadcastContent = 4;
    boolean hasBroadcastContent();
    String getBroadcastContent();
    
    // optional .MessageSign signs = 5;
    boolean hasSigns();
    com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign getSigns();
    com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSignOrBuilder getSignsOrBuilder();
  }
  public static final class MessageBroadcastSave extends
      com.google.protobuf.GeneratedMessage
      implements MessageBroadcastSaveOrBuilder {
    // Use MessageBroadcastSave.newBuilder() to construct.
    private MessageBroadcastSave(Builder builder) {
      super(builder);
    }
    private MessageBroadcastSave(boolean noInit) {}
    
    private static final MessageBroadcastSave defaultInstance;
    public static MessageBroadcastSave getDefaultInstance() {
      return defaultInstance;
    }
    
    public MessageBroadcastSave getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCMessageBroadcastSave.internal_static_MessageBroadcastSave_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCMessageBroadcastSave.internal_static_MessageBroadcastSave_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 terminalId = 1;
    public static final int TERMINALID_FIELD_NUMBER = 1;
    private long terminalId_;
    public boolean hasTerminalId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getTerminalId() {
      return terminalId_;
    }
    
    // required int64 areaIdentify = 2;
    public static final int AREAIDENTIFY_FIELD_NUMBER = 2;
    private long areaIdentify_;
    public boolean hasAreaIdentify() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getAreaIdentify() {
      return areaIdentify_;
    }
    
    // optional int64 broadcastDate = 3;
    public static final int BROADCASTDATE_FIELD_NUMBER = 3;
    private long broadcastDate_;
    public boolean hasBroadcastDate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getBroadcastDate() {
      return broadcastDate_;
    }
    
    // optional string broadcastContent = 4;
    public static final int BROADCASTCONTENT_FIELD_NUMBER = 4;
    private Object broadcastContent_;
    public boolean hasBroadcastContent() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getBroadcastContent() {
      Object ref = broadcastContent_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          broadcastContent_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getBroadcastContentBytes() {
      Object ref = broadcastContent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        broadcastContent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional .MessageSign signs = 5;
    public static final int SIGNS_FIELD_NUMBER = 5;
    private com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign signs_;
    public boolean hasSigns() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign getSigns() {
      return signs_;
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSignOrBuilder getSignsOrBuilder() {
      return signs_;
    }
    
    private void initFields() {
      terminalId_ = 0L;
      areaIdentify_ = 0L;
      broadcastDate_ = 0L;
      broadcastContent_ = "";
      signs_ = com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTerminalId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAreaIdentify()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasSigns()) {
        if (!getSigns().isInitialized()) {
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
        output.writeInt64(1, terminalId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, areaIdentify_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, broadcastDate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getBroadcastContentBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, signs_);
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
          .computeInt64Size(1, terminalId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, areaIdentify_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, broadcastDate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getBroadcastContentBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, signs_);
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
    
    public static MessageBroadcastSave parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static MessageBroadcastSave parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static MessageBroadcastSave parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static MessageBroadcastSave parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static MessageBroadcastSave parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static MessageBroadcastSave parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static MessageBroadcastSave parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static MessageBroadcastSave parseDelimitedFrom(
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
    public static MessageBroadcastSave parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static MessageBroadcastSave parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MessageBroadcastSave prototype) {
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
       implements MessageBroadcastSaveOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCMessageBroadcastSave.internal_static_MessageBroadcastSave_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCMessageBroadcastSave.internal_static_MessageBroadcastSave_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCMessageBroadcastSave.MessageBroadcastSave.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getSignsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        terminalId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        areaIdentify_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        broadcastDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        broadcastContent_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        if (signsBuilder_ == null) {
          signs_ = com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.getDefaultInstance();
        } else {
          signsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MessageBroadcastSave.getDescriptor();
      }
      
      public MessageBroadcastSave getDefaultInstanceForType() {
        return MessageBroadcastSave.getDefaultInstance();
      }
      
      public MessageBroadcastSave build() {
        MessageBroadcastSave result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private MessageBroadcastSave buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        MessageBroadcastSave result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public MessageBroadcastSave buildPartial() {
        MessageBroadcastSave result = new MessageBroadcastSave(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.terminalId_ = terminalId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.areaIdentify_ = areaIdentify_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.broadcastDate_ = broadcastDate_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.broadcastContent_ = broadcastContent_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (signsBuilder_ == null) {
          result.signs_ = signs_;
        } else {
          result.signs_ = signsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MessageBroadcastSave) {
          return mergeFrom((MessageBroadcastSave)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(MessageBroadcastSave other) {
        if (other == MessageBroadcastSave.getDefaultInstance()) return this;
        if (other.hasTerminalId()) {
          setTerminalId(other.getTerminalId());
        }
        if (other.hasAreaIdentify()) {
          setAreaIdentify(other.getAreaIdentify());
        }
        if (other.hasBroadcastDate()) {
          setBroadcastDate(other.getBroadcastDate());
        }
        if (other.hasBroadcastContent()) {
          setBroadcastContent(other.getBroadcastContent());
        }
        if (other.hasSigns()) {
          mergeSigns(other.getSigns());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTerminalId()) {
          
          return false;
        }
        if (!hasAreaIdentify()) {
          
          return false;
        }
        if (hasSigns()) {
          if (!getSigns().isInitialized()) {
            
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
              terminalId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              areaIdentify_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              broadcastDate_ = input.readInt64();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              broadcastContent_ = input.readBytes();
              break;
            }
            case 42: {
              com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.newBuilder();
              if (hasSigns()) {
                subBuilder.mergeFrom(getSigns());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setSigns(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 terminalId = 1;
      private long terminalId_ ;
      public boolean hasTerminalId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getTerminalId() {
        return terminalId_;
      }
      public Builder setTerminalId(long value) {
        bitField0_ |= 0x00000001;
        terminalId_ = value;
        onChanged();
        return this;
      }
      public Builder clearTerminalId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        terminalId_ = 0L;
        onChanged();
        return this;
      }
      
      // required int64 areaIdentify = 2;
      private long areaIdentify_ ;
      public boolean hasAreaIdentify() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getAreaIdentify() {
        return areaIdentify_;
      }
      public Builder setAreaIdentify(long value) {
        bitField0_ |= 0x00000002;
        areaIdentify_ = value;
        onChanged();
        return this;
      }
      public Builder clearAreaIdentify() {
        bitField0_ = (bitField0_ & ~0x00000002);
        areaIdentify_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 broadcastDate = 3;
      private long broadcastDate_ ;
      public boolean hasBroadcastDate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getBroadcastDate() {
        return broadcastDate_;
      }
      public Builder setBroadcastDate(long value) {
        bitField0_ |= 0x00000004;
        broadcastDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearBroadcastDate() {
        bitField0_ = (bitField0_ & ~0x00000004);
        broadcastDate_ = 0L;
        onChanged();
        return this;
      }
      
      // optional string broadcastContent = 4;
      private Object broadcastContent_ = "";
      public boolean hasBroadcastContent() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getBroadcastContent() {
        Object ref = broadcastContent_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          broadcastContent_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setBroadcastContent(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        broadcastContent_ = value;
        onChanged();
        return this;
      }
      public Builder clearBroadcastContent() {
        bitField0_ = (bitField0_ & ~0x00000008);
        broadcastContent_ = getDefaultInstance().getBroadcastContent();
        onChanged();
        return this;
      }
      void setBroadcastContent(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        broadcastContent_ = value;
        onChanged();
      }
      
      // optional .MessageSign signs = 5;
      private com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign signs_ = com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign, com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSignOrBuilder> signsBuilder_;
      public boolean hasSigns() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign getSigns() {
        if (signsBuilder_ == null) {
          return signs_;
        } else {
          return signsBuilder_.getMessage();
        }
      }
      public Builder setSigns(com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign value) {
        if (signsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          signs_ = value;
          onChanged();
        } else {
          signsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      public Builder setSigns(
          com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.Builder builderForValue) {
        if (signsBuilder_ == null) {
          signs_ = builderForValue.build();
          onChanged();
        } else {
          signsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      public Builder mergeSigns(com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign value) {
        if (signsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010) &&
              signs_ != com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.getDefaultInstance()) {
            signs_ =
              com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.newBuilder(signs_).mergeFrom(value).buildPartial();
          } else {
            signs_ = value;
          }
          onChanged();
        } else {
          signsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      public Builder clearSigns() {
        if (signsBuilder_ == null) {
          signs_ = com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.getDefaultInstance();
          onChanged();
        } else {
          signsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.Builder getSignsBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getSignsFieldBuilder().getBuilder();
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSignOrBuilder getSignsOrBuilder() {
        if (signsBuilder_ != null) {
          return signsBuilder_.getMessageOrBuilder();
        } else {
          return signs_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign, com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSignOrBuilder> 
          getSignsFieldBuilder() {
        if (signsBuilder_ == null) {
          signsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign, com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSign.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.MessageSignOrBuilder>(
                  signs_,
                  getParentForChildren(),
                  isClean());
          signs_ = null;
        }
        return signsBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:MessageBroadcastSave)
    }
    
    static {
      defaultInstance = new MessageBroadcastSave(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:MessageBroadcastSave)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageBroadcastSave_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MessageBroadcastSave_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n<core/proto/dataaccess/common/java/Mess" +
      "ageBroadcastSave.proto\032(core/proto/commo" +
      "n/java/MessageSign.proto\"\216\001\n\024MessageBroa" +
      "dcastSave\022\022\n\nterminalId\030\001 \002(\003\022\024\n\014areaIde" +
      "ntify\030\002 \002(\003\022\025\n\rbroadcastDate\030\003 \001(\003\022\030\n\020br" +
      "oadcastContent\030\004 \001(\t\022\033\n\005signs\030\005 \001(\0132\014.Me" +
      "ssageSignBZ\n@com.navinfo.opentsp.platfor" +
      "m.location.protocol.dataaccess.commonB\026L" +
      "CMessageBroadcastSave"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_MessageBroadcastSave_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_MessageBroadcastSave_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MessageBroadcastSave_descriptor,
              new String[] { "TerminalId", "AreaIdentify", "BroadcastDate", "BroadcastContent", "Signs", },
              MessageBroadcastSave.class,
              MessageBroadcastSave.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.common.LCMessageSign.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
