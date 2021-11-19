protected com.hazelcast.spi.Operation prepareOperation() {
    return new com.hazelcast.cache.impl.operation.CacheCreateConfigOperation(cacheConfig, createAlsoOnOthers);
}