private boolean controllerNotConnected() throws java.lang.Exception {
    return (!(com.iotracks.iofabric.status_reporter.StatusReporter.getFieldAgentStatus().getContollerStatus().equals(ControllerStatus.OK))) && (!(ping()));
}