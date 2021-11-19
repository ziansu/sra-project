public long getLong(java.lang.String key) {
    java.lang.String ret = getProperty(key);
    return ret == null ? null : java.lang.Long.parseLong(key);
}