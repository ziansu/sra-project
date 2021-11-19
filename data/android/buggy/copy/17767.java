protected java.lang.Object getFromCache(java.lang.Object key) {
    return ((org.apache.commons.collections4.map.LRUMap<java.lang.Object, java.lang.Object>) (this.cache)).get(key);
}