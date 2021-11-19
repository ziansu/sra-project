protected com.hazelcast.core.HazelcastInstance getClient(com.hazelcast.client.test.TestHazelcastFactory testHazelcastFactory, com.hazelcast.config.NearCacheConfig nearCacheConfig) {
    com.hazelcast.client.config.ClientConfig clientConfig = newClientConfig();
    clientConfig.addNearCacheConfig(nearCacheConfig);
    return testHazelcastFactory.newHazelcastClient(clientConfig);
}