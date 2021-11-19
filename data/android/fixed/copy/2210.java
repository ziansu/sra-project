@java.lang.Override
public void invalidate(java.lang.Object key) {
    checkDisposed();
    if ((cache) != null) {
        cache.invalidate(key);
    }
}