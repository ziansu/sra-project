@java.lang.Override
public void enable() throws java.io.IOException {
    if (!(sensorEnabled)) {
        sensorEnabled = true;
        buildWatchService(this.dir, this.recursive);
        new eu.musesproject.windowsclient.contextmonitoring.sensors.DirectoryWatcherSensor.EventObserver().backgroundProcess.run();
    }
}