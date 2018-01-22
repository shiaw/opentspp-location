// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/common/java/AreaProperty.proto

package com.navinfo.opentsp.platform.location.protocol.common;

public final class LCAreaProperty {
  private LCAreaProperty() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum AreaProperty
      implements com.google.protobuf.ProtocolMessageEnum {
    accordingTime(0, 1),
    speedLimit(1, 2),
    inAreaAlarmToDriver(2, 4),
    inAreaAlarmToPlatform(3, 8),
    outAreaAlarmToDriver(4, 16),
    outAreaAlarmToPlatform(5, 32),
    northOrSouthLatitude(6, 64),
    eastOrWestLongitude(7, 128),
    doorStatusSwitches(8, 256),
    communicateModuleSwitch(9, 16384),
    collectGNSSLocationInfo(10, 32768),
    openDoorOutArea(11, 65536),
    everyDay(12, 131072),
    notArriveFenceAlarmToDriver(13, 262144),
    notArriveFenceAlarmToPlatform(14, 524288),
    notLeaveFenceAlarmToDriver(15, 1048576),
    notLeaveFenceAlarmToPlatform(16, 2097152),
    ;
    
    public static final int accordingTime_VALUE = 1;
    public static final int speedLimit_VALUE = 2;
    public static final int inAreaAlarmToDriver_VALUE = 4;
    public static final int inAreaAlarmToPlatform_VALUE = 8;
    public static final int outAreaAlarmToDriver_VALUE = 16;
    public static final int outAreaAlarmToPlatform_VALUE = 32;
    public static final int northOrSouthLatitude_VALUE = 64;
    public static final int eastOrWestLongitude_VALUE = 128;
    public static final int doorStatusSwitches_VALUE = 256;
    public static final int communicateModuleSwitch_VALUE = 16384;
    public static final int collectGNSSLocationInfo_VALUE = 32768;
    public static final int openDoorOutArea_VALUE = 65536;
    public static final int everyDay_VALUE = 131072;
    public static final int notArriveFenceAlarmToDriver_VALUE = 262144;
    public static final int notArriveFenceAlarmToPlatform_VALUE = 524288;
    public static final int notLeaveFenceAlarmToDriver_VALUE = 1048576;
    public static final int notLeaveFenceAlarmToPlatform_VALUE = 2097152;
    
    
    public final int getNumber() { return value; }
    
    public static AreaProperty valueOf(int value) {
      switch (value) {
        case 1: return accordingTime;
        case 2: return speedLimit;
        case 4: return inAreaAlarmToDriver;
        case 8: return inAreaAlarmToPlatform;
        case 16: return outAreaAlarmToDriver;
        case 32: return outAreaAlarmToPlatform;
        case 64: return northOrSouthLatitude;
        case 128: return eastOrWestLongitude;
        case 256: return doorStatusSwitches;
        case 16384: return communicateModuleSwitch;
        case 32768: return collectGNSSLocationInfo;
        case 65536: return openDoorOutArea;
        case 131072: return everyDay;
        case 262144: return notArriveFenceAlarmToDriver;
        case 524288: return notArriveFenceAlarmToPlatform;
        case 1048576: return notLeaveFenceAlarmToDriver;
        case 2097152: return notLeaveFenceAlarmToPlatform;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<AreaProperty>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<AreaProperty>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AreaProperty>() {
            public AreaProperty findValueByNumber(int number) {
              return AreaProperty.valueOf(number);
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
      return com.navinfo.opentsp.platform.location.protocol.common.LCAreaProperty.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final AreaProperty[] VALUES = {
      accordingTime, speedLimit, inAreaAlarmToDriver, inAreaAlarmToPlatform, outAreaAlarmToDriver, outAreaAlarmToPlatform, northOrSouthLatitude, eastOrWestLongitude, doorStatusSwitches, communicateModuleSwitch, collectGNSSLocationInfo, openDoorOutArea, everyDay, notArriveFenceAlarmToDriver, notArriveFenceAlarmToPlatform, notLeaveFenceAlarmToDriver, notLeaveFenceAlarmToPlatform, 
    };
    
    public static AreaProperty valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private AreaProperty(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:AreaProperty)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)core/proto/common/java/AreaProperty.pr" +
      "oto*\334\003\n\014AreaProperty\022\021\n\raccordingTime\020\001\022" +
      "\016\n\nspeedLimit\020\002\022\027\n\023inAreaAlarmToDriver\020\004" +
      "\022\031\n\025inAreaAlarmToPlatform\020\010\022\030\n\024outAreaAl" +
      "armToDriver\020\020\022\032\n\026outAreaAlarmToPlatform\020" +
      " \022\030\n\024northOrSouthLatitude\020@\022\030\n\023eastOrWes" +
      "tLongitude\020\200\001\022\027\n\022doorStatusSwitches\020\200\002\022\035" +
      "\n\027communicateModuleSwitch\020\200\200\001\022\035\n\027collect" +
      "GNSSLocationInfo\020\200\200\002\022\025\n\017openDoorOutArea\020" +
      "\200\200\004\022\016\n\010everyDay\020\200\200\010\022!\n\033notArriveFenceAla",
      "rmToDriver\020\200\200\020\022#\n\035notArriveFenceAlarmToP" +
      "latform\020\200\200 \022 \n\032notLeaveFenceAlarmToDrive" +
      "r\020\200\200@\022#\n\034notLeaveFenceAlarmToPlatform\020\200\200" +
      "\200\001BG\n5com.navinfo.opentsp.platform.locat" +
      "ion.protocol.commonB\016LCAreaProperty"
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
