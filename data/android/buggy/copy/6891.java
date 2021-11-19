public void changeCacheSize(final long cacheSize) {
    readCache.changeMaximumAmountOfMemory(calculateReadCacheMaxMemory(cacheSize));
}