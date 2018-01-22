// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/monitor/java/MultimediaUpload.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.monitor;

public final class LCMultimediaUpload {
  private LCMultimediaUpload() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MultimediaUploadOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 mediaId = 1;
    boolean hasMediaId();
    long getMediaId();
    
    // required .MediaType types = 2;
    boolean hasTypes();
    com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.MediaType getTypes();
    
    // required .FormatEncoding encode = 3;
    boolean hasEncode();
    com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.FormatEncoding getEncode();
    
    // required .EventCode events = 4;
    boolean hasEvents();
    com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.EventCode getEvents();
    
    // required int32 channels = 5;
    boolean hasChannels();
    int getChannels();
    
    // optional .LocationData locationData = 6;
    boolean hasLocationData();
    com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData getLocationData();
    com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder getLocationDataOrBuilder();
    
    // optional bytes mediaData = 7;
    boolean hasMediaData();
    com.google.protobuf.ByteString getMediaData();
  }
  public static final class MultimediaUpload extends
      com.google.protobuf.GeneratedMessage
      implements MultimediaUploadOrBuilder {
    // Use MultimediaUpload.newBuilder() to construct.
    private MultimediaUpload(Builder builder) {
      super(builder);
    }
    private MultimediaUpload(boolean noInit) {}
    
    private static final MultimediaUpload defaultInstance;
    public static MultimediaUpload getDefaultInstance() {
      return defaultInstance;
    }
    
    public MultimediaUpload getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.internal_static_MultimediaUpload_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.internal_static_MultimediaUpload_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 mediaId = 1;
    public static final int MEDIAID_FIELD_NUMBER = 1;
    private long mediaId_;
    public boolean hasMediaId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getMediaId() {
      return mediaId_;
    }
    
    // required .MediaType types = 2;
    public static final int TYPES_FIELD_NUMBER = 2;
    private com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.MediaType types_;
    public boolean hasTypes() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.MediaType getTypes() {
      return types_;
    }
    
    // required .FormatEncoding encode = 3;
    public static final int ENCODE_FIELD_NUMBER = 3;
    private com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.FormatEncoding encode_;
    public boolean hasEncode() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.FormatEncoding getEncode() {
      return encode_;
    }
    
    // required .EventCode events = 4;
    public static final int EVENTS_FIELD_NUMBER = 4;
    private com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.EventCode events_;
    public boolean hasEvents() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.EventCode getEvents() {
      return events_;
    }
    
    // required int32 channels = 5;
    public static final int CHANNELS_FIELD_NUMBER = 5;
    private int channels_;
    public boolean hasChannels() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getChannels() {
      return channels_;
    }
    
    // optional .LocationData locationData = 6;
    public static final int LOCATIONDATA_FIELD_NUMBER = 6;
    private com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData locationData_;
    public boolean hasLocationData() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData getLocationData() {
      return locationData_;
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder getLocationDataOrBuilder() {
      return locationData_;
    }
    
    // optional bytes mediaData = 7;
    public static final int MEDIADATA_FIELD_NUMBER = 7;
    private com.google.protobuf.ByteString mediaData_;
    public boolean hasMediaData() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public com.google.protobuf.ByteString getMediaData() {
      return mediaData_;
    }
    
    private void initFields() {
      mediaId_ = 0L;
      types_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.MediaType.picture;
      encode_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.FormatEncoding.picture_jpeg;
      events_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.EventCode.platformSend;
      channels_ = 0;
      locationData_ = com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.getDefaultInstance();
      mediaData_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasMediaId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTypes()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEncode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEvents()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasChannels()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasLocationData()) {
        if (!getLocationData().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, mediaId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, types_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, encode_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, events_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, channels_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeMessage(6, locationData_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, mediaData_);
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
          .computeInt64Size(1, mediaId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, types_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, encode_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, events_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, channels_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, locationData_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, mediaData_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUploadOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.internal_static_MultimediaUpload_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.internal_static_MultimediaUpload_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload.newBuilder()
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
        mediaId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        types_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.MediaType.picture;
        bitField0_ = (bitField0_ & ~0x00000002);
        encode_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.FormatEncoding.picture_jpeg;
        bitField0_ = (bitField0_ & ~0x00000004);
        events_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.EventCode.platformSend;
        bitField0_ = (bitField0_ & ~0x00000008);
        channels_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        if (locationDataBuilder_ == null) {
          locationData_ = com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.getDefaultInstance();
        } else {
          locationDataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        mediaData_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload build() {
        com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload result = new com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.mediaId_ = mediaId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.types_ = types_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.encode_ = encode_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.events_ = events_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.channels_ = channels_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        if (locationDataBuilder_ == null) {
          result.locationData_ = locationData_;
        } else {
          result.locationData_ = locationDataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.mediaData_ = mediaData_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload.getDefaultInstance()) return this;
        if (other.hasMediaId()) {
          setMediaId(other.getMediaId());
        }
        if (other.hasTypes()) {
          setTypes(other.getTypes());
        }
        if (other.hasEncode()) {
          setEncode(other.getEncode());
        }
        if (other.hasEvents()) {
          setEvents(other.getEvents());
        }
        if (other.hasChannels()) {
          setChannels(other.getChannels());
        }
        if (other.hasLocationData()) {
          mergeLocationData(other.getLocationData());
        }
        if (other.hasMediaData()) {
          setMediaData(other.getMediaData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasMediaId()) {
          
          return false;
        }
        if (!hasTypes()) {
          
          return false;
        }
        if (!hasEncode()) {
          
          return false;
        }
        if (!hasEvents()) {
          
          return false;
        }
        if (!hasChannels()) {
          
          return false;
        }
        if (hasLocationData()) {
          if (!getLocationData().isInitialized()) {
            
            return false;
          }
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
              mediaId_ = input.readInt64();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.MediaType value = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.MediaType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                types_ = value;
              }
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.FormatEncoding value = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.FormatEncoding.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                encode_ = value;
              }
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.EventCode value = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.EventCode.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                events_ = value;
              }
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              channels_ = input.readInt32();
              break;
            }
            case 50: {
              com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.newBuilder();
              if (hasLocationData()) {
                subBuilder.mergeFrom(getLocationData());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setLocationData(subBuilder.buildPartial());
              break;
            }
            case 58: {
              bitField0_ |= 0x00000040;
              mediaData_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 mediaId = 1;
      private long mediaId_ ;
      public boolean hasMediaId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getMediaId() {
        return mediaId_;
      }
      public Builder setMediaId(long value) {
        bitField0_ |= 0x00000001;
        mediaId_ = value;
        onChanged();
        return this;
      }
      public Builder clearMediaId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        mediaId_ = 0L;
        onChanged();
        return this;
      }
      
      // required .MediaType types = 2;
      private com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.MediaType types_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.MediaType.picture;
      public boolean hasTypes() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.MediaType getTypes() {
        return types_;
      }
      public Builder setTypes(com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.MediaType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        types_ = value;
        onChanged();
        return this;
      }
      public Builder clearTypes() {
        bitField0_ = (bitField0_ & ~0x00000002);
        types_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.MediaType.picture;
        onChanged();
        return this;
      }
      
      // required .FormatEncoding encode = 3;
      private com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.FormatEncoding encode_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.FormatEncoding.picture_jpeg;
      public boolean hasEncode() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.FormatEncoding getEncode() {
        return encode_;
      }
      public Builder setEncode(com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.FormatEncoding value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        encode_ = value;
        onChanged();
        return this;
      }
      public Builder clearEncode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        encode_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.FormatEncoding.picture_jpeg;
        onChanged();
        return this;
      }
      
      // required .EventCode events = 4;
      private com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.EventCode events_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.EventCode.platformSend;
      public boolean hasEvents() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.EventCode getEvents() {
        return events_;
      }
      public Builder setEvents(com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.EventCode value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        events_ = value;
        onChanged();
        return this;
      }
      public Builder clearEvents() {
        bitField0_ = (bitField0_ & ~0x00000008);
        events_ = com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.EventCode.platformSend;
        onChanged();
        return this;
      }
      
      // required int32 channels = 5;
      private int channels_ ;
      public boolean hasChannels() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getChannels() {
        return channels_;
      }
      public Builder setChannels(int value) {
        bitField0_ |= 0x00000010;
        channels_ = value;
        onChanged();
        return this;
      }
      public Builder clearChannels() {
        bitField0_ = (bitField0_ & ~0x00000010);
        channels_ = 0;
        onChanged();
        return this;
      }
      
      // optional .LocationData locationData = 6;
      private com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData locationData_ = com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder, com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationDataOrBuilder> locationDataBuilder_;
      public boolean hasLocationData() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
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
        bitField0_ |= 0x00000020;
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
        bitField0_ |= 0x00000020;
        return this;
      }
      public Builder mergeLocationData(com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData value) {
        if (locationDataBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020) &&
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
        bitField0_ |= 0x00000020;
        return this;
      }
      public Builder clearLocationData() {
        if (locationDataBuilder_ == null) {
          locationData_ = com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.getDefaultInstance();
          onChanged();
        } else {
          locationDataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData.Builder getLocationDataBuilder() {
        bitField0_ |= 0x00000020;
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
      
      // optional bytes mediaData = 7;
      private com.google.protobuf.ByteString mediaData_ = com.google.protobuf.ByteString.EMPTY;
      public boolean hasMediaData() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public com.google.protobuf.ByteString getMediaData() {
        return mediaData_;
      }
      public Builder setMediaData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        mediaData_ = value;
        onChanged();
        return this;
      }
      public Builder clearMediaData() {
        bitField0_ = (bitField0_ & ~0x00000040);
        mediaData_ = getDefaultInstance().getMediaData();
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:MultimediaUpload)
    }
    
    static {
      defaultInstance = new MultimediaUpload(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:MultimediaUpload)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MultimediaUpload_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MultimediaUpload_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7core/proto/terminal/monitor/java/Multi" +
      "mediaUpload.proto\032)core/proto/common/jav" +
      "a/LocationData.proto\032/core/proto/termina" +
      "l/common/java/MediaType.proto\032/core/prot" +
      "o/terminal/common/java/EventCode.proto\0320" +
      "core/proto/terminal/common/java/Resoluti" +
      "on.proto\0324core/proto/terminal/common/jav" +
      "a/FormatEncoding.proto\"\305\001\n\020MultimediaUpl" +
      "oad\022\017\n\007mediaId\030\001 \002(\003\022\031\n\005types\030\002 \002(\0162\n.Me" +
      "diaType\022\037\n\006encode\030\003 \002(\0162\017.FormatEncoding",
      "\022\032\n\006events\030\004 \002(\0162\n.EventCode\022\020\n\010channels" +
      "\030\005 \002(\005\022#\n\014locationData\030\006 \001(\0132\r.LocationD" +
      "ata\022\021\n\tmediaData\030\007 \001(\014BU\n?com.navinfo.op" +
      "entsp.platform.location.protocol.termina" +
      "l.monitorB\022LCMultimediaUpload"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_MultimediaUpload_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_MultimediaUpload_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MultimediaUpload_descriptor,
              new java.lang.String[] { "MediaId", "Types", "Encode", "Events", "Channels", "LocationData", "MediaData", },
              com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload.class,
              com.navinfo.opentsp.platform.location.protocol.terminal.monitor.LCMultimediaUpload.MultimediaUpload.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.getDescriptor(),
          com.navinfo.opentsp.platform.location.protocol.terminal.common.LCMediaType.getDescriptor(),
          com.navinfo.opentsp.platform.location.protocol.terminal.common.LCEventCode.getDescriptor(),
          com.navinfo.opentsp.platform.location.protocol.terminal.common.LCResolution.getDescriptor(),
          com.navinfo.opentsp.platform.location.protocol.terminal.common.LCFormatEncoding.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
