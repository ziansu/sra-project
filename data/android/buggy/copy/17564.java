public java.lang.String getProperty(java.lang.String key) {
    if ((key == null) || (key.equals(""))) {
        throw new java.lang.IllegalArgumentException("Key must not be null");
    }
    return properties.get(key);
}