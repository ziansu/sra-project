@java.lang.Override
protected java.lang.Object newRecord(java.lang.Object old, org.apache.avro.Schema schema) {
    java.lang.Object rec = org.apache.avro.protobuf.ProtobufData.newRecord(old, schema);
    return rec != null ? rec : super.newRecord(old, schema);
}