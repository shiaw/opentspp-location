// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/query/travelrecorder/TRVersionRes.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder;

public final class LCTRVersionRes {
  private LCTRVersionRes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TRVersionResOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 serialNumber = 1;
    boolean hasSerialNumber();
    int getSerialNumber();
    
    // required .ResponseResult result = 2;
    boolean hasResult();
    com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult getResult();
    
    // optional int32 versionYear = 3;
    boolean hasVersionYear();
    int getVersionYear();
    
    // optional int32 modifyVersion = 4;
    boolean hasModifyVersion();
    int getModifyVersion();
  }
  public static final class TRVersionRes extends
      com.google.protobuf.GeneratedMessage
      implements TRVersionResOrBuilder {
    // Use TRVersionRes.newBuilder() to construct.
    private TRVersionRes(Builder builder) {
      super(builder);
    }
    private TRVersionRes(boolean noInit) {}
    
    private static final TRVersionRes defaultInstance;
    public static TRVersionRes getDefaultInstance() {
      return defaultInstance;
    }
    
    public TRVersionRes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCTRVersionRes.internal_static_TRVersionRes_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCTRVersionRes.internal_static_TRVersionRes_fieldAccessorTable;
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
    
    // optional int32 versionYear = 3;
    public static final int VERSIONYEAR_FIELD_NUMBER = 3;
    private int versionYear_;
    public boolean hasVersionYear() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getVersionYear() {
      return versionYear_;
    }
    
    // optional int32 modifyVersion = 4;
    public static final int MODIFYVERSION_FIELD_NUMBER = 4;
    private int modifyVersion_;
    public boolean hasModifyVersion() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getModifyVersion() {
      return modifyVersion_;
    }
    
    private void initFields() {
      serialNumber_ = 0;
      result_ = com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.ResponseResult.success;
      versionYear_ = 0;
      modifyVersion_ = 0;
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
        output.writeInt32(3, versionYear_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, modifyVersion_);
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
          .computeInt32Size(3, versionYear_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, modifyVersion_);
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
    
    public static TRVersionRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TRVersionRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TRVersionRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TRVersionRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TRVersionRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TRVersionRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static TRVersionRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static TRVersionRes parseDelimitedFrom(
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
    public static TRVersionRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TRVersionRes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(TRVersionRes prototype) {
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
       implements TRVersionResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCTRVersionRes.internal_static_TRVersionRes_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCTRVersionRes.internal_static_TRVersionRes_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.LCTRVersionRes.TRVersionRes.newBuilder()
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
        versionYear_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        modifyVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TRVersionRes.getDescriptor();
      }
      
      public TRVersionRes getDefaultInstanceForType() {
        return TRVersionRes.getDefaultInstance();
      }
      
      public TRVersionRes build() {
        TRVersionRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private TRVersionRes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        TRVersionRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public TRVersionRes buildPartial() {
        TRVersionRes result = new TRVersionRes(this);
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
        result.versionYear_ = versionYear_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.modifyVersion_ = modifyVersion_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TRVersionRes) {
          return mergeFrom((TRVersionRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(TRVersionRes other) {
        if (other == TRVersionRes.getDefaultInstance()) return this;
        if (other.hasSerialNumber()) {
          setSerialNumber(other.getSerialNumber());
        }
        if (other.hasResult()) {
          setResult(other.getResult());
        }
        if (other.hasVersionYear()) {
          setVersionYear(other.getVersionYear());
        }
        if (other.hasModifyVersion()) {
          setModifyVersion(other.getModifyVersion());
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
            case 24: {
              bitField0_ |= 0x00000004;
              versionYear_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              modifyVersion_ = input.readInt32();
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
      
      // optional int32 versionYear = 3;
      private int versionYear_ ;
      public boolean hasVersionYear() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getVersionYear() {
        return versionYear_;
      }
      public Builder setVersionYear(int value) {
        bitField0_ |= 0x00000004;
        versionYear_ = value;
        onChanged();
        return this;
      }
      public Builder clearVersionYear() {
        bitField0_ = (bitField0_ & ~0x00000004);
        versionYear_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 modifyVersion = 4;
      private int modifyVersion_ ;
      public boolean hasModifyVersion() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getModifyVersion() {
        return modifyVersion_;
      }
      public Builder setModifyVersion(int value) {
        bitField0_ |= 0x00000008;
        modifyVersion_ = value;
        onChanged();
        return this;
      }
      public Builder clearModifyVersion() {
        bitField0_ = (bitField0_ & ~0x00000008);
        modifyVersion_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:TRVersionRes)
    }
    
    static {
      defaultInstance = new TRVersionRes(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:TRVersionRes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TRVersionRes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TRVersionRes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n;core/proto/terminal/query/travelrecord" +
      "er/TRVersionRes.proto\032+core/proto/common" +
      "/java/ResponseResult.proto\"q\n\014TRVersionR" +
      "es\022\024\n\014serialNumber\030\001 \002(\005\022\037\n\006result\030\002 \002(\016" +
      "2\017.ResponseResult\022\023\n\013versionYear\030\003 \001(\005\022\025" +
      "\n\rmodifyVersion\030\004 \001(\005B^\nLcom.navinfo.ope" +
      "ntsp.platform.location.protocol.terminal" +
      ".query.travelrecorderB\016LCTRVersionRes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TRVersionRes_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TRVersionRes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TRVersionRes_descriptor,
              new String[] { "SerialNumber", "Result", "VersionYear", "ModifyVersion", },
              TRVersionRes.class,
              TRVersionRes.Builder.class);
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
