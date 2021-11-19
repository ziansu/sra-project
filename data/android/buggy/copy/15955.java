private com.hazelcast.config.NearCacheConfig newTTLNearCacheConfig() {
    com.hazelcast.config.NearCacheConfig nearCacheConfig = newNearCacheConfig();
    nearCacheConfig.setInvalidateOnChange(false);
    nearCacheConfig.setTimeToLiveSeconds(com.hazelcast.client.map.impl.nearcache.ClientMapNearCacheTest.MAX_TTL_SECONDS);
    return nearCacheConfig;
}