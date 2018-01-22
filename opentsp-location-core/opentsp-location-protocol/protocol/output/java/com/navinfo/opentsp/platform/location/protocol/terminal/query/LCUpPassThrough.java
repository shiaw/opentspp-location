// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/query/java/UpPassThrough.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.query;

public final class LCUpPassThrough {
  private LCUpPassThrough() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UpPassThroughOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .PassType types = 1;
    boolean hasTypes();
    com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.PassType getTypes();
    
    // required string passContents = 2;
    boolean hasPassContents();
    String getPassContents();
  }
  public static final class UpPassThrough extends
      com.google.protobuf.GeneratedMessage
      implements UpPassThroughOrBuilder {
    // Use UpPassThrough.newBuilder() to construct.
    private UpPassThrough(Builder builder) {
      super(builder);
    }
    private UpPassThrough(boolean noInit) {}
    
    private static final UpPassThrough defaultInstance;
    public static UpPassThrough getDefaultInstance() {
      return defaultInstance;
    }
    
    public UpPassThrough getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.internal_static_UpPassThrough_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.internal_static_UpPassThrough_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .PassType types = 1;
    public static final int TYPES_FIELD_NUMBER = 1;
    private com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.PassType types_;
    public boolean hasTypes() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.PassType getTypes() {
      return types_;
    }
    
    // required string passContents = 2;
    public static final int PASSCONTENTS_FIELD_NUMBER = 2;
    private java.lang.Object passContents_;
    public boolean hasPassContents() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getPassContents() {
      java.lang.Object ref = passContents_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          passContents_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getPassContentsBytes() {
      java.lang.Object ref = passContents_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        passContents_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      types_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.PassType.gnssData;
      passContents_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTypes()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPassContents()) {
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
        output.writeEnum(1, types_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getPassContentsBytes());
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
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getPassContentsBytes());
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
    
    public static com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThroughOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.internal_static_UpPassThrough_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.internal_static_UpPassThrough_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough.newBuilder()
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
        types_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.PassType.gnssData;
        bitField0_ = (bitField0_ & ~0x00000001);
        passContents_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough build() {
        com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough result = new com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.types_ = types_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.passContents_ = passContents_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough.getDefaultInstance()) return this;
        if (other.hasTypes()) {
          setTypes(other.getTypes());
        }
        if (other.hasPassContents()) {
          setPassContents(other.getPassContents());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTypes()) {
          
          return false;
        }
        if (!hasPassContents()) {
          
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
              int rawValue = input.readEnum();
              com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.PassType value = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.PassType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                types_ = value;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              passContents_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .PassType types = 1;
      private com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.PassType types_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.PassType.gnssData;
      public boolean hasTypes() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.PassType getTypes() {
        return types_;
      }
      public Builder setTypes(com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.PassType value) {
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
        types_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.PassType.gnssData;
        onChanged();
        return this;
      }
      
      // required string passContents = 2;
      private java.lang.Object passContents_ = "";
      public boolean hasPassContents() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getPassContents() {
        java.lang.Object ref = passContents_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          passContents_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setPassContents(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        passContents_ = value;
        onChanged();
        return this;
      }
      public Builder clearPassContents() {
        bitField0_ = (bitField0_ & ~0x00000002);
        passContents_ = getDefaultInstance().getPassContents();
        onChanged();
        return this;
      }
      void setPassContents(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        passContents_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:UpPassThrough)
    }
    
    static {
      defaultInstance = new UpPassThrough(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:UpPassThrough)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_UpPassThrough_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_UpPassThrough_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2core/proto/terminal/query/java/UpPassT" +
      "hrough.proto\032.core/proto/terminal/common" +
      "/java/PassType.proto\"?\n\rUpPassThrough\022\030\n" +
      "\005types\030\001 \002(\0162\t.PassType\022\024\n\014passContents\030" +
      "\002 \002(\tBP\n=com.navinfo.opentsp.platform.lo" +
      "cation.protocol.terminal.queryB\017LCUpPass" +
      "Through"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_UpPassThrough_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_UpPassThrough_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_UpPassThrough_descriptor,
              new java.lang.String[] { "Types", "PassContents", },
              com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough.class,
              com.navinfo.opentsp.platform.location.protocol.terminal.query.LCUpPassThrough.UpPassThrough.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.terminal.common.LCPassType.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
