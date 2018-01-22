// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/dataaccess/regular/java/QueryRegularData.proto

package com.navinfo.opentsp.platform.location.protocol.dataaccess.regular;

public final class LCQueryRegularData {
  private LCQueryRegularData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface QueryRegularDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .DistrictCode districtCode = 1;
    boolean hasDistrictCode();
    com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.DistrictCode getDistrictCode();
    
    // required int64 nodeCode = 2;
    boolean hasNodeCode();
    long getNodeCode();
  }
  public static final class QueryRegularData extends
      com.google.protobuf.GeneratedMessage
      implements QueryRegularDataOrBuilder {
    // Use QueryRegularData.newBuilder() to construct.
    private QueryRegularData(Builder builder) {
      super(builder);
    }
    private QueryRegularData(boolean noInit) {}
    
    private static final QueryRegularData defaultInstance;
    public static QueryRegularData getDefaultInstance() {
      return defaultInstance;
    }
    
    public QueryRegularData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCQueryRegularData.internal_static_QueryRegularData_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCQueryRegularData.internal_static_QueryRegularData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .DistrictCode districtCode = 1;
    public static final int DISTRICTCODE_FIELD_NUMBER = 1;
    private com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.DistrictCode districtCode_;
    public boolean hasDistrictCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.DistrictCode getDistrictCode() {
      return districtCode_;
    }
    
    // required int64 nodeCode = 2;
    public static final int NODECODE_FIELD_NUMBER = 2;
    private long nodeCode_;
    public boolean hasNodeCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getNodeCode() {
      return nodeCode_;
    }
    
    private void initFields() {
      districtCode_ = com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.DistrictCode.none;
      nodeCode_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasDistrictCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNodeCode()) {
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
        output.writeEnum(1, districtCode_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, nodeCode_);
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
          .computeEnumSize(1, districtCode_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, nodeCode_);
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
    
    public static QueryRegularData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static QueryRegularData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static QueryRegularData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static QueryRegularData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static QueryRegularData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static QueryRegularData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static QueryRegularData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static QueryRegularData parseDelimitedFrom(
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
    public static QueryRegularData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static QueryRegularData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(QueryRegularData prototype) {
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
       implements QueryRegularDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCQueryRegularData.internal_static_QueryRegularData_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCQueryRegularData.internal_static_QueryRegularData_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.dataaccess.regular.LCQueryRegularData.QueryRegularData.newBuilder()
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
        districtCode_ = com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.DistrictCode.none;
        bitField0_ = (bitField0_ & ~0x00000001);
        nodeCode_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return QueryRegularData.getDescriptor();
      }
      
      public QueryRegularData getDefaultInstanceForType() {
        return QueryRegularData.getDefaultInstance();
      }
      
      public QueryRegularData build() {
        QueryRegularData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private QueryRegularData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        QueryRegularData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public QueryRegularData buildPartial() {
        QueryRegularData result = new QueryRegularData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.districtCode_ = districtCode_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.nodeCode_ = nodeCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof QueryRegularData) {
          return mergeFrom((QueryRegularData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(QueryRegularData other) {
        if (other == QueryRegularData.getDefaultInstance()) return this;
        if (other.hasDistrictCode()) {
          setDistrictCode(other.getDistrictCode());
        }
        if (other.hasNodeCode()) {
          setNodeCode(other.getNodeCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasDistrictCode()) {
          
          return false;
        }
        if (!hasNodeCode()) {
          
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
              com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.DistrictCode value = com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.DistrictCode.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                districtCode_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              nodeCode_ = input.readInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .DistrictCode districtCode = 1;
      private com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.DistrictCode districtCode_ = com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.DistrictCode.none;
      public boolean hasDistrictCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.DistrictCode getDistrictCode() {
        return districtCode_;
      }
      public Builder setDistrictCode(com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.DistrictCode value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        districtCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearDistrictCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        districtCode_ = com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.DistrictCode.none;
        onChanged();
        return this;
      }
      
      // required int64 nodeCode = 2;
      private long nodeCode_ ;
      public boolean hasNodeCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getNodeCode() {
        return nodeCode_;
      }
      public Builder setNodeCode(long value) {
        bitField0_ |= 0x00000002;
        nodeCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearNodeCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        nodeCode_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:QueryRegularData)
    }
    
    static {
      defaultInstance = new QueryRegularData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:QueryRegularData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_QueryRegularData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_QueryRegularData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n9core/proto/dataaccess/regular/java/Que" +
      "ryRegularData.proto\032)core/proto/common/j" +
      "ava/DistrictCode.proto\"I\n\020QueryRegularDa" +
      "ta\022#\n\014districtCode\030\001 \002(\0162\r.DistrictCode\022" +
      "\020\n\010nodeCode\030\002 \002(\003BW\nAcom.navinfo.opentsp" +
      ".platform.location.protocol.dataaccess.r" +
      "egularB\022LCQueryRegularData"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_QueryRegularData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_QueryRegularData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_QueryRegularData_descriptor,
              new String[] { "DistrictCode", "NodeCode", },
              QueryRegularData.class,
              QueryRegularData.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.common.LCDistrictCode.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
