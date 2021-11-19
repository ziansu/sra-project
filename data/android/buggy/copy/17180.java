@java.lang.Override
public synchronized void signalEvent(org.couchsource.dring.application.Event event) {
    if (event == null) {
        return ;
    }
    switch (event) {
        case USER_PREF_CHANGED :
            currentDeviceStatus = null;
        default :
            exitLowPowerMode();
    }
}