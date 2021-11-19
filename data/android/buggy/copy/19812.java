public int get(int key) {
    hello.lru.LRUCache.CacheNode result = cache.get(key);
    if (result == null) {
        return -1;
    }
    moveNodeToHead(result);
    return result.value;
}