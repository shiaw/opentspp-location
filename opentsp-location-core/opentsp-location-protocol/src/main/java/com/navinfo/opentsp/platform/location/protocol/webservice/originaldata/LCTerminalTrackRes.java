// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/originaldata/java/TerminalTrackRes.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.originaldata;

public final class LCTerminalTrackRes {
  private LCTerminalTrackRes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TerminalTrackResOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 statusCode = 1;
    boolean hasStatusCode();
    int getStatusCode();
    
    // optional int32 totalRecords = 2;
    boolean hasTotalRecords();
    int getTotalRecords();
    
    // repeated .TerminalLocationData datas = 3;
    java.util.List<LCTerminalLocationData.TerminalLocationData>
        getDatasList();
    LCTerminalLocationData.TerminalLocationData getDatas(int index);
    int getDatasCount();
    java.util.List<? extends LCTerminalLocationData.TerminalLocationDataOrBuilder>
        getDatasOrBuilderList();
    LCTerminalLocationData.TerminalLocationDataOrBuilder getDatasOrBuilder(
            int index);
  }
  public static final class TerminalTrackRes extends
      com.google.protobuf.GeneratedMessage
      implements TerminalTrackResOrBuilder {
    // Use TerminalTrackRes.newBuilder() to construct.
    private TerminalTrackRes(Builder builder) {
      super(builder);
    }
    private TerminalTrackRes(boolean noInit) {}
    
    private static final TerminalTrackRes defaultInstance;
    public static TerminalTrackRes getDefaultInstance() {
      return defaultInstance;
    }
    
    public TerminalTrackRes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCTerminalTrackRes.internal_static_TerminalTrackRes_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCTerminalTrackRes.internal_static_TerminalTrackRes_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 statusCode = 1;
    public static final int STATUSCODE_FIELD_NUMBER = 1;
    private int statusCode_;
    public boolean hasStatusCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getStatusCode() {
      return statusCode_;
    }
    
    // optional int32 totalRecords = 2;
    public static final int TOTALRECORDS_FIELD_NUMBER = 2;
    private int totalRecords_;
    public boolean hasTotalRecords() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getTotalRecords() {
      return totalRecords_;
    }
    
    // repeated .TerminalLocationData datas = 3;
    public static final int DATAS_FIELD_NUMBER = 3;
    private java.util.List<LCTerminalLocationData.TerminalLocationData> datas_;
    public java.util.List<LCTerminalLocationData.TerminalLocationData> getDatasList() {
      return datas_;
    }
    public java.util.List<? extends LCTerminalLocationData.TerminalLocationDataOrBuilder>
        getDatasOrBuilderList() {
      return datas_;
    }
    public int getDatasCount() {
      return datas_.size();
    }
    public LCTerminalLocationData.TerminalLocationData getDatas(int index) {
      return datas_.get(index);
    }
    public LCTerminalLocationData.TerminalLocationDataOrBuilder getDatasOrBuilder(
        int index) {
      return datas_.get(index);
    }
    
    private void initFields() {
      statusCode_ = 0;
      totalRecords_ = 0;
      datas_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasStatusCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getDatasCount(); i++) {
        if (!getDatas(i).isInitialized()) {
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
        output.writeInt32(1, statusCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, totalRecords_);
      }
      for (int i = 0; i < datas_.size(); i++) {
        output.writeMessage(3, datas_.get(i));
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
          .computeInt32Size(1, statusCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, totalRecords_);
      }
      for (int i = 0; i < datas_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, datas_.get(i));
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
    
    public static TerminalTrackRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TerminalTrackRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TerminalTrackRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TerminalTrackRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TerminalTrackRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TerminalTrackRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static TerminalTrackRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static TerminalTrackRes parseDelimitedFrom(
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
    public static TerminalTrackRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TerminalTrackRes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(TerminalTrackRes prototype) {
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
       implements TerminalTrackResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCTerminalTrackRes.internal_static_TerminalTrackRes_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCTerminalTrackRes.internal_static_TerminalTrackRes_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCTerminalTrackRes.TerminalTrackRes.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getDatasFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        statusCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        totalRecords_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (datasBuilder_ == null) {
          datas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          datasBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TerminalTrackRes.getDescriptor();
      }
      
      public TerminalTrackRes getDefaultInstanceForType() {
        return TerminalTrackRes.getDefaultInstance();
      }
      
      public TerminalTrackRes build() {
        TerminalTrackRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private TerminalTrackRes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        TerminalTrackRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public TerminalTrackRes buildPartial() {
        TerminalTrackRes result = new TerminalTrackRes(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.statusCode_ = statusCode_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.totalRecords_ = totalRecords_;
        if (datasBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            datas_ = java.util.Collections.unmodifiableList(datas_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.datas_ = datas_;
        } else {
          result.datas_ = datasBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TerminalTrackRes) {
          return mergeFrom((TerminalTrackRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(TerminalTrackRes other) {
        if (other == TerminalTrackRes.getDefaultInstance()) return this;
        if (other.hasStatusCode()) {
          setStatusCode(other.getStatusCode());
        }
        if (other.hasTotalRecords()) {
          setTotalRecords(other.getTotalRecords());
        }
        if (datasBuilder_ == null) {
          if (!other.datas_.isEmpty()) {
            if (datas_.isEmpty()) {
              datas_ = other.datas_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureDatasIsMutable();
              datas_.addAll(other.datas_);
            }
            onChanged();
          }
        } else {
          if (!other.datas_.isEmpty()) {
            if (datasBuilder_.isEmpty()) {
              datasBuilder_.dispose();
              datasBuilder_ = null;
              datas_ = other.datas_;
              bitField0_ = (bitField0_ & ~0x00000004);
              datasBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getDatasFieldBuilder() : null;
            } else {
              datasBuilder_.addAllMessages(other.datas_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasStatusCode()) {
          
          return false;
        }
        for (int i = 0; i < getDatasCount(); i++) {
          if (!getDatas(i).isInitialized()) {
            
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
              statusCode_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              totalRecords_ = input.readInt32();
              break;
            }
            case 26: {
              LCTerminalLocationData.TerminalLocationData.Builder subBuilder = LCTerminalLocationData.TerminalLocationData.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addDatas(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 statusCode = 1;
      private int statusCode_ ;
      public boolean hasStatusCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getStatusCode() {
        return statusCode_;
      }
      public Builder setStatusCode(int value) {
        bitField0_ |= 0x00000001;
        statusCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearStatusCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        statusCode_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 totalRecords = 2;
      private int totalRecords_ ;
      public boolean hasTotalRecords() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getTotalRecords() {
        return totalRecords_;
      }
      public Builder setTotalRecords(int value) {
        bitField0_ |= 0x00000002;
        totalRecords_ = value;
        onChanged();
        return this;
      }
      public Builder clearTotalRecords() {
        bitField0_ = (bitField0_ & ~0x00000002);
        totalRecords_ = 0;
        onChanged();
        return this;
      }
      
      // repeated .TerminalLocationData datas = 3;
      private java.util.List<LCTerminalLocationData.TerminalLocationData> datas_ =
        java.util.Collections.emptyList();
      private void ensureDatasIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          datas_ = new java.util.ArrayList<LCTerminalLocationData.TerminalLocationData>(datas_);
          bitField0_ |= 0x00000004;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          LCTerminalLocationData.TerminalLocationData, LCTerminalLocationData.TerminalLocationData.Builder, LCTerminalLocationData.TerminalLocationDataOrBuilder> datasBuilder_;
      
      public java.util.List<LCTerminalLocationData.TerminalLocationData> getDatasList() {
        if (datasBuilder_ == null) {
          return java.util.Collections.unmodifiableList(datas_);
        } else {
          return datasBuilder_.getMessageList();
        }
      }
      public int getDatasCount() {
        if (datasBuilder_ == null) {
          return datas_.size();
        } else {
          return datasBuilder_.getCount();
        }
      }
      public LCTerminalLocationData.TerminalLocationData getDatas(int index) {
        if (datasBuilder_ == null) {
          return datas_.get(index);
        } else {
          return datasBuilder_.getMessage(index);
        }
      }
      public Builder setDatas(
          int index, LCTerminalLocationData.TerminalLocationData value) {
        if (datasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDatasIsMutable();
          datas_.set(index, value);
          onChanged();
        } else {
          datasBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setDatas(
          int index, LCTerminalLocationData.TerminalLocationData.Builder builderForValue) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          datas_.set(index, builderForValue.build());
          onChanged();
        } else {
          datasBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addDatas(LCTerminalLocationData.TerminalLocationData value) {
        if (datasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDatasIsMutable();
          datas_.add(value);
          onChanged();
        } else {
          datasBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addDatas(
          int index, LCTerminalLocationData.TerminalLocationData value) {
        if (datasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDatasIsMutable();
          datas_.add(index, value);
          onChanged();
        } else {
          datasBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addDatas(
          LCTerminalLocationData.TerminalLocationData.Builder builderForValue) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          datas_.add(builderForValue.build());
          onChanged();
        } else {
          datasBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addDatas(
          int index, LCTerminalLocationData.TerminalLocationData.Builder builderForValue) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          datas_.add(index, builderForValue.build());
          onChanged();
        } else {
          datasBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllDatas(
          Iterable<? extends LCTerminalLocationData.TerminalLocationData> values) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          super.addAll(values, datas_);
          onChanged();
        } else {
          datasBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearDatas() {
        if (datasBuilder_ == null) {
          datas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          datasBuilder_.clear();
        }
        return this;
      }
      public Builder removeDatas(int index) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          datas_.remove(index);
          onChanged();
        } else {
          datasBuilder_.remove(index);
        }
        return this;
      }
      public LCTerminalLocationData.TerminalLocationData.Builder getDatasBuilder(
          int index) {
        return getDatasFieldBuilder().getBuilder(index);
      }
      public LCTerminalLocationData.TerminalLocationDataOrBuilder getDatasOrBuilder(
          int index) {
        if (datasBuilder_ == null) {
          return datas_.get(index);  } else {
          return datasBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends LCTerminalLocationData.TerminalLocationDataOrBuilder>
           getDatasOrBuilderList() {
        if (datasBuilder_ != null) {
          return datasBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(datas_);
        }
      }
      public LCTerminalLocationData.TerminalLocationData.Builder addDatasBuilder() {
        return getDatasFieldBuilder().addBuilder(
            LCTerminalLocationData.TerminalLocationData.getDefaultInstance());
      }
      public LCTerminalLocationData.TerminalLocationData.Builder addDatasBuilder(
          int index) {
        return getDatasFieldBuilder().addBuilder(
            index, LCTerminalLocationData.TerminalLocationData.getDefaultInstance());
      }
      public java.util.List<LCTerminalLocationData.TerminalLocationData.Builder>
           getDatasBuilderList() {
        return getDatasFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          LCTerminalLocationData.TerminalLocationData, LCTerminalLocationData.TerminalLocationData.Builder, LCTerminalLocationData.TerminalLocationDataOrBuilder>
          getDatasFieldBuilder() {
        if (datasBuilder_ == null) {
          datasBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              LCTerminalLocationData.TerminalLocationData, LCTerminalLocationData.TerminalLocationData.Builder, LCTerminalLocationData.TerminalLocationDataOrBuilder>(
                  datas_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          datas_ = null;
        }
        return datasBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:TerminalTrackRes)
    }
    
    static {
      defaultInstance = new TerminalTrackRes(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:TerminalTrackRes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TerminalTrackRes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TerminalTrackRes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n>core/proto/webservice/originaldata/jav" +
      "a/TerminalTrackRes.proto\032Bcore/proto/web" +
      "service/originaldata/java/TerminalLocati" +
      "onData.proto\"b\n\020TerminalTrackRes\022\022\n\nstat" +
      "usCode\030\001 \002(\005\022\024\n\014totalRecords\030\002 \001(\005\022$\n\005da" +
      "tas\030\003 \003(\0132\025.TerminalLocationDataB\\\nFcom." +
      "navinfo.opentsp.platform.location.protoc" +
      "ol.webservice.originaldataB\022LCTerminalTr" +
      "ackRes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TerminalTrackRes_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TerminalTrackRes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TerminalTrackRes_descriptor,
              new String[] { "StatusCode", "TotalRecords", "Datas", },
              TerminalTrackRes.class,
              TerminalTrackRes.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          LCTerminalLocationData.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
