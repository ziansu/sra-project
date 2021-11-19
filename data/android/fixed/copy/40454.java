@java.lang.Override
protected java.lang.Object newRecord(java.lang.Object old, org.apache.avro.Schema schema) {
    return org.apache.avro.protobuf.ProtobufData.newRecord(old, schema);
}