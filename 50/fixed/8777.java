protected void stopManagedResources() {
    stopManagedResourceFlowElements(this.flowConfiguration.getManagedResourceFlowElements());
    if ((this.exclusionFlowConfiguration) != null) {
        stopManagedResourceFlowElements(this.exclusionFlowConfiguration.getManagedResourceFlowElements());
    }
}