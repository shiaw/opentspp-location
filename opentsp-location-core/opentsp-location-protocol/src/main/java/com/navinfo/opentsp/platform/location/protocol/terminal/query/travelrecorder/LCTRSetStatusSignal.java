// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/query/travelrecorder/TRSetStatusSignal.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder;

public final class LCTRSetStatusSignal {
  private LCTRSetStatusSignal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TRSetStatusSignalOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 currentDate = 1;
    boolean hasCurrentDate();
    long getCurrentDate();
    
    // repeated .SignalData datas = 2;
    java.util.List<com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData> 
        getDatasList();
    com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData getDatas(int index);
    int getDatasCount();
    java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalDataOrBuilder> 
        getDatasOrBuilderList();
    com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalDataOrBuilder getDatasOrBuilder(
            int index);
  }
  public static final class TRSetStatusSignal extends
      com.google.protobuf.GeneratedMessage
      implements TRSetStatusSignalOrBuilder {
    // Use TRSetStatusSignal.newBuilder() to construct.
    private TRSetStatusSignal(Builder builder) {
      super(builder);
    }
    private TRSetStatusSignal(boolean noInit) {}
    
    private static final TRSetStatusSignal defaultInstance;
    public static TRSetStatusSignal getDefaultInstance() {
      return defaultInstance;
    }
    
    public TRSetStatusSignal getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCTRSetStatusSignal.internal_static_TRSetStatusSignal_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCTRSetStatusSignal.internal_static_TRSetStatusSignal_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 currentDate = 1;
    public static final int CURRENTDATE_FIELD_NUMBER = 1;
    private long currentDate_;
    public boolean hasCurrentDate() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getCurrentDate() {
      return currentDate_;
    }
    
    // repeated .SignalData datas = 2;
    public static final int DATAS_FIELD_NUMBER = 2;
    private java.util.List<com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData> datas_;
    public java.util.List<com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData> getDatasList() {
      return datas_;
    }
    public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalDataOrBuilder> 
        getDatasOrBuilderList() {
      return datas_;
    }
    public int getDatasCount() {
      return datas_.size();
    }
    public com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData getDatas(int index) {
      return datas_.get(index);
    }
    public com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalDataOrBuilder getDatasOrBuilder(
        int index) {
      return datas_.get(index);
    }
    
    private void initFields() {
      currentDate_ = 0L;
      datas_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasCurrentDate()) {
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
        output.writeInt64(1, currentDate_);
      }
      for (int i = 0; i < datas_.size(); i++) {
        output.writeMessage(2, datas_.get(i));
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
          .computeInt64Size(1, currentDate_);
      }
      for (int i = 0; i < datas_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, datas_.get(i));
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
    
    public static TRSetStatusSignal parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TRSetStatusSignal parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TRSetStatusSignal parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static TRSetStatusSignal parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static TRSetStatusSignal parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TRSetStatusSignal parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static TRSetStatusSignal parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static TRSetStatusSignal parseDelimitedFrom(
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
    public static TRSetStatusSignal parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static TRSetStatusSignal parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(TRSetStatusSignal prototype) {
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
       implements TRSetStatusSignalOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCTRSetStatusSignal.internal_static_TRSetStatusSignal_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCTRSetStatusSignal.internal_static_TRSetStatusSignal_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.LCTRSetStatusSignal.TRSetStatusSignal.newBuilder()
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
        currentDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (datasBuilder_ == null) {
          datas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
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
        return TRSetStatusSignal.getDescriptor();
      }
      
      public TRSetStatusSignal getDefaultInstanceForType() {
        return TRSetStatusSignal.getDefaultInstance();
      }
      
      public TRSetStatusSignal build() {
        TRSetStatusSignal result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private TRSetStatusSignal buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        TRSetStatusSignal result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public TRSetStatusSignal buildPartial() {
        TRSetStatusSignal result = new TRSetStatusSignal(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.currentDate_ = currentDate_;
        if (datasBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            datas_ = java.util.Collections.unmodifiableList(datas_);
            bitField0_ = (bitField0_ & ~0x00000002);
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
        if (other instanceof TRSetStatusSignal) {
          return mergeFrom((TRSetStatusSignal)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(TRSetStatusSignal other) {
        if (other == TRSetStatusSignal.getDefaultInstance()) return this;
        if (other.hasCurrentDate()) {
          setCurrentDate(other.getCurrentDate());
        }
        if (datasBuilder_ == null) {
          if (!other.datas_.isEmpty()) {
            if (datas_.isEmpty()) {
              datas_ = other.datas_;
              bitField0_ = (bitField0_ & ~0x00000002);
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
              bitField0_ = (bitField0_ & ~0x00000002);
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
        if (!hasCurrentDate()) {
          
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
              currentDate_ = input.readInt64();
              break;
            }
            case 18: {
              com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addDatas(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 currentDate = 1;
      private long currentDate_ ;
      public boolean hasCurrentDate() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getCurrentDate() {
        return currentDate_;
      }
      public Builder setCurrentDate(long value) {
        bitField0_ |= 0x00000001;
        currentDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearCurrentDate() {
        bitField0_ = (bitField0_ & ~0x00000001);
        currentDate_ = 0L;
        onChanged();
        return this;
      }
      
      // repeated .SignalData datas = 2;
      private java.util.List<com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData> datas_ =
        java.util.Collections.emptyList();
      private void ensureDatasIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          datas_ = new java.util.ArrayList<com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData>(datas_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData, com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.Builder, com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalDataOrBuilder> datasBuilder_;
      
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData> getDatasList() {
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
      public com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData getDatas(int index) {
        if (datasBuilder_ == null) {
          return datas_.get(index);
        } else {
          return datasBuilder_.getMessage(index);
        }
      }
      public Builder setDatas(
          int index, com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData value) {
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
          int index, com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.Builder builderForValue) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          datas_.set(index, builderForValue.build());
          onChanged();
        } else {
          datasBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addDatas(com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData value) {
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
          int index, com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData value) {
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
          com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.Builder builderForValue) {
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
          int index, com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.Builder builderForValue) {
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
          Iterable<? extends com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData> values) {
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
          bitField0_ = (bitField0_ & ~0x00000002);
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
      public com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.Builder getDatasBuilder(
          int index) {
        return getDatasFieldBuilder().getBuilder(index);
      }
      public com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalDataOrBuilder getDatasOrBuilder(
          int index) {
        if (datasBuilder_ == null) {
          return datas_.get(index);  } else {
          return datasBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalDataOrBuilder> 
           getDatasOrBuilderList() {
        if (datasBuilder_ != null) {
          return datasBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(datas_);
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.Builder addDatasBuilder() {
        return getDatasFieldBuilder().addBuilder(
            com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.getDefaultInstance());
      }
      public com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.Builder addDatasBuilder(
          int index) {
        return getDatasFieldBuilder().addBuilder(
            index, com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.getDefaultInstance());
      }
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.Builder> 
           getDatasBuilderList() {
        return getDatasFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData, com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.Builder, com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalDataOrBuilder> 
          getDatasFieldBuilder() {
        if (datasBuilder_ == null) {
          datasBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData, com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalData.Builder, com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.SignalDataOrBuilder>(
                  datas_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          datas_ = null;
        }
        return datasBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:TRSetStatusSignal)
    }
    
    static {
      defaultInstance = new TRSetStatusSignal(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:TRSetStatusSignal)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_TRSetStatusSignal_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TRSetStatusSignal_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n@core/proto/terminal/query/travelrecord" +
      "er/TRSetStatusSignal.proto\032+core/proto/c" +
      "ommon/java/ResponseResult.proto\032Dcore/pr" +
      "oto/terminal/query/travelrecorder/block/" +
      "java/SignalData.proto\"D\n\021TRSetStatusSign" +
      "al\022\023\n\013currentDate\030\001 \002(\003\022\032\n\005datas\030\002 \003(\0132\013" +
      ".SignalDataBc\nLcom.navinfo.opentsp.platf" +
      "orm.location.protocol.terminal.query.tra" +
      "velrecorderB\023LCTRSetStatusSignal"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_TRSetStatusSignal_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_TRSetStatusSignal_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_TRSetStatusSignal_descriptor,
              new String[] { "CurrentDate", "Datas", },
              TRSetStatusSignal.class,
              TRSetStatusSignal.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.common.LCResponseResult.getDescriptor(),
          com.navinfo.opentsp.platform.location.protocol.terminal.query.travelrecorder.block.LCSignalData.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}