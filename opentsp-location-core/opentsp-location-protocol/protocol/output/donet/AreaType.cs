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
    public static partial class AreaType {
    
      #region Extension registration
      public static void RegisterAllExtensions(pb::ExtensionRegistry registry) {
      }
      #endregion
      #region Static variables
      #endregion
      #region Descriptor
      public static pbd::FileDescriptor Descriptor {
        get { return descriptor; }
      }
      private static pbd::FileDescriptor descriptor;
      
      static AreaType() {
        byte[] descriptorData = global::System.Convert.FromBase64String(
            "CiRjb3JlL3Byb3RvL2NvbW1vbi9uZXQvQXJlYVR5cGUucHJvdG8aFGNzaGFy" + 
            "cF9vcHRpb25zLnByb3RvKm8KCEFyZWFUeXBlEgwKBm5vVHlwZRDgxQgSCwoF" + 
            "cG9pbnQQ4cUIEgwKBmNpcmNsZRDixQgSDwoJcmVjdGFuZ2xlEOPFCBINCgdw" + 
            "b2x5Z29uEOTFCBILCgVyb3V0ZRDlxQgSDQoHc2VnbWVudBDmxQhCQAobY29t" + 
            "LmxjLmNvcmUucHJvdG9jb2wuY29tbW9uQgpMQ0FyZWFUeXBlwj4UChJBZXJv" + 
            "Q2xvdWQuUHJvdG9jb2w=");
        pbd::FileDescriptor.InternalDescriptorAssigner assigner = delegate(pbd::FileDescriptor root) {
          descriptor = root;
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
  #region Enums
  [global::System.Runtime.CompilerServices.CompilerGeneratedAttribute()]
  [global::System.CodeDom.Compiler.GeneratedCodeAttribute("ProtoGen", "2.4.1.473")]
  public enum AreaType {
    noType = 140000,
    point = 140001,
    circle = 140002,
    rectangle = 140003,
    polygon = 140004,
    route = 140005,
    segment = 140006,
  }
  
  #endregion
  
}

#endregion Designer generated code
