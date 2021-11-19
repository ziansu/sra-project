@java.lang.Override
public synchronized void signalEvent(org.couchsource.dring.application.Event event) {
    if (event == null) {
        return ;
    }
    currentDeviceStatus = null;
    exitLowPowerMode();
}