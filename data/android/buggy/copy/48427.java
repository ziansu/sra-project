public com.orientechnologies.orient.core.metadata.schema.OType[] getKeyTypes() {
    com.orientechnologies.orient.core.index.OIndexAbstract.acquireSharedLock();
    try {
        if ((indexDefinition) == null)
            return null;
        
        return indexDefinition.getTypes();
    } finally {
        com.orientechnologies.orient.core.index.OIndexAbstract.releaseSharedLock();
    }
}