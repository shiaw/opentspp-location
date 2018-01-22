// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/common/java/BreakdownType.proto

package com.navinfo.opentsp.platform.location.protocol.common;

public final class LCBreakdownType {
  private LCBreakdownType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum BreakdownType
      implements com.google.protobuf.ProtocolMessageEnum {
    break1(0, 1),
    break2(1, 2),
    break3(2, 3),
    break4(3, 4),
    ;
    
    public static final int break1_VALUE = 1;
    public static final int break2_VALUE = 2;
    public static final int break3_VALUE = 3;
    public static final int break4_VALUE = 4;
    
    
    public final int getNumber() { return value; }
    
    public static BreakdownType valueOf(int value) {
      switch (value) {
        case 1: return break1;
        case 2: return break2;
        case 3: return break3;
        case 4: return break4;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<BreakdownType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<BreakdownType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BreakdownType>() {
            public BreakdownType findValueByNumber(int number) {
              return BreakdownType.valueOf(number);
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
      return com.navinfo.opentsp.platform.location.protocol.common.LCBreakdownType.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final BreakdownType[] VALUES = {
      break1, break2, break3, break4, 
    };
    
    public static BreakdownType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private BreakdownType(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:BreakdownType)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*core/proto/common/java/BreakdownType.p" +
      "roto*?\n\rBreakdownType\022\n\n\006break1\020\001\022\n\n\006bre" +
      "ak2\020\002\022\n\n\006break3\020\003\022\n\n\006break4\020\004BH\n5com.nav" +
      "info.opentsp.platform.location.protocol." +
      "commonB\017LCBreakdownType"
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
