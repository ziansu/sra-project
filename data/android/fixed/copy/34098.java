public void registerListenerAccelerometer() {
    sensorManager.registerListener(accelListener, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    sensorManager.registerListener(proximityListener, proximitySensor, SensorManager.SENSOR_DELAY_NORMAL);
}