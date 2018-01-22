// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/webservice/originaldata/java/QueryRegularDataRes.proto

package com.navinfo.opentsp.platform.location.protocol.webservice.originaldata;

public final class LCQueryRegularDataRes {
  private LCQueryRegularDataRes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface QueryRegularDataResOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .RegularData datas = 1;
    java.util.List<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData> 
        getDatasList();
    com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData getDatas(int index);
    int getDatasCount();
    java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularDataOrBuilder> 
        getDatasOrBuilderList();
    com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularDataOrBuilder getDatasOrBuilder(
            int index);
  }
  public static final class QueryRegularDataRes extends
      com.google.protobuf.GeneratedMessage
      implements QueryRegularDataResOrBuilder {
    // Use QueryRegularDataRes.newBuilder() to construct.
    private QueryRegularDataRes(Builder builder) {
      super(builder);
    }
    private QueryRegularDataRes(boolean noInit) {}
    
    private static final QueryRegularDataRes defaultInstance;
    public static QueryRegularDataRes getDefaultInstance() {
      return defaultInstance;
    }
    
    public QueryRegularDataRes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCQueryRegularDataRes.internal_static_QueryRegularDataRes_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCQueryRegularDataRes.internal_static_QueryRegularDataRes_fieldAccessorTable;
    }
    
    // repeated .RegularData datas = 1;
    public static final int DATAS_FIELD_NUMBER = 1;
    private java.util.List<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData> datas_;
    public java.util.List<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData> getDatasList() {
      return datas_;
    }
    public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularDataOrBuilder> 
        getDatasOrBuilderList() {
      return datas_;
    }
    public int getDatasCount() {
      return datas_.size();
    }
    public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData getDatas(int index) {
      return datas_.get(index);
    }
    public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularDataOrBuilder getDatasOrBuilder(
        int index) {
      return datas_.get(index);
    }
    
    private void initFields() {
      datas_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
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
      for (int i = 0; i < datas_.size(); i++) {
        output.writeMessage(1, datas_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < datas_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, datas_.get(i));
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
    
    public static QueryRegularDataRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static QueryRegularDataRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static QueryRegularDataRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static QueryRegularDataRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static QueryRegularDataRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static QueryRegularDataRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static QueryRegularDataRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static QueryRegularDataRes parseDelimitedFrom(
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
    public static QueryRegularDataRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static QueryRegularDataRes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(QueryRegularDataRes prototype) {
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
       implements QueryRegularDataResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCQueryRegularDataRes.internal_static_QueryRegularDataRes_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCQueryRegularDataRes.internal_static_QueryRegularDataRes_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.webservice.originaldata.LCQueryRegularDataRes.QueryRegularDataRes.newBuilder()
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
        if (datasBuilder_ == null) {
          datas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
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
        return QueryRegularDataRes.getDescriptor();
      }
      
      public QueryRegularDataRes getDefaultInstanceForType() {
        return QueryRegularDataRes.getDefaultInstance();
      }
      
      public QueryRegularDataRes build() {
        QueryRegularDataRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private QueryRegularDataRes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        QueryRegularDataRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public QueryRegularDataRes buildPartial() {
        QueryRegularDataRes result = new QueryRegularDataRes(this);
        int from_bitField0_ = bitField0_;
        if (datasBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            datas_ = java.util.Collections.unmodifiableList(datas_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.datas_ = datas_;
        } else {
          result.datas_ = datasBuilder_.build();
        }
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof QueryRegularDataRes) {
          return mergeFrom((QueryRegularDataRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(QueryRegularDataRes other) {
        if (other == QueryRegularDataRes.getDefaultInstance()) return this;
        if (datasBuilder_ == null) {
          if (!other.datas_.isEmpty()) {
            if (datas_.isEmpty()) {
              datas_ = other.datas_;
              bitField0_ = (bitField0_ & ~0x00000001);
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
              bitField0_ = (bitField0_ & ~0x00000001);
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
            case 10: {
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.Builder subBuilder = com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addDatas(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .RegularData datas = 1;
      private java.util.List<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData> datas_ =
        java.util.Collections.emptyList();
      private void ensureDatasIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          datas_ = new java.util.ArrayList<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData>(datas_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.Builder, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularDataOrBuilder> datasBuilder_;
      
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData> getDatasList() {
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
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData getDatas(int index) {
        if (datasBuilder_ == null) {
          return datas_.get(index);
        } else {
          return datasBuilder_.getMessage(index);
        }
      }
      public Builder setDatas(
          int index, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData value) {
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
          int index, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.Builder builderForValue) {
        if (datasBuilder_ == null) {
          ensureDatasIsMutable();
          datas_.set(index, builderForValue.build());
          onChanged();
        } else {
          datasBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addDatas(com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData value) {
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
          int index, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData value) {
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
          com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.Builder builderForValue) {
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
          int index, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.Builder builderForValue) {
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
          Iterable<? extends com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData> values) {
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
          bitField0_ = (bitField0_ & ~0x00000001);
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
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.Builder getDatasBuilder(
          int index) {
        return getDatasFieldBuilder().getBuilder(index);
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularDataOrBuilder getDatasOrBuilder(
          int index) {
        if (datasBuilder_ == null) {
          return datas_.get(index);  } else {
          return datasBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularDataOrBuilder> 
           getDatasOrBuilderList() {
        if (datasBuilder_ != null) {
          return datasBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(datas_);
        }
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.Builder addDatasBuilder() {
        return getDatasFieldBuilder().addBuilder(
            com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.getDefaultInstance());
      }
      public com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.Builder addDatasBuilder(
          int index) {
        return getDatasFieldBuilder().addBuilder(
            index, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.getDefaultInstance());
      }
      public java.util.List<com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.Builder> 
           getDatasBuilderList() {
        return getDatasFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.Builder, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularDataOrBuilder> 
          getDatasFieldBuilder() {
        if (datasBuilder_ == null) {
          datasBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularData.Builder, com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.RegularDataOrBuilder>(
                  datas_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          datas_ = null;
        }
        return datasBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:QueryRegularDataRes)
    }
    
    static {
      defaultInstance = new QueryRegularDataRes(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:QueryRegularDataRes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_QueryRegularDataRes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_QueryRegularDataRes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nAcore/proto/webservice/originaldata/jav" +
      "a/QueryRegularDataRes.proto\0323core/proto/" +
      "dataaccess/common/java/RegularData.proto" +
      "\"2\n\023QueryRegularDataRes\022\033\n\005datas\030\001 \003(\0132\014" +
      ".RegularDataB_\nFcom.navinfo.opentsp.plat" +
      "form.location.protocol.webservice.origin" +
      "aldataB\025LCQueryRegularDataRes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_QueryRegularDataRes_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_QueryRegularDataRes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_QueryRegularDataRes_descriptor,
              new String[] { "Datas", },
              QueryRegularDataRes.class,
              QueryRegularDataRes.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCRegularData.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
