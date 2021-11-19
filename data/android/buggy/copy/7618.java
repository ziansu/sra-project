public byte getByte(java.lang.String key) {
    java.lang.String ret = getProperty(key);
    return ret == null ? null : java.lang.Byte.parseByte(key);
}