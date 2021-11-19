public java.util.Set<org.yawlfoundation.yawl.engine.YWorkItem> getWorkItems() {
    cleanseRepository();
    return new java.util.HashSet<org.yawlfoundation.yawl.engine.YWorkItem>(_itemMap.values());
}