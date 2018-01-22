// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/dataaccess/common/java/TaskType.proto

package com.navinfo.opentsp.platform.location.protocol.dataaccess.common;

public final class LCTaskType {
  private LCTaskType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum TaskType
      implements com.google.protobuf.ProtocolMessageEnum {
    DataTransfer(0, 0),
    DataStatistic(1, 1),
    ;
    
    public static final int DataTransfer_VALUE = 0;
    public static final int DataStatistic_VALUE = 1;
    
    
    public final int getNumber() { return value; }
    
    public static TaskType valueOf(int value) {
      switch (value) {
        case 0: return DataTransfer;
        case 1: return DataStatistic;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<TaskType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<TaskType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TaskType>() {
            public TaskType findValueByNumber(int number) {
              return TaskType.valueOf(number);
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
      return com.navinfo.opentsp.platform.location.protocol.dataaccess.common.LCTaskType.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final TaskType[] VALUES = {
      DataTransfer, DataStatistic, 
    };
    
    public static TaskType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private TaskType(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:TaskType)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0core/proto/dataaccess/common/java/Task" +
      "Type.proto*/\n\010TaskType\022\020\n\014DataTransfer\020\000" +
      "\022\021\n\rDataStatistic\020\001BN\n@com.navinfo.opent" +
      "sp.platform.location.protocol.dataaccess" +
      ".commonB\nLCTaskType"
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
