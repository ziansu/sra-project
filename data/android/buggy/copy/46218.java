@java.lang.Override
public java.lang.Object get(java.lang.Object key) {
    acquireSharedLock();
    try {
        return sbTree.get(key);
    } finally {
        releaseSharedLock();
    }
}