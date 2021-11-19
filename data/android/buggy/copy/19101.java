private com.hazelcast.config.NearCacheConfig newInvalidationAndCacheLocalEntriesEnabledNearCacheConfig(java.lang.String name) {
    com.hazelcast.config.NearCacheConfig nearCacheConfig = newNearCacheConfig();
    nearCacheConfig.setInvalidateOnChange(true);
    nearCacheConfig.setCacheLocalEntries(true);
    nearCacheConfig.setName(name);
    return nearCacheConfig;
}