public java.lang.Object get(java.lang.String cacheName, java.lang.Object key) throws uk.co.christhomson.sibyl.exception.CacheException {
    java.util.Map<java.lang.Object, java.lang.Object> cache = getCache(cacheName);
    java.lang.Object value = cache.get(key);
    return value;
}