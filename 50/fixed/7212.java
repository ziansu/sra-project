@java.lang.Override
public synchronized void onSleep(int duration) {
    stopSensingTask();
    logInfo(TAG, ("Pausing sensor for " + duration));
    getSensorEvent().onSensingPaused(SensorUtils.SENSOR_TYPE_MICROPHONE);
}