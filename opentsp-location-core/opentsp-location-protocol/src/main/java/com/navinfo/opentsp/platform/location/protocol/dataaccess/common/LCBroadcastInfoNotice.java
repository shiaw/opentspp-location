// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/dataaccess/common/java/BroadcastInfoNotice.proto

package com.navinfo.opentsp.platform.location.protocol.dataaccess.common;

public final class LCBroadcastInfoNotice {
  private LCBroadcastInfoNotice() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BroadcastInfoNoticeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 areaIdentify = 1;
    boolean hasAreaIdentify();
    long getAreaIdentify();
    
    // required string broadcastContent = 2;
    boolean hasBroadcastContent();
    String getBroadcastContent();
  }
  public static final class BroadcastInfoNotice extends
      com.google.protobuf.GeneratedMessage
      implements BroadcastInfoNoticeOrBuilder {
    // Use BroadcastInfoNotice.newBuilder() to construct.
    private BroadcastInfoNotice(Builder builder) {
      super(builder);
    }
    private BroadcastInfoNotice(boolean noInit) {}
    
    private static final BroadcastInfoNotice defaultInstance;
    public static BroadcastInfoNotice getDefaultInstance() {
      return defaultInstance;
    }
    
    public BroadcastInfoNotice getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCBroadcastInfoNotice.internal_static_BroadcastInfoNotice_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCBroadcastInfoNotice.internal_static_BroadcastInfoNotice_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 areaIdentify = 1;
    public static final int AREAIDENTIFY_FIELD_NUMBER = 1;
    private long areaIdentify_;
    public boolean hasAreaIdentify() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getAreaIdentify() {
      return areaIdentify_;
    }
    
    // required string broadcastContent = 2;
    public static final int BROADCASTCONTENT_FIELD_NUMBER = 2;
    private Object broadcastContent_;
    public boolean hasBroadcastContent() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
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
    
    private void initFields() {
      areaIdentify_ = 0L;
      broadcastContent_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasAreaIdentify()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBroadcastContent()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, areaIdentify_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getBroadcastContentBytes());
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
          .computeInt64Size(1, areaIdentify_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getBroadcastContentBytes());
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
    
    public static BroadcastInfoNotice parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static BroadcastInfoNotice parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static BroadcastInfoNotice parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static BroadcastInfoNotice parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static BroadcastInfoNotice parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static BroadcastInfoNotice parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static BroadcastInfoNotice parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static BroadcastInfoNotice parseDelimitedFrom(
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
    public static BroadcastInfoNotice parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static BroadcastInfoNotice parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(BroadcastInfoNotice prototype) {
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
       implements BroadcastInfoNoticeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCBroadcastInfoNotice.internal_static_BroadcastInfoNotice_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCBroadcastInfoNotice.internal_static_BroadcastInfoNotice_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCBroadcastInfoNotice.BroadcastInfoNotice.newBuilder()
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
        areaIdentify_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        broadcastContent_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BroadcastInfoNotice.getDescriptor();
      }
      
      public BroadcastInfoNotice getDefaultInstanceForType() {
        return BroadcastInfoNotice.getDefaultInstance();
      }
      
      public BroadcastInfoNotice build() {
        BroadcastInfoNotice result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private BroadcastInfoNotice buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        BroadcastInfoNotice result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public BroadcastInfoNotice buildPartial() {
        BroadcastInfoNotice result = new BroadcastInfoNotice(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.areaIdentify_ = areaIdentify_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.broadcastContent_ = broadcastContent_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BroadcastInfoNotice) {
          return mergeFrom((BroadcastInfoNotice)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(BroadcastInfoNotice other) {
        if (other == BroadcastInfoNotice.getDefaultInstance()) return this;
        if (other.hasAreaIdentify()) {
          setAreaIdentify(other.getAreaIdentify());
        }
        if (other.hasBroadcastContent()) {
          setBroadcastContent(other.getBroadcastContent());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasAreaIdentify()) {
          
          return false;
        }
        if (!hasBroadcastContent()) {
          
          return false;
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
              areaIdentify_ = input.readInt64();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              broadcastContent_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 areaIdentify = 1;
      private long areaIdentify_ ;
      public boolean hasAreaIdentify() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getAreaIdentify() {
        return areaIdentify_;
      }
      public Builder setAreaIdentify(long value) {
        bitField0_ |= 0x00000001;
        areaIdentify_ = value;
        onChanged();
        return this;
      }
      public Builder clearAreaIdentify() {
        bitField0_ = (bitField0_ & ~0x00000001);
        areaIdentify_ = 0L;
        onChanged();
        return this;
      }
      
      // required string broadcastContent = 2;
      private Object broadcastContent_ = "";
      public boolean hasBroadcastContent() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
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
  bitField0_ |= 0x00000002;
        broadcastContent_ = value;
        onChanged();
        return this;
      }
      public Builder clearBroadcastContent() {
        bitField0_ = (bitField0_ & ~0x00000002);
        broadcastContent_ = getDefaultInstance().getBroadcastContent();
        onChanged();
        return this;
      }
      void setBroadcastContent(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        broadcastContent_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:BroadcastInfoNotice)
    }
    
    static {
      defaultInstance = new BroadcastInfoNotice(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:BroadcastInfoNotice)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_BroadcastInfoNotice_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BroadcastInfoNotice_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n;core/proto/dataaccess/common/java/Broa" +
      "dcastInfoNotice.proto\"E\n\023BroadcastInfoNo" +
      "tice\022\024\n\014areaIdentify\030\001 \002(\003\022\030\n\020broadcastC" +
      "ontent\030\002 \002(\tBY\n@com.navinfo.opentsp.plat" +
      "form.location.protocol.dataaccess.common" +
      "B\025LCBroadcastInfoNotice"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_BroadcastInfoNotice_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_BroadcastInfoNotice_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_BroadcastInfoNotice_descriptor,
              new String[] { "AreaIdentify", "BroadcastContent", },
              BroadcastInfoNotice.class,
              BroadcastInfoNotice.Builder.class);
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
