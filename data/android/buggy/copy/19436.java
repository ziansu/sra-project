public void remove(android.content.ComponentName componentName, com.android.launcher3.compat.UserHandleCompat user) {
    synchronized(mCache) {
        mCache.remove(new com.android.launcher3.IconCache.CacheKey(componentName, user));
    }
}