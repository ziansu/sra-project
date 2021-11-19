protected com.hazelcast.config.NearCacheConfig newRandomNearCacheConfig() {
    com.hazelcast.config.NearCacheConfig nearCacheConfig = newNearCacheConfig();
    nearCacheConfig.setInvalidateOnChange(true);
    nearCacheConfig.setMaxSize(com.hazelcast.client.map.impl.nearcache.ClientMapNearCacheTest.MAX_CACHE_SIZE);
    nearCacheConfig.setEvictionPolicy("RANDOM");
    return nearCacheConfig;
}