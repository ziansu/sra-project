protected void triggerNearCacheEviction(com.hazelcast.core.IMap<java.lang.Integer, java.lang.Integer> map) {
    populateMap(map, 1);
    pullEntriesToNearCache(map, 1);
}