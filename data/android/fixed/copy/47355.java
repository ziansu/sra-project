@java.lang.Override
public void onContainerStatusReceived(org.apache.hadoop.yarn.api.records.ContainerId cid, org.apache.hadoop.yarn.api.records.ContainerStatus status) {
    org.apache.hadoop.yarn.dmlc.ApplicationMaster.LOG.info("onContainerStatusReceived Invoked");
}