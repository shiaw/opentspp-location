// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/dataaccess/terminal/java/PassThrough.proto

package com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal;

public final class LCPassThrough {
  private LCPassThrough() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PassThroughOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 terminalId = 1;
    boolean hasTerminalId();
    long getTerminalId();
    
    // required bool isUp = 2;
    boolean hasIsUp();
    boolean getIsUp();
    
    // required bytes throughContent = 3;
    boolean hasThroughContent();
    com.google.protobuf.ByteString getThroughContent();
  }
  public static final class PassThrough extends
      com.google.protobuf.GeneratedMessage
      implements PassThroughOrBuilder {
    // Use PassThrough.newBuilder() to construct.
    private PassThrough(Builder builder) {
      super(builder);
    }
    private PassThrough(boolean noInit) {}
    
    private static final PassThrough defaultInstance;
    public static PassThrough getDefaultInstance() {
      return defaultInstance;
    }
    
    public PassThrough getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCPassThrough.internal_static_PassThrough_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCPassThrough.internal_static_PassThrough_fieldAccessorTable;
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
    
    // required bool isUp = 2;
    public static final int ISUP_FIELD_NUMBER = 2;
    private boolean isUp_;
    public boolean hasIsUp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public boolean getIsUp() {
      return isUp_;
    }
    
    // required bytes throughContent = 3;
    public static final int THROUGHCONTENT_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString throughContent_;
    public boolean hasThroughContent() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public com.google.protobuf.ByteString getThroughContent() {
      return throughContent_;
    }
    
    private void initFields() {
      terminalId_ = 0L;
      isUp_ = false;
      throughContent_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTerminalId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIsUp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasThroughContent()) {
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
        output.writeInt64(1, terminalId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, isUp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, throughContent_);
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
          .computeBoolSize(2, isUp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, throughContent_);
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
    
    public static PassThrough parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static PassThrough parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static PassThrough parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static PassThrough parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static PassThrough parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static PassThrough parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static PassThrough parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static PassThrough parseDelimitedFrom(
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
    public static PassThrough parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static PassThrough parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(PassThrough prototype) {
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
       implements PassThroughOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCPassThrough.internal_static_PassThrough_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCPassThrough.internal_static_PassThrough_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCPassThrough.PassThrough.newBuilder()
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
        terminalId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        isUp_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        throughContent_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PassThrough.getDescriptor();
      }
      
      public PassThrough getDefaultInstanceForType() {
        return PassThrough.getDefaultInstance();
      }
      
      public PassThrough build() {
        PassThrough result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private PassThrough buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        PassThrough result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public PassThrough buildPartial() {
        PassThrough result = new PassThrough(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.terminalId_ = terminalId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.isUp_ = isUp_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.throughContent_ = throughContent_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PassThrough) {
          return mergeFrom((PassThrough)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(PassThrough other) {
        if (other == PassThrough.getDefaultInstance()) return this;
        if (other.hasTerminalId()) {
          setTerminalId(other.getTerminalId());
        }
        if (other.hasIsUp()) {
          setIsUp(other.getIsUp());
        }
        if (other.hasThroughContent()) {
          setThroughContent(other.getThroughContent());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTerminalId()) {
          
          return false;
        }
        if (!hasIsUp()) {
          
          return false;
        }
        if (!hasThroughContent()) {
          
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
              terminalId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              isUp_ = input.readBool();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              throughContent_ = input.readBytes();
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
      
      // required bool isUp = 2;
      private boolean isUp_ ;
      public boolean hasIsUp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public boolean getIsUp() {
        return isUp_;
      }
      public Builder setIsUp(boolean value) {
        bitField0_ |= 0x00000002;
        isUp_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsUp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isUp_ = false;
        onChanged();
        return this;
      }
      
      // required bytes throughContent = 3;
      private com.google.protobuf.ByteString throughContent_ = com.google.protobuf.ByteString.EMPTY;
      public boolean hasThroughContent() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public com.google.protobuf.ByteString getThroughContent() {
        return throughContent_;
      }
      public Builder setThroughContent(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        throughContent_ = value;
        onChanged();
        return this;
      }
      public Builder clearThroughContent() {
        bitField0_ = (bitField0_ & ~0x00000004);
        throughContent_ = getDefaultInstance().getThroughContent();
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:PassThrough)
    }
    
    static {
      defaultInstance = new PassThrough(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:PassThrough)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_PassThrough_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PassThrough_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n5core/proto/dataaccess/terminal/java/Pa" +
      "ssThrough.proto\"G\n\013PassThrough\022\022\n\ntermin" +
      "alId\030\001 \002(\003\022\014\n\004isUp\030\002 \002(\010\022\026\n\016throughConte" +
      "nt\030\003 \002(\014BS\nBcom.navinfo.opentsp.platform" +
      ".location.protocol.dataaccess.terminalB\r" +
      "LCPassThrough"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_PassThrough_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_PassThrough_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_PassThrough_descriptor,
              new String[] { "TerminalId", "IsUp", "ThroughContent", },
              PassThrough.class,
              PassThrough.Builder.class);
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