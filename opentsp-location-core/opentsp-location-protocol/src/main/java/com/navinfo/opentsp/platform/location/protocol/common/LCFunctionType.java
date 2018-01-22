// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/common/java/FunctionType.proto

package com.navinfo.opentsp.platform.location.protocol.common;

public final class LCFunctionType {
  private LCFunctionType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum FunctionType
      implements com.google.protobuf.ProtocolMessageEnum {
    business(0, 1),
    terminalProtocol(1, 2),
    ;
    
    public static final int business_VALUE = 1;
    public static final int terminalProtocol_VALUE = 2;
    
    
    public final int getNumber() { return value; }
    
    public static FunctionType valueOf(int value) {
      switch (value) {
        case 1: return business;
        case 2: return terminalProtocol;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<FunctionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<FunctionType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FunctionType>() {
            public FunctionType findValueByNumber(int number) {
              return FunctionType.valueOf(number);
            }
          };
    
    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return LCFunctionType.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final FunctionType[] VALUES = {
      business, terminalProtocol, 
    };
    
    public static FunctionType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private FunctionType(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:FunctionType)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n)core/proto/common/java/FunctionType.pr" +
      "oto*2\n\014FunctionType\022\014\n\010business\020\001\022\024\n\020ter" +
      "minalProtocol\020\002BG\n5com.navinfo.opentsp.p" +
      "latform.location.protocol.commonB\016LCFunc" +
      "tionType"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
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
