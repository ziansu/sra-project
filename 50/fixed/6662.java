public static int getMaxSizePerNode(com.hazelcast.config.MaxSizeConfig maxSizeConfig) {
    int maxSizePerNode = java.lang.Math.round(com.hazelcast.map.impl.eviction.MaxSizeChecker.getApproximateMaxSize(maxSizeConfig, MaxSizePolicy.PER_NODE));
    if (maxSizePerNode == (com.hazelcast.config.MaxSizeConfig.DEFAULT_MAX_SIZE)) {
        return -1;
    }
    return maxSizePerNode;
}