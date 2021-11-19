private java.lang.String setSystemProperty(java.util.Map.Entry<java.lang.String, java.lang.Object> entry) {
    java.lang.String loggingKey = createLoggingKey(entry.getKey());
    java.lang.String value = entry.getValue().toString();
    return java.lang.System.setProperty(loggingKey, value);
}