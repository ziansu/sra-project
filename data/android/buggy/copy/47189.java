private com.hazelcast.client.config.ClientConfig getClientConfig(java.lang.String mapName) {
    com.hazelcast.config.NearCacheConfig nearCacheConfig = getNearCacheConfig(mapName);
    com.hazelcast.client.config.ClientConfig clientConfig = new com.hazelcast.client.config.ClientConfig();
    clientConfig.addNearCacheConfig(nearCacheConfig);
    return clientConfig;
}