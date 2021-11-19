public void removeFromClusterMap(java.lang.String cluserId) {
    clusterMap.remove(cluserId);
    org.apache.stratos.messaging.domain.topology.locking.TopologyLockHierarchy.getInstance().removeTopologyLockForCluster(cluserId);
}