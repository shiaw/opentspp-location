// Generated by ProtoGen, Version=2.4.1.473, Culture=neutral, PublicKeyToken=55f7125234beb589.  DO NOT EDIT!
#pragma warning disable 1591, 0612
#region Designer generated code

using pb = global::Google.ProtocolBuffers;
using pbc = global::Google.ProtocolBuffers.Collections;
using pbd = global::Google.ProtocolBuffers.Descriptors;
using scg = global::System.Collections.Generic;
namespace AeroCloud.Protocol {
  
  namespace Proto {
    
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
    [global::System.Runtime.CompilerServices.CompilerGeneratedAttribute()]
    [global::System.CodeDom.Compiler.GeneratedCodeAttribute("ProtoGen", "2.4.1.473")]
    public static partial class AreaSpeeding {
    
      #region Extension registration
      public static void RegisterAllExtensions(pb::ExtensionRegistry registry) {
      }
      #endregion
      #region Static variables
      internal static pbd::MessageDescriptor internal__static_AreaSpeeding__Descriptor;
      internal static pb::FieldAccess.FieldAccessorTable<global::AeroCloud.Protocol.AreaSpeeding, global::AeroCloud.Protocol.AreaSpeeding.Builder> internal__static_AreaSpeeding__FieldAccessorTable;
      #endregion
      #region Descriptor
      public static pbd::FileDescriptor Descriptor {
        get { return descriptor; }
      }
      private static pbd::FileDescriptor descriptor;
      
      static AreaSpeeding() {
        byte[] descriptorData = global::System.Convert.FromBase64String(
            "CjNjb3JlL3Byb3RvL2RhdGFhY2Nlc3MvY29tbW9uL25ldC9BcmVhU3BlZWRp" + 
            "bmcucHJvdG8aFGNzaGFycF9vcHRpb25zLnByb3RvGiRjb3JlL3Byb3RvL2Nv" + 
            "bW1vbi9uZXQvQXJlYVR5cGUucHJvdG8ivgEKDEFyZWFTcGVlZGluZxIOCgZh" + 
            "cmVhSWQYASACKAMSGAoFdHlwZXMYAiACKA4yCS5BcmVhVHlwZRIPCgdyb3V0" + 
            "ZUlkGAMgASgDEhAKCG1heFNwZWVkGAQgAigFEhYKDmNvbnRpbnVvdXNUaW1l" + 
            "GAUgAigFEhEKCWJhc2VkVGltZRgGIAIoCBISCgppc0V2ZXJ5RGF5GAcgASgI" + 
            "EhEKCXN0YXJ0RGF0ZRgIIAEoAxIPCgdlbmREYXRlGAkgASgDQk8KJmNvbS5s" + 
            "Yy5jb3JlLnByb3RvY29sLmRhdGFhY2Nlc3MuY29tbW9uQg5MQ0FyZWFTcGVl" + 
            "ZGluZ8I+FAoSQWVyb0Nsb3VkLlByb3RvY29s");
        pbd::FileDescriptor.InternalDescriptorAssigner assigner = delegate(pbd::FileDescriptor root) {
          descriptor = root;
          internal__static_AreaSpeeding__Descriptor = Descriptor.MessageTypes[0];
          internal__static_AreaSpeeding__FieldAccessorTable = 
              new pb::FieldAccess.FieldAccessorTable<global::AeroCloud.Protocol.AreaSpeeding, global::AeroCloud.Protocol.AreaSpeeding.Builder>(internal__static_AreaSpeeding__Descriptor,
                  new string[] { "AreaId", "Types", "RouteId", "MaxSpeed", "ContinuousTime", "BasedTime", "IsEveryDay", "StartDate", "EndDate", });
          pb::ExtensionRegistry registry = pb::ExtensionRegistry.CreateInstance();
          RegisterAllExtensions(registry);
          global::Google.ProtocolBuffers.DescriptorProtos.CSharpOptions.RegisterAllExtensions(registry);
          global::AeroCloud.Protocol.Proto.AreaType.RegisterAllExtensions(registry);
          return registry;
        };
        pbd::FileDescriptor.InternalBuildGeneratedFileFrom(descriptorData,
            new pbd::FileDescriptor[] {
            global::Google.ProtocolBuffers.DescriptorProtos.CSharpOptions.Descriptor, 
            global::AeroCloud.Protocol.Proto.AreaType.Descriptor, 
            }, assigner);
      }
      #endregion
      
    }
  }
  #region Messages
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
  [global::System.Runtime.CompilerServices.CompilerGeneratedAttribute()]
  [global::System.CodeDom.Compiler.GeneratedCodeAttribute("ProtoGen", "2.4.1.473")]
  public sealed partial class AreaSpeeding : pb::GeneratedMessage<AreaSpeeding, AreaSpeeding.Builder> {
    private AreaSpeeding() { }
    private static readonly AreaSpeeding defaultInstance = new AreaSpeeding().MakeReadOnly();
    private static readonly string[] _areaSpeedingFieldNames = new string[] { "areaId", "basedTime", "continuousTime", "endDate", "isEveryDay", "maxSpeed", "routeId", "startDate", "types" };
    private static readonly uint[] _areaSpeedingFieldTags = new uint[] { 8, 48, 40, 72, 56, 32, 24, 64, 16 };
    public static AreaSpeeding DefaultInstance {
      get { return defaultInstance; }
    }
    
