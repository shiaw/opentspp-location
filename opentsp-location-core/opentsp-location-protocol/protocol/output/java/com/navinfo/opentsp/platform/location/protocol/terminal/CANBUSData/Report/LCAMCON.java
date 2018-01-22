// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/CANBUSData/Report/AMCON.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report;

public final class LCAMCON {
  private LCAMCON() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AMCONOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional float barometricPressure = 1;
    boolean hasBarometricPressure();
    float getBarometricPressure();
    
    // optional float ambientAirTemperature = 2;
    boolean hasAmbientAirTemperature();
    float getAmbientAirTemperature();
    
    // optional int32 airInletTemperature = 3;
    boolean hasAirInletTemperature();
    int getAirInletTemperature();
  }
  public static final class AMCON extends
      com.google.protobuf.GeneratedMessage
      implements AMCONOrBuilder {
    // Use AMCON.newBuilder() to construct.
    private AMCON(Builder builder) {
      super(builder);
    }
    private AMCON(boolean noInit) {}
    
    private static final AMCON defaultInstance;
    public static AMCON getDefaultInstance() {
      return defaultInstance;
    }
    
    public AMCON getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.internal_static_AMCON_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.internal_static_AMCON_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional float barometricPressure = 1;
    public static final int BAROMETRICPRESSURE_FIELD_NUMBER = 1;
    private float barometricPressure_;
    public boolean hasBarometricPressure() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public float getBarometricPressure() {
      return barometricPressure_;
    }
    
    // optional float ambientAirTemperature = 2;
    public static final int AMBIENTAIRTEMPERATURE_FIELD_NUMBER = 2;
    private float ambientAirTemperature_;
    public boolean hasAmbientAirTemperature() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public float getAmbientAirTemperature() {
      return ambientAirTemperature_;
    }
    
    // optional int32 airInletTemperature = 3;
    public static final int AIRINLETTEMPERATURE_FIELD_NUMBER = 3;
    private int airInletTemperature_;
    public boolean hasAirInletTemperature() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getAirInletTemperature() {
      return airInletTemperature_;
    }
    
    private void initFields() {
      barometricPressure_ = 0F;
      ambientAirTemperature_ = 0F;
      airInletTemperature_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeFloat(1, barometricPressure_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeFloat(2, ambientAirTemperature_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, airInletTemperature_);
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
          .computeFloatSize(1, barometricPressure_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, ambientAirTemperature_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, airInletTemperature_);
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
    
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON parseDelimitedFrom(
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
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON prototype) {
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
       implements com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCONOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.internal_static_AMCON_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.internal_static_AMCON_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON.newBuilder()
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
        barometricPressure_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000001);
        ambientAirTemperature_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        airInletTemperature_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON.getDescriptor();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON getDefaultInstanceForType() {
        return com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON.getDefaultInstance();
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON build() {
        com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON buildPartial() {
        com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON result = new com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.barometricPressure_ = barometricPressure_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.ambientAirTemperature_ = ambientAirTemperature_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.airInletTemperature_ = airInletTemperature_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON) {
          return mergeFrom((com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON other) {
        if (other == com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON.getDefaultInstance()) return this;
        if (other.hasBarometricPressure()) {
          setBarometricPressure(other.getBarometricPressure());
        }
        if (other.hasAmbientAirTemperature()) {
          setAmbientAirTemperature(other.getAmbientAirTemperature());
        }
        if (other.hasAirInletTemperature()) {
          setAirInletTemperature(other.getAirInletTemperature());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
              barometricPressure_ = input.readFloat();
              break;
            }
            case 21: {
              bitField0_ |= 0x00000002;
              ambientAirTemperature_ = input.readFloat();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              airInletTemperature_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional float barometricPressure = 1;
      private float barometricPressure_ ;
      public boolean hasBarometricPressure() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public float getBarometricPressure() {
        return barometricPressure_;
      }
      public Builder setBarometricPressure(float value) {
        bitField0_ |= 0x00000001;
        barometricPressure_ = value;
        onChanged();
        return this;
      }
      public Builder clearBarometricPressure() {
        bitField0_ = (bitField0_ & ~0x00000001);
        barometricPressure_ = 0F;
        onChanged();
        return this;
      }
      
      // optional float ambientAirTemperature = 2;
      private float ambientAirTemperature_ ;
      public boolean hasAmbientAirTemperature() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public float getAmbientAirTemperature() {
        return ambientAirTemperature_;
      }
      public Builder setAmbientAirTemperature(float value) {
        bitField0_ |= 0x00000002;
        ambientAirTemperature_ = value;
        onChanged();
        return this;
      }
      public Builder clearAmbientAirTemperature() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ambientAirTemperature_ = 0F;
        onChanged();
        return this;
      }
      
      // optional int32 airInletTemperature = 3;
      private int airInletTemperature_ ;
      public boolean hasAirInletTemperature() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getAirInletTemperature() {
        return airInletTemperature_;
      }
      public Builder setAirInletTemperature(int value) {
        bitField0_ |= 0x00000004;
        airInletTemperature_ = value;
        onChanged();
        return this;
      }
      public Builder clearAirInletTemperature() {
        bitField0_ = (bitField0_ & ~0x00000004);
        airInletTemperature_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:AMCON)
    }
    
    static {
      defaultInstance = new AMCON(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:AMCON)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_AMCON_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AMCON_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1core/proto/terminal/CANBUSData/Report/" +
      "AMCON.proto\"_\n\005AMCON\022\032\n\022barometricPressu" +
      "re\030\001 \001(\002\022\035\n\025ambientAirTemperature\030\002 \001(\002\022" +
      "\033\n\023airInletTemperature\030\003 \001(\005BT\nIcom.navi" +
      "nfo.opentsp.platform.location.protocol.t" +
      "erminal.CANBUSData.ReportB\007LCAMCON"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_AMCON_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_AMCON_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_AMCON_descriptor,
              new java.lang.String[] { "BarometricPressure", "AmbientAirTemperature", "AirInletTemperature", },
              com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON.class,
              com.navinfo.opentsp.platform.location.protocol.terminal.CANBUSData.Report.LCAMCON.AMCON.Builder.class);
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
