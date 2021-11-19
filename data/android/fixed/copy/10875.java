public <T> T deserialize(java.lang.Class<T> clazz, T defaultValue) {
    T o = deserialize(clazz);
    if (o == null) {
        return defaultValue;
    }
    return o;
}