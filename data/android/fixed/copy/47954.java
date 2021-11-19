@java.lang.Override
public com.google.common.base.Optional<java.lang.String> getString(java.lang.String key) {
    java.lang.String property = properties.getProperty(key);
    if (property != null) {
        property = property.trim();
    }
    return com.google.common.base.Optional.fromNullable(property);
}