@java.lang.Override
public void onStartContainerError(org.apache.hadoop.yarn.api.records.ContainerId containerId, java.lang.Throwable throwable) {
    hivemall.mix.yarn.ApplicationMaster.logger.error(("Failed to start Container " + containerId));
}