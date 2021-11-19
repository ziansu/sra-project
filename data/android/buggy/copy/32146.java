private static int getApproximateMaxSize(int maxSizeFromConfig) {
    return (maxSizeFromConfig * (com.hazelcast.map.impl.eviction.MaxSizeChecker.EVICTION_START_THRESHOLD_PERCENTAGE)) / (com.hazelcast.map.impl.eviction.MaxSizeChecker.ONE_HUNDRED_PERCENT);
}