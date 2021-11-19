private com.hazelcast.config.NearCacheConfig newMaxSizeNearCacheConfig() {
    com.hazelcast.config.NearCacheConfig nearCacheConfig = newNearCacheConfig();
    nearCacheConfig.setMaxSize(com.hazelcast.client.map.impl.nearcache.ClientMapNearCacheTest.MAX_CACHE_SIZE);
    nearCacheConfig.setInvalidateOnChange(false);
    return nearCacheConfig;
}