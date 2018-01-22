// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/dataaccess/common/java/DataQueryKeyOverdue.proto

package com.navinfo.opentsp.platform.location.protocol.dataaccess.common;

public final class LCDataQueryKeyOverdue {
  private LCDataQueryKeyOverdue() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DataQueryKeyOverdueOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated string key = 1;
    java.util.List<String> getKeyList();
    int getKeyCount();
    String getKey(int index);
  }
  public static final class DataQueryKeyOverdue extends
      com.google.protobuf.GeneratedMessage
      implements DataQueryKeyOverdueOrBuilder {
    // Use DataQueryKeyOverdue.newBuilder() to construct.
    private DataQueryKeyOverdue(Builder builder) {
      super(builder);
    }
    private DataQueryKeyOverdue(boolean noInit) {}
    
    private static final DataQueryKeyOverdue defaultInstance;
    public static DataQueryKeyOverdue getDefaultInstance() {
      return defaultInstance;
    }
    
    public DataQueryKeyOverdue getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCDataQueryKeyOverdue.internal_static_DataQueryKeyOverdue_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCDataQueryKeyOverdue.internal_static_DataQueryKeyOverdue_fieldAccessorTable;
    }
    
    // repeated string key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList key_;
    public java.util.List<String>
        getKeyList() {
      return key_;
    }
    public int getKeyCount() {
      return key_.size();
    }
    public String getKey(int index) {
      return key_.get(index);
    }
    
    private void initFields() {
      key_ = com.google.protobuf.LazyStringArrayList.EMPTY;
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
      for (int i = 0; i < key_.size(); i++) {
        output.writeBytes(1, key_.getByteString(i));
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
        for (int i = 0; i < key_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(key_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getKeyList().size();
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
    
    public static DataQueryKeyOverdue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static DataQueryKeyOverdue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static DataQueryKeyOverdue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static DataQueryKeyOverdue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static DataQueryKeyOverdue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static DataQueryKeyOverdue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static DataQueryKeyOverdue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static DataQueryKeyOverdue parseDelimitedFrom(
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
    public static DataQueryKeyOverdue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static DataQueryKeyOverdue parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(DataQueryKeyOverdue prototype) {
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
       implements DataQueryKeyOverdueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCDataQueryKeyOverdue.internal_static_DataQueryKeyOverdue_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCDataQueryKeyOverdue.internal_static_DataQueryKeyOverdue_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataQueryKeyOverdue.DataQueryKeyOverdue.newBuilder()
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
        key_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DataQueryKeyOverdue.getDescriptor();
      }
      
      public DataQueryKeyOverdue getDefaultInstanceForType() {
        return DataQueryKeyOverdue.getDefaultInstance();
      }
      
      public DataQueryKeyOverdue build() {
        DataQueryKeyOverdue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private DataQueryKeyOverdue buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        DataQueryKeyOverdue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public DataQueryKeyOverdue buildPartial() {
        DataQueryKeyOverdue result = new DataQueryKeyOverdue(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          key_ = new com.google.protobuf.UnmodifiableLazyStringList(
              key_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.key_ = key_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof DataQueryKeyOverdue) {
          return mergeFrom((DataQueryKeyOverdue)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(DataQueryKeyOverdue other) {
        if (other == DataQueryKeyOverdue.getDefaultInstance()) return this;
        if (!other.key_.isEmpty()) {
          if (key_.isEmpty()) {
            key_ = other.key_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKeyIsMutable();
            key_.addAll(other.key_);
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
            case 10: {
              ensureKeyIsMutable();
              key_.add(input.readBytes());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated string key = 1;
      private com.google.protobuf.LazyStringList key_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureKeyIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          key_ = new com.google.protobuf.LazyStringArrayList(key_);
          bitField0_ |= 0x00000001;
         }
      }
      public java.util.List<String>
          getKeyList() {
        return java.util.Collections.unmodifiableList(key_);
      }
      public int getKeyCount() {
        return key_.size();
      }
      public String getKey(int index) {
        return key_.get(index);
      }
      public Builder setKey(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureKeyIsMutable();
        key_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addKey(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureKeyIsMutable();
        key_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllKey(
          Iterable<String> values) {
        ensureKeyIsMutable();
        super.addAll(values, key_);
        onChanged();
        return this;
      }
      public Builder clearKey() {
        key_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      void addKey(com.google.protobuf.ByteString value) {
        ensureKeyIsMutable();
        key_.add(value);
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:DataQueryKeyOverdue)
    }
    
    static {
      defaultInstance = new DataQueryKeyOverdue(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:DataQueryKeyOverdue)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_DataQueryKeyOverdue_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DataQueryKeyOverdue_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n;core/proto/dataaccess/common/java/Data" +
      "QueryKeyOverdue.proto\"\"\n\023DataQueryKeyOve" +
      "rdue\022\013\n\003key\030\001 \003(\tBY\n@com.navinfo.opentsp" +
      ".platform.location.protocol.dataaccess.c" +
      "ommonB\025LCDataQueryKeyOverdue"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_DataQueryKeyOverdue_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_DataQueryKeyOverdue_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_DataQueryKeyOverdue_descriptor,
              new String[] { "Key", },
              DataQueryKeyOverdue.class,
              DataQueryKeyOverdue.Builder.class);
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
