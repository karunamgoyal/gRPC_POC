// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contact_service.proto

package com.helloworld.grpcservices;

public final class ContactServiceOuterClass {
  private ContactServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025contact_service.proto\032\rcontact.proto2\267" +
      "\001\n\016ContactService\022)\n\rcreateContact\022\r.Con" +
      "tactProto\032\t.Response\022\'\n\ngetContact\022\n.Con" +
      "tactId\032\r.ContactProto\022)\n\rupdateContact\022\r" +
      ".ContactProto\032\t.Response\022&\n\rdeleteContac" +
      "t\022\n.ContactId\032\t.ResponseB\037\n\033com.hellowor" +
      "ld.grpcservicesP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.helloworld.modelproto.Contact.getDescriptor(),
        }, assigner);
    com.helloworld.modelproto.Contact.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
