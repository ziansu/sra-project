@java.lang.Override
public void deleteWithoutLoad(java.lang.String indexName) {
    acquireExclusiveLock();
    try {
        sbTree.deleteWithoutLoad(indexName);
    } finally {
        releaseExclusiveLock();
    }
}