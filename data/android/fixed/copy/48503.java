@java.lang.Override
public <T> T getInstance(java.lang.Class<T> clazz, java.lang.String name) {
    return getProvider(clazz, name).get();
}