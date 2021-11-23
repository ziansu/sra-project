@java.lang.Override
public long drained() {
    evictionLock.lock();
    try {
        drainUnderLock();
    } finally {
        evictionLock.unlock();
    }
    return readCounter.get();
}