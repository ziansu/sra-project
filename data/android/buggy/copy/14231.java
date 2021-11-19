@java.lang.Override
public com.orientechnologies.orient.core.index.OIndexKeyCursor keyCursor() {
    checkForRebuild();
    com.orientechnologies.orient.core.index.OIndexAbstract.acquireSharedLock();
    try {
        return indexEngine.keyCursor();
    } finally {
        com.orientechnologies.orient.core.index.OIndexAbstract.releaseSharedLock();
    }
}