    public override AreaSpeeding DefaultInstanceForType {
      get { return DefaultInstance; }
    }
    
    protected override AreaSpeeding ThisMessage {
      get { return this; }
    }
    
    public static pbd::MessageDescriptor Descriptor {
      get { return global::AeroCloud.Protocol.Proto.AreaSpeeding.internal__static_AreaSpeeding__Descriptor; }
    }
    
    protected override pb::FieldAccess.FieldAccessorTable<AreaSpeeding, AreaSpeeding.Builder> InternalFieldAccessors {
      get { return global::AeroCloud.Protocol.Proto.AreaSpeeding.internal__static_AreaSpeeding__FieldAccessorTable; }
    }
    
    public const int AreaIdFieldNumber = 1;
    private bool hasAreaId;
    private long areaId_;
    public bool HasAreaId {
      get { return hasAreaId; }
    }
    public long AreaId {
      get { return areaId_; }
    }
    
    public const int TypesFieldNumber = 2;
    private bool hasTypes;
    private global::AeroCloud.Protocol.AreaType types_ = global::AeroCloud.Protocol.AreaType.noType;
    public bool HasTypes {
      get { return hasTypes; }
    }
    public global::AeroCloud.Protocol.AreaType Types {
      get { return types_; }
    }
    
    public const int RouteIdFieldNumber = 3;
    private bool hasRouteId;
    private long routeId_;
    public bool HasRouteId {
      get { return hasRouteId; }
    }
    public long RouteId {
      get { return routeId_; }
    }
    
    public const int MaxSpeedFieldNumber = 4;
    private bool hasMaxSpeed;
    private int maxSpeed_;
    public bool HasMaxSpeed {
      get { return hasMaxSpeed; }
    }
    public int MaxSpeed {
      get { return maxSpeed_; }
    }
    
    public const int ContinuousTimeFieldNumber = 5;
    private bool hasContinuousTime;
    private int continuousTime_;
    public bool HasContinuousTime {
      get { return hasContinuousTime; }
    }
    public int ContinuousTime {
      get { return continuousTime_; }
    }
    
    public const int BasedTimeFieldNumber = 6;
    private bool hasBasedTime;
    private bool basedTime_;
    public bool HasBasedTime {
      get { return hasBasedTime; }
    }
    public bool BasedTime {
      get { return basedTime_; }
    }
    
    public const int IsEveryDayFieldNumber = 7;
    private bool hasIsEveryDay;
    private bool isEveryDay_;
    public bool HasIsEveryDay {
      get { return hasIsEveryDay; }
    }
    public bool IsEveryDay {
      get { return isEveryDay_; }
    }
    
    public const int StartDateFieldNumber = 8;
    private bool hasStartDate;
    private long startDate_;
    public bool HasStartDate {
      get { return hasStartDate; }
    }
    public long StartDate {
      get { return startDate_; }
    }
    
    public const int EndDateFieldNumber = 9;
    private bool hasEndDate;
    private long endDate_;
    public bool HasEndDate {
      get { return hasEndDate; }
    }
    public long EndDate {
      get { return endDate_; }
    }
    
    public override bool IsInitialized {
      get {
        if (!hasAreaId) return false;
        if (!hasTypes) return false;
        if (!hasMaxSpeed) return false;
        if (!hasContinuousTime) return false;
        if (!hasBasedTime) return false;
        return true;
      }
    }
    
    public override void WriteTo(pb::ICodedOutputStream output) {
      int size = SerializedSize;
      string[] field_names = _areaSpeedingFieldNames;
      if (hasAreaId) {
        output.WriteInt64(1, field_names[0], AreaId);
      }
      if (hasTypes) {
        output.WriteEnum(2, field_names[8], (int) Types, Types);
      }
      if (hasRouteId) {
        output.WriteInt64(3, field_names[6], RouteId);
      }
      if (hasMaxSpeed) {
        output.WriteInt32(4, field_names[5], MaxSpeed);
      }
      if (hasContinuousTime) {
        output.WriteInt32(5, field_names[2], ContinuousTime);
      }
      if (hasBasedTime) {
        output.WriteBool(6, field_names[1], BasedTime);
      }
      if (hasIsEveryDay) {
        output.WriteBool(7, field_names[4], IsEveryDay);
      }
      if (hasStartDate) {
        output.WriteInt64(8, field_names[7], StartDate);
      }
      if (hasEndDate) {
        output.WriteInt64(9, field_names[3], EndDate);
      }
      UnknownFields.WriteTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public override int SerializedSize {
      get {
        int size = memoizedSerializedSize;
        if (size != -1) return size;
        
        size = 0;
        if (hasAreaId) {
          size += pb::CodedOutputStream.ComputeInt64Size(1, AreaId);
        }
        if (hasTypes) {
          size += pb::CodedOutputStream.ComputeEnumSize(2, (int) Types);
        }
        if (hasRouteId) {
          size += pb::CodedOutputStream.ComputeInt64Size(3, RouteId);
        }
        if (hasMaxSpeed) {
          size += pb::CodedOutputStream.ComputeInt32Size(4, MaxSpeed);
        }
        if (hasContinuousTime) {
          size += pb::CodedOutputStream.ComputeInt32Size(5, ContinuousTime);
        }
        if (hasBasedTime) {
          size += pb::CodedOutputStream.ComputeBoolSize(6, BasedTime);
        }
        if (hasIsEveryDay) {
          size += pb::CodedOutputStream.ComputeBoolSize(7, IsEveryDay);
        }
        if (hasStartDate) {
          size += pb::CodedOutputStream.ComputeInt64Size(8, StartDate);
        }
        if (hasEndDate) {
          size += pb::CodedOutputStream.ComputeInt64Size(9, EndDate);
        }
        size += UnknownFields.SerializedSize;
        memoizedSerializedSize = size;
        return size;
      }
    }
    
    public static AreaSpeeding ParseFrom(pb::ByteString data) {
      return ((Builder) CreateBuilder().MergeFrom(data)).BuildParsed();
    }
    public static AreaSpeeding ParseFrom(pb::ByteString data, pb::ExtensionRegistry extensionRegistry) {
      return ((Builder) CreateBuilder().MergeFrom(data, extensionRegistry)).BuildParsed();
    }
    public static AreaSpeeding ParseFrom(byte[] data) {
      return ((Builder) CreateBuilder().MergeFrom(data)).BuildParsed();
    }
    public static AreaSpeeding ParseFrom(byte[] data, pb::ExtensionRegistry extensionRegistry) {
      return ((Builder) CreateBuilder().MergeFrom(data, extensionRegistry)).BuildParsed();
    }
    public static AreaSpeeding ParseFrom(global::System.IO.Stream input) {
      return ((Builder) CreateBuilder().MergeFrom(input)).BuildParsed();
    }
    public static AreaSpeeding ParseFrom(global::System.IO.Stream input, pb::ExtensionRegistry extensionRegistry) {
      return ((Builder) CreateBuilder().MergeFrom(input, extensionRegistry)).BuildParsed();
    }
    public static AreaSpeeding ParseDelimitedFrom(global::System.IO.Stream input) {
      return CreateBuilder().MergeDelimitedFrom(input).BuildParsed();
    }
    public static AreaSpeeding ParseDelimitedFrom(global::System.IO.Stream input, pb::ExtensionRegistry extensionRegistry) {
      return CreateBuilder().MergeDelimitedFrom(input, extensionRegistry).BuildParsed();
    }
    public static AreaSpeeding ParseFrom(pb::ICodedInputStream input) {
      return ((Builder) CreateBuilder().MergeFrom(input)).BuildParsed();
    }
    public static AreaSpeeding ParseFrom(pb::ICodedInputStream input, pb::ExtensionRegistry extensionRegistry) {
      return ((Builder) CreateBuilder().MergeFrom(input, extensionRegistry)).BuildParsed();
    }
    private AreaSpeeding MakeReadOnly() {
      return this;
    }
    
    public static Builder CreateBuilder() { return new Builder(); }
    public override Builder ToBuilder() { return CreateBuilder(this); }
    public override Builder CreateBuilderForType() { return new Builder(); }
    public static Builder CreateBuilder(AreaSpeeding prototype) {
      return new Builder(prototype);
    }
    
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
    [global::System.Runtime.CompilerServices.CompilerGeneratedAttribute()]
    [global::System.CodeDom.Compiler.GeneratedCodeAttribute("ProtoGen", "2.4.1.473")]
    public sealed partial class Builder : pb::GeneratedBuilder<AreaSpeeding, Builder> {
      protected override Builder ThisBuilder {
        get { return this; }
      }
      public Builder() {
        result = DefaultInstance;
        resultIsReadOnly = true;
      }
      internal Builder(AreaSpeeding cloneFrom) {
        result = cloneFrom;
        resultIsReadOnly = true;
      }
      
      private bool resultIsReadOnly;
      private AreaSpeeding result;
      
      private AreaSpeeding PrepareBuilder() {
        if (resultIsReadOnly) {
          AreaSpeeding original = result;
          result = new AreaSpeeding();
          resultIsReadOnly = false;
          MergeFrom(original);
        }
        return result;
      }
      
      public override bool IsInitialized {
        get { return result.IsInitialized; }
      }
      
      protected override AreaSpeeding MessageBeingBuilt {
        get { return PrepareBuilder(); }
      }
      
      public override Builder Clear() {
        result = DefaultInstance;
        resultIsReadOnly = true;
        return this;
      }
      
      public override Builder Clone() {
        if (resultIsReadOnly) {
          return new Builder(result);
        } else {
          return new Builder().MergeFrom(result);
        }
      }
      
      public override pbd::MessageDescriptor DescriptorForType {
        get { return global::AeroCloud.Protocol.AreaSpeeding.Descriptor; }
      }
      
      public override AreaSpeeding DefaultInstanceForType {
        get { return global::AeroCloud.Protocol.AreaSpeeding.DefaultInstance; }
      }
      
      public override AreaSpeeding BuildPartial() {
        if (resultIsReadOnly) {
          return result;
        }
        resultIsReadOnly = true;
        return result.MakeReadOnly();
      }
      
      public override Builder MergeFrom(pb::IMessage other) {
        if (other is AreaSpeeding) {
          return MergeFrom((AreaSpeeding) other);
        } else {
          base.MergeFrom(other);
          return this;
        }
      }
      
      public override Builder MergeFrom(AreaSpeeding other) {
        if (other == global::AeroCloud.Protocol.AreaSpeeding.DefaultInstance) return this;
        PrepareBuilder();
        if (other.HasAreaId) {
          AreaId = other.AreaId;
        }
        if (other.HasTypes) {
          Types = other.Types;
        }
        if (other.HasRouteId) {
          RouteId = other.RouteId;
        }
        if (other.HasMaxSpeed) {
          MaxSpeed = other.MaxSpeed;
        }
        if (other.HasContinuousTime) {
          ContinuousTime = other.ContinuousTime;
        }
        if (other.HasBasedTime) {
          BasedTime = other.BasedTime;
        }
        if (other.HasIsEveryDay) {
          IsEveryDay = other.IsEveryDay;
        }
        if (other.HasStartDate) {
          StartDate = other.StartDate;
        }
        if (other.HasEndDate) {
          EndDate = other.EndDate;
        }
        this.MergeUnknownFields(other.UnknownFields);
        return this;
      }
      
      public override Builder MergeFrom(pb::ICodedInputStream input) {
        return MergeFrom(input, pb::ExtensionRegistry.Empty);
      }
      
      public override Builder MergeFrom(pb::ICodedInputStream input, pb::ExtensionRegistry extensionRegistry) {
        PrepareBuilder();
        pb::UnknownFieldSet.Builder unknownFields = null;
        uint tag;
        string field_name;
        while (input.ReadTag(out tag, out field_name)) {
          if(tag == 0 && field_name != null) {
            int field_ordinal = global::System.Array.BinarySearch(_areaSpeedingFieldNames, field_name, global::System.StringComparer.Ordinal);
            if(field_ordinal >= 0)
              tag = _areaSpeedingFieldTags[field_ordinal];
            else {
              if (unknownFields == null) {
                unknownFields = pb::UnknownFieldSet.CreateBuilder(this.UnknownFields);
              }
              ParseUnknownField(input, unknownFields, extensionRegistry, tag, field_name);
              continue;
            }
          }
          switch (tag) {
            case 0: {
              throw pb::InvalidProtocolBufferException.InvalidTag();
            }
            default: {
              if (pb::WireFormat.IsEndGroupTag(tag)) {
                if (unknownFields != null) {
                  this.UnknownFields = unknownFields.Build();
                }
                return this;
              }
              if (unknownFields == null) {
                unknownFields = pb::UnknownFieldSet.CreateBuilder(this.UnknownFields);
              }
              ParseUnknownField(input, unknownFields, extensionRegistry, tag, field_name);
              break;
            }
            case 8: {
              result.hasAreaId = input.ReadInt64(ref result.areaId_);
              break;
            }
            case 16: {
              object unknown;
              if(input.ReadEnum(ref result.types_, out unknown)) {
                result.hasTypes = true;
              } else if(unknown is int) {
                if (unknownFields == null) {
                  unknownFields = pb::UnknownFieldSet.CreateBuilder(this.UnknownFields);
                }
                unknownFields.MergeVarintField(2, (ulong)(int)unknown);
              }
              break;
            }
            case 24: {
              result.hasRouteId = input.ReadInt64(ref result.routeId_);
              break;
            }
            case 32: {
              result.hasMaxSpeed = input.ReadInt32(ref result.maxSpeed_);
              break;
            }
            case 40: {
              result.hasContinuousTime = input.ReadInt32(ref result.continuousTime_);
              break;
            }
            case 48: {
              result.hasBasedTime = input.ReadBool(ref result.basedTime_);
              break;
            }
            case 56: {
              result.hasIsEveryDay = input.ReadBool(ref result.isEveryDay_);
              break;
            }
            case 64: {
              result.hasStartDate = input.ReadInt64(ref result.startDate_);
              break;
            }
            case 72: {
              result.hasEndDate = input.ReadInt64(ref result.endDate_);
              break;
            }
          }
        }
        
        if (unknownFields != null) {
          this.UnknownFields = unknownFields.Build();
        }
        return this;
      }
      
      
      public bool HasAreaId {
        get { return result.hasAreaId; }
      }
      public long AreaId {
        get { return result.AreaId; }
        set { SetAreaId(value); }
      }
      public Builder SetAreaId(long value) {
        PrepareBuilder();
        result.hasAreaId = true;
        result.areaId_ = value;
        return this;
      }
      public Builder ClearAreaId() {
        PrepareBuilder();
        result.hasAreaId = false;
        result.areaId_ = 0L;
        return this;
      }
      
      public bool HasTypes {
       get { return result.hasTypes; }
      }
      public global::AeroCloud.Protocol.AreaType Types {
        get { return result.Types; }
        set { SetTypes(value); }
      }
      public Builder SetTypes(global::AeroCloud.Protocol.AreaType value) {
        PrepareBuilder();
        result.hasTypes = true;
        result.types_ = value;
        return this;
      }
      public Builder ClearTypes() {
        PrepareBuilder();
        result.hasTypes = false;
        result.types_ = global::AeroCloud.Protocol.AreaType.noType;
        return this;
      }
      
      public bool HasRouteId {
        get { return result.hasRouteId; }
      }
      public long RouteId {
        get { return result.RouteId; }
        set { SetRouteId(value); }
      }
      public Builder SetRouteId(long value) {
        PrepareBuilder();
        result.hasRouteId = true;
        result.routeId_ = value;
        return this;
      }
      public Builder ClearRouteId() {
        PrepareBuilder();
        result.hasRouteId = false;
        result.routeId_ = 0L;
        return this;
      }
      
      public bool HasMaxSpeed {
        get { return result.hasMaxSpeed; }
      }
      public int MaxSpeed {
        get { return result.MaxSpeed; }
        set { SetMaxSpeed(value); }
      }
      public Builder SetMaxSpeed(int value) {
        PrepareBuilder();
        result.hasMaxSpeed = true;
        result.maxSpeed_ = value;
        return this;
      }
      public Builder ClearMaxSpeed() {
        PrepareBuilder();
        result.hasMaxSpeed = false;
        result.maxSpeed_ = 0;
        return this;
      }
      
      public bool HasContinuousTime {
        get { return result.hasContinuousTime; }
      }
      public int ContinuousTime {
        get { return result.ContinuousTime; }
        set { SetContinuousTime(value); }
      }
      public Builder SetContinuousTime(int value) {
        PrepareBuilder();
        result.hasContinuousTime = true;
        result.continuousTime_ = value;
        return this;
      }
      public Builder ClearContinuousTime() {
        PrepareBuilder();
        result.hasContinuousTime = false;
        result.continuousTime_ = 0;
        return this;
      }
      
      public bool HasBasedTime {
        get { return result.hasBasedTime; }
      }
      public bool BasedTime {
        get { return result.BasedTime; }
        set { SetBasedTime(value); }
      }
      public Builder SetBasedTime(bool value) {
        PrepareBuilder();
        result.hasBasedTime = true;
        result.basedTime_ = value;
        return this;
      }
      public Builder ClearBasedTime() {
        PrepareBuilder();
        result.hasBasedTime = false;
        result.basedTime_ = false;
        return this;
      }
      
      public bool HasIsEveryDay {
        get { return result.hasIsEveryDay; }
      }
      public bool IsEveryDay {
        get { return result.IsEveryDay; }
        set { SetIsEveryDay(value); }
      }
      public Builder SetIsEveryDay(bool value) {
        PrepareBuilder();
        result.hasIsEveryDay = true;
        result.isEveryDay_ = value;
        return this;
      }
      public Builder ClearIsEveryDay() {
        PrepareBuilder();
        result.hasIsEveryDay = false;
        result.isEveryDay_ = false;
        return this;
      }
      
      public bool HasStartDate {
        get { return result.hasStartDate; }
      }
      public long StartDate {
        get { return result.StartDate; }
        set { SetStartDate(value); }
      }
      public Builder SetStartDate(long value) {
        PrepareBuilder();
        result.hasStartDate = true;
        result.startDate_ = value;
        return this;
      }
      public Builder ClearStartDate() {
        PrepareBuilder();
        result.hasStartDate = false;
        result.startDate_ = 0L;
        return this;
      }
      
      public bool HasEndDate {
        get { return result.hasEndDate; }
      }
      public long EndDate {
        get { return result.EndDate; }
        set { SetEndDate(value); }
      }
      public Builder SetEndDate(long value) {
        PrepareBuilder();
        result.hasEndDate = true;
        result.endDate_ = value;
        return this;
      }
      public Builder ClearEndDate() {
        PrepareBuilder();
        result.hasEndDate = false;
        result.endDate_ = 0L;
        return this;
      }
    }
    static AreaSpeeding() {
      object.ReferenceEquals(global::AeroCloud.Protocol.Proto.AreaSpeeding.Descriptor, null);
    }
  }
  
  #endregion
  
}

#endregion Designer generated code
