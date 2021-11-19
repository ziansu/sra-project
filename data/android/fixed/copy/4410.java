@java.lang.Override
public void onContainerStopped(org.apache.hadoop.yarn.api.records.ContainerId containerId) {
    hivemall.mix.yarn.ApplicationMaster.logger.info(("Succeeded to stop Container " + containerId));
}