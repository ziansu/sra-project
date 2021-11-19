private java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock(java.lang.Object obj) {
    return writeLock(obj.hashCode());
}