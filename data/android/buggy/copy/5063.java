public boolean getBoolean(java.lang.String key) {
    java.lang.String ret = getProperty(key);
    return ret == null ? null : java.lang.Boolean.parseBoolean(key);
}