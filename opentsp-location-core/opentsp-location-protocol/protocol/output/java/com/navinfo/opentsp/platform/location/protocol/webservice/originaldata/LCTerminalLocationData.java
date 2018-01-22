// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/originaldata/java/TerminalLocationData.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.originaldata;

public final class LCTerminalLocationData {
  private LCTerminalLocationData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TerminalLocationDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 terminalId = 1;
    boolean hasTerminalId();
    long getTerminalId();
    
    // required .LocationData locationData = 2;
    boolean hasLocationData();
    com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData getLocationData();
    com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder getLocationDataOrBuilder();
  }
  public static final class TerminalLocationData extends
      com.google.protobuf.GeneratedMessage
      implements TerminalLocationDataOrBuilder {
    // Use TerminalLocationData.newBuilder() to construct.
    private TerminalLocationData(Builder builder) {
      super(builder);
    }
    private TerminalLocationData(boolean noInit) {}
    
    private static final TerminalLocationData defaultInstance;
    public static TerminalLocationData getDefaultInstance() {
      return defaultInstance;
    }
    
    public TerminalLocationData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.internal_static_TerminalLocationData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.internal_static_TerminalLocationData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 terminalId = 1;
    public static final int TERMINALID_FIELD_NUMBER = 1;
    private long terminalId_;
    public boolean hasTerminalId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getTerminalId() {
      return terminalId_;
    }
    
    // required .LocationData locationData = 2;
    public static final int LOCATIONDATA_FIELD_NUMBER = 2;
    private com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData locationData_;
    public boolean hasLocationData() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData getLocationData() {
      return locationData_;
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder getLocationDataOrBuilder() {
      return locationData_;
    }
    
    private void initFields() {
      terminalId_ = 0L;
      locationData_ = com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTerminalId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLocationData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getLocationData().isInitialized()) {
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
        output.writeInt64(1, terminalId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, locationData_);
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
          .computeInt64Size(1, terminalId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, locationData_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.internal_static_TerminalLocationData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.internal_static_TerminalLocationData_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getLocationDataFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        terminalId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (locationDataBuilder_ == null) {
          locationData_ = com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.getDefaultInstance();
        } else {
          locationDataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData build() {
        com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData result = new com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.terminalId_ = terminalId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (locationDataBuilder_ == null) {
          result.locationData_ = locationData_;
        } else {
          result.locationData_ = locationDataBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData.getDefaultInstance()) return this;
        if (other.hasTerminalId()) {
          setTerminalId(other.getTerminalId());
        }
        if (other.hasLocationData()) {
          mergeLocationData(other.getLocationData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTerminalId()) {
          
          return false;
        }
        if (!hasLocationData()) {
          
          return false;
        }
        if (!getLocationData().isInitialized()) {
          
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
              terminalId_ = input.readInt64();
              break;
            }
            case 18: {
              com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.newBuilder();
              if (hasLocationData()) {
                subBuilder.mergeFrom(getLocationData());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setLocationData(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 terminalId = 1;
      private long terminalId_ ;
      public boolean hasTerminalId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getTerminalId() {
        return terminalId_;
      }
      public Builder setTerminalId(long value) {
        bitField0_ |= 0x00000001;
        terminalId_ = value;
        onChanged();
        return this;
      }
      public Builder clearTerminalId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        terminalId_ = 0L;
        onChanged();
        return this;
      }
      
      // required .LocationData locationData = 2;
      private com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData locationData_ = com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder> locationDataBuilder_;
      public boolean hasLocationData() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData getLocationData() {
        if (locationDataBuilder_ == null) {
          return locationData_;
        } else {
          return locationDataBuilder_.getMessage();
        }
      }
      public Builder setLocationData(com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData value) {
        if (locationDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          locationData_ = value;
          onChanged();
        } else {
          locationDataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder setLocationData(
          com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder builderForValue) {
        if (locationDataBuilder_ == null) {
          locationData_ = builderForValue.build();
          onChanged();
        } else {
          locationDataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder mergeLocationData(com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData value) {
        if (locationDataBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              locationData_ != com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.getDefaultInstance()) {
            locationData_ =
              com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.newBuilder(locationData_).mergeFrom(value).buildPartial();
          } else {
            locationData_ = value;
          }
          onChanged();
        } else {
          locationDataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder clearLocationData() {
        if (locationDataBuilder_ == null) {
          locationData_ = com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.getDefaultInstance();
          onChanged();
        } else {
          locationDataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder getLocationDataBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getLocationDataFieldBuilder().getBuilder();
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder getLocationDataOrBuilder() {
        if (locationDataBuilder_ != null) {
          return locationDataBuilder_.getMessageOrBuilder();
        } else {
          return locationData_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder> 
          getLocationDataFieldBuilder() {
        if (locationDataBuilder_ == null) {
          locationDataBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder>(
                  locationData_,
                  getParentForChildren(),
                  isClean());
          locationData_ = null;
        }
        return locationDataBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:TerminalLocationData)
    }
    
    static {
      defaultInstance = new TerminalLocationData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:TerminalLocationData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TerminalLocationData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TerminalLocationData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBcore/proto/webservice/originaldata/jav" +
      "a/TerminalLocationData.proto\032)core/proto" +
      "/common/java/LocationData.proto\"O\n\024Termi" +
      "nalLocationData\022\022\n\nterminalId\030\001 \002(\003\022#\n\014l" +
      "ocationData\030\002 \002(\0132\r.LocationDataB`\nFcom." +
      "navinfo.opentsp.platform.location.protoc" +
      "ol.webservice.originaldataB\026LCTerminalLo" +
      "cationData"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TerminalLocationData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TerminalLocationData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TerminalLocationData_descriptor,
              new java.lang.String[] { "TerminalId", "LocationData", },
              com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData.class,
              com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalLocationData.TerminalLocationData.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
