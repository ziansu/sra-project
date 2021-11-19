@java.lang.Override
public void invalidate(java.lang.Object key) {
    key = com.google.common.base.Preconditions.checkNotNull(key);
    localCache.remove(key);
}