// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/proto/terminal/common/java/AudioRate.proto

package com.navinfo.opentsp.platform.location.protocol.terminal.common;

public final class LCAudioRate {
  private LCAudioRate() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum AudioRate
      implements com.google.protobuf.ProtocolMessageEnum {
    rate_8k(0, 0),
    rate_11k(1, 1),
    rate_23k(2, 2),
    rate_32k(3, 3),
    ;
    
    public static final int rate_8k_VALUE = 0;
    public static final int rate_11k_VALUE = 1;
    public static final int rate_23k_VALUE = 2;
    public static final int rate_32k_VALUE = 3;
    
    
    public final int getNumber() { return value; }
    
    public static AudioRate valueOf(int value) {
      switch (value) {
        case 0: return rate_8k;
        case 1: return rate_11k;
        case 2: return rate_23k;
        case 3: return rate_32k;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<AudioRate>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<AudioRate>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AudioRate>() {
            public AudioRate findValueByNumber(int number) {
              return AudioRate.valueOf(number);
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
      return LCAudioRate.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final AudioRate[] VALUES = {
      rate_8k, rate_11k, rate_23k, rate_32k, 
    };
    
    public static AudioRate valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private AudioRate(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:AudioRate)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n/core/proto/terminal/common/java/AudioR" +
      "ate.proto*B\n\tAudioRate\022\013\n\007rate_8k\020\000\022\014\n\010r" +
      "ate_11k\020\001\022\014\n\010rate_23k\020\002\022\014\n\010rate_32k\020\003BM\n" +
      ">com.navinfo.opentsp.platform.location.p" +
      "rotocol.terminal.commonB\013LCAudioRate"
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
