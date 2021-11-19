public javax.cache.spi.CachingProvider getCachingProvider() {
    if ((enabled) && (!(booted))) {
        bootstrapHazelcast();
    }
    return hazelcastCachingProvider;
}