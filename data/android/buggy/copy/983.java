@java.lang.Override
public void doNotify() {
    logger.info("[notifyClusterDelete]{},{}", clusterName, dc.getDcName());
    metaServerConsoleServiceManagerWrapper.get(dc.getDcName()).clusterDeleted(clusterName);
}