@java.lang.Override
public void invalidate(java.lang.Object key) {
    com.google.common.base.Preconditions.checkNotNull(key);
    localCache.remove(key);
}