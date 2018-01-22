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
    public static partial class DriverNotCard {
    
      #region Extension registration
      public static void RegisterAllExtensions(pb::ExtensionRegistry registry) {
      }
      #endregion
      #region Static variables
      internal static pbd::MessageDescriptor internal__static_DriverNotCard__Descriptor;
      internal static pb::FieldAccess.FieldAccessorTable<global::AeroCloud.Protocol.DriverNotCard, global::AeroCloud.Protocol.DriverNotCard.Builder> internal__static_DriverNotCard__FieldAccessorTable;
      #endregion
      #region Descriptor
      public static pbd::FileDescriptor Descriptor {
        get { return descriptor; }
      }
      private static pbd::FileDescriptor descriptor;
      
      static DriverNotCard() {
        byte[] descriptorData = global::System.Convert.FromBase64String(
            "CjRjb3JlL3Byb3RvL2RhdGFhY2Nlc3MvY29tbW9uL25ldC9Ecml2ZXJOb3RD" + 
            "YXJkLnByb3RvGhRjc2hhcnBfb3B0aW9ucy5wcm90byIkCg1Ecml2ZXJOb3RD" + 
            "YXJkEhMKC25vdENhcmRUaW1lGAEgAigFQlAKJmNvbS5sYy5jb3JlLnByb3Rv" + 
            "Y29sLmRhdGFhY2Nlc3MuY29tbW9uQg9MQ0RyaXZlck5vdENhcmTCPhQKEkFl" + 
            "cm9DbG91ZC5Qcm90b2NvbA==");
        pbd::FileDescriptor.InternalDescriptorAssigner assigner = delegate(pbd::FileDescriptor root) {
          descriptor = root;
          internal__static_DriverNotCard__Descriptor = Descriptor.MessageTypes[0];
          internal__static_DriverNotCard__FieldAccessorTable = 
              new pb::FieldAccess.FieldAccessorTable<global::AeroCloud.Protocol.DriverNotCard, global::AeroCloud.Protocol.DriverNotCard.Builder>(internal__static_DriverNotCard__Descriptor,
                  new string[] { "NotCardTime", });
          pb::ExtensionRegistry registry = pb::ExtensionRegistry.CreateInstance();
          RegisterAllExtensions(registry);
          global::Google.ProtocolBuffers.DescriptorProtos.CSharpOptions.RegisterAllExtensions(registry);
          return registry;
        };
        pbd::FileDescriptor.InternalBuildGeneratedFileFrom(descriptorData,
            new pbd::FileDescriptor[] {
            global::Google.ProtocolBuffers.DescriptorProtos.CSharpOptions.Descriptor, 
            }, assigner);
      }
      #endregion
      
    }
  }
  #region Messages
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
  [global::System.Runtime.CompilerServices.CompilerGeneratedAttribute()]
  [global::System.CodeDom.Compiler.GeneratedCodeAttribute("ProtoGen", "2.4.1.473")]
  public sealed partial class DriverNotCard : pb::GeneratedMessage<DriverNotCard, DriverNotCard.Builder> {
    private DriverNotCard() { }
    private static readonly DriverNotCard defaultInstance = new DriverNotCard().MakeReadOnly();
    private static readonly string[] _driverNotCardFieldNames = new string[] { "notCardTime" };
    private static readonly uint[] _driverNotCardFieldTags = new uint[] { 8 };
    public static DriverNotCard DefaultInstance {
      get { return defaultInstance; }
    }
    
    public override DriverNotCard DefaultInstanceForType {
      get { return DefaultInstance; }
    }
    
    protected override DriverNotCard ThisMessage {
      get { return this; }
    }
    
    public static pbd::MessageDescriptor Descriptor {
      get { return global::AeroCloud.Protocol.Proto.DriverNotCard.internal__static_DriverNotCard__Descriptor; }
    }
    
    protected override pb::FieldAccess.FieldAccessorTable<DriverNotCard, DriverNotCard.Builder> InternalFieldAccessors {
      get { return global::AeroCloud.Protocol.Proto.DriverNotCard.internal__static_DriverNotCard__FieldAccessorTable; }
    }
    
    public const int NotCardTimeFieldNumber = 1;
    private bool hasNotCardTime;
    private int notCardTime_;
    public bool HasNotCardTime {
      get { return hasNotCardTime; }
    }
    public int NotCardTime {
      get { return notCardTime_; }
    }
    
    public override bool IsInitialized {
      get {
        if (!hasNotCardTime) return false;
        return true;
      }
    }
    
    public override void WriteTo(pb::ICodedOutputStream output) {
      int size = SerializedSize;
      string[] field_names = _driverNotCardFieldNames;
      if (hasNotCardTime) {
        output.WriteInt32(1, field_names[0], NotCardTime);
      }
      UnknownFields.WriteTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public override int SerializedSize {
      get {
        int size = memoizedSerializedSize;
        if (size != -1) return size;
        
        size = 0;
        if (hasNotCardTime) {
          size += pb::CodedOutputStream.ComputeInt32Size(1, NotCardTime);
        }
        size += UnknownFields.SerializedSize;
        memoizedSerializedSize = size;
        return size;
      }
    }
    
    public static DriverNotCard ParseFrom(pb::ByteString data) {
      return ((Builder) CreateBuilder().MergeFrom(data)).BuildParsed();
    }
    public static DriverNotCard ParseFrom(pb::ByteString data, pb::ExtensionRegistry extensionRegistry) {
      return ((Builder) CreateBuilder().MergeFrom(data, extensionRegistry)).BuildParsed();
    }
    public static DriverNotCard ParseFrom(byte[] data) {
      return ((Builder) CreateBuilder().MergeFrom(data)).BuildParsed();
    }
    public static DriverNotCard ParseFrom(byte[] data, pb::ExtensionRegistry extensionRegistry) {
      return ((Builder) CreateBuilder().MergeFrom(data, extensionRegistry)).BuildParsed();
    }
    public static DriverNotCard ParseFrom(global::System.IO.Stream input) {
      return ((Builder) CreateBuilder().MergeFrom(input)).BuildParsed();
    }
    public static DriverNotCard ParseFrom(global::System.IO.Stream input, pb::ExtensionRegistry extensionRegistry) {
      return ((Builder) CreateBuilder().MergeFrom(input, extensionRegistry)).BuildParsed();
    }
    public static DriverNotCard ParseDelimitedFrom(global::System.IO.Stream input) {
      return CreateBuilder().MergeDelimitedFrom(input).BuildParsed();
    }
    public static DriverNotCard ParseDelimitedFrom(global::System.IO.Stream input, pb::ExtensionRegistry extensionRegistry) {
      return CreateBuilder().MergeDelimitedFrom(input, extensionRegistry).BuildParsed();
    }
    public static DriverNotCard ParseFrom(pb::ICodedInputStream input) {
      return ((Builder) CreateBuilder().MergeFrom(input)).BuildParsed();
    }
    public static DriverNotCard ParseFrom(pb::ICodedInputStream input, pb::ExtensionRegistry extensionRegistry) {
      return ((Builder) CreateBuilder().MergeFrom(input, extensionRegistry)).BuildParsed();
    }
    private DriverNotCard MakeReadOnly() {
      return this;
    }
    
    public static Builder CreateBuilder() { return new Builder(); }
    public override Builder ToBuilder() { return CreateBuilder(this); }
    public override Builder CreateBuilderForType() { return new Builder(); }
    public static Builder CreateBuilder(DriverNotCard prototype) {
      return new Builder(prototype);
    }
    
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
    [global::System.Runtime.CompilerServices.CompilerGeneratedAttribute()]
    [global::System.CodeDom.Compiler.GeneratedCodeAttribute("ProtoGen", "2.4.1.473")]
    public sealed partial class Builder : pb::GeneratedBuilder<DriverNotCard, Builder> {
      protected override Builder ThisBuilder {
        get { return this; }
      }
      public Builder() {
        result = DefaultInstance;
        resultIsReadOnly = true;
      }
      internal Builder(DriverNotCard cloneFrom) {
        result = cloneFrom;
        resultIsReadOnly = true;
      }
      
      private bool resultIsReadOnly;
      private DriverNotCard result;
      
      private DriverNotCard PrepareBuilder() {
        if (resultIsReadOnly) {
          DriverNotCard original = result;
          result = new DriverNotCard();
          resultIsReadOnly = false;
          MergeFrom(original);
        }
        return result;
      }
      
      public override bool IsInitialized {
        get { return result.IsInitialized; }
      }
      
      protected override DriverNotCard MessageBeingBuilt {
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
        get { return global::AeroCloud.Protocol.DriverNotCard.Descriptor; }
      }
      
      public override DriverNotCard DefaultInstanceForType {
        get { return global::AeroCloud.Protocol.DriverNotCard.DefaultInstance; }
      }
      
      public override DriverNotCard BuildPartial() {
        if (resultIsReadOnly) {
          return result;
        }
        resultIsReadOnly = true;
        return result.MakeReadOnly();
      }
      
      public override Builder MergeFrom(pb::IMessage other) {
        if (other is DriverNotCard) {
          return MergeFrom((DriverNotCard) other);
        } else {
          base.MergeFrom(other);
          return this;
        }
      }
      
      public override Builder MergeFrom(DriverNotCard other) {
        if (other == global::AeroCloud.Protocol.DriverNotCard.DefaultInstance) return this;
        PrepareBuilder();
        if (other.HasNotCardTime) {
          NotCardTime = other.NotCardTime;
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
            int field_ordinal = global::System.Array.BinarySearch(_driverNotCardFieldNames, field_name, global::System.StringComparer.Ordinal);
            if(field_ordinal >= 0)
              tag = _driverNotCardFieldTags[field_ordinal];
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
              result.hasNotCardTime = input.ReadInt32(ref result.notCardTime_);
              break;
            }
          }
        }
        
        if (unknownFields != null) {
          this.UnknownFields = unknownFields.Build();
        }
        return this;
      }
      
      
      public bool HasNotCardTime {
        get { return result.hasNotCardTime; }
      }
      public int NotCardTime {
        get { return result.NotCardTime; }
        set { SetNotCardTime(value); }
      }
      public Builder SetNotCardTime(int value) {
        PrepareBuilder();
        result.hasNotCardTime = true;
        result.notCardTime_ = value;
        return this;
      }
      public Builder ClearNotCardTime() {
        PrepareBuilder();
        result.hasNotCardTime = false;
        result.notCardTime_ = 0;
        return this;
      }
    }
    static DriverNotCard() {
      object.ReferenceEquals(global::AeroCloud.Protocol.Proto.DriverNotCard.Descriptor, null);
    }
  }
  
  #endregion
  
}

#endregion Designer generated code
