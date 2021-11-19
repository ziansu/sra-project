@java.lang.Override
public void stop() {
    if ((batteryLevelReceiver) != null) {
        service.unregisterReceiver(batteryLevelReceiver);
        batteryLevelReceiver = null;
    }
}