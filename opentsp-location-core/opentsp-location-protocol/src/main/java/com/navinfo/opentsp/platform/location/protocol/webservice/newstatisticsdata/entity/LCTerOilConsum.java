// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/newstatisticsdata/entity/TerOilConsum.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity;

public final class LCTerOilConsum {
  private LCTerOilConsum() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TerOilConsumOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 terminalID = 1;
    boolean hasTerminalID();
    long getTerminalID();
    
    // required int32 type = 2;
    boolean hasType();
    int getType();
  }
  public static final class TerOilConsum extends
      com.google.protobuf.GeneratedMessage
      implements TerOilConsumOrBuilder {
    // Use TerOilConsum.newBuilder() to construct.
    private TerOilConsum(Builder builder) {
      super(builder);
    }
    private TerOilConsum(boolean noInit) {}
    
    private static final TerOilConsum defaultInstance;
    public static TerOilConsum getDefaultInstance() {
      return defaultInstance;
    }
    
    public TerOilConsum getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCTerOilConsum.internal_static_TerOilConsum_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCTerOilConsum.internal_static_TerOilConsum_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 terminalID = 1;
    public static final int TERMINALID_FIELD_NUMBER = 1;
    private long terminalID_;
    public boolean hasTerminalID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getTerminalID() {
      return terminalID_;
    }
    
    // required int32 type = 2;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getType() {
      return type_;
    }
    
    private void initFields() {
      terminalID_ = 0L;
      type_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTerminalID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
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
        output.writeInt64(1, terminalID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, type_);
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
          .computeInt64Size(1, terminalID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, type_);
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
    
    public static TerOilConsum parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TerOilConsum parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TerOilConsum parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TerOilConsum parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TerOilConsum parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TerOilConsum parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static TerOilConsum parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static TerOilConsum parseDelimitedFrom(
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
    public static TerOilConsum parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TerOilConsum parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(TerOilConsum prototype) {
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
       implements TerOilConsumOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCTerOilConsum.internal_static_TerOilConsum_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCTerOilConsum.internal_static_TerOilConsum_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.newstatisticsdata.entity.LCTerOilConsum.TerOilConsum.newBuilder()
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
        terminalID_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TerOilConsum.getDescriptor();
      }
      
      public TerOilConsum getDefaultInstanceForType() {
        return TerOilConsum.getDefaultInstance();
      }
      
      public TerOilConsum build() {
        TerOilConsum result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private TerOilConsum buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        TerOilConsum result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public TerOilConsum buildPartial() {
        TerOilConsum result = new TerOilConsum(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.terminalID_ = terminalID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TerOilConsum) {
          return mergeFrom((TerOilConsum)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(TerOilConsum other) {
        if (other == TerOilConsum.getDefaultInstance()) return this;
        if (other.hasTerminalID()) {
          setTerminalID(other.getTerminalID());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTerminalID()) {
          
          return false;
        }
        if (!hasType()) {
          
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
              terminalID_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              type_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 terminalID = 1;
      private long terminalID_ ;
      public boolean hasTerminalID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getTerminalID() {
        return terminalID_;
      }
      public Builder setTerminalID(long value) {
        bitField0_ |= 0x00000001;
        terminalID_ = value;
        onChanged();
        return this;
      }
      public Builder clearTerminalID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        terminalID_ = 0L;
        onChanged();
        return this;
      }
      
      // required int32 type = 2;
      private int type_ ;
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getType() {
        return type_;
      }
      public Builder setType(int value) {
        bitField0_ |= 0x00000002;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:TerOilConsum)
    }
    
    static {
      defaultInstance = new TerOilConsum(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:TerOilConsum)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TerOilConsum_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TerOilConsum_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nAcore/proto/webservice/newstatisticsdat" +
      "a/entity/TerOilConsum.proto\"0\n\014TerOilCon" +
      "sum\022\022\n\nterminalID\030\001 \002(\003\022\014\n\004type\030\002 \002(\005Bd\n" +
      "Rcom.navinfo.opentsp.platform.location.p" +
      "rotocol.webservice.newstatisticsdata.ent" +
      "ityB\016LCTerOilConsum"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TerOilConsum_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TerOilConsum_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TerOilConsum_descriptor,
              new String[] { "TerminalID", "Type", },
              TerOilConsum.class,
              TerOilConsum.Builder.class);
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
