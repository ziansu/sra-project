private java.lang.String setSystemProperty(java.util.Map.Entry<java.lang.String, java.lang.Object> entry) {
    java.lang.String key = entry.getKey();
    java.lang.String value = entry.getValue().toString();
    return java.lang.System.setProperty(key, value);
}