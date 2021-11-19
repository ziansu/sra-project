@java.lang.Override
public org.graylog2.users.UserImpl create(java.util.Map<java.lang.String, java.lang.Object> fields) {
    return new org.graylog2.users.UserImpl(passwordAlgorithmFactory, fields);
}