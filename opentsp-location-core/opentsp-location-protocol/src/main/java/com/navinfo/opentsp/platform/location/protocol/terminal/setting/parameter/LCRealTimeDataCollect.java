// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/setting/parameter/java/RealTimeDataCollect.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter;

public final class LCRealTimeDataCollect {
  private LCRealTimeDataCollect() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RealTimeDataCollectOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 uploadCycle = 1;
    boolean hasUploadCycle();
    int getUploadCycle();
    
    // required int32 collectCycle = 2;
    boolean hasCollectCycle();
    int getCollectCycle();
    
    // required int32 collectionTime = 3;
    boolean hasCollectionTime();
    int getCollectionTime();
  }
  public static final class RealTimeDataCollect extends
      com.google.protobuf.GeneratedMessage
      implements RealTimeDataCollectOrBuilder {
    // Use RealTimeDataCollect.newBuilder() to construct.
    private RealTimeDataCollect(Builder builder) {
      super(builder);
    }
    private RealTimeDataCollect(boolean noInit) {}
    
    private static final RealTimeDataCollect defaultInstance;
    public static RealTimeDataCollect getDefaultInstance() {
      return defaultInstance;
    }
    
    public RealTimeDataCollect getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCRealTimeDataCollect.internal_static_RealTimeDataCollect_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCRealTimeDataCollect.internal_static_RealTimeDataCollect_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 uploadCycle = 1;
    public static final int UPLOADCYCLE_FIELD_NUMBER = 1;
    private int uploadCycle_;
    public boolean hasUploadCycle() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getUploadCycle() {
      return uploadCycle_;
    }
    
    // required int32 collectCycle = 2;
    public static final int COLLECTCYCLE_FIELD_NUMBER = 2;
    private int collectCycle_;
    public boolean hasCollectCycle() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getCollectCycle() {
      return collectCycle_;
    }
    
    // required int32 collectionTime = 3;
    public static final int COLLECTIONTIME_FIELD_NUMBER = 3;
    private int collectionTime_;
    public boolean hasCollectionTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getCollectionTime() {
      return collectionTime_;
    }
    
    private void initFields() {
      uploadCycle_ = 0;
      collectCycle_ = 0;
      collectionTime_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasUploadCycle()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCollectCycle()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCollectionTime()) {
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
        output.writeInt32(1, uploadCycle_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, collectCycle_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, collectionTime_);
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
          .computeInt32Size(1, uploadCycle_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, collectCycle_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, collectionTime_);
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
    
    public static RealTimeDataCollect parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static RealTimeDataCollect parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static RealTimeDataCollect parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static RealTimeDataCollect parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static RealTimeDataCollect parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static RealTimeDataCollect parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static RealTimeDataCollect parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static RealTimeDataCollect parseDelimitedFrom(
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
    public static RealTimeDataCollect parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static RealTimeDataCollect parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(RealTimeDataCollect prototype) {
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
       implements RealTimeDataCollectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCRealTimeDataCollect.internal_static_RealTimeDataCollect_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCRealTimeDataCollect.internal_static_RealTimeDataCollect_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCRealTimeDataCollect.RealTimeDataCollect.newBuilder()
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
        uploadCycle_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        collectCycle_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        collectionTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RealTimeDataCollect.getDescriptor();
      }
      
      public RealTimeDataCollect getDefaultInstanceForType() {
        return RealTimeDataCollect.getDefaultInstance();
      }
      
      public RealTimeDataCollect build() {
        RealTimeDataCollect result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private RealTimeDataCollect buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        RealTimeDataCollect result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public RealTimeDataCollect buildPartial() {
        RealTimeDataCollect result = new RealTimeDataCollect(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.uploadCycle_ = uploadCycle_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.collectCycle_ = collectCycle_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.collectionTime_ = collectionTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RealTimeDataCollect) {
          return mergeFrom((RealTimeDataCollect)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(RealTimeDataCollect other) {
        if (other == RealTimeDataCollect.getDefaultInstance()) return this;
        if (other.hasUploadCycle()) {
          setUploadCycle(other.getUploadCycle());
        }
        if (other.hasCollectCycle()) {
          setCollectCycle(other.getCollectCycle());
        }
        if (other.hasCollectionTime()) {
          setCollectionTime(other.getCollectionTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasUploadCycle()) {
          
          return false;
        }
        if (!hasCollectCycle()) {
          
          return false;
        }
        if (!hasCollectionTime()) {
          
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
              uploadCycle_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              collectCycle_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              collectionTime_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 uploadCycle = 1;
      private int uploadCycle_ ;
      public boolean hasUploadCycle() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getUploadCycle() {
        return uploadCycle_;
      }
      public Builder setUploadCycle(int value) {
        bitField0_ |= 0x00000001;
        uploadCycle_ = value;
        onChanged();
        return this;
      }
      public Builder clearUploadCycle() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uploadCycle_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 collectCycle = 2;
      private int collectCycle_ ;
      public boolean hasCollectCycle() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getCollectCycle() {
        return collectCycle_;
      }
      public Builder setCollectCycle(int value) {
        bitField0_ |= 0x00000002;
        collectCycle_ = value;
        onChanged();
        return this;
      }
      public Builder clearCollectCycle() {
        bitField0_ = (bitField0_ & ~0x00000002);
        collectCycle_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 collectionTime = 3;
      private int collectionTime_ ;
      public boolean hasCollectionTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getCollectionTime() {
        return collectionTime_;
      }
      public Builder setCollectionTime(int value) {
        bitField0_ |= 0x00000004;
        collectionTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearCollectionTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        collectionTime_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:RealTimeDataCollect)
    }
    
    static {
      defaultInstance = new RealTimeDataCollect(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:RealTimeDataCollect)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_RealTimeDataCollect_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RealTimeDataCollect_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nDcore/proto/terminal/setting/parameter/" +
      "java/RealTimeDataCollect.proto\"X\n\023RealTi" +
      "meDataCollect\022\023\n\013uploadCycle\030\001 \002(\005\022\024\n\014co" +
      "llectCycle\030\002 \002(\005\022\026\n\016collectionTime\030\003 \002(\005" +
      "Bb\nIcom.navinfo.opentsp.platform.locatio" +
      "n.protocol.terminal.setting.parameterB\025L" +
      "CRealTimeDataCollect"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_RealTimeDataCollect_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_RealTimeDataCollect_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_RealTimeDataCollect_descriptor,
              new String[] { "UploadCycle", "CollectCycle", "CollectionTime", },
              RealTimeDataCollect.class,
              RealTimeDataCollect.Builder.class);
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