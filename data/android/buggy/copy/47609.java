@java.lang.Override
public void delete() {
    acquireSharedLock();
    try {
        sbTree.delete();
    } finally {
        releaseSharedLock();
    }
}