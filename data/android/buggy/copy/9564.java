@java.lang.Override
public void save(java.lang.String key, T value) {
    cache.put(key, value);
}