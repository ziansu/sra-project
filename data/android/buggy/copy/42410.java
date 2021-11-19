public java.util.Set<java.lang.String> getClusters() {
    com.orientechnologies.orient.core.index.OIndexAbstract.acquireSharedLock();
    try {
        return java.util.Collections.unmodifiableSet(clustersToIndex);
    } finally {
        com.orientechnologies.orient.core.index.OIndexAbstract.releaseSharedLock();
    }
}