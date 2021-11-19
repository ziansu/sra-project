public com.orientechnologies.orient.core.record.impl.ODocument getConfiguration() {
    com.orientechnologies.orient.core.index.OIndexAbstract.acquireSharedLock();
    try {
        return configuration;
    } finally {
        com.orientechnologies.orient.core.index.OIndexAbstract.releaseSharedLock();
    }
}