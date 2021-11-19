public boolean requestProgress(double prog, com.serotonin.bacnet4j.type.primitive.ObjectIdentifier oid, com.serotonin.bacnet4j.type.enumerated.PropertyIdentifier pid, com.serotonin.bacnet4j.type.primitive.UnsignedInteger unsignedinteger, com.serotonin.bacnet4j.type.Encodable encodable) {
    bacnet.BacnetPoint pt = points.get(oid);
    updatePointValue(pt, pid, encodable);
    return prog == 1;
}