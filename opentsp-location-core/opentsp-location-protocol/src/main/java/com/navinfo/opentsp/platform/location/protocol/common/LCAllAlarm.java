// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/common/java/AllAlarm.proto

package com.navinfo.opentsp.platform.location.protocol.common;

public final class LCAllAlarm {
  private LCAllAlarm() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum AllAlarm
      implements com.google.protobuf.ProtocolMessageEnum {
    none(0, 0),
    ;
    
    public static final int none_VALUE = 0;
    
    
    public final int getNumber() { return value; }
    
    public static AllAlarm valueOf(int value) {
      switch (value) {
        case 0: return none;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<AllAlarm>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<AllAlarm>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AllAlarm>() {
            public AllAlarm findValueByNumber(int number) {
              return AllAlarm.valueOf(number);
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
      return LCAllAlarm.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final AllAlarm[] VALUES = {
      none, 
    };
    
    public static AllAlarm valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private AllAlarm(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:AllAlarm)
  }
  
  public enum Alarm
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
    
    
    public final int getNumber() { return value; }
    
    public static Alarm valueOf(int value) {
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
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<Alarm>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Alarm>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Alarm>() {
            public Alarm findValueByNumber(int number) {
              return Alarm.valueOf(number);
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
      return LCAllAlarm.getDescriptor().getEnumTypes().get(1);
    }
    
    private static final Alarm[] VALUES = {
      emergencyAlarm, speedingAlarm, tiredAlarm, comingAlarm, faultGNSS, noConnectGNSS, shortCircuitGNSS, underPower, lossPower, faultLCD, faultTTS, faultCamera, icCardFailure, speedingWarningAlarm, tiredWarningAlarm, drivingTimeout, parkingTimeout, inOutArea, inOutRoute, routeLackOrOverTime, routeDeviates, 
    };
    
    public static Alarm valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private Alarm(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:Alarm)
  }
  
  public enum AlarmAddition
      implements com.google.protobuf.ProtocolMessageEnum {
    faultVSS(0, 1),
    abnormalOil(1, 2),
    stolenVehicle(2, 4),
    illegalIgnition(3, 8),
    illegalDisplacement(4, 16),
    collisionAlarm(5, 32),
    rolloverAlarm(6, 64),
    illegalOpenDoorAlarm(7, 128),
    drivingBan(8, 256),
    keyPointFence(9, 512),
    overtimeParkingInArea(10, 1024),
    removeAlarm(11, 2048),
    staytimeParkingInArea(12,4096)
    ;
    
    public static final int faultVSS_VALUE = 1;
    public static final int abnormalOil_VALUE = 2;
    public static final int stolenVehicle_VALUE = 4;
    public static final int illegalIgnition_VALUE = 8;
    public static final int illegalDisplacement_VALUE = 16;
    public static final int collisionAlarm_VALUE = 32;
    public static final int rolloverAlarm_VALUE = 64;
    public static final int illegalOpenDoorAlarm_VALUE = 128;
    public static final int drivingBan_VALUE = 256;
    public static final int keyPointFence_VALUE = 512;
    public static final int overtimeParkingInArea_VALUE = 1024;
    public static final int removeAlarm_VALUE = 2048;
    public static final int staytimeParkingInArea_VALUE = 4096;



    public final int getNumber() { return value; }
    
    public static AlarmAddition valueOf(int value) {
      switch (value) {
        case 1: return faultVSS;
        case 2: return abnormalOil;
        case 4: return stolenVehicle;
        case 8: return illegalIgnition;
        case 16: return illegalDisplacement;
        case 32: return collisionAlarm;
        case 64: return rolloverAlarm;
        case 128: return illegalOpenDoorAlarm;
        case 256: return drivingBan;
        case 512: return keyPointFence;
        case 1024: return overtimeParkingInArea;
        case 2048: return removeAlarm;
        case 4096: return staytimeParkingInArea;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<AlarmAddition>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<AlarmAddition>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AlarmAddition>() {
            public AlarmAddition findValueByNumber(int number) {
              return AlarmAddition.valueOf(number);
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
      return LCAllAlarm.getDescriptor().getEnumTypes().get(2);
    }
    
    private static final AlarmAddition[] VALUES = {
      faultVSS, abnormalOil, stolenVehicle, illegalIgnition, illegalDisplacement, collisionAlarm, rolloverAlarm, illegalOpenDoorAlarm, drivingBan, keyPointFence, overtimeParkingInArea, removeAlarm, 
    };
    
    public static AlarmAddition valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private AlarmAddition(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:AlarmAddition)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n%core/proto/common/java/AllAlarm.proto*" +
      "\024\n\010AllAlarm\022\010\n\004none\020\000*\242\003\n\005Alarm\022\022\n\016emerg" +
      "encyAlarm\020\001\022\021\n\rspeedingAlarm\020\002\022\016\n\ntiredA" +
      "larm\020\004\022\017\n\013comingAlarm\020\010\022\r\n\tfaultGNSS\020\020\022\021" +
      "\n\rnoConnectGNSS\020 \022\024\n\020shortCircuitGNSS\020@\022" +
      "\017\n\nunderPower\020\200\001\022\016\n\tlossPower\020\200\002\022\r\n\010faul" +
      "tLCD\020\200\004\022\r\n\010faultTTS\020\200\010\022\020\n\013faultCamera\020\200\020" +
      "\022\022\n\ricCardFailure\020\200 \022\031\n\024speedingWarningA" +
      "larm\020\200@\022\027\n\021tiredWarningAlarm\020\200\200\001\022\024\n\016driv" +
      "ingTimeout\020\200\200\020\022\024\n\016parkingTimeout\020\200\200 \022\017\n\t",
      "inOutArea\020\200\200@\022\021\n\ninOutRoute\020\200\200\200\001\022\032\n\023rout" +
      "eLackOrOverTime\020\200\200\200\002\022\024\n\rrouteDeviates\020\200\200" +
      "\200\004*\204\002\n\rAlarmAddition\022\014\n\010faultVSS\020\001\022\017\n\013ab" +
      "normalOil\020\002\022\021\n\rstolenVehicle\020\004\022\023\n\017illega" +
      "lIgnition\020\010\022\027\n\023illegalDisplacement\020\020\022\022\n\016" +
      "collisionAlarm\020 \022\021\n\rrolloverAlarm\020@\022\031\n\024i" +
      "llegalOpenDoorAlarm\020\200\001\022\017\n\ndrivingBan\020\200\002\022" +
      "\022\n\rkeyPointFence\020\200\004\022\032\n\025overtimeParkingIn" +
      "Area\020\200\010\022\020\n\013removeAlarm\020\200\020BC\n5com.navinfo" +
      ".opentsp.platform.location.protocol.comm",
      "onB\nLCAllAlarm"
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