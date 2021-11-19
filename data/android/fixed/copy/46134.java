public void onSensorChanged(android.hardware.SensorEvent event) {
    synchronized(this) {
        x = event.values[0];
        y = event.values[1];
        z = event.values[2];
    }
}