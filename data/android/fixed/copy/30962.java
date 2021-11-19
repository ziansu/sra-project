@java.lang.Override
public void release() {
    allocationLock.lock();
    try {
        (allocations)--;
        if ((markedClosed) && ((allocations) == 0)) {
            close();
        }
    } finally {
        allocationLock.unlock();
    }
}