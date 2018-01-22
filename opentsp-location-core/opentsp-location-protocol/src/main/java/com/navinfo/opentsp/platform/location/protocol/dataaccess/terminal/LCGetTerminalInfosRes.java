// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/dataaccess/terminal/java/GetTerminalInfosRes.proto

package com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal;

public final class LCGetTerminalInfosRes {
  private LCGetTerminalInfosRes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetTerminalInfosResOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 serialNumber = 1;
    boolean hasSerialNumber();
    int getSerialNumber();
    
    // required .PlatformResponseResult results = 2;
    boolean hasResults();
    com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult getResults();
    
    // repeated .TerminalInfo terminals = 3;
    java.util.List<LCTerminalInfo.TerminalInfo>
        getTerminalsList();
    LCTerminalInfo.TerminalInfo getTerminals(int index);
    int getTerminalsCount();
    java.util.List<? extends LCTerminalInfo.TerminalInfoOrBuilder>
        getTerminalsOrBuilderList();
    LCTerminalInfo.TerminalInfoOrBuilder getTerminalsOrBuilder(
            int index);
  }
  public static final class GetTerminalInfosRes extends
      com.google.protobuf.GeneratedMessage
      implements GetTerminalInfosResOrBuilder {
    // Use GetTerminalInfosRes.newBuilder() to construct.
    private GetTerminalInfosRes(Builder builder) {
      super(builder);
    }
    private GetTerminalInfosRes(boolean noInit) {}
    
    private static final GetTerminalInfosRes defaultInstance;
    public static GetTerminalInfosRes getDefaultInstance() {
      return defaultInstance;
    }
    
    public GetTerminalInfosRes getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LCGetTerminalInfosRes.internal_static_GetTerminalInfosRes_descriptor;
    }
    
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LCGetTerminalInfosRes.internal_static_GetTerminalInfosRes_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 serialNumber = 1;
    public static final int SERIALNUMBER_FIELD_NUMBER = 1;
    private int serialNumber_;
    public boolean hasSerialNumber() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getSerialNumber() {
      return serialNumber_;
    }
    
    // required .PlatformResponseResult results = 2;
    public static final int RESULTS_FIELD_NUMBER = 2;
    private com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult results_;
    public boolean hasResults() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult getResults() {
      return results_;
    }
    
    // repeated .TerminalInfo terminals = 3;
    public static final int TERMINALS_FIELD_NUMBER = 3;
    private java.util.List<LCTerminalInfo.TerminalInfo> terminals_;
    public java.util.List<LCTerminalInfo.TerminalInfo> getTerminalsList() {
      return terminals_;
    }
    public java.util.List<? extends LCTerminalInfo.TerminalInfoOrBuilder>
        getTerminalsOrBuilderList() {
      return terminals_;
    }
    public int getTerminalsCount() {
      return terminals_.size();
    }
    public LCTerminalInfo.TerminalInfo getTerminals(int index) {
      return terminals_.get(index);
    }
    public LCTerminalInfo.TerminalInfoOrBuilder getTerminalsOrBuilder(
        int index) {
      return terminals_.get(index);
    }
    
    private void initFields() {
      serialNumber_ = 0;
      results_ = com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult.failure;
      terminals_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSerialNumber()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasResults()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getTerminalsCount(); i++) {
        if (!getTerminals(i).isInitialized()) {
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
        output.writeInt32(1, serialNumber_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, results_.getNumber());
      }
      for (int i = 0; i < terminals_.size(); i++) {
        output.writeMessage(3, terminals_.get(i));
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
          .computeInt32Size(1, serialNumber_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, results_.getNumber());
      }
      for (int i = 0; i < terminals_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, terminals_.get(i));
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
    
    public static GetTerminalInfosRes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static GetTerminalInfosRes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static GetTerminalInfosRes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static GetTerminalInfosRes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static GetTerminalInfosRes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static GetTerminalInfosRes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static GetTerminalInfosRes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static GetTerminalInfosRes parseDelimitedFrom(
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
    public static GetTerminalInfosRes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static GetTerminalInfosRes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(GetTerminalInfosRes prototype) {
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
       implements GetTerminalInfosResOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LCGetTerminalInfosRes.internal_static_GetTerminalInfosRes_descriptor;
      }
      
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LCGetTerminalInfosRes.internal_static_GetTerminalInfosRes_fieldAccessorTable;
      }
      
      // Construct using com.navinfo.opentsp.platform.location.protocol.dataaccess.terminal.LCGetTerminalInfosRes.GetTerminalInfosRes.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTerminalsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        serialNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        results_ = com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult.failure;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (terminalsBuilder_ == null) {
          terminals_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          terminalsBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GetTerminalInfosRes.getDescriptor();
      }
      
      public GetTerminalInfosRes getDefaultInstanceForType() {
        return GetTerminalInfosRes.getDefaultInstance();
      }
      
      public GetTerminalInfosRes build() {
        GetTerminalInfosRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private GetTerminalInfosRes buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        GetTerminalInfosRes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public GetTerminalInfosRes buildPartial() {
        GetTerminalInfosRes result = new GetTerminalInfosRes(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.serialNumber_ = serialNumber_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.results_ = results_;
        if (terminalsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            terminals_ = java.util.Collections.unmodifiableList(terminals_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.terminals_ = terminals_;
        } else {
          result.terminals_ = terminalsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof GetTerminalInfosRes) {
          return mergeFrom((GetTerminalInfosRes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(GetTerminalInfosRes other) {
        if (other == GetTerminalInfosRes.getDefaultInstance()) return this;
        if (other.hasSerialNumber()) {
          setSerialNumber(other.getSerialNumber());
        }
        if (other.hasResults()) {
          setResults(other.getResults());
        }
        if (terminalsBuilder_ == null) {
          if (!other.terminals_.isEmpty()) {
            if (terminals_.isEmpty()) {
              terminals_ = other.terminals_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureTerminalsIsMutable();
              terminals_.addAll(other.terminals_);
            }
            onChanged();
          }
        } else {
          if (!other.terminals_.isEmpty()) {
            if (terminalsBuilder_.isEmpty()) {
              terminalsBuilder_.dispose();
              terminalsBuilder_ = null;
              terminals_ = other.terminals_;
              bitField0_ = (bitField0_ & ~0x00000004);
              terminalsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getTerminalsFieldBuilder() : null;
            } else {
              terminalsBuilder_.addAllMessages(other.terminals_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSerialNumber()) {
          
          return false;
        }
        if (!hasResults()) {
          
          return false;
        }
        for (int i = 0; i < getTerminalsCount(); i++) {
          if (!getTerminals(i).isInitialized()) {
            
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
              serialNumber_ = input.readInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult value = com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                results_ = value;
              }
              break;
            }
            case 26: {
              LCTerminalInfo.TerminalInfo.Builder subBuilder = LCTerminalInfo.TerminalInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addTerminals(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 serialNumber = 1;
      private int serialNumber_ ;
      public boolean hasSerialNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getSerialNumber() {
        return serialNumber_;
      }
      public Builder setSerialNumber(int value) {
        bitField0_ |= 0x00000001;
        serialNumber_ = value;
        onChanged();
        return this;
      }
      public Builder clearSerialNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        serialNumber_ = 0;
        onChanged();
        return this;
      }
      
      // required .PlatformResponseResult results = 2;
      private com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult results_ = com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult.failure;
      public boolean hasResults() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult getResults() {
        return results_;
      }
      public Builder setResults(com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        results_ = value;
        onChanged();
        return this;
      }
      public Builder clearResults() {
        bitField0_ = (bitField0_ & ~0x00000002);
        results_ = com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.PlatformResponseResult.failure;
        onChanged();
        return this;
      }
      
      // repeated .TerminalInfo terminals = 3;
      private java.util.List<LCTerminalInfo.TerminalInfo> terminals_ =
        java.util.Collections.emptyList();
      private void ensureTerminalsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          terminals_ = new java.util.ArrayList<LCTerminalInfo.TerminalInfo>(terminals_);
          bitField0_ |= 0x00000004;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          LCTerminalInfo.TerminalInfo, LCTerminalInfo.TerminalInfo.Builder, LCTerminalInfo.TerminalInfoOrBuilder> terminalsBuilder_;
      
      public java.util.List<LCTerminalInfo.TerminalInfo> getTerminalsList() {
        if (terminalsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(terminals_);
        } else {
          return terminalsBuilder_.getMessageList();
        }
      }
      public int getTerminalsCount() {
        if (terminalsBuilder_ == null) {
          return terminals_.size();
        } else {
          return terminalsBuilder_.getCount();
        }
      }
      public LCTerminalInfo.TerminalInfo getTerminals(int index) {
        if (terminalsBuilder_ == null) {
          return terminals_.get(index);
        } else {
          return terminalsBuilder_.getMessage(index);
        }
      }
      public Builder setTerminals(
          int index, LCTerminalInfo.TerminalInfo value) {
        if (terminalsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTerminalsIsMutable();
          terminals_.set(index, value);
          onChanged();
        } else {
          terminalsBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setTerminals(
          int index, LCTerminalInfo.TerminalInfo.Builder builderForValue) {
        if (terminalsBuilder_ == null) {
          ensureTerminalsIsMutable();
          terminals_.set(index, builderForValue.build());
          onChanged();
        } else {
          terminalsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addTerminals(LCTerminalInfo.TerminalInfo value) {
        if (terminalsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTerminalsIsMutable();
          terminals_.add(value);
          onChanged();
        } else {
          terminalsBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addTerminals(
          int index, LCTerminalInfo.TerminalInfo value) {
        if (terminalsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTerminalsIsMutable();
          terminals_.add(index, value);
          onChanged();
        } else {
          terminalsBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addTerminals(
          LCTerminalInfo.TerminalInfo.Builder builderForValue) {
        if (terminalsBuilder_ == null) {
          ensureTerminalsIsMutable();
          terminals_.add(builderForValue.build());
          onChanged();
        } else {
          terminalsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addTerminals(
          int index, LCTerminalInfo.TerminalInfo.Builder builderForValue) {
        if (terminalsBuilder_ == null) {
          ensureTerminalsIsMutable();
          terminals_.add(index, builderForValue.build());
          onChanged();
        } else {
          terminalsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllTerminals(
          Iterable<? extends LCTerminalInfo.TerminalInfo> values) {
        if (terminalsBuilder_ == null) {
          ensureTerminalsIsMutable();
          super.addAll(values, terminals_);
          onChanged();
        } else {
          terminalsBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearTerminals() {
        if (terminalsBuilder_ == null) {
          terminals_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          terminalsBuilder_.clear();
        }
        return this;
      }
      public Builder removeTerminals(int index) {
        if (terminalsBuilder_ == null) {
          ensureTerminalsIsMutable();
          terminals_.remove(index);
          onChanged();
        } else {
          terminalsBuilder_.remove(index);
        }
        return this;
      }
      public LCTerminalInfo.TerminalInfo.Builder getTerminalsBuilder(
          int index) {
        return getTerminalsFieldBuilder().getBuilder(index);
      }
      public LCTerminalInfo.TerminalInfoOrBuilder getTerminalsOrBuilder(
          int index) {
        if (terminalsBuilder_ == null) {
          return terminals_.get(index);  } else {
          return terminalsBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends LCTerminalInfo.TerminalInfoOrBuilder>
           getTerminalsOrBuilderList() {
        if (terminalsBuilder_ != null) {
          return terminalsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(terminals_);
        }
      }
      public LCTerminalInfo.TerminalInfo.Builder addTerminalsBuilder() {
        return getTerminalsFieldBuilder().addBuilder(
            LCTerminalInfo.TerminalInfo.getDefaultInstance());
      }
      public LCTerminalInfo.TerminalInfo.Builder addTerminalsBuilder(
          int index) {
        return getTerminalsFieldBuilder().addBuilder(
            index, LCTerminalInfo.TerminalInfo.getDefaultInstance());
      }
      public java.util.List<LCTerminalInfo.TerminalInfo.Builder>
           getTerminalsBuilderList() {
        return getTerminalsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          LCTerminalInfo.TerminalInfo, LCTerminalInfo.TerminalInfo.Builder, LCTerminalInfo.TerminalInfoOrBuilder>
          getTerminalsFieldBuilder() {
        if (terminalsBuilder_ == null) {
          terminalsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              LCTerminalInfo.TerminalInfo, LCTerminalInfo.TerminalInfo.Builder, LCTerminalInfo.TerminalInfoOrBuilder>(
                  terminals_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          terminals_ = null;
        }
        return terminalsBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:GetTerminalInfosRes)
    }
    
    static {
      defaultInstance = new GetTerminalInfosRes(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:GetTerminalInfosRes)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_GetTerminalInfosRes_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetTerminalInfosRes_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n=core/proto/dataaccess/terminal/java/Ge" +
      "tTerminalInfosRes.proto\0326core/proto/data" +
      "access/terminal/java/TerminalInfo.proto\032" +
      "3core/proto/common/java/PlatformResponse" +
      "Result.proto\"w\n\023GetTerminalInfosRes\022\024\n\014s" +
      "erialNumber\030\001 \002(\005\022(\n\007results\030\002 \002(\0162\027.Pla" +
      "tformResponseResult\022 \n\tterminals\030\003 \003(\0132\r" +
      ".TerminalInfoB[\nBcom.navinfo.opentsp.pla" +
      "tform.location.protocol.dataaccess.termi" +
      "nalB\025LCGetTerminalInfosRes"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_GetTerminalInfosRes_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_GetTerminalInfosRes_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_GetTerminalInfosRes_descriptor,
              new String[] { "SerialNumber", "Results", "Terminals", },
              GetTerminalInfosRes.class,
              GetTerminalInfosRes.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          LCTerminalInfo.getDescriptor(),
          com.navinfo.opentsp.platform.location.protocol.common.LCPlatformResponseResult.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
