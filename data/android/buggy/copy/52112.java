@java.lang.Override
public void allocate() {
    try {
        allocationLock.lock();
        (allocations)++;
    } finally {
        allocationLock.unlock();
    }
}