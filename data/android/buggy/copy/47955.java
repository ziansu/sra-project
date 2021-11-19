private boolean controllerNotConnected() throws java.lang.Exception {
    connected = (com.iotracks.iofabric.status_reporter.StatusReporter.getFieldAgentStatus().getContollerStatus().equals(ControllerStatus.OK)) && (ping());
    return !(connected);
}