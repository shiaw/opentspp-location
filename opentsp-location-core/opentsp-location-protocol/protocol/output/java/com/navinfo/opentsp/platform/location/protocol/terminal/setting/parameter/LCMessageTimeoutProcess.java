// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/setting/parameter/java/MessageTimeoutProcess.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter;

public final class LCMessageTimeoutProcess {
  private LCMessageTimeoutProcess() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MessageTimeoutProcessOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 heartbeatInterval = 1;
    boolean hasHeartbeatInterval();
    int getHeartbeatInterval();
    
    // optional int32 tcpResponseTimeout = 2;
    boolean hasTcpResponseTimeout();
    int getTcpResponseTimeout();
    
    // optional int32 tcpRetransTimes = 3;
    boolean hasTcpRetransTimes();
    int getTcpRetransTimes();
    
    // optional int32 udpResponseTimeout = 4;
    boolean hasUdpResponseTimeout();
    int getUdpResponseTimeout();
    
    // optional int32 udpRetransTimes = 5;
    boolean hasUdpRetransTimes();
    int getUdpRetransTimes();
    
    // optional int32 smsResponseTimeout = 6;
    boolean hasSmsResponseTimeout();
    int getSmsResponseTimeout();
    
    // optional int32 smsRetransTimes = 7;
    boolean hasSmsRetransTimes();
    int getSmsRetransTimes();
  }
  public static final class MessageTimeoutProcess extends
      com.google.protobuf.GeneratedMessage
      implements MessageTimeoutProcessOrBuilder {
    // Use MessageTimeoutProcess.newBuilder() to construct.
    private MessageTimeoutProcess(Builder builder) {
      super(builder);
    }
    private MessageTimeoutProcess(boolean noInit) {}
    
    private static final MessageTimeoutProcess defaultInstance;
    public static MessageTimeoutProcess getDefaultInstance() {
      return defaultInstance;
    }
    
    public MessageTimeoutProcess getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.internal_static_MessageTimeoutProcess_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.internal_static_MessageTimeoutProcess_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int32 heartbeatInterval = 1;
    public static final int HEARTBEATINTERVAL_FIELD_NUMBER = 1;
    private int heartbeatInterval_;
    public boolean hasHeartbeatInterval() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getHeartbeatInterval() {
      return heartbeatInterval_;
    }
    
    // optional int32 tcpResponseTimeout = 2;
    public static final int TCPRESPONSETIMEOUT_FIELD_NUMBER = 2;
    private int tcpResponseTimeout_;
    public boolean hasTcpResponseTimeout() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getTcpResponseTimeout() {
      return tcpResponseTimeout_;
    }
    
    // optional int32 tcpRetransTimes = 3;
    public static final int TCPRETRANSTIMES_FIELD_NUMBER = 3;
    private int tcpRetransTimes_;
    public boolean hasTcpRetransTimes() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getTcpRetransTimes() {
      return tcpRetransTimes_;
    }
    
    // optional int32 udpResponseTimeout = 4;
    public static final int UDPRESPONSETIMEOUT_FIELD_NUMBER = 4;
    private int udpResponseTimeout_;
    public boolean hasUdpResponseTimeout() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getUdpResponseTimeout() {
      return udpResponseTimeout_;
    }
    
    // optional int32 udpRetransTimes = 5;
    public static final int UDPRETRANSTIMES_FIELD_NUMBER = 5;
    private int udpRetransTimes_;
    public boolean hasUdpRetransTimes() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getUdpRetransTimes() {
      return udpRetransTimes_;
    }
    
    // optional int32 smsResponseTimeout = 6;
    public static final int SMSRESPONSETIMEOUT_FIELD_NUMBER = 6;
    private int smsResponseTimeout_;
    public boolean hasSmsResponseTimeout() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getSmsResponseTimeout() {
      return smsResponseTimeout_;
    }
    
    // optional int32 smsRetransTimes = 7;
    public static final int SMSRETRANSTIMES_FIELD_NUMBER = 7;
    private int smsRetransTimes_;
    public boolean hasSmsRetransTimes() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getSmsRetransTimes() {
      return smsRetransTimes_;
    }
    
    private void initFields() {
      heartbeatInterval_ = 0;
      tcpResponseTimeout_ = 0;
      tcpRetransTimes_ = 0;
      udpResponseTimeout_ = 0;
      udpRetransTimes_ = 0;
      smsResponseTimeout_ = 0;
      smsRetransTimes_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, heartbeatInterval_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, tcpResponseTimeout_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, tcpRetransTimes_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, udpResponseTimeout_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, udpRetransTimes_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, smsResponseTimeout_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, smsRetransTimes_);
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
          .computeInt32Size(1, heartbeatInterval_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, tcpResponseTimeout_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, tcpRetransTimes_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, udpResponseTimeout_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, udpRetransTimes_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, smsResponseTimeout_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, smsRetransTimes_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcessOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.internal_static_MessageTimeoutProcess_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.internal_static_MessageTimeoutProcess_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        heartbeatInterval_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        tcpResponseTimeout_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        tcpRetransTimes_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        udpResponseTimeout_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        udpRetransTimes_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        smsResponseTimeout_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        smsRetransTimes_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess build() {
        com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess result = new com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.heartbeatInterval_ = heartbeatInterval_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.tcpResponseTimeout_ = tcpResponseTimeout_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.tcpRetransTimes_ = tcpRetransTimes_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.udpResponseTimeout_ = udpResponseTimeout_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.udpRetransTimes_ = udpRetransTimes_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.smsResponseTimeout_ = smsResponseTimeout_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.smsRetransTimes_ = smsRetransTimes_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess.getDefaultInstance()) return this;
        if (other.hasHeartbeatInterval()) {
          setHeartbeatInterval(other.getHeartbeatInterval());
        }
        if (other.hasTcpResponseTimeout()) {
          setTcpResponseTimeout(other.getTcpResponseTimeout());
        }
        if (other.hasTcpRetransTimes()) {
          setTcpRetransTimes(other.getTcpRetransTimes());
        }
        if (other.hasUdpResponseTimeout()) {
          setUdpResponseTimeout(other.getUdpResponseTimeout());
        }
        if (other.hasUdpRetransTimes()) {
          setUdpRetransTimes(other.getUdpRetransTimes());
        }
        if (other.hasSmsResponseTimeout()) {
          setSmsResponseTimeout(other.getSmsResponseTimeout());
        }
        if (other.hasSmsRetransTimes()) {
          setSmsRetransTimes(other.getSmsRetransTimes());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
              heartbeatInterval_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              tcpResponseTimeout_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              tcpRetransTimes_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              udpResponseTimeout_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              udpRetransTimes_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              smsResponseTimeout_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              smsRetransTimes_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 heartbeatInterval = 1;
      private int heartbeatInterval_ ;
      public boolean hasHeartbeatInterval() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getHeartbeatInterval() {
        return heartbeatInterval_;
      }
      public Builder setHeartbeatInterval(int value) {
        bitField0_ |= 0x00000001;
        heartbeatInterval_ = value;
        onChanged();
        return this;
      }
      public Builder clearHeartbeatInterval() {
        bitField0_ = (bitField0_ & ~0x00000001);
        heartbeatInterval_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 tcpResponseTimeout = 2;
      private int tcpResponseTimeout_ ;
      public boolean hasTcpResponseTimeout() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getTcpResponseTimeout() {
        return tcpResponseTimeout_;
      }
      public Builder setTcpResponseTimeout(int value) {
        bitField0_ |= 0x00000002;
        tcpResponseTimeout_ = value;
        onChanged();
        return this;
      }
      public Builder clearTcpResponseTimeout() {
        bitField0_ = (bitField0_ & ~0x00000002);
        tcpResponseTimeout_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 tcpRetransTimes = 3;
      private int tcpRetransTimes_ ;
      public boolean hasTcpRetransTimes() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getTcpRetransTimes() {
        return tcpRetransTimes_;
      }
      public Builder setTcpRetransTimes(int value) {
        bitField0_ |= 0x00000004;
        tcpRetransTimes_ = value;
        onChanged();
        return this;
      }
      public Builder clearTcpRetransTimes() {
        bitField0_ = (bitField0_ & ~0x00000004);
        tcpRetransTimes_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 udpResponseTimeout = 4;
      private int udpResponseTimeout_ ;
      public boolean hasUdpResponseTimeout() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getUdpResponseTimeout() {
        return udpResponseTimeout_;
      }
      public Builder setUdpResponseTimeout(int value) {
        bitField0_ |= 0x00000008;
        udpResponseTimeout_ = value;
        onChanged();
        return this;
      }
      public Builder clearUdpResponseTimeout() {
        bitField0_ = (bitField0_ & ~0x00000008);
        udpResponseTimeout_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 udpRetransTimes = 5;
      private int udpRetransTimes_ ;
      public boolean hasUdpRetransTimes() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getUdpRetransTimes() {
        return udpRetransTimes_;
      }
      public Builder setUdpRetransTimes(int value) {
        bitField0_ |= 0x00000010;
        udpRetransTimes_ = value;
        onChanged();
        return this;
      }
      public Builder clearUdpRetransTimes() {
        bitField0_ = (bitField0_ & ~0x00000010);
        udpRetransTimes_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 smsResponseTimeout = 6;
      private int smsResponseTimeout_ ;
      public boolean hasSmsResponseTimeout() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getSmsResponseTimeout() {
        return smsResponseTimeout_;
      }
      public Builder setSmsResponseTimeout(int value) {
        bitField0_ |= 0x00000020;
        smsResponseTimeout_ = value;
        onChanged();
        return this;
      }
      public Builder clearSmsResponseTimeout() {
        bitField0_ = (bitField0_ & ~0x00000020);
        smsResponseTimeout_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 smsRetransTimes = 7;
      private int smsRetransTimes_ ;
      public boolean hasSmsRetransTimes() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getSmsRetransTimes() {
        return smsRetransTimes_;
      }
      public Builder setSmsRetransTimes(int value) {
        bitField0_ |= 0x00000040;
        smsRetransTimes_ = value;
        onChanged();
        return this;
      }
      public Builder clearSmsRetransTimes() {
        bitField0_ = (bitField0_ & ~0x00000040);
        smsRetransTimes_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:MessageTimeoutProcess)
    }
    
    static {
      defaultInstance = new MessageTimeoutProcess(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:MessageTimeoutProcess)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageTimeoutProcess_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MessageTimeoutProcess_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFcore/proto/terminal/setting/parameter/" +
      "java/MessageTimeoutProcess.proto\"\321\001\n\025Mes" +
      "sageTimeoutProcess\022\031\n\021heartbeatInterval\030" +
      "\001 \001(\005\022\032\n\022tcpResponseTimeout\030\002 \001(\005\022\027\n\017tcp" +
      "RetransTimes\030\003 \001(\005\022\032\n\022udpResponseTimeout" +
      "\030\004 \001(\005\022\027\n\017udpRetransTimes\030\005 \001(\005\022\032\n\022smsRe" +
      "sponseTimeout\030\006 \001(\005\022\027\n\017smsRetransTimes\030\007" +
      " \001(\005Bd\nIcom.navinfo.opentsp.platform.loc" +
      "ation.protocol.terminal.setting.paramete" +
      "rB\027LCMessageTimeoutProcess"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_MessageTimeoutProcess_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_MessageTimeoutProcess_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MessageTimeoutProcess_descriptor,
              new java.lang.String[] { "HeartbeatInterval", "TcpResponseTimeout", "TcpRetransTimes", "UdpResponseTimeout", "UdpRetransTimes", "SmsResponseTimeout", "SmsRetransTimes", },
              com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess.class,
              com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCMessageTimeoutProcess.MessageTimeoutProcess.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
