@java.lang.Override
public java.lang.Void doNotify() {
    logger.info("[notifyClusterDelete]{},{}", clusterName, dc.getDcName());
    metaServerConsoleServiceManagerWrapper.get(dc.getDcName()).clusterDeleted(clusterName);
    return null;
}