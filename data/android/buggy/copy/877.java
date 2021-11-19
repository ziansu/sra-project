@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
    addSampleOnPlot(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
}