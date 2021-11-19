public short getShort(java.lang.String key) {
    java.lang.String ret = getProperty(key);
    return ret == null ? null : java.lang.Short.parseShort(key);
}