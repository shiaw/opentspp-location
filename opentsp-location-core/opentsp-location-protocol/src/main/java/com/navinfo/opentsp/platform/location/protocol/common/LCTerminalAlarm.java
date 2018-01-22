// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/common/java/TerminalAlarm.proto

package com.navinfo.opentsp.platform.location.protocol.common;

public final class LCTerminalAlarm {
  private LCTerminalAlarm() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum TerminalAlarm
      implements com.google.protobuf.ProtocolMessageEnum {
    emergencyAlarm(0, 1),
    speedingAlarm(1, 2),
    tiredAlarm(2, 4),
    comingAlarm(3, 8),
    faultGNSS(4, 16),
    noConnectGNSS(5, 32),
    shortCircuitGNSS(6, 64),
    underPower(7, 128),
    lossPower(8, 256),
    faultLCD(9, 512),
    faultTTS(10, 1024),
    faultCamera(11, 2048),
    icCardFailure(12, 4096),
    speedingWarningAlarm(13, 8192),
    tiredWarningAlarm(14, 16384),
    drivingTimeout(15, 262144),
    parkingTimeout(16, 524288),
    inOutArea(17, 1048576),
    inOutRoute(18, 2097152),
    routeLackOrOverTime(19, 4194304),
    routeDeviates(20, 8388608),
    faultVSS(21, 16777216),
    abnormalOil(22, 33554432),
    stolenVehicle(23, 67108864),
    illegalIgnition(24, 134217728),
    illegalDisplacement(25, 268435456),
    collisionAlarm(26, 536870912),
    rolloverAlarm(27, 1073741824),
    ;
    
    public static final int emergencyAlarm_VALUE = 1;
    public static final int speedingAlarm_VALUE = 2;
    public static final int tiredAlarm_VALUE = 4;
    public static final int comingAlarm_VALUE = 8;
    public static final int faultGNSS_VALUE = 16;
    public static final int noConnectGNSS_VALUE = 32;
    public static final int shortCircuitGNSS_VALUE = 64;
    public static final int underPower_VALUE = 128;
    public static final int lossPower_VALUE = 256;
    public static final int faultLCD_VALUE = 512;
    public static final int faultTTS_VALUE = 1024;
    public static final int faultCamera_VALUE = 2048;
    public static final int icCardFailure_VALUE = 4096;
    public static final int speedingWarningAlarm_VALUE = 8192;
    public static final int tiredWarningAlarm_VALUE = 16384;
    public static final int drivingTimeout_VALUE = 262144;
    public static final int parkingTimeout_VALUE = 524288;
    public static final int inOutArea_VALUE = 1048576;
    public static final int inOutRoute_VALUE = 2097152;
    public static final int routeLackOrOverTime_VALUE = 4194304;
    public static final int routeDeviates_VALUE = 8388608;
    public static final int faultVSS_VALUE = 16777216;
    public static final int abnormalOil_VALUE = 33554432;
    public static final int stolenVehicle_VALUE = 67108864;
    public static final int illegalIgnition_VALUE = 134217728;
    public static final int illegalDisplacement_VALUE = 268435456;
    public static final int collisionAlarm_VALUE = 536870912;
    public static final int rolloverAlarm_VALUE = 1073741824;
    
    
    public final int getNumber() { return value; }
    
    public static TerminalAlarm valueOf(int value) {
      switch (value) {
        case 1: return emergencyAlarm;
        case 2: return speedingAlarm;
        case 4: return tiredAlarm;
        case 8: return comingAlarm;
        case 16: return faultGNSS;
        case 32: return noConnectGNSS;
        case 64: return shortCircuitGNSS;
        case 128: return underPower;
        case 256: return lossPower;
        case 512: return faultLCD;
        case 1024: return faultTTS;
        case 2048: return faultCamera;
        case 4096: return icCardFailure;
        case 8192: return speedingWarningAlarm;
        case 16384: return tiredWarningAlarm;
        case 262144: return drivingTimeout;
        case 524288: return parkingTimeout;
        case 1048576: return inOutArea;
        case 2097152: return inOutRoute;
        case 4194304: return routeLackOrOverTime;
        case 8388608: return routeDeviates;
        case 16777216: return faultVSS;
        case 33554432: return abnormalOil;
        case 67108864: return stolenVehicle;
        case 134217728: return illegalIgnition;
        case 268435456: return illegalDisplacement;
        case 536870912: return collisionAlarm;
        case 1073741824: return rolloverAlarm;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<TerminalAlarm>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<TerminalAlarm>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TerminalAlarm>() {
            public TerminalAlarm findValueByNumber(int number) {
              return TerminalAlarm.valueOf(number);
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
      return LCTerminalAlarm.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final TerminalAlarm[] VALUES = {
      emergencyAlarm, speedingAlarm, tiredAlarm, comingAlarm, faultGNSS, noConnectGNSS, shortCircuitGNSS, underPower, lossPower, faultLCD, faultTTS, faultCamera, icCardFailure, speedingWarningAlarm, tiredWarningAlarm, drivingTimeout, parkingTimeout, inOutArea, inOutRoute, routeLackOrOverTime, routeDeviates, faultVSS, abnormalOil, stolenVehicle, illegalIgnition, illegalDisplacement, collisionAlarm, rolloverAlarm, 
    };
    
    public static TerminalAlarm valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private TerminalAlarm(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:TerminalAlarm)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n*core/proto/common/java/TerminalAlarm.p" +
      "roto*\311\004\n\rTerminalAlarm\022\022\n\016emergencyAlarm" +
      "\020\001\022\021\n\rspeedingAlarm\020\002\022\016\n\ntiredAlarm\020\004\022\017\n" +
      "\013comingAlarm\020\010\022\r\n\tfaultGNSS\020\020\022\021\n\rnoConne" +
      "ctGNSS\020 \022\024\n\020shortCircuitGNSS\020@\022\017\n\nunderP" +
      "ower\020\200\001\022\016\n\tlossPower\020\200\002\022\r\n\010faultLCD\020\200\004\022\r" +
      "\n\010faultTTS\020\200\010\022\020\n\013faultCamera\020\200\020\022\022\n\ricCar" +
      "dFailure\020\200 \022\031\n\024speedingWarningAlarm\020\200@\022\027" +
      "\n\021tiredWarningAlarm\020\200\200\001\022\024\n\016drivingTimeou" +
      "t\020\200\200\020\022\024\n\016parkingTimeout\020\200\200 \022\017\n\tinOutArea",
      "\020\200\200@\022\021\n\ninOutRoute\020\200\200\200\001\022\032\n\023routeLackOrOv" +
      "erTime\020\200\200\200\002\022\024\n\rrouteDeviates\020\200\200\200\004\022\017\n\010fau" +
      "ltVSS\020\200\200\200\010\022\022\n\013abnormalOil\020\200\200\200\020\022\024\n\rstolen" +
      "Vehicle\020\200\200\200 \022\026\n\017illegalIgnition\020\200\200\200@\022\033\n\023" +
      "illegalDisplacement\020\200\200\200\200\001\022\026\n\016collisionAl" +
      "arm\020\200\200\200\200\002\022\025\n\rrolloverAlarm\020\200\200\200\200\004BH\n5com." +
      "navinfo.opentsp.platform.location.protoc" +
      "ol.commonB\017LCTerminalAlarm"
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