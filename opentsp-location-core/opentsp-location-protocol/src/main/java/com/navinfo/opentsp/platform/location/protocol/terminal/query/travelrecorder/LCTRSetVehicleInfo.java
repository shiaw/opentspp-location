// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/query/travelrecorder/TRSetVehicleInfo.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder;

public final class LCTRSetVehicleInfo {
  private LCTRSetVehicleInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TRSetVehicleInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string IdentifyCode = 1;
    boolean hasIdentifyCode();
    String getIdentifyCode();
    
    // required string licenseNumber = 2;
    boolean hasLicenseNumber();
    String getLicenseNumber();
    
    // required string licenseType = 3;
    boolean hasLicenseType();
    String getLicenseType();
  }
  public static final class TRSetVehicleInfo extends
      com.google.protobuf.GeneratedMessage
      implements TRSetVehicleInfoOrBuilder {
    // Use TRSetVehicleInfo.newBuilder() to construct.
    private TRSetVehicleInfo(Builder builder) {
      super(builder);
    }
    private TRSetVehicleInfo(boolean noInit) {}
    
    private static final TRSetVehicleInfo defaultInstance;
    public static TRSetVehicleInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public TRSetVehicleInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCTRSetVehicleInfo.internal_static_TRSetVehicleInfo_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCTRSetVehicleInfo.internal_static_TRSetVehicleInfo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string IdentifyCode = 1;
    public static final int IDENTIFYCODE_FIELD_NUMBER = 1;
    private Object identifyCode_;
    public boolean hasIdentifyCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getIdentifyCode() {
      Object ref = identifyCode_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          identifyCode_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIdentifyCodeBytes() {
      Object ref = identifyCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        identifyCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string licenseNumber = 2;
    public static final int LICENSENUMBER_FIELD_NUMBER = 2;
    private Object licenseNumber_;
    public boolean hasLicenseNumber() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getLicenseNumber() {
      Object ref = licenseNumber_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          licenseNumber_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getLicenseNumberBytes() {
      Object ref = licenseNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        licenseNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string licenseType = 3;
    public static final int LICENSETYPE_FIELD_NUMBER = 3;
    private Object licenseType_;
    public boolean hasLicenseType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getLicenseType() {
      Object ref = licenseType_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          licenseType_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getLicenseTypeBytes() {
      Object ref = licenseType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        licenseType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      identifyCode_ = "";
      licenseNumber_ = "";
      licenseType_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasIdentifyCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLicenseNumber()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLicenseType()) {
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
        output.writeBytes(1, getIdentifyCodeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getLicenseNumberBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getLicenseTypeBytes());
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
          .computeBytesSize(1, getIdentifyCodeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getLicenseNumberBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getLicenseTypeBytes());
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
    
    public static TRSetVehicleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TRSetVehicleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TRSetVehicleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TRSetVehicleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TRSetVehicleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TRSetVehicleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static TRSetVehicleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static TRSetVehicleInfo parseDelimitedFrom(
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
    public static TRSetVehicleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TRSetVehicleInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(TRSetVehicleInfo prototype) {
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
       implements TRSetVehicleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCTRSetVehicleInfo.internal_static_TRSetVehicleInfo_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCTRSetVehicleInfo.internal_static_TRSetVehicleInfo_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.LCTRSetVehicleInfo.TRSetVehicleInfo.newBuilder()
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
        identifyCode_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        licenseNumber_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        licenseType_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TRSetVehicleInfo.getDescriptor();
      }
      
      public TRSetVehicleInfo getDefaultInstanceForType() {
        return TRSetVehicleInfo.getDefaultInstance();
      }
      
      public TRSetVehicleInfo build() {
        TRSetVehicleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private TRSetVehicleInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        TRSetVehicleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public TRSetVehicleInfo buildPartial() {
        TRSetVehicleInfo result = new TRSetVehicleInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.identifyCode_ = identifyCode_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.licenseNumber_ = licenseNumber_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.licenseType_ = licenseType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TRSetVehicleInfo) {
          return mergeFrom((TRSetVehicleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(TRSetVehicleInfo other) {
        if (other == TRSetVehicleInfo.getDefaultInstance()) return this;
        if (other.hasIdentifyCode()) {
          setIdentifyCode(other.getIdentifyCode());
        }
        if (other.hasLicenseNumber()) {
          setLicenseNumber(other.getLicenseNumber());
        }
        if (other.hasLicenseType()) {
          setLicenseType(other.getLicenseType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasIdentifyCode()) {
          
          return false;
        }
        if (!hasLicenseNumber()) {
          
          return false;
        }
        if (!hasLicenseType()) {
          
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
            case 10: {
              bitField0_ |= 0x00000001;
              identifyCode_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              licenseNumber_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              licenseType_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string IdentifyCode = 1;
      private Object identifyCode_ = "";
      public boolean hasIdentifyCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getIdentifyCode() {
        Object ref = identifyCode_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          identifyCode_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setIdentifyCode(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identifyCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearIdentifyCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        identifyCode_ = getDefaultInstance().getIdentifyCode();
        onChanged();
        return this;
      }
      void setIdentifyCode(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        identifyCode_ = value;
        onChanged();
      }
      
      // required string licenseNumber = 2;
      private Object licenseNumber_ = "";
      public boolean hasLicenseNumber() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getLicenseNumber() {
        Object ref = licenseNumber_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          licenseNumber_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setLicenseNumber(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        licenseNumber_ = value;
        onChanged();
        return this;
      }
      public Builder clearLicenseNumber() {
        bitField0_ = (bitField0_ & ~0x00000002);
        licenseNumber_ = getDefaultInstance().getLicenseNumber();
        onChanged();
        return this;
      }
      void setLicenseNumber(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        licenseNumber_ = value;
        onChanged();
      }
      
      // required string licenseType = 3;
      private Object licenseType_ = "";
      public boolean hasLicenseType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getLicenseType() {
        Object ref = licenseType_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          licenseType_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setLicenseType(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        licenseType_ = value;
        onChanged();
        return this;
      }
      public Builder clearLicenseType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        licenseType_ = getDefaultInstance().getLicenseType();
        onChanged();
        return this;
      }
      void setLicenseType(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        licenseType_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:TRSetVehicleInfo)
    }
    
    static {
      defaultInstance = new TRSetVehicleInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:TRSetVehicleInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TRSetVehicleInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TRSetVehicleInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n?core/proto/terminal/query/travelrecord" +
      "er/TRSetVehicleInfo.proto\"T\n\020TRSetVehicl" +
      "eInfo\022\024\n\014IdentifyCode\030\001 \002(\t\022\025\n\rlicenseNu" +
      "mber\030\002 \002(\t\022\023\n\013licenseType\030\003 \002(\tBb\nLcom.n" +
      "avinfo.opentsp.platform.location.protoco" +
      "l.terminal.query.travelrecorderB\022LCTRSet" +
      "VehicleInfo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TRSetVehicleInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TRSetVehicleInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TRSetVehicleInfo_descriptor,
              new String[] { "IdentifyCode", "LicenseNumber", "LicenseType", },
              TRSetVehicleInfo.class,
              TRSetVehicleInfo.Builder.class);
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
