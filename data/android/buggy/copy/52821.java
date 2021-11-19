@java.lang.Override
public org.graylog2.users.UserImpl create(org.bson.types.ObjectId id, java.util.Map<java.lang.String, java.lang.Object> fields) {
    return new org.graylog2.users.UserImpl(passwordAlgorithmFactory, id, fields);
}