@java.lang.Override
public void drain() {
    if (evictionLock.tryLock()) {
        try {
            drainUnderLock();
        } finally {
            evictionLock.unlock();
        }
    }
}