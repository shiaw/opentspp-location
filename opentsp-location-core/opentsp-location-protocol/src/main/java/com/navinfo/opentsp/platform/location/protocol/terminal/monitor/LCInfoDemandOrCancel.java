// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/monitor/java/InfoDemandOrCancel.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.monitor;

public final class LCInfoDemandOrCancel {
  private LCInfoDemandOrCancel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface InfoDemandOrCancelOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 infoType = 1;
    boolean hasInfoType();
    int getInfoType();
    
    // required bool isDemand = 2;
    boolean hasIsDemand();
    boolean getIsDemand();
  }
  public static final class InfoDemandOrCancel extends
      com.google.protobuf.GeneratedMessage
      implements InfoDemandOrCancelOrBuilder {
    // Use InfoDemandOrCancel.newBuilder() to construct.
    private InfoDemandOrCancel(Builder builder) {
      super(builder);
    }
    private InfoDemandOrCancel(boolean noInit) {}
    
    private static final InfoDemandOrCancel defaultInstance;
    public static InfoDemandOrCancel getDefaultInstance() {
      return defaultInstance;
    }
    
    public InfoDemandOrCancel getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCInfoDemandOrCancel.internal_static_InfoDemandOrCancel_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCInfoDemandOrCancel.internal_static_InfoDemandOrCancel_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 infoType = 1;
    public static final int INFOTYPE_FIELD_NUMBER = 1;
    private int infoType_;
    public boolean hasInfoType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getInfoType() {
      return infoType_;
    }
    
    // required bool isDemand = 2;
    public static final int ISDEMAND_FIELD_NUMBER = 2;
    private boolean isDemand_;
    public boolean hasIsDemand() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public boolean getIsDemand() {
      return isDemand_;
    }
    
    private void initFields() {
      infoType_ = 0;
      isDemand_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasInfoType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIsDemand()) {
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
        output.writeInt32(1, infoType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, isDemand_);
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
          .computeInt32Size(1, infoType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isDemand_);
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
    
    public static InfoDemandOrCancel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static InfoDemandOrCancel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static InfoDemandOrCancel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static InfoDemandOrCancel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static InfoDemandOrCancel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static InfoDemandOrCancel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static InfoDemandOrCancel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static InfoDemandOrCancel parseDelimitedFrom(
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
    public static InfoDemandOrCancel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static InfoDemandOrCancel parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(InfoDemandOrCancel prototype) {
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
       implements InfoDemandOrCancelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCInfoDemandOrCancel.internal_static_InfoDemandOrCancel_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCInfoDemandOrCancel.internal_static_InfoDemandOrCancel_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCInfoDemandOrCancel.InfoDemandOrCancel.newBuilder()
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
        infoType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        isDemand_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return InfoDemandOrCancel.getDescriptor();
      }
      
      public InfoDemandOrCancel getDefaultInstanceForType() {
        return InfoDemandOrCancel.getDefaultInstance();
      }
      
      public InfoDemandOrCancel build() {
        InfoDemandOrCancel result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private InfoDemandOrCancel buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        InfoDemandOrCancel result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public InfoDemandOrCancel buildPartial() {
        InfoDemandOrCancel result = new InfoDemandOrCancel(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.infoType_ = infoType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.isDemand_ = isDemand_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof InfoDemandOrCancel) {
          return mergeFrom((InfoDemandOrCancel)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(InfoDemandOrCancel other) {
        if (other == InfoDemandOrCancel.getDefaultInstance()) return this;
        if (other.hasInfoType()) {
          setInfoType(other.getInfoType());
        }
        if (other.hasIsDemand()) {
          setIsDemand(other.getIsDemand());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasInfoType()) {
          
          return false;
        }
        if (!hasIsDemand()) {
          
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
              infoType_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              isDemand_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 infoType = 1;
      private int infoType_ ;
      public boolean hasInfoType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getInfoType() {
        return infoType_;
      }
      public Builder setInfoType(int value) {
        bitField0_ |= 0x00000001;
        infoType_ = value;
        onChanged();
        return this;
      }
      public Builder clearInfoType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        infoType_ = 0;
        onChanged();
        return this;
      }
      
      // required bool isDemand = 2;
      private boolean isDemand_ ;
      public boolean hasIsDemand() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public boolean getIsDemand() {
        return isDemand_;
      }
      public Builder setIsDemand(boolean value) {
        bitField0_ |= 0x00000002;
        isDemand_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsDemand() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isDemand_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:InfoDemandOrCancel)
    }
    
    static {
      defaultInstance = new InfoDemandOrCancel(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:InfoDemandOrCancel)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_InfoDemandOrCancel_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_InfoDemandOrCancel_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n9core/proto/terminal/monitor/java/InfoD" +
      "emandOrCancel.proto\"8\n\022InfoDemandOrCance" +
      "l\022\020\n\010infoType\030\001 \002(\005\022\020\n\010isDemand\030\002 \002(\010BW\n" +
      "?com.navinfo.opentsp.platform.location.p" +
      "rotocol.terminal.monitorB\024LCInfoDemandOr" +
      "Cancel"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_InfoDemandOrCancel_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_InfoDemandOrCancel_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_InfoDemandOrCancel_descriptor,
              new String[] { "InfoType", "IsDemand", },
              InfoDemandOrCancel.class,
              InfoDemandOrCancel.Builder.class);
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
