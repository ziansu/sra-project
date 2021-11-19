void removeRequestCache(java.lang.String key) {
    if ((requestCache) != null) {
        requestCache.remove(key);
    }
}