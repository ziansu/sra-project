@java.lang.Override
public boolean hasRangeQuerySupport() {
    acquireSharedLock();
    try {
        return indexEngine.hasRangeQuerySupport();
    } finally {
        releaseSharedLock();
    }
}