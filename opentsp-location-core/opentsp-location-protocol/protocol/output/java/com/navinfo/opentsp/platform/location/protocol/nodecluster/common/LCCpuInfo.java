// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/nodecluster/common/java/CpuInfo.proto

package com.navinfo.opentsp.platform.location.protocol.nodecluster.common;

public final class LCCpuInfo {
  private LCCpuInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CpuInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required float serverCpu = 1;
    boolean hasServerCpu();
    float getServerCpu();
    
    // required float systemCpu = 2;
    boolean hasSystemCpu();
    float getSystemCpu();
    
    // required float totalCpu = 3;
    boolean hasTotalCpu();
    float getTotalCpu();
    
    // required float idleCpu = 4;
    boolean hasIdleCpu();
    float getIdleCpu();
  }
  public static final class CpuInfo extends
      com.google.protobuf.GeneratedMessage
      implements CpuInfoOrBuilder {
    // Use CpuInfo.newBuilder() to construct.
    private CpuInfo(Builder builder) {
      super(builder);
    }
    private CpuInfo(boolean noInit) {}
    
    private static final CpuInfo defaultInstance;
    public static CpuInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public CpuInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.internal_static_CpuInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.internal_static_CpuInfo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required float serverCpu = 1;
    public static final int SERVERCPU_FIELD_NUMBER = 1;
    private float serverCpu_;
    public boolean hasServerCpu() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public float getServerCpu() {
      return serverCpu_;
    }
    
    // required float systemCpu = 2;
    public static final int SYSTEMCPU_FIELD_NUMBER = 2;
    private float systemCpu_;
    public boolean hasSystemCpu() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public float getSystemCpu() {
      return systemCpu_;
    }
    
    // required float totalCpu = 3;
    public static final int TOTALCPU_FIELD_NUMBER = 3;
    private float totalCpu_;
    public boolean hasTotalCpu() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public float getTotalCpu() {
      return totalCpu_;
    }
    
    // required float idleCpu = 4;
    public static final int IDLECPU_FIELD_NUMBER = 4;
    private float idleCpu_;
    public boolean hasIdleCpu() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public float getIdleCpu() {
      return idleCpu_;
    }
    
    private void initFields() {
      serverCpu_ = 0F;
      systemCpu_ = 0F;
      totalCpu_ = 0F;
      idleCpu_ = 0F;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasServerCpu()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSystemCpu()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTotalCpu()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIdleCpu()) {
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
        output.writeFloat(1, serverCpu_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeFloat(2, systemCpu_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeFloat(3, totalCpu_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeFloat(4, idleCpu_);
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
          .computeFloatSize(1, serverCpu_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, systemCpu_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, totalCpu_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, idleCpu_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.internal_static_CpuInfo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.internal_static_CpuInfo_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo.newBuilder()
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
        serverCpu_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000001);
        systemCpu_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        totalCpu_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000004);
        idleCpu_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo build() {
        com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo result = new com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.serverCpu_ = serverCpu_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.systemCpu_ = systemCpu_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.totalCpu_ = totalCpu_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.idleCpu_ = idleCpu_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo.getDefaultInstance()) return this;
        if (other.hasServerCpu()) {
          setServerCpu(other.getServerCpu());
        }
        if (other.hasSystemCpu()) {
          setSystemCpu(other.getSystemCpu());
        }
        if (other.hasTotalCpu()) {
          setTotalCpu(other.getTotalCpu());
        }
        if (other.hasIdleCpu()) {
          setIdleCpu(other.getIdleCpu());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasServerCpu()) {
          
          return false;
        }
        if (!hasSystemCpu()) {
          
          return false;
        }
        if (!hasTotalCpu()) {
          
          return false;
        }
        if (!hasIdleCpu()) {
          
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
            case 13: {
              bitField0_ |= 0x00000001;
              serverCpu_ = input.readFloat();
              break;
            }
            case 21: {
              bitField0_ |= 0x00000002;
              systemCpu_ = input.readFloat();
              break;
            }
            case 29: {
              bitField0_ |= 0x00000004;
              totalCpu_ = input.readFloat();
              break;
            }
            case 37: {
              bitField0_ |= 0x00000008;
              idleCpu_ = input.readFloat();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required float serverCpu = 1;
      private float serverCpu_ ;
      public boolean hasServerCpu() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public float getServerCpu() {
        return serverCpu_;
      }
      public Builder setServerCpu(float value) {
        bitField0_ |= 0x00000001;
        serverCpu_ = value;
        onChanged();
        return this;
      }
      public Builder clearServerCpu() {
        bitField0_ = (bitField0_ & ~0x00000001);
        serverCpu_ = 0F;
        onChanged();
        return this;
      }
      
      // required float systemCpu = 2;
      private float systemCpu_ ;
      public boolean hasSystemCpu() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public float getSystemCpu() {
        return systemCpu_;
      }
      public Builder setSystemCpu(float value) {
        bitField0_ |= 0x00000002;
        systemCpu_ = value;
        onChanged();
        return this;
      }
      public Builder clearSystemCpu() {
        bitField0_ = (bitField0_ & ~0x00000002);
        systemCpu_ = 0F;
        onChanged();
        return this;
      }
      
      // required float totalCpu = 3;
      private float totalCpu_ ;
      public boolean hasTotalCpu() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public float getTotalCpu() {
        return totalCpu_;
      }
      public Builder setTotalCpu(float value) {
        bitField0_ |= 0x00000004;
        totalCpu_ = value;
        onChanged();
        return this;
      }
      public Builder clearTotalCpu() {
        bitField0_ = (bitField0_ & ~0x00000004);
        totalCpu_ = 0F;
        onChanged();
        return this;
      }
      
      // required float idleCpu = 4;
      private float idleCpu_ ;
      public boolean hasIdleCpu() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public float getIdleCpu() {
        return idleCpu_;
      }
      public Builder setIdleCpu(float value) {
        bitField0_ |= 0x00000008;
        idleCpu_ = value;
        onChanged();
        return this;
      }
      public Builder clearIdleCpu() {
        bitField0_ = (bitField0_ & ~0x00000008);
        idleCpu_ = 0F;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:CpuInfo)
    }
    
    static {
      defaultInstance = new CpuInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:CpuInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_CpuInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CpuInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0core/proto/nodecluster/common/java/Cpu" +
      "Info.proto\"R\n\007CpuInfo\022\021\n\tserverCpu\030\001 \002(\002" +
      "\022\021\n\tsystemCpu\030\002 \002(\002\022\020\n\010totalCpu\030\003 \002(\002\022\017\n" +
      "\007idleCpu\030\004 \002(\002BN\nAcom.navinfo.opentsp.pl" +
      "atform.location.protocol.nodecluster.com" +
      "monB\tLCCpuInfo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_CpuInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_CpuInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_CpuInfo_descriptor,
              new java.lang.String[] { "ServerCpu", "SystemCpu", "TotalCpu", "IdleCpu", },
              com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo.class,
              com.navinfo.opentsp.platform.location.protocol.nodecluster.common.LCCpuInfo.CpuInfo.Builder.class);
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
