// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/setting/parameter/java/FatigueDriving.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter;

public final class LCFatigueDriving {
  private LCFatigueDriving() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface FatigueDrivingOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 continueDrivingTime = 1;
    boolean hasContinueDrivingTime();
    int getContinueDrivingTime();
    
    // required int32 dayCumulativeDrivingTime = 2;
    boolean hasDayCumulativeDrivingTime();
    int getDayCumulativeDrivingTime();
    
    // required int32 minRestingTime = 3;
    boolean hasMinRestingTime();
    int getMinRestingTime();
    
    // optional int32 warningFatigue = 4;
    boolean hasWarningFatigue();
    int getWarningFatigue();
  }
  public static final class FatigueDriving extends
      com.google.protobuf.GeneratedMessage
      implements FatigueDrivingOrBuilder {
    // Use FatigueDriving.newBuilder() to construct.
    private FatigueDriving(Builder builder) {
      super(builder);
    }
    private FatigueDriving(boolean noInit) {}
    
    private static final FatigueDriving defaultInstance;
    public static FatigueDriving getDefaultInstance() {
      return defaultInstance;
    }
    
    public FatigueDriving getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCFatigueDriving.internal_static_FatigueDriving_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCFatigueDriving.internal_static_FatigueDriving_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 continueDrivingTime = 1;
    public static final int CONTINUEDRIVINGTIME_FIELD_NUMBER = 1;
    private int continueDrivingTime_;
    public boolean hasContinueDrivingTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getContinueDrivingTime() {
      return continueDrivingTime_;
    }
    
    // required int32 dayCumulativeDrivingTime = 2;
    public static final int DAYCUMULATIVEDRIVINGTIME_FIELD_NUMBER = 2;
    private int dayCumulativeDrivingTime_;
    public boolean hasDayCumulativeDrivingTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getDayCumulativeDrivingTime() {
      return dayCumulativeDrivingTime_;
    }
    
    // required int32 minRestingTime = 3;
    public static final int MINRESTINGTIME_FIELD_NUMBER = 3;
    private int minRestingTime_;
    public boolean hasMinRestingTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getMinRestingTime() {
      return minRestingTime_;
    }
    
    // optional int32 warningFatigue = 4;
    public static final int WARNINGFATIGUE_FIELD_NUMBER = 4;
    private int warningFatigue_;
    public boolean hasWarningFatigue() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getWarningFatigue() {
      return warningFatigue_;
    }
    
    private void initFields() {
      continueDrivingTime_ = 0;
      dayCumulativeDrivingTime_ = 0;
      minRestingTime_ = 0;
      warningFatigue_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasContinueDrivingTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDayCumulativeDrivingTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMinRestingTime()) {
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
        output.writeInt32(1, continueDrivingTime_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, dayCumulativeDrivingTime_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, minRestingTime_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, warningFatigue_);
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
          .computeInt32Size(1, continueDrivingTime_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, dayCumulativeDrivingTime_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, minRestingTime_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, warningFatigue_);
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
    
    public static FatigueDriving parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static FatigueDriving parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static FatigueDriving parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static FatigueDriving parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static FatigueDriving parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static FatigueDriving parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static FatigueDriving parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static FatigueDriving parseDelimitedFrom(
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
    public static FatigueDriving parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static FatigueDriving parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(FatigueDriving prototype) {
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
       implements FatigueDrivingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCFatigueDriving.internal_static_FatigueDriving_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCFatigueDriving.internal_static_FatigueDriving_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.setting.parameter.LCFatigueDriving.FatigueDriving.newBuilder()
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
        continueDrivingTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        dayCumulativeDrivingTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        minRestingTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        warningFatigue_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return FatigueDriving.getDescriptor();
      }
      
      public FatigueDriving getDefaultInstanceForType() {
        return FatigueDriving.getDefaultInstance();
      }
      
      public FatigueDriving build() {
        FatigueDriving result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private FatigueDriving buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        FatigueDriving result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public FatigueDriving buildPartial() {
        FatigueDriving result = new FatigueDriving(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.continueDrivingTime_ = continueDrivingTime_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.dayCumulativeDrivingTime_ = dayCumulativeDrivingTime_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.minRestingTime_ = minRestingTime_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.warningFatigue_ = warningFatigue_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof FatigueDriving) {
          return mergeFrom((FatigueDriving)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(FatigueDriving other) {
        if (other == FatigueDriving.getDefaultInstance()) return this;
        if (other.hasContinueDrivingTime()) {
          setContinueDrivingTime(other.getContinueDrivingTime());
        }
        if (other.hasDayCumulativeDrivingTime()) {
          setDayCumulativeDrivingTime(other.getDayCumulativeDrivingTime());
        }
        if (other.hasMinRestingTime()) {
          setMinRestingTime(other.getMinRestingTime());
        }
        if (other.hasWarningFatigue()) {
          setWarningFatigue(other.getWarningFatigue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasContinueDrivingTime()) {
          
          return false;
        }
        if (!hasDayCumulativeDrivingTime()) {
          
          return false;
        }
        if (!hasMinRestingTime()) {
          
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
              continueDrivingTime_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              dayCumulativeDrivingTime_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              minRestingTime_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              warningFatigue_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 continueDrivingTime = 1;
      private int continueDrivingTime_ ;
      public boolean hasContinueDrivingTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getContinueDrivingTime() {
        return continueDrivingTime_;
      }
      public Builder setContinueDrivingTime(int value) {
        bitField0_ |= 0x00000001;
        continueDrivingTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearContinueDrivingTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        continueDrivingTime_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 dayCumulativeDrivingTime = 2;
      private int dayCumulativeDrivingTime_ ;
      public boolean hasDayCumulativeDrivingTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getDayCumulativeDrivingTime() {
        return dayCumulativeDrivingTime_;
      }
      public Builder setDayCumulativeDrivingTime(int value) {
        bitField0_ |= 0x00000002;
        dayCumulativeDrivingTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearDayCumulativeDrivingTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dayCumulativeDrivingTime_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 minRestingTime = 3;
      private int minRestingTime_ ;
      public boolean hasMinRestingTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getMinRestingTime() {
        return minRestingTime_;
      }
      public Builder setMinRestingTime(int value) {
        bitField0_ |= 0x00000004;
        minRestingTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearMinRestingTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        minRestingTime_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 warningFatigue = 4;
      private int warningFatigue_ ;
      public boolean hasWarningFatigue() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getWarningFatigue() {
        return warningFatigue_;
      }
      public Builder setWarningFatigue(int value) {
        bitField0_ |= 0x00000008;
        warningFatigue_ = value;
        onChanged();
        return this;
      }
      public Builder clearWarningFatigue() {
        bitField0_ = (bitField0_ & ~0x00000008);
        warningFatigue_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:FatigueDriving)
    }
    
    static {
      defaultInstance = new FatigueDriving(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:FatigueDriving)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_FatigueDriving_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_FatigueDriving_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n?core/proto/terminal/setting/parameter/" +
      "java/FatigueDriving.proto\"\177\n\016FatigueDriv" +
      "ing\022\033\n\023continueDrivingTime\030\001 \002(\005\022 \n\030dayC" +
      "umulativeDrivingTime\030\002 \002(\005\022\026\n\016minResting" +
      "Time\030\003 \002(\005\022\026\n\016warningFatigue\030\004 \001(\005B]\nIco" +
      "m.navinfo.opentsp.platform.location.prot" +
      "ocol.terminal.setting.parameterB\020LCFatig" +
      "ueDriving"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_FatigueDriving_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_FatigueDriving_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_FatigueDriving_descriptor,
              new String[] { "ContinueDrivingTime", "DayCumulativeDrivingTime", "MinRestingTime", "WarningFatigue", },
              FatigueDriving.class,
              FatigueDriving.Builder.class);
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
