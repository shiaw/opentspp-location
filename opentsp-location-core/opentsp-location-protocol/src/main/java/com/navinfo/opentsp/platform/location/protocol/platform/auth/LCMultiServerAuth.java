// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/platform/auth/java/MultiServerAuth.proto

package com.navinfo.opentsp.platform.location.protocol.platform.auth;

public final class LCMultiServerAuth {
  private LCMultiServerAuth() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MultiServerAuthOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated string serverIp = 1;
    java.util.List<String> getServerIpList();
    int getServerIpCount();
    String getServerIp(int index);
    
    // optional string channelIdentify = 2;
    boolean hasChannelIdentify();
    String getChannelIdentify();
  }
  public static final class MultiServerAuth extends
      com.google.protobuf.GeneratedMessage
      implements MultiServerAuthOrBuilder {
    // Use MultiServerAuth.newBuilder() to construct.
    private MultiServerAuth(Builder builder) {
      super(builder);
    }
    private MultiServerAuth(boolean noInit) {}
    
    private static final MultiServerAuth defaultInstance;
    public static MultiServerAuth getDefaultInstance() {
      return defaultInstance;
    }
    
    public MultiServerAuth getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCMultiServerAuth.internal_static_MultiServerAuth_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCMultiServerAuth.internal_static_MultiServerAuth_fieldAccessorTable;
    }
    
    private int bitField0_;
    // repeated string serverIp = 1;
    public static final int SERVERIP_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList serverIp_;
    public java.util.List<String>
        getServerIpList() {
      return serverIp_;
    }
    public int getServerIpCount() {
      return serverIp_.size();
    }
    public String getServerIp(int index) {
      return serverIp_.get(index);
    }
    
    // optional string channelIdentify = 2;
    public static final int CHANNELIDENTIFY_FIELD_NUMBER = 2;
    private Object channelIdentify_;
    public boolean hasChannelIdentify() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getChannelIdentify() {
      Object ref = channelIdentify_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          channelIdentify_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getChannelIdentifyBytes() {
      Object ref = channelIdentify_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        channelIdentify_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      serverIp_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      channelIdentify_ = "";
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
      for (int i = 0; i < serverIp_.size(); i++) {
        output.writeBytes(1, serverIp_.getByteString(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(2, getChannelIdentifyBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < serverIp_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(serverIp_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getServerIpList().size();
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getChannelIdentifyBytes());
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
    
    public static MultiServerAuth parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static MultiServerAuth parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static MultiServerAuth parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static MultiServerAuth parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static MultiServerAuth parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static MultiServerAuth parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static MultiServerAuth parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static MultiServerAuth parseDelimitedFrom(
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
    public static MultiServerAuth parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static MultiServerAuth parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MultiServerAuth prototype) {
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
       implements MultiServerAuthOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCMultiServerAuth.internal_static_MultiServerAuth_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCMultiServerAuth.internal_static_MultiServerAuth_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.platform.auth.LCMultiServerAuth.MultiServerAuth.newBuilder()
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
        serverIp_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        channelIdentify_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MultiServerAuth.getDescriptor();
      }
      
      public MultiServerAuth getDefaultInstanceForType() {
        return MultiServerAuth.getDefaultInstance();
      }
      
      public MultiServerAuth build() {
        MultiServerAuth result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private MultiServerAuth buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        MultiServerAuth result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public MultiServerAuth buildPartial() {
        MultiServerAuth result = new MultiServerAuth(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          serverIp_ = new com.google.protobuf.UnmodifiableLazyStringList(
              serverIp_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.serverIp_ = serverIp_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        result.channelIdentify_ = channelIdentify_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MultiServerAuth) {
          return mergeFrom((MultiServerAuth)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(MultiServerAuth other) {
        if (other == MultiServerAuth.getDefaultInstance()) return this;
        if (!other.serverIp_.isEmpty()) {
          if (serverIp_.isEmpty()) {
            serverIp_ = other.serverIp_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServerIpIsMutable();
            serverIp_.addAll(other.serverIp_);
          }
          onChanged();
        }
        if (other.hasChannelIdentify()) {
          setChannelIdentify(other.getChannelIdentify());
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
            case 10: {
              ensureServerIpIsMutable();
              serverIp_.add(input.readBytes());
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              channelIdentify_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated string serverIp = 1;
      private com.google.protobuf.LazyStringList serverIp_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureServerIpIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          serverIp_ = new com.google.protobuf.LazyStringArrayList(serverIp_);
          bitField0_ |= 0x00000001;
         }
      }
      public java.util.List<String>
          getServerIpList() {
        return java.util.Collections.unmodifiableList(serverIp_);
      }
      public int getServerIpCount() {
        return serverIp_.size();
      }
      public String getServerIp(int index) {
        return serverIp_.get(index);
      }
      public Builder setServerIp(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureServerIpIsMutable();
        serverIp_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addServerIp(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureServerIpIsMutable();
        serverIp_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllServerIp(
          Iterable<String> values) {
        ensureServerIpIsMutable();
        super.addAll(values, serverIp_);
        onChanged();
        return this;
      }
      public Builder clearServerIp() {
        serverIp_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      void addServerIp(com.google.protobuf.ByteString value) {
        ensureServerIpIsMutable();
        serverIp_.add(value);
        onChanged();
      }
      
      // optional string channelIdentify = 2;
      private Object channelIdentify_ = "";
      public boolean hasChannelIdentify() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getChannelIdentify() {
        Object ref = channelIdentify_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          channelIdentify_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setChannelIdentify(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        channelIdentify_ = value;
        onChanged();
        return this;
      }
      public Builder clearChannelIdentify() {
        bitField0_ = (bitField0_ & ~0x00000002);
        channelIdentify_ = getDefaultInstance().getChannelIdentify();
        onChanged();
        return this;
      }
      void setChannelIdentify(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        channelIdentify_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:MultiServerAuth)
    }
    
    static {
      defaultInstance = new MultiServerAuth(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:MultiServerAuth)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MultiServerAuth_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MultiServerAuth_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n3core/proto/platform/auth/java/MultiSer" +
      "verAuth.proto\"<\n\017MultiServerAuth\022\020\n\010serv" +
      "erIp\030\001 \003(\t\022\027\n\017channelIdentify\030\002 \001(\tBQ\n<c" +
      "om.navinfo.opentsp.platform.location.pro" +
      "tocol.platform.authB\021LCMultiServerAuth"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_MultiServerAuth_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_MultiServerAuth_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MultiServerAuth_descriptor,
              new String[] { "ServerIp", "ChannelIdentify", },
              MultiServerAuth.class,
              MultiServerAuth.Builder.class);
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
