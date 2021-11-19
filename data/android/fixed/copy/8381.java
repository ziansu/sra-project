static java.lang.String getString(java.lang.String key, java.lang.String defaultValue) {
    java.lang.String value = ibcontroller.Settings._Props.getProperty(key, defaultValue);
    if (value.isEmpty()) {
        value = defaultValue;
    }
    return value;
}