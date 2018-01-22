// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/dataaccess/regular/java/DeleteRegularData.proto

package com.navinfo.opentsp.platform.location.protocol.dataaccess.regular;

public final class LCDeleteRegularData {
  private LCDeleteRegularData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DeleteRegularDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int64 terminalId = 1;
    boolean hasTerminalId();
    long getTerminalId();
    
    // required .RegularCode regularCode = 2;
    boolean hasRegularCode();
    com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.RegularCode getRegularCode();
    
    // repeated int64 regularIdentify = 3;
    java.util.List<Long> getRegularIdentifyList();
    int getRegularIdentifyCount();
    long getRegularIdentify(int index);
  }
  public static final class DeleteRegularData extends
      com.google.protobuf.GeneratedMessage
      implements DeleteRegularDataOrBuilder {
    // Use DeleteRegularData.newBuilder() to construct.
    private DeleteRegularData(Builder builder) {
      super(builder);
    }
    private DeleteRegularData(boolean noInit) {}
    
    private static final DeleteRegularData defaultInstance;
    public static DeleteRegularData getDefaultInstance() {
      return defaultInstance;
    }
    
    public DeleteRegularData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCDeleteRegularData.internal_static_DeleteRegularData_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCDeleteRegularData.internal_static_DeleteRegularData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int64 terminalId = 1;
    public static final int TERMINALID_FIELD_NUMBER = 1;
    private long terminalId_;
    public boolean hasTerminalId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getTerminalId() {
      return terminalId_;
    }
    
    // required .RegularCode regularCode = 2;
    public static final int REGULARCODE_FIELD_NUMBER = 2;
    private com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.RegularCode regularCode_;
    public boolean hasRegularCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.RegularCode getRegularCode() {
      return regularCode_;
    }
    
    // repeated int64 regularIdentify = 3;
    public static final int REGULARIDENTIFY_FIELD_NUMBER = 3;
    private java.util.List<Long> regularIdentify_;
    public java.util.List<Long>
        getRegularIdentifyList() {
      return regularIdentify_;
    }
    public int getRegularIdentifyCount() {
      return regularIdentify_.size();
    }
    public long getRegularIdentify(int index) {
      return regularIdentify_.get(index);
    }
    
    private void initFields() {
      terminalId_ = 0L;
      regularCode_ = com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.RegularCode.speeding;
      regularIdentify_ = java.util.Collections.emptyList();;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasRegularCode()) {
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
        output.writeEnum(2, regularCode_.getNumber());
      }
      for (int i = 0; i < regularIdentify_.size(); i++) {
        output.writeInt64(3, regularIdentify_.get(i));
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
          .computeEnumSize(2, regularCode_.getNumber());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < regularIdentify_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt64SizeNoTag(regularIdentify_.get(i));
        }
        size += dataSize;
        size += 1 * getRegularIdentifyList().size();
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
    
    public static DeleteRegularData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static DeleteRegularData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static DeleteRegularData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static DeleteRegularData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static DeleteRegularData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static DeleteRegularData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static DeleteRegularData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static DeleteRegularData parseDelimitedFrom(
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
    public static DeleteRegularData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static DeleteRegularData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(DeleteRegularData prototype) {
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
       implements DeleteRegularDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCDeleteRegularData.internal_static_DeleteRegularData_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCDeleteRegularData.internal_static_DeleteRegularData_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.dataaccess.regular.LCDeleteRegularData.DeleteRegularData.newBuilder()
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
        regularCode_ = com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.RegularCode.speeding;
        bitField0_ = (bitField0_ & ~0x00000002);
        regularIdentify_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DeleteRegularData.getDescriptor();
      }
      
      public DeleteRegularData getDefaultInstanceForType() {
        return DeleteRegularData.getDefaultInstance();
      }
      
      public DeleteRegularData build() {
        DeleteRegularData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private DeleteRegularData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        DeleteRegularData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public DeleteRegularData buildPartial() {
        DeleteRegularData result = new DeleteRegularData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.terminalId_ = terminalId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.regularCode_ = regularCode_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          regularIdentify_ = java.util.Collections.unmodifiableList(regularIdentify_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.regularIdentify_ = regularIdentify_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof DeleteRegularData) {
          return mergeFrom((DeleteRegularData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(DeleteRegularData other) {
        if (other == DeleteRegularData.getDefaultInstance()) return this;
        if (other.hasTerminalId()) {
          setTerminalId(other.getTerminalId());
        }
        if (other.hasRegularCode()) {
          setRegularCode(other.getRegularCode());
        }
        if (!other.regularIdentify_.isEmpty()) {
          if (regularIdentify_.isEmpty()) {
            regularIdentify_ = other.regularIdentify_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureRegularIdentifyIsMutable();
            regularIdentify_.addAll(other.regularIdentify_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasRegularCode()) {
          
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
              int rawValue = input.readEnum();
              com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.RegularCode value = com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.RegularCode.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                regularCode_ = value;
              }
              break;
            }
            case 24: {
              ensureRegularIdentifyIsMutable();
              regularIdentify_.add(input.readInt64());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addRegularIdentify(input.readInt64());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int64 terminalId = 1;
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
      
      // required .RegularCode regularCode = 2;
      private com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.RegularCode regularCode_ = com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.RegularCode.speeding;
      public boolean hasRegularCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.RegularCode getRegularCode() {
        return regularCode_;
      }
      public Builder setRegularCode(com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.RegularCode value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        regularCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearRegularCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        regularCode_ = com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.RegularCode.speeding;
        onChanged();
        return this;
      }
      
      // repeated int64 regularIdentify = 3;
      private java.util.List<Long> regularIdentify_ = java.util.Collections.emptyList();;
      private void ensureRegularIdentifyIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          regularIdentify_ = new java.util.ArrayList<Long>(regularIdentify_);
          bitField0_ |= 0x00000004;
         }
      }
      public java.util.List<Long>
          getRegularIdentifyList() {
        return java.util.Collections.unmodifiableList(regularIdentify_);
      }
      public int getRegularIdentifyCount() {
        return regularIdentify_.size();
      }
      public long getRegularIdentify(int index) {
        return regularIdentify_.get(index);
      }
      public Builder setRegularIdentify(
          int index, long value) {
        ensureRegularIdentifyIsMutable();
        regularIdentify_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addRegularIdentify(long value) {
        ensureRegularIdentifyIsMutable();
        regularIdentify_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllRegularIdentify(
          Iterable<? extends Long> values) {
        ensureRegularIdentifyIsMutable();
        super.addAll(values, regularIdentify_);
        onChanged();
        return this;
      }
      public Builder clearRegularIdentify() {
        regularIdentify_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:DeleteRegularData)
    }
    
    static {
      defaultInstance = new DeleteRegularData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:DeleteRegularData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteRegularData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DeleteRegularData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n:core/proto/dataaccess/regular/java/Del" +
      "eteRegularData.proto\032(core/proto/common/" +
      "java/RegularCode.proto\"c\n\021DeleteRegularD" +
      "ata\022\022\n\nterminalId\030\001 \001(\003\022!\n\013regularCode\030\002" +
      " \002(\0162\014.RegularCode\022\027\n\017regularIdentify\030\003 " +
      "\003(\003BX\nAcom.navinfo.opentsp.platform.loca" +
      "tion.protocol.dataaccess.regularB\023LCDele" +
      "teRegularData"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_DeleteRegularData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_DeleteRegularData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_DeleteRegularData_descriptor,
              new String[] { "TerminalId", "RegularCode", "RegularIdentify", },
              DeleteRegularData.class,
              DeleteRegularData.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.common.LCRegularCode.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
