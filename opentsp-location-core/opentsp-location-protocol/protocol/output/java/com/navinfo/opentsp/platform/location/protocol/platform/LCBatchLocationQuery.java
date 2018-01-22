// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/platform/java/BatchLocationQuery.proto

package com.navinfo.opentsp.platform.location.protocol.platform;

public final class LCBatchLocationQuery {
  private LCBatchLocationQuery() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BatchLocationQueryOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated int64 terminalIdentify = 1;
    java.util.List<java.lang.Long> getTerminalIdentifyList();
    int getTerminalIdentifyCount();
    long getTerminalIdentify(int index);
  }
  public static final class BatchLocationQuery extends
      com.google.protobuf.GeneratedMessage
      implements BatchLocationQueryOrBuilder {
    // Use BatchLocationQuery.newBuilder() to construct.
    private BatchLocationQuery(Builder builder) {
      super(builder);
    }
    private BatchLocationQuery(boolean noInit) {}
    
    private static final BatchLocationQuery defaultInstance;
    public static BatchLocationQuery getDefaultInstance() {
      return defaultInstance;
    }
    
    public BatchLocationQuery getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.internal_static_BatchLocationQuery_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.internal_static_BatchLocationQuery_fieldAccessorTable;
    }
    
    // repeated int64 terminalIdentify = 1;
    public static final int TERMINALIDENTIFY_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Long> terminalIdentify_;
    public java.util.List<java.lang.Long>
        getTerminalIdentifyList() {
      return terminalIdentify_;
    }
    public int getTerminalIdentifyCount() {
      return terminalIdentify_.size();
    }
    public long getTerminalIdentify(int index) {
      return terminalIdentify_.get(index);
    }
    
    private void initFields() {
      terminalIdentify_ = java.util.Collections.emptyList();;
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
      for (int i = 0; i < terminalIdentify_.size(); i++) {
        output.writeInt64(1, terminalIdentify_.get(i));
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
        for (int i = 0; i < terminalIdentify_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt64SizeNoTag(terminalIdentify_.get(i));
        }
        size += dataSize;
        size += 1 * getTerminalIdentifyList().size();
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
    
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQueryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.internal_static_BatchLocationQuery_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.internal_static_BatchLocationQuery_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery.newBuilder()
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
        terminalIdentify_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery build() {
        com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery result = new com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          terminalIdentify_ = java.util.Collections.unmodifiableList(terminalIdentify_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.terminalIdentify_ = terminalIdentify_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery.getDefaultInstance()) return this;
        if (!other.terminalIdentify_.isEmpty()) {
          if (terminalIdentify_.isEmpty()) {
            terminalIdentify_ = other.terminalIdentify_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTerminalIdentifyIsMutable();
            terminalIdentify_.addAll(other.terminalIdentify_);
          }
          onChanged();
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
              ensureTerminalIdentifyIsMutable();
              terminalIdentify_.add(input.readInt64());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addTerminalIdentify(input.readInt64());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated int64 terminalIdentify = 1;
      private java.util.List<java.lang.Long> terminalIdentify_ = java.util.Collections.emptyList();;
      private void ensureTerminalIdentifyIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          terminalIdentify_ = new java.util.ArrayList<java.lang.Long>(terminalIdentify_);
          bitField0_ |= 0x00000001;
         }
      }
      public java.util.List<java.lang.Long>
          getTerminalIdentifyList() {
        return java.util.Collections.unmodifiableList(terminalIdentify_);
      }
      public int getTerminalIdentifyCount() {
        return terminalIdentify_.size();
      }
      public long getTerminalIdentify(int index) {
        return terminalIdentify_.get(index);
      }
      public Builder setTerminalIdentify(
          int index, long value) {
        ensureTerminalIdentifyIsMutable();
        terminalIdentify_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addTerminalIdentify(long value) {
        ensureTerminalIdentifyIsMutable();
        terminalIdentify_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllTerminalIdentify(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureTerminalIdentifyIsMutable();
        super.addAll(values, terminalIdentify_);
        onChanged();
        return this;
      }
      public Builder clearTerminalIdentify() {
        terminalIdentify_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:BatchLocationQuery)
    }
    
    static {
      defaultInstance = new BatchLocationQuery(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:BatchLocationQuery)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_BatchLocationQuery_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BatchLocationQuery_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1core/proto/platform/java/BatchLocation" +
      "Query.proto\032/core/proto/platform/java/Ba" +
      "tchQueryObject.proto\".\n\022BatchLocationQue" +
      "ry\022\030\n\020terminalIdentify\030\001 \003(\003BO\n7com.navi" +
      "nfo.opentsp.platform.location.protocol.p" +
      "latformB\024LCBatchLocationQuery"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_BatchLocationQuery_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_BatchLocationQuery_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_BatchLocationQuery_descriptor,
              new java.lang.String[] { "TerminalIdentify", },
              com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery.class,
              com.navinfo.opentsp.platform.location.protocol.platform.LCBatchLocationQuery.BatchLocationQuery.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.platform.LCBatchQueryObject.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
