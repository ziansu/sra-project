@java.lang.Override
public void flush() {
    acquireSharedLock();
    try {
        sbTree.flush();
    } finally {
        releaseSharedLock();
    }
}