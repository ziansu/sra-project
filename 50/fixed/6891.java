public void changeCacheSize(final long cacheSize) {
    if ((readCache) != null)
        readCache.changeMaximumAmountOfMemory(calculateReadCacheMaxMemory(cacheSize));
    
}