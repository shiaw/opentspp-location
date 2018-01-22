// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/query/travelrecorder/TRCollectOnlyCodeRes.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder;

public final class LCTRCollectOnlyCodeRes {
  private LCTRCollectOnlyCodeRes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TRCollectOnlyCodeResOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 serialNumber = 1;
    boolean hasSerialNumber();
    int getSerialNumber();
    
    // required .ResponseResult result = 2;
    boolean hasResult();
    com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult getResult();
    
    // optional string manufacturerAuthCode = 3;
    boolean hasManufacturerAuthCode();
    String getManufacturerAuthCode();
    
    // optional string productsAuthCode = 4;
    boolean hasProductsAuthCode();
    String getProductsAuthCode();
    
    // optional int64 productDate = 5;
    boolean hasProductDate();
    long getProductDate();
    
    // optional int64 productsCode = 6;
    boolean hasProductsCode();
    long getProductsCode();
  }
  public static final class TRCollectOnlyCodeRes extends
      com.google.protobuf.GeneratedMessage
      implements TRCollectOnlyCodeResOrBuilder {
    // Use TRCollectOnlyCodeRes.newBuilder() to construct.
    private TRCollectOnlyCodeRes(Builder builder) {
      super(builder);
    }
    private TRCollectOnlyCodeRes(boolean noInit) {}
    
    private static final TRCollectOnlyCodeRes defaultInstance;
    public static TRCollectOnlyCodeRes getDefaultInstance() {
      return defaultInstance;
    }
    
    public TRCollectOnlyCodeRes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCTRCollectOnlyCodeRes.internal_static_TRCollectOnlyCodeRes_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCTRCollectOnlyCodeRes.internal_static_TRCollectOnlyCodeRes_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 serialNumber = 1;
    public static final int SERIALNUMBER_FIELD_NUMBER = 1;
    private int serialNumber_;
    public boolean hasSerialNumber() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getSerialNumber() {
      return serialNumber_;
    }
    
    // required .ResponseResult result = 2;
    public static final int RESULT_FIELD_NUMBER = 2;
    private com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult result_;
    public boolean hasResult() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult getResult() {
      return result_;
    }
    
    // optional string manufacturerAuthCode = 3;
    public static final int MANUFACTURERAUTHCODE_FIELD_NUMBER = 3;
    private Object manufacturerAuthCode_;
    public boolean hasManufacturerAuthCode() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getManufacturerAuthCode() {
      Object ref = manufacturerAuthCode_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          manufacturerAuthCode_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getManufacturerAuthCodeBytes() {
      Object ref = manufacturerAuthCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        manufacturerAuthCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string productsAuthCode = 4;
    public static final int PRODUCTSAUTHCODE_FIELD_NUMBER = 4;
    private Object productsAuthCode_;
    public boolean hasProductsAuthCode() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getProductsAuthCode() {
      Object ref = productsAuthCode_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          productsAuthCode_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getProductsAuthCodeBytes() {
      Object ref = productsAuthCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        productsAuthCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int64 productDate = 5;
    public static final int PRODUCTDATE_FIELD_NUMBER = 5;
    private long productDate_;
    public boolean hasProductDate() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public long getProductDate() {
      return productDate_;
    }
    
    // optional int64 productsCode = 6;
    public static final int PRODUCTSCODE_FIELD_NUMBER = 6;
    private long productsCode_;
    public boolean hasProductsCode() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public long getProductsCode() {
      return productsCode_;
    }
    
    private void initFields() {
      serialNumber_ = 0;
      result_ = com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult.success;
      manufacturerAuthCode_ = "";
      productsAuthCode_ = "";
      productDate_ = 0L;
      productsCode_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSerialNumber()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasResult()) {
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
        output.writeInt32(1, serialNumber_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, result_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getManufacturerAuthCodeBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getProductsAuthCodeBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, productDate_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(6, productsCode_);
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
          .computeInt32Size(1, serialNumber_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, result_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getManufacturerAuthCodeBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getProductsAuthCodeBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, productDate_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, productsCode_);
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
    
    public static TRCollectOnlyCodeRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TRCollectOnlyCodeRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TRCollectOnlyCodeRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TRCollectOnlyCodeRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TRCollectOnlyCodeRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TRCollectOnlyCodeRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static TRCollectOnlyCodeRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static TRCollectOnlyCodeRes parseDelimitedFrom(
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
    public static TRCollectOnlyCodeRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TRCollectOnlyCodeRes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(TRCollectOnlyCodeRes prototype) {
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
       implements TRCollectOnlyCodeResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCTRCollectOnlyCodeRes.internal_static_TRCollectOnlyCodeRes_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCTRCollectOnlyCodeRes.internal_static_TRCollectOnlyCodeRes_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.LCTRCollectOnlyCodeRes.TRCollectOnlyCodeRes.newBuilder()
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
        serialNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        result_ = com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult.success;
        bitField0_ = (bitField0_ & ~0x00000002);
        manufacturerAuthCode_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        productsAuthCode_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        productDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        productsCode_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TRCollectOnlyCodeRes.getDescriptor();
      }
      
      public TRCollectOnlyCodeRes getDefaultInstanceForType() {
        return TRCollectOnlyCodeRes.getDefaultInstance();
      }
      
      public TRCollectOnlyCodeRes build() {
        TRCollectOnlyCodeRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private TRCollectOnlyCodeRes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        TRCollectOnlyCodeRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public TRCollectOnlyCodeRes buildPartial() {
        TRCollectOnlyCodeRes result = new TRCollectOnlyCodeRes(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.serialNumber_ = serialNumber_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.result_ = result_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.manufacturerAuthCode_ = manufacturerAuthCode_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.productsAuthCode_ = productsAuthCode_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.productDate_ = productDate_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.productsCode_ = productsCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TRCollectOnlyCodeRes) {
          return mergeFrom((TRCollectOnlyCodeRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(TRCollectOnlyCodeRes other) {
        if (other == TRCollectOnlyCodeRes.getDefaultInstance()) return this;
        if (other.hasSerialNumber()) {
          setSerialNumber(other.getSerialNumber());
        }
        if (other.hasResult()) {
          setResult(other.getResult());
        }
        if (other.hasManufacturerAuthCode()) {
          setManufacturerAuthCode(other.getManufacturerAuthCode());
        }
        if (other.hasProductsAuthCode()) {
          setProductsAuthCode(other.getProductsAuthCode());
        }
        if (other.hasProductDate()) {
          setProductDate(other.getProductDate());
        }
        if (other.hasProductsCode()) {
          setProductsCode(other.getProductsCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSerialNumber()) {
          
          return false;
        }
        if (!hasResult()) {
          
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
              serialNumber_ = input.readInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult value = com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                result_ = value;
              }
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              manufacturerAuthCode_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              productsAuthCode_ = input.readBytes();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              productDate_ = input.readInt64();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              productsCode_ = input.readInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 serialNumber = 1;
      private int serialNumber_ ;
      public boolean hasSerialNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getSerialNumber() {
        return serialNumber_;
      }
      public Builder setSerialNumber(int value) {
        bitField0_ |= 0x00000001;
        serialNumber_ = value;
        onChanged();
        return this;
      }
      public Builder clearSerialNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        serialNumber_ = 0;
        onChanged();
        return this;
      }
      
      // required .ResponseResult result = 2;
      private com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult result_ = com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult.success;
      public boolean hasResult() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult getResult() {
        return result_;
      }
      public Builder setResult(com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        result_ = value;
        onChanged();
        return this;
      }
      public Builder clearResult() {
        bitField0_ = (bitField0_ & ~0x00000002);
        result_ = com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult.success;
        onChanged();
        return this;
      }
      
      // optional string manufacturerAuthCode = 3;
      private Object manufacturerAuthCode_ = "";
      public boolean hasManufacturerAuthCode() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getManufacturerAuthCode() {
        Object ref = manufacturerAuthCode_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          manufacturerAuthCode_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setManufacturerAuthCode(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        manufacturerAuthCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearManufacturerAuthCode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        manufacturerAuthCode_ = getDefaultInstance().getManufacturerAuthCode();
        onChanged();
        return this;
      }
      void setManufacturerAuthCode(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        manufacturerAuthCode_ = value;
        onChanged();
      }
      
      // optional string productsAuthCode = 4;
      private Object productsAuthCode_ = "";
      public boolean hasProductsAuthCode() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getProductsAuthCode() {
        Object ref = productsAuthCode_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          productsAuthCode_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setProductsAuthCode(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        productsAuthCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearProductsAuthCode() {
        bitField0_ = (bitField0_ & ~0x00000008);
        productsAuthCode_ = getDefaultInstance().getProductsAuthCode();
        onChanged();
        return this;
      }
      void setProductsAuthCode(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        productsAuthCode_ = value;
        onChanged();
      }
      
      // optional int64 productDate = 5;
      private long productDate_ ;
      public boolean hasProductDate() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public long getProductDate() {
        return productDate_;
      }
      public Builder setProductDate(long value) {
        bitField0_ |= 0x00000010;
        productDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearProductDate() {
        bitField0_ = (bitField0_ & ~0x00000010);
        productDate_ = 0L;
        onChanged();
        return this;
      }
      
      // optional int64 productsCode = 6;
      private long productsCode_ ;
      public boolean hasProductsCode() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public long getProductsCode() {
        return productsCode_;
      }
      public Builder setProductsCode(long value) {
        bitField0_ |= 0x00000020;
        productsCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearProductsCode() {
        bitField0_ = (bitField0_ & ~0x00000020);
        productsCode_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:TRCollectOnlyCodeRes)
    }
    
    static {
      defaultInstance = new TRCollectOnlyCodeRes(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:TRCollectOnlyCodeRes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TRCollectOnlyCodeRes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TRCollectOnlyCodeRes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nCcore/proto/terminal/query/travelrecord" +
      "er/TRCollectOnlyCodeRes.proto\032+core/prot" +
      "o/common/java/ResponseResult.proto\"\260\001\n\024T" +
      "RCollectOnlyCodeRes\022\024\n\014serialNumber\030\001 \002(" +
      "\005\022\037\n\006result\030\002 \002(\0162\017.ResponseResult\022\034\n\024ma" +
      "nufacturerAuthCode\030\003 \001(\t\022\030\n\020productsAuth" +
      "Code\030\004 \001(\t\022\023\n\013productDate\030\005 \001(\003\022\024\n\014produ" +
      "ctsCode\030\006 \001(\003Bf\nLcom.navinfo.opentsp.pla" +
      "tform.location.protocol.terminal.query.t" +
      "ravelrecorderB\026LCTRCollectOnlyCodeRes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TRCollectOnlyCodeRes_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TRCollectOnlyCodeRes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TRCollectOnlyCodeRes_descriptor,
              new String[] { "SerialNumber", "Result", "ManufacturerAuthCode", "ProductsAuthCode", "ProductDate", "ProductsCode", },
              TRCollectOnlyCodeRes.class,
              TRCollectOnlyCodeRes.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
