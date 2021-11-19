public void setSpindleRPM(double rpm) throws replicatorg.drivers.RetryException {
    machine.currentTool().setSpindleSpeedRPM(rpm);
}