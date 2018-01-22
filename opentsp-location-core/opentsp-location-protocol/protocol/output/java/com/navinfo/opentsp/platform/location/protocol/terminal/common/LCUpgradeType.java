// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/common/java/UpgradeType.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.common;

public final class LCUpgradeType {
  private LCUpgradeType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum UpgradeType
      implements com.google.protobuf.ProtocolMessageEnum {
    terminal(0, 0),
    cardReader(1, 12),
    beidou(2, 52),
    ;
    
    public static final int terminal_VALUE = 0;
    public static final int cardReader_VALUE = 12;
    public static final int beidou_VALUE = 52;
    
    
    public final int getNumber() { return value; }
    
    public static UpgradeType valueOf(int value) {
      switch (value) {
        case 0: return terminal;
        case 12: return cardReader;
        case 52: return beidou;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<UpgradeType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<UpgradeType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UpgradeType>() {
            public UpgradeType findValueByNumber(int number) {
              return UpgradeType.valueOf(number);
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
      return com.navinfo.opentsp.platform.location.protocol.terminal.common.LCUpgradeType.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final UpgradeType[] VALUES = {
      terminal, cardReader, beidou, 
    };
    
    public static UpgradeType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private UpgradeType(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:UpgradeType)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1core/proto/terminal/common/java/Upgrad" +
      "eType.proto*7\n\013UpgradeType\022\014\n\010terminal\020\000" +
      "\022\016\n\ncardReader\020\014\022\n\n\006beidou\0204BO\n>com.navi" +
      "nfo.opentsp.platform.location.protocol.t" +
      "erminal.commonB\rLCUpgradeType"
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
