// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/common/java/StatusType.proto

package com.navinfo.opentsp.platform.location.protocol.common;

public final class LCStatusType {
  private LCStatusType() {}
  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum StatusType
          implements com.google.protobuf.ProtocolMessageEnum {
    dpfPressure(0, 1),
    relativePressure(1, 2),
    intakeAirTem(2, 3),
    absolutePressure(3, 4),
    exhaustTem(4, 5),
    atmosphericPressure(5, 6),
    engineTem(6, 7),
    atmosphericTem(7, 8),
    pavementTem(8, 9),
    lampStatus(9, 10),
    mileage(10, 11),
    waterInOilStatus(11, 12),
    oilValue(12, 14),
    rotation(13, 15),
    fuelPressure(14, 16),
    oilLevel(15, 17),
    oilPressure(16, 18),
    coolantLevel(17, 19),
    coolingWaterTem(18, 20),
    fuelTem(19, 21),
    oilTem(20, 22),
    ureaTankLiquidLevel(21, 23),
    ureaTankTem(22, 24),
    cumulativeRunningTime(23, 25),
    cumulativeTurningNumber(24, 26),
    fuelConsumptionRate(25, 27),
    averageFuelConsumption(26, 28),
    dayFuelConsumption(27, 29),
    totalFuelConsumption(28, 30),
    engineTorMode(29, 31),
    driverEnginePercentTor(30, 32),
    actualEnginePercentTor(31, 33),
    accPedalLowIdleSwitch(32, 34),
    accPedalKickdownSwitch(33, 35),
    accPedalPos(34, 36),
    percentLoadAtCurrentSpd(35, 37),
    nominalFrictionPercentTrq(36, 38),
    parkingBrakeSwitch(37, 39),
    cruiseCtrlActive(38, 40),
    brakeSwitch(39, 41),
    clutchSwitch(40, 42),
    cruiseCtrlSetSwitch(41, 43),
    cruiseCtrlCoastSwitch(42, 44),
    cruiseCtrlResumeSwitch(43, 45),
    cruiseCtrlAccSwitch(44, 46),
    cruiseCtrlSetSpd(45, 47),
    cruiseCtrlStates(46, 48),
    tripDistance(47, 49),
    realTimeOilConsumption(48, 50),
    wheelBasedVehicleSpd(49, 51),
    outPutRoateSpeed(50, 52),
    tachographVehicleSpeed(51, 53),
    currentGear(52, 54),
    tripFuel(53, 55),
    truboOilTem(54, 56),
    batteryPot(55, 57),
    engineProtection(56, 58),
    P1Speed(57, 59),
    P1Torque(58, 60),
    P3Speed(59, 61),
    P3Torque(60, 62),
    P4Speed(61, 63),
    P4Troque(62, 64),
    P5Speed(63, 65),
    P5Torque(64, 66),
    P6Speed(65, 67),
    gainSpeed(66, 68),
    RefEngineTorque(67, 69),
    MaxSpeedLimit(68, 70),
    MaxTimeLimit(69, 71),
    SpLowerLimit(70, 72),
    SpUpperLimit(71, 73),
    TorLowerLimit(72, 74),
    TorUpperLimit(73, 75),
    ReqSpUpperLimit(74, 76),
    MomentIner(75, 77),
    RelEngOilPressure(76, 78),
    engOilPreLow(77, 79),
    engCoolTem(78, 80),
    StartHeartStat(79, 81),
    OBDLampStatus(80, 82),
    ExOutput(81, 83),
    EsFanSp(82, 84),
    FanDriState(83, 85),
    FanSpeed(84, 86),
    airFilterPre(85, 87),
    CoolDifferTem(86, 88),
    AirInTem(87, 89),
    perTorResolution(88, 90),
    addControlDevice(89, 91),
    engineStartMode(90, 92),
    engineDePerTor(91, 93),
    speedLimitStatus(92, 94),
    reAccPosition(93, 95),
    reAccPosition2(94, 96),
    maxAvailableEngPerTor(95, 97),
    desirOperaSpeed(96, 98),
    engAsyAdjust(97, 99),
    EstimaParLoss(98, 100),
    exhGasMassflow(99, 101),
    af1Intake(100, 102),
    af1Exhaust(101, 103),
    af2Intake(102, 104),
    af2Exhaust(103, 105),
    cruPauseSwitch(104, 106),
    cruiControlEnable(105, 107),
    ptoState(106, 108),
    engShutOverSwitch(107, 109),
    engTestModeWwitch(108, 110),
    engIdleDecSwitch(109, 111),
    engIdleIncSwitch(110, 112),
    retarTorMode(111, 113),
    retBrakeAssSwitch(112, 114),
    retShiftAssSwitch(113, 115),
    actRetTorPer(114, 116),
    intRetPerTor(115, 117),
    coolLoadIncrease(116, 118),
    retReqBrakeLight(117, 119),
    addOfControDevice(118, 120),
    demRetPerTor(119, 121),
    retSwitchPerTor(120, 122),
    actMaxAvailableRetPerTor(121, 123),
    retarderLocation(122, 124),
    retarderType(123, 125),
    retarderConMethod(124, 126),
    retarderSpIdlePoint1(125, 127),
    retarderPerTorIdle(126, 128),
    maxRetSpeedPoint2(127, 129),
    retPerTorMaxSpeedPoint2(128, 130),
    engSpeedPoint3(129, 131),
    retarderPerTorPoint3(130, 132),
    engSpeedPoint4(131, 133),
    retarderPerTorPoint4(132, 134),
    retSpeedTorPoint5(133, 135),
    refRetarTorque(134, 136),
    retarderPerTorPoint5(135, 137),
    extendCrankcase(136, 138),
    engineInterTemper(137, 139),
    batteryPotInput1(138, 140),
    P2HighestSpeed(139, 141),
    P2PercentTorSpeed(140, 142),
    TripDistanceDD(141, 143),
    mileageDD(142, 144),
    lng1Gross(143, 145),
    lng1Surplus(144, 146),
    lng2Gross(145, 147),
    lng2Surplus(146, 148),
    lng3Gross(147, 149),
    lng3Surplus(148, 150),
    lng4Gross(149, 151),
    lng4Surplus(150, 152),
    p2Speed(151, 153),
    p2Torque(152, 154),
    ureaConcentration(153, 155),
    integralFuelConsumption(154, 156),
    protectLamp(155, 157),
    stopLamp(156, 159),
    milLamp(157, 161),
    scrLamp(158, 162),
    amberWarningLamp(159, 163),
    differentialMileage(160, 164),
    circleType(161, 165),
    roteSpeed(162, 166),
    forewardCount(163, 167),
    reverseCount(164, 168),
    avgGasConsumption(165, 169),
    totalGasConsumption(166, 170),
    integralGasConsumption(167, 171),
    actualPumpState(168, 172),
    dynamicLoad(169, 173),
    lampState(170, 174),
    integralMileage(171, 175),
    integralOilConsumption(172, 177),
    targetGear(173, 178),
    realSpeedRatio(174, 179),
    ;

    public static final int dpfPressure_VALUE = 1;
    public static final int relativePressure_VALUE = 2;
    public static final int intakeAirTem_VALUE = 3;
    public static final int absolutePressure_VALUE = 4;
    public static final int exhaustTem_VALUE = 5;
    public static final int atmosphericPressure_VALUE = 6;
    public static final int engineTem_VALUE = 7;
    public static final int atmosphericTem_VALUE = 8;
    public static final int pavementTem_VALUE = 9;
    public static final int lampStatus_VALUE = 10;
    public static final int mileage_VALUE = 11;
    public static final int waterInOilStatus_VALUE = 12;
    public static final int oilValue_VALUE = 14;
    public static final int rotation_VALUE = 15;
    public static final int fuelPressure_VALUE = 16;
    public static final int oilLevel_VALUE = 17;
    public static final int oilPressure_VALUE = 18;
    public static final int coolantLevel_VALUE = 19;
    public static final int coolingWaterTem_VALUE = 20;
    public static final int fuelTem_VALUE = 21;
    public static final int oilTem_VALUE = 22;
    public static final int ureaTankLiquidLevel_VALUE = 23;
    public static final int ureaTankTem_VALUE = 24;
    public static final int cumulativeRunningTime_VALUE = 25;
    public static final int cumulativeTurningNumber_VALUE = 26;
    public static final int fuelConsumptionRate_VALUE = 27;
    public static final int averageFuelConsumption_VALUE = 28;
    public static final int dayFuelConsumption_VALUE = 29;
    public static final int totalFuelConsumption_VALUE = 30;
    public static final int engineTorMode_VALUE = 31;
    public static final int driverEnginePercentTor_VALUE = 32;
    public static final int actualEnginePercentTor_VALUE = 33;
    public static final int accPedalLowIdleSwitch_VALUE = 34;
    public static final int accPedalKickdownSwitch_VALUE = 35;
    public static final int accPedalPos_VALUE = 36;
    public static final int percentLoadAtCurrentSpd_VALUE = 37;
    public static final int nominalFrictionPercentTrq_VALUE = 38;
    public static final int parkingBrakeSwitch_VALUE = 39;
    public static final int cruiseCtrlActive_VALUE = 40;
    public static final int brakeSwitch_VALUE = 41;
    public static final int clutchSwitch_VALUE = 42;
    public static final int cruiseCtrlSetSwitch_VALUE = 43;
    public static final int cruiseCtrlCoastSwitch_VALUE = 44;
    public static final int cruiseCtrlResumeSwitch_VALUE = 45;
    public static final int cruiseCtrlAccSwitch_VALUE = 46;
    public static final int cruiseCtrlSetSpd_VALUE = 47;
    public static final int cruiseCtrlStates_VALUE = 48;
    public static final int tripDistance_VALUE = 49;
    public static final int realTimeOilConsumption_VALUE = 50;
    public static final int wheelBasedVehicleSpd_VALUE = 51;
    public static final int outPutRoateSpeed_VALUE = 52;
    public static final int tachographVehicleSpeed_VALUE = 53;
    public static final int currentGear_VALUE = 54;
    public static final int tripFuel_VALUE = 55;
    public static final int truboOilTem_VALUE = 56;
    public static final int batteryPot_VALUE = 57;
    public static final int engineProtection_VALUE = 58;
    public static final int P1Speed_VALUE = 59;
    public static final int P1Torque_VALUE = 60;
    public static final int P3Speed_VALUE = 61;
    public static final int P3Torque_VALUE = 62;
    public static final int P4Speed_VALUE = 63;
    public static final int P4Troque_VALUE = 64;
    public static final int P5Speed_VALUE = 65;
    public static final int P5Torque_VALUE = 66;
    public static final int P6Speed_VALUE = 67;
    public static final int gainSpeed_VALUE = 68;
    public static final int RefEngineTorque_VALUE = 69;
    public static final int MaxSpeedLimit_VALUE = 70;
    public static final int MaxTimeLimit_VALUE = 71;
    public static final int SpLowerLimit_VALUE = 72;
    public static final int SpUpperLimit_VALUE = 73;
    public static final int TorLowerLimit_VALUE = 74;
    public static final int TorUpperLimit_VALUE = 75;
    public static final int ReqSpUpperLimit_VALUE = 76;
    public static final int MomentIner_VALUE = 77;
    public static final int RelEngOilPressure_VALUE = 78;
    public static final int engOilPreLow_VALUE = 79;
    public static final int engCoolTem_VALUE = 80;
    public static final int StartHeartStat_VALUE = 81;
    public static final int OBDLampStatus_VALUE = 82;
    public static final int ExOutput_VALUE = 83;
    public static final int EsFanSp_VALUE = 84;
    public static final int FanDriState_VALUE = 85;
    public static final int FanSpeed_VALUE = 86;
    public static final int airFilterPre_VALUE = 87;
    public static final int CoolDifferTem_VALUE = 88;
    public static final int AirInTem_VALUE = 89;
    public static final int perTorResolution_VALUE = 90;
    public static final int addControlDevice_VALUE = 91;
    public static final int engineStartMode_VALUE = 92;
    public static final int engineDePerTor_VALUE = 93;
    public static final int speedLimitStatus_VALUE = 94;
    public static final int reAccPosition_VALUE = 95;
    public static final int reAccPosition2_VALUE = 96;
    public static final int maxAvailableEngPerTor_VALUE = 97;
    public static final int desirOperaSpeed_VALUE = 98;
    public static final int engAsyAdjust_VALUE = 99;
    public static final int EstimaParLoss_VALUE = 100;
    public static final int exhGasMassflow_VALUE = 101;
    public static final int af1Intake_VALUE = 102;
    public static final int af1Exhaust_VALUE = 103;
    public static final int af2Intake_VALUE = 104;
    public static final int af2Exhaust_VALUE = 105;
    public static final int cruPauseSwitch_VALUE = 106;
    public static final int cruiControlEnable_VALUE = 107;
    public static final int ptoState_VALUE = 108;
    public static final int engShutOverSwitch_VALUE = 109;
    public static final int engTestModeWwitch_VALUE = 110;
    public static final int engIdleDecSwitch_VALUE = 111;
    public static final int engIdleIncSwitch_VALUE = 112;
    public static final int retarTorMode_VALUE = 113;
    public static final int retBrakeAssSwitch_VALUE = 114;
    public static final int retShiftAssSwitch_VALUE = 115;
    public static final int actRetTorPer_VALUE = 116;
    public static final int intRetPerTor_VALUE = 117;
    public static final int coolLoadIncrease_VALUE = 118;
    public static final int retReqBrakeLight_VALUE = 119;
    public static final int addOfControDevice_VALUE = 120;
    public static final int demRetPerTor_VALUE = 121;
    public static final int retSwitchPerTor_VALUE = 122;
    public static final int actMaxAvailableRetPerTor_VALUE = 123;
    public static final int retarderLocation_VALUE = 124;
    public static final int retarderType_VALUE = 125;
    public static final int retarderConMethod_VALUE = 126;
    public static final int retarderSpIdlePoint1_VALUE = 127;
    public static final int retarderPerTorIdle_VALUE = 128;
    public static final int maxRetSpeedPoint2_VALUE = 129;
    public static final int retPerTorMaxSpeedPoint2_VALUE = 130;
    public static final int engSpeedPoint3_VALUE = 131;
    public static final int retarderPerTorPoint3_VALUE = 132;
    public static final int engSpeedPoint4_VALUE = 133;
    public static final int retarderPerTorPoint4_VALUE = 134;
    public static final int retSpeedTorPoint5_VALUE = 135;
    public static final int refRetarTorque_VALUE = 136;
    public static final int retarderPerTorPoint5_VALUE = 137;
    public static final int extendCrankcase_VALUE = 138;
    public static final int engineInterTemper_VALUE = 139;
    public static final int batteryPotInput1_VALUE = 140;
    public static final int P2HighestSpeed_VALUE = 141;
    public static final int P2PercentTorSpeed_VALUE = 142;
    public static final int TripDistanceDD_VALUE = 143;
    public static final int mileageDD_VALUE = 144;
    public static final int lng1Gross_VALUE = 145;
    public static final int lng1Surplus_VALUE = 146;
    public static final int lng2Gross_VALUE = 147;
    public static final int lng2Surplus_VALUE = 148;
    public static final int lng3Gross_VALUE = 149;
    public static final int lng3Surplus_VALUE = 150;
    public static final int lng4Gross_VALUE = 151;
    public static final int lng4Surplus_VALUE = 152;
    public static final int p2Speed_VALUE = 153;
    public static final int p2Torque_VALUE = 154;
    public static final int ureaConcentration_VALUE = 155;
    public static final int integralFuelConsumption_VALUE = 156;
    public static final int protectLamp_VALUE = 157;
    public static final int stopLamp_VALUE = 159;
    public static final int milLamp_VALUE = 161;
    public static final int scrLamp_VALUE = 162;
    public static final int amberWarningLamp_VALUE = 163;
    public static final int differentialMileage_VALUE = 164;
    public static final int circleType_VALUE = 165;
    public static final int roteSpeed_VALUE = 166;
    public static final int forewardCount_VALUE = 167;
    public static final int reverseCount_VALUE = 168;
    public static final int avgGasConsumption_VALUE = 169;
    public static final int totalGasConsumption_VALUE = 170;
    public static final int integralGasConsumption_VALUE = 171;
    public static final int actualPumpState_VALUE = 172;
    public static final int dynamicLoad_VALUE = 173;
    public static final int lampState_VALUE = 174;
    public static final int integralMileage_VALUE = 175;
    public static final int integralOilConsumption_VALUE = 177;
    public static final int targetGear_VALUE = 178;
    public static final int realSpeedRatio_VALUE = 179;


    public final int getNumber() { return value; }

    public static StatusType valueOf(int value) {
      switch (value) {
        case 1: return dpfPressure;
        case 2: return relativePressure;
        case 3: return intakeAirTem;
        case 4: return absolutePressure;
        case 5: return exhaustTem;
        case 6: return atmosphericPressure;
        case 7: return engineTem;
        case 8: return atmosphericTem;
        case 9: return pavementTem;
        case 10: return lampStatus;
        case 11: return mileage;
        case 12: return waterInOilStatus;
        case 14: return oilValue;
        case 15: return rotation;
        case 16: return fuelPressure;
        case 17: return oilLevel;
        case 18: return oilPressure;
        case 19: return coolantLevel;
        case 20: return coolingWaterTem;
        case 21: return fuelTem;
        case 22: return oilTem;
        case 23: return ureaTankLiquidLevel;
        case 24: return ureaTankTem;
        case 25: return cumulativeRunningTime;
        case 26: return cumulativeTurningNumber;
        case 27: return fuelConsumptionRate;
        case 28: return averageFuelConsumption;
        case 29: return dayFuelConsumption;
        case 30: return totalFuelConsumption;
        case 31: return engineTorMode;
        case 32: return driverEnginePercentTor;
        case 33: return actualEnginePercentTor;
        case 34: return accPedalLowIdleSwitch;
        case 35: return accPedalKickdownSwitch;
        case 36: return accPedalPos;
        case 37: return percentLoadAtCurrentSpd;
        case 38: return nominalFrictionPercentTrq;
        case 39: return parkingBrakeSwitch;
        case 40: return cruiseCtrlActive;
        case 41: return brakeSwitch;
        case 42: return clutchSwitch;
        case 43: return cruiseCtrlSetSwitch;
        case 44: return cruiseCtrlCoastSwitch;
        case 45: return cruiseCtrlResumeSwitch;
        case 46: return cruiseCtrlAccSwitch;
        case 47: return cruiseCtrlSetSpd;
        case 48: return cruiseCtrlStates;
        case 49: return tripDistance;
        case 50: return realTimeOilConsumption;
        case 51: return wheelBasedVehicleSpd;
        case 52: return outPutRoateSpeed;
        case 53: return tachographVehicleSpeed;
        case 54: return currentGear;
        case 55: return tripFuel;
        case 56: return truboOilTem;
        case 57: return batteryPot;
        case 58: return engineProtection;
        case 59: return P1Speed;
        case 60: return P1Torque;
        case 61: return P3Speed;
        case 62: return P3Torque;
        case 63: return P4Speed;
        case 64: return P4Troque;
        case 65: return P5Speed;
        case 66: return P5Torque;
        case 67: return P6Speed;
        case 68: return gainSpeed;
        case 69: return RefEngineTorque;
        case 70: return MaxSpeedLimit;
        case 71: return MaxTimeLimit;
        case 72: return SpLowerLimit;
        case 73: return SpUpperLimit;
        case 74: return TorLowerLimit;
        case 75: return TorUpperLimit;
        case 76: return ReqSpUpperLimit;
        case 77: return MomentIner;
        case 78: return RelEngOilPressure;
        case 79: return engOilPreLow;
        case 80: return engCoolTem;
        case 81: return StartHeartStat;
        case 82: return OBDLampStatus;
        case 83: return ExOutput;
        case 84: return EsFanSp;
        case 85: return FanDriState;
        case 86: return FanSpeed;
        case 87: return airFilterPre;
        case 88: return CoolDifferTem;
        case 89: return AirInTem;
        case 90: return perTorResolution;
        case 91: return addControlDevice;
        case 92: return engineStartMode;
        case 93: return engineDePerTor;
        case 94: return speedLimitStatus;
        case 95: return reAccPosition;
        case 96: return reAccPosition2;
        case 97: return maxAvailableEngPerTor;
        case 98: return desirOperaSpeed;
        case 99: return engAsyAdjust;
        case 100: return EstimaParLoss;
        case 101: return exhGasMassflow;
        case 102: return af1Intake;
        case 103: return af1Exhaust;
        case 104: return af2Intake;
        case 105: return af2Exhaust;
        case 106: return cruPauseSwitch;
        case 107: return cruiControlEnable;
        case 108: return ptoState;
        case 109: return engShutOverSwitch;
        case 110: return engTestModeWwitch;
        case 111: return engIdleDecSwitch;
        case 112: return engIdleIncSwitch;
        case 113: return retarTorMode;
        case 114: return retBrakeAssSwitch;
        case 115: return retShiftAssSwitch;
        case 116: return actRetTorPer;
        case 117: return intRetPerTor;
        case 118: return coolLoadIncrease;
        case 119: return retReqBrakeLight;
        case 120: return addOfControDevice;
        case 121: return demRetPerTor;
        case 122: return retSwitchPerTor;
        case 123: return actMaxAvailableRetPerTor;
        case 124: return retarderLocation;
        case 125: return retarderType;
        case 126: return retarderConMethod;
        case 127: return retarderSpIdlePoint1;
        case 128: return retarderPerTorIdle;
        case 129: return maxRetSpeedPoint2;
        case 130: return retPerTorMaxSpeedPoint2;
        case 131: return engSpeedPoint3;
        case 132: return retarderPerTorPoint3;
        case 133: return engSpeedPoint4;
        case 134: return retarderPerTorPoint4;
        case 135: return retSpeedTorPoint5;
        case 136: return refRetarTorque;
        case 137: return retarderPerTorPoint5;
        case 138: return extendCrankcase;
        case 139: return engineInterTemper;
        case 140: return batteryPotInput1;
        case 141: return P2HighestSpeed;
        case 142: return P2PercentTorSpeed;
        case 143: return TripDistanceDD;
        case 144: return mileageDD;
        case 145: return lng1Gross;
        case 146: return lng1Surplus;
        case 147: return lng2Gross;
        case 148: return lng2Surplus;
        case 149: return lng3Gross;
        case 150: return lng3Surplus;
        case 151: return lng4Gross;
        case 152: return lng4Surplus;
        case 153: return p2Speed;
        case 154: return p2Torque;
        case 155: return ureaConcentration;
        case 156: return integralFuelConsumption;
        case 157: return protectLamp;
        case 159: return stopLamp;
        case 161: return milLamp;
        case 162: return scrLamp;
        case 163: return amberWarningLamp;
        case 164: return differentialMileage;
        case 165: return circleType;
        case 166: return roteSpeed;
        case 167: return forewardCount;
        case 168: return reverseCount;
        case 169: return avgGasConsumption;
        case 170: return totalGasConsumption;
        case 171: return integralGasConsumption;
        case 172: return actualPumpState;
        case 173: return dynamicLoad;
        case 174: return lampState;
        case 175: return integralMileage;
        case 177: return integralOilConsumption;
        case 178: return targetGear;
        case 179: return realSpeedRatio;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<StatusType>
    internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<StatusType>
            internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<StatusType>() {
              public StatusType findValueByNumber(int number) {
                return StatusType.valueOf(number);
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
      return LCStatusType.getDescriptor().getEnumTypes().get(0);
    }

    private static final StatusType[] VALUES = {
            dpfPressure, relativePressure, intakeAirTem, absolutePressure, exhaustTem, atmosphericPressure, engineTem, atmosphericTem, pavementTem, lampStatus, mileage, waterInOilStatus, oilValue, rotation, fuelPressure, oilLevel, oilPressure, coolantLevel, coolingWaterTem, fuelTem, oilTem, ureaTankLiquidLevel, ureaTankTem, cumulativeRunningTime, cumulativeTurningNumber, fuelConsumptionRate, averageFuelConsumption, dayFuelConsumption, totalFuelConsumption, engineTorMode, driverEnginePercentTor, actualEnginePercentTor, accPedalLowIdleSwitch, accPedalKickdownSwitch, accPedalPos, percentLoadAtCurrentSpd, nominalFrictionPercentTrq, parkingBrakeSwitch, cruiseCtrlActive, brakeSwitch, clutchSwitch, cruiseCtrlSetSwitch, cruiseCtrlCoastSwitch, cruiseCtrlResumeSwitch, cruiseCtrlAccSwitch, cruiseCtrlSetSpd, cruiseCtrlStates, tripDistance, realTimeOilConsumption, wheelBasedVehicleSpd, outPutRoateSpeed, tachographVehicleSpeed, currentGear, tripFuel, truboOilTem, batteryPot, engineProtection, P1Speed, P1Torque, P3Speed, P3Torque, P4Speed, P4Troque, P5Speed, P5Torque, P6Speed, gainSpeed, RefEngineTorque, MaxSpeedLimit, MaxTimeLimit, SpLowerLimit, SpUpperLimit, TorLowerLimit, TorUpperLimit, ReqSpUpperLimit, MomentIner, RelEngOilPressure, engOilPreLow, engCoolTem, StartHeartStat, OBDLampStatus, ExOutput, EsFanSp, FanDriState, FanSpeed, airFilterPre, CoolDifferTem, AirInTem, perTorResolution, addControlDevice, engineStartMode, engineDePerTor, speedLimitStatus, reAccPosition, reAccPosition2, maxAvailableEngPerTor, desirOperaSpeed, engAsyAdjust, EstimaParLoss, exhGasMassflow, af1Intake, af1Exhaust, af2Intake, af2Exhaust, cruPauseSwitch, cruiControlEnable, ptoState, engShutOverSwitch, engTestModeWwitch, engIdleDecSwitch, engIdleIncSwitch, retarTorMode, retBrakeAssSwitch, retShiftAssSwitch, actRetTorPer, intRetPerTor, coolLoadIncrease, retReqBrakeLight, addOfControDevice, demRetPerTor, retSwitchPerTor, actMaxAvailableRetPerTor, retarderLocation, retarderType, retarderConMethod, retarderSpIdlePoint1, retarderPerTorIdle, maxRetSpeedPoint2, retPerTorMaxSpeedPoint2, engSpeedPoint3, retarderPerTorPoint3, engSpeedPoint4, retarderPerTorPoint4, retSpeedTorPoint5, refRetarTorque, retarderPerTorPoint5, extendCrankcase, engineInterTemper, batteryPotInput1, P2HighestSpeed, P2PercentTorSpeed, TripDistanceDD, mileageDD, lng1Gross, lng1Surplus, lng2Gross, lng2Surplus, lng3Gross, lng3Surplus, lng4Gross, lng4Surplus, p2Speed, p2Torque, ureaConcentration, integralFuelConsumption, protectLamp, stopLamp, milLamp, scrLamp, amberWarningLamp, differentialMileage, circleType, roteSpeed, forewardCount, reverseCount, avgGasConsumption, totalGasConsumption, integralGasConsumption, actualPumpState, dynamicLoad, lampState, integralMileage, integralOilConsumption, targetGear, realSpeedRatio,
    };

    public static StatusType valueOf(
            com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
                "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private StatusType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:StatusType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
          descriptor;
  static {
    String[] descriptorData = {
            "\n\'core/proto/common/java/StatusType.prot" +
                    "o*\324\033\n\nStatusType\022\017\n\013dpfPressure\020\001\022\024\n\020rel" +
                    "ativePressure\020\002\022\020\n\014intakeAirTem\020\003\022\024\n\020abs" +
                    "olutePressure\020\004\022\016\n\nexhaustTem\020\005\022\027\n\023atmos" +
                    "phericPressure\020\006\022\r\n\tengineTem\020\007\022\022\n\016atmos" +
                    "phericTem\020\010\022\017\n\013pavementTem\020\t\022\016\n\nlampStat" +
                    "us\020\n\022\013\n\007mileage\020\013\022\024\n\020waterInOilStatus\020\014\022" +
                    "\014\n\010oilValue\020\016\022\014\n\010rotation\020\017\022\020\n\014fuelPress" +
                    "ure\020\020\022\014\n\010oilLevel\020\021\022\017\n\013oilPressure\020\022\022\020\n\014" +
                    "coolantLevel\020\023\022\023\n\017coolingWaterTem\020\024\022\013\n\007f",
            "uelTem\020\025\022\n\n\006oilTem\020\026\022\027\n\023ureaTankLiquidLe" +
                    "vel\020\027\022\017\n\013ureaTankTem\020\030\022\031\n\025cumulativeRunn" +
                    "ingTime\020\031\022\033\n\027cumulativeTurningNumber\020\032\022\027" +
                    "\n\023fuelConsumptionRate\020\033\022\032\n\026averageFuelCo" +
                    "nsumption\020\034\022\026\n\022dayFuelConsumption\020\035\022\030\n\024t" +
                    "otalFuelConsumption\020\036\022\021\n\rengineTorMode\020\037" +
                    "\022\032\n\026driverEnginePercentTor\020 \022\032\n\026actualEn" +
                    "ginePercentTor\020!\022\031\n\025accPedalLowIdleSwitc" +
                    "h\020\"\022\032\n\026accPedalKickdownSwitch\020#\022\017\n\013accPe" +
                    "dalPos\020$\022\033\n\027percentLoadAtCurrentSpd\020%\022\035\n",
            "\031nominalFrictionPercentTrq\020&\022\026\n\022parkingB" +
                    "rakeSwitch\020\'\022\024\n\020cruiseCtrlActive\020(\022\017\n\013br" +
                    "akeSwitch\020)\022\020\n\014clutchSwitch\020*\022\027\n\023cruiseC" +
                    "trlSetSwitch\020+\022\031\n\025cruiseCtrlCoastSwitch\020" +
                    ",\022\032\n\026cruiseCtrlResumeSwitch\020-\022\027\n\023cruiseC" +
                    "trlAccSwitch\020.\022\024\n\020cruiseCtrlSetSpd\020/\022\024\n\020" +
                    "cruiseCtrlStates\0200\022\020\n\014tripDistance\0201\022\032\n\026" +
                    "realTimeOilConsumption\0202\022\030\n\024wheelBasedVe" +
                    "hicleSpd\0203\022\024\n\020outPutRoateSpeed\0204\022\032\n\026tach" +
                    "ographVehicleSpeed\0205\022\017\n\013currentGear\0206\022\014\n",
            "\010tripFuel\0207\022\017\n\013truboOilTem\0208\022\016\n\nbatteryP" +
                    "ot\0209\022\024\n\020engineProtection\020:\022\013\n\007P1Speed\020;\022" +
                    "\014\n\010P1Torque\020<\022\013\n\007P3Speed\020=\022\014\n\010P3Torque\020>" +
                    "\022\013\n\007P4Speed\020?\022\014\n\010P4Troque\020@\022\013\n\007P5Speed\020A" +
                    "\022\014\n\010P5Torque\020B\022\013\n\007P6Speed\020C\022\r\n\tgainSpeed" +
                    "\020D\022\023\n\017RefEngineTorque\020E\022\021\n\rMaxSpeedLimit" +
                    "\020F\022\020\n\014MaxTimeLimit\020G\022\020\n\014SpLowerLimit\020H\022\020" +
                    "\n\014SpUpperLimit\020I\022\021\n\rTorLowerLimit\020J\022\021\n\rT" +
                    "orUpperLimit\020K\022\023\n\017ReqSpUpperLimit\020L\022\016\n\nM" +
                    "omentIner\020M\022\025\n\021RelEngOilPressure\020N\022\020\n\014en",
            "gOilPreLow\020O\022\016\n\nengCoolTem\020P\022\022\n\016StartHea" +
                    "rtStat\020Q\022\021\n\rOBDLampStatus\020R\022\014\n\010ExOutput\020" +
                    "S\022\013\n\007EsFanSp\020T\022\017\n\013FanDriState\020U\022\014\n\010FanSp" +
                    "eed\020V\022\020\n\014airFilterPre\020W\022\021\n\rCoolDifferTem" +
                    "\020X\022\014\n\010AirInTem\020Y\022\024\n\020perTorResolution\020Z\022\024" +
                    "\n\020addControlDevice\020[\022\023\n\017engineStartMode\020" +
                    "\\\022\022\n\016engineDePerTor\020]\022\024\n\020speedLimitStatu" +
                    "s\020^\022\021\n\rreAccPosition\020_\022\022\n\016reAccPosition2" +
                    "\020`\022\031\n\025maxAvailableEngPerTor\020a\022\023\n\017desirOp" +
                    "eraSpeed\020b\022\020\n\014engAsyAdjust\020c\022\021\n\rEstimaPa",
            "rLoss\020d\022\022\n\016exhGasMassflow\020e\022\r\n\taf1Intake" +
                    "\020f\022\016\n\naf1Exhaust\020g\022\r\n\taf2Intake\020h\022\016\n\naf2" +
                    "Exhaust\020i\022\022\n\016cruPauseSwitch\020j\022\025\n\021cruiCon" +
                    "trolEnable\020k\022\014\n\010ptoState\020l\022\025\n\021engShutOve" +
                    "rSwitch\020m\022\025\n\021engTestModeWwitch\020n\022\024\n\020engI" +
                    "dleDecSwitch\020o\022\024\n\020engIdleIncSwitch\020p\022\020\n\014" +
                    "retarTorMode\020q\022\025\n\021retBrakeAssSwitch\020r\022\025\n" +
                    "\021retShiftAssSwitch\020s\022\020\n\014actRetTorPer\020t\022\020" +
                    "\n\014intRetPerTor\020u\022\024\n\020coolLoadIncrease\020v\022\024" +
                    "\n\020retReqBrakeLight\020w\022\025\n\021addOfControDevic",
            "e\020x\022\020\n\014demRetPerTor\020y\022\023\n\017retSwitchPerTor" +
                    "\020z\022\034\n\030actMaxAvailableRetPerTor\020{\022\024\n\020reta" +
                    "rderLocation\020|\022\020\n\014retarderType\020}\022\025\n\021reta" +
                    "rderConMethod\020~\022\030\n\024retarderSpIdlePoint1\020" +
                    "\177\022\027\n\022retarderPerTorIdle\020\200\001\022\026\n\021maxRetSpee" +
                    "dPoint2\020\201\001\022\034\n\027retPerTorMaxSpeedPoint2\020\202\001" +
                    "\022\023\n\016engSpeedPoint3\020\203\001\022\031\n\024retarderPerTorP" +
                    "oint3\020\204\001\022\023\n\016engSpeedPoint4\020\205\001\022\031\n\024retarde" +
                    "rPerTorPoint4\020\206\001\022\026\n\021retSpeedTorPoint5\020\207\001" +
                    "\022\023\n\016refRetarTorque\020\210\001\022\031\n\024retarderPerTorP",
            "oint5\020\211\001\022\024\n\017extendCrankcase\020\212\001\022\026\n\021engine" +
                    "InterTemper\020\213\001\022\025\n\020batteryPotInput1\020\214\001\022\023\n" +
                    "\016P2HighestSpeed\020\215\001\022\026\n\021P2PercentTorSpeed\020" +
                    "\216\001\022\023\n\016TripDistanceDD\020\217\001\022\016\n\tmileageDD\020\220\001\022" +
                    "\016\n\tlng1Gross\020\221\001\022\020\n\013lng1Surplus\020\222\001\022\016\n\tlng" +
                    "2Gross\020\223\001\022\020\n\013lng2Surplus\020\224\001\022\016\n\tlng3Gross" +
                    "\020\225\001\022\020\n\013lng3Surplus\020\226\001\022\016\n\tlng4Gross\020\227\001\022\020\n" +
                    "\013lng4Surplus\020\230\001\022\014\n\007p2Speed\020\231\001\022\r\n\010p2Torqu" +
                    "e\020\232\001\022\026\n\021ureaConcentration\020\233\001\022\034\n\027integral" +
                    "FuelConsumption\020\234\001\022\020\n\013protectLamp\020\235\001\022\r\n\010",
            "stopLamp\020\237\001\022\014\n\007milLamp\020\241\001\022\014\n\007scrLamp\020\242\001\022" +
                    "\025\n\020amberWarningLamp\020\243\001\022\030\n\023differentialMi" +
                    "leage\020\244\001\022\017\n\ncircleType\020\245\001\022\016\n\troteSpeed\020\246" +
                    "\001\022\022\n\rforewardCount\020\247\001\022\021\n\014reverseCount\020\250\001" +
                    "\022\026\n\021avgGasConsumption\020\251\001\022\030\n\023totalGasCons" +
                    "umption\020\252\001\022\033\n\026integralGasConsumption\020\253\001\022" +
                    "\024\n\017actualPumpState\020\254\001\022\020\n\013dynamicLoad\020\255\001\022" +
                    "\016\n\tlampState\020\256\001\022\024\n\017integralMileage\020\257\001\022\033\n" +
                    "\026integralOilConsumption\020\261\001\022\017\n\ntargetGear" +
                    "\020\262\001\022\023\n\016realSpeedRatio\020\263\001BE\n5com.navinfo.",
            "opentsp.platform.location.protocol.commo" +
                    "nB\014LCStatusType"
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
