public static synchronized void matchHostToComputeElements(com.emc.storageos.db.client.DbClient _dbClient, java.net.URI hostId) {
    java.util.Collection<java.net.URI> hostIds = java.util.Arrays.asList(hostId);
    com.emc.storageos.computesystemcontroller.impl.HostToComputeElementMatcher.matchHosts(_dbClient, hostIds);
}