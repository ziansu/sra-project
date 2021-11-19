@java.lang.Override
public void invalidateAll() {
    indexCacheTime = 0;
    try {
        updateCache();
    } catch (java.io.IOException e) {
        indexCacheTime = 0;
        cache.clear();
    }
}