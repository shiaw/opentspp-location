// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/statisticsdata/entity/CrossGridRecord.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity;

public final class LCCrossGridRecord {
  private LCCrossGridRecord() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CrossGridRecordOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 terminalId = 1;
    boolean hasTerminalId();
    long getTerminalId();
    
    // required int32 counts = 2;
    boolean hasCounts();
    int getCounts();
  }
  public static final class CrossGridRecord extends
      com.google.protobuf.GeneratedMessage
      implements CrossGridRecordOrBuilder {
    // Use CrossGridRecord.newBuilder() to construct.
    private CrossGridRecord(Builder builder) {
      super(builder);
    }
    private CrossGridRecord(boolean noInit) {}
    
    private static final CrossGridRecord defaultInstance;
    public static CrossGridRecord getDefaultInstance() {
      return defaultInstance;
    }
    
    public CrossGridRecord getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.internal_static_CrossGridRecord_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.internal_static_CrossGridRecord_fieldAccessorTable;
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
    
    // required int32 counts = 2;
    public static final int COUNTS_FIELD_NUMBER = 2;
    private int counts_;
    public boolean hasCounts() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getCounts() {
      return counts_;
    }
    
    private void initFields() {
      terminalId_ = 0L;
      counts_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTerminalId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCounts()) {
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
        output.writeInt32(2, counts_);
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
          .computeInt32Size(2, counts_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.internal_static_CrossGridRecord_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.internal_static_CrossGridRecord_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord.newBuilder()
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
        counts_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord build() {
        com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord result = new com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.terminalId_ = terminalId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.counts_ = counts_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord.getDefaultInstance()) return this;
        if (other.hasTerminalId()) {
          setTerminalId(other.getTerminalId());
        }
        if (other.hasCounts()) {
          setCounts(other.getCounts());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTerminalId()) {
          
          return false;
        }
        if (!hasCounts()) {
          
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
              counts_ = input.readInt32();
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
      
      // required int32 counts = 2;
      private int counts_ ;
      public boolean hasCounts() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getCounts() {
        return counts_;
      }
      public Builder setCounts(int value) {
        bitField0_ |= 0x00000002;
        counts_ = value;
        onChanged();
        return this;
      }
      public Builder clearCounts() {
        bitField0_ = (bitField0_ & ~0x00000002);
        counts_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:CrossGridRecord)
    }
    
    static {
      defaultInstance = new CrossGridRecord(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:CrossGridRecord)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_CrossGridRecord_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CrossGridRecord_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAcore/proto/webservice/statisticsdata/e" +
      "ntity/CrossGridRecord.proto\"5\n\017CrossGrid" +
      "Record\022\022\n\nterminalId\030\001 \002(\003\022\016\n\006counts\030\002 \002" +
      "(\005Bd\nOcom.navinfo.opentsp.platform.locat" +
      "ion.protocol.webservice.statisticsdata.e" +
      "ntityB\021LCCrossGridRecord"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_CrossGridRecord_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_CrossGridRecord_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_CrossGridRecord_descriptor,
              new java.lang.String[] { "TerminalId", "Counts", },
              com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord.class,
              com.navinfo.opentsp.platform.location.protocol.webservice.statisticsdata.entity.LCCrossGridRecord.CrossGridRecord.Builder.class);
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
