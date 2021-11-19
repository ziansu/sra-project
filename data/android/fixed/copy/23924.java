public void remove(com.hazelcast.nio.serialization.Data key) {
    final com.hazelcast.map.impl.NearCacheRecord record = cache.remove(key);
    if (record != null) {
        updateSizeEstimator((-(calculateCost(record))));
    }
}