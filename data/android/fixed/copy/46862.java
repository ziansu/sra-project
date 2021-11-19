@java.lang.Override
public void put(java.lang.String cacheName, java.lang.Object key, java.lang.Object value) {
    if (value == null) {
        return ;
    }
    redis.set(buildKey(cacheName, key), value);
}