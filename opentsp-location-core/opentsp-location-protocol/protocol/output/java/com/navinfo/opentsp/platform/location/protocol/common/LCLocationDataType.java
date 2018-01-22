// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/common/java/LocationDataType.proto

package com.navinfo.opentsp.platform.location.protocol.common;

public final class LCLocationDataType {
  private LCLocationDataType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum LocationDataType
      implements com.google.protobuf.ProtocolMessageEnum {
    normal(0, 0),
    blindArea(1, 1),
    ;
    
    public static final int normal_VALUE = 0;
    public static final int blindArea_VALUE = 1;
    
    
    public final int getNumber() { return value; }
    
    public static LocationDataType valueOf(int value) {
      switch (value) {
        case 0: return normal;
        case 1: return blindArea;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<LocationDataType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<LocationDataType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LocationDataType>() {
            public LocationDataType findValueByNumber(int number) {
              return LocationDataType.valueOf(number);
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
      return com.navinfo.opentsp.platform.location.protocol.common.LCLocationDataType.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final LocationDataType[] VALUES = {
      normal, blindArea, 
    };
    
    public static LocationDataType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private LocationDataType(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:LocationDataType)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-core/proto/common/java/LocationDataTyp" +
      "e.proto*-\n\020LocationDataType\022\n\n\006normal\020\000\022" +
      "\r\n\tblindArea\020\001BK\n5com.navinfo.opentsp.pl" +
      "atform.location.protocol.commonB\022LCLocat" +
      "ionDataType"
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
