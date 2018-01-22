// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/dataaccess/common/java/DataSave.proto

package com.navinfo.opentsp.platform.location.protocol.dataaccess.common;

public final class LCDataSave {
  private LCDataSave() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DataSaveOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 nodeNumber = 1;
    boolean hasNodeNumber();
    int getNodeNumber();
    
    // required int32 nodeNumberTo = 2;
    boolean hasNodeNumberTo();
    int getNodeNumberTo();
    
    // required int32 dataType = 3;
    boolean hasDataType();
    int getDataType();
    
    // required bytes dataValue = 4;
    boolean hasDataValue();
    com.google.protobuf.ByteString getDataValue();
  }
  public static final class DataSave extends
      com.google.protobuf.GeneratedMessage
      implements DataSaveOrBuilder {
    // Use DataSave.newBuilder() to construct.
    private DataSave(Builder builder) {
      super(builder);
    }
    private DataSave(boolean noInit) {}
    
    private static final DataSave defaultInstance;
    public static DataSave getDefaultInstance() {
      return defaultInstance;
    }
    
    public DataSave getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.internal_static_DataSave_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.internal_static_DataSave_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 nodeNumber = 1;
    public static final int NODENUMBER_FIELD_NUMBER = 1;
    private int nodeNumber_;
    public boolean hasNodeNumber() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getNodeNumber() {
      return nodeNumber_;
    }
    
    // required int32 nodeNumberTo = 2;
    public static final int NODENUMBERTO_FIELD_NUMBER = 2;
    private int nodeNumberTo_;
    public boolean hasNodeNumberTo() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getNodeNumberTo() {
      return nodeNumberTo_;
    }
    
    // required int32 dataType = 3;
    public static final int DATATYPE_FIELD_NUMBER = 3;
    private int dataType_;
    public boolean hasDataType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getDataType() {
      return dataType_;
    }
    
    // required bytes dataValue = 4;
    public static final int DATAVALUE_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString dataValue_;
    public boolean hasDataValue() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public com.google.protobuf.ByteString getDataValue() {
      return dataValue_;
    }
    
    private void initFields() {
      nodeNumber_ = 0;
      nodeNumberTo_ = 0;
      dataType_ = 0;
      dataValue_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasNodeNumber()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNodeNumberTo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDataType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDataValue()) {
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
        output.writeInt32(1, nodeNumber_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, nodeNumberTo_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, dataType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, dataValue_);
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
          .computeInt32Size(1, nodeNumber_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, nodeNumberTo_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, dataType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, dataValue_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSaveOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.internal_static_DataSave_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.internal_static_DataSave_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave.newBuilder()
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
        nodeNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        nodeNumberTo_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        dataType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        dataValue_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave build() {
        com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave result = new com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.nodeNumber_ = nodeNumber_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.nodeNumberTo_ = nodeNumberTo_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.dataType_ = dataType_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.dataValue_ = dataValue_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave.getDefaultInstance()) return this;
        if (other.hasNodeNumber()) {
          setNodeNumber(other.getNodeNumber());
        }
        if (other.hasNodeNumberTo()) {
          setNodeNumberTo(other.getNodeNumberTo());
        }
        if (other.hasDataType()) {
          setDataType(other.getDataType());
        }
        if (other.hasDataValue()) {
          setDataValue(other.getDataValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasNodeNumber()) {
          
          return false;
        }
        if (!hasNodeNumberTo()) {
          
          return false;
        }
        if (!hasDataType()) {
          
          return false;
        }
        if (!hasDataValue()) {
          
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
              nodeNumber_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              nodeNumberTo_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              dataType_ = input.readInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              dataValue_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 nodeNumber = 1;
      private int nodeNumber_ ;
      public boolean hasNodeNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getNodeNumber() {
        return nodeNumber_;
      }
      public Builder setNodeNumber(int value) {
        bitField0_ |= 0x00000001;
        nodeNumber_ = value;
        onChanged();
        return this;
      }
      public Builder clearNodeNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        nodeNumber_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 nodeNumberTo = 2;
      private int nodeNumberTo_ ;
      public boolean hasNodeNumberTo() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getNodeNumberTo() {
        return nodeNumberTo_;
      }
      public Builder setNodeNumberTo(int value) {
        bitField0_ |= 0x00000002;
        nodeNumberTo_ = value;
        onChanged();
        return this;
      }
      public Builder clearNodeNumberTo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        nodeNumberTo_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 dataType = 3;
      private int dataType_ ;
      public boolean hasDataType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getDataType() {
        return dataType_;
      }
      public Builder setDataType(int value) {
        bitField0_ |= 0x00000004;
        dataType_ = value;
        onChanged();
        return this;
      }
      public Builder clearDataType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        dataType_ = 0;
        onChanged();
        return this;
      }
      
      // required bytes dataValue = 4;
      private com.google.protobuf.ByteString dataValue_ = com.google.protobuf.ByteString.EMPTY;
      public boolean hasDataValue() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public com.google.protobuf.ByteString getDataValue() {
        return dataValue_;
      }
      public Builder setDataValue(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        dataValue_ = value;
        onChanged();
        return this;
      }
      public Builder clearDataValue() {
        bitField0_ = (bitField0_ & ~0x00000008);
        dataValue_ = getDefaultInstance().getDataValue();
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:DataSave)
    }
    
    static {
      defaultInstance = new DataSave(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:DataSave)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_DataSave_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DataSave_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0core/proto/dataaccess/common/java/Data" +
      "Save.proto\"Y\n\010DataSave\022\022\n\nnodeNumber\030\001 \002" +
      "(\005\022\024\n\014nodeNumberTo\030\002 \002(\005\022\020\n\010dataType\030\003 \002" +
      "(\005\022\021\n\tdataValue\030\004 \002(\014BN\n@com.navinfo.ope" +
      "ntsp.platform.location.protocol.dataacce" +
      "ss.commonB\nLCDataSave"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_DataSave_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_DataSave_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_DataSave_descriptor,
              new java.lang.String[] { "NodeNumber", "NodeNumberTo", "DataType", "DataValue", },
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave.class,
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCDataSave.DataSave.Builder.class);
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
