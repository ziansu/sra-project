public void onSensorChanged(android.hardware.SensorEvent event) {
    x = event.values[0];
    y = event.values[1];
    z = event.values[2];
}