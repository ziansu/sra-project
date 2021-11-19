@java.lang.Override
public void removeCache(java.lang.String path) {
    if ((mLruCache) != null) {
        mLruCache.remove(path);
    }
}