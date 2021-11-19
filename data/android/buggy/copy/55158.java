@java.lang.Override
public void onAutoFocus(boolean b, android.hardware.Camera camera) {
    sensorManager.registerListener(sensorEventListener, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    android.util.Log.e("tag", "came");
}