private synchronized void onStartContainerError(org.apache.hadoop.yarn.api.records.ContainerId cid) {
    this.handleFailure(java.util.Collections.singletonList(cid));
}