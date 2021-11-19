@java.lang.Override
public void doNotify() {
    logger.info("[notifyClusterUpdate]{},{}", dcName, clusterName);
    metaServerConsoleServiceManagerWrapper.get(dcName).clusterModified(clusterName, clusterMetaService.getClusterMeta(dcName, clusterName));
}