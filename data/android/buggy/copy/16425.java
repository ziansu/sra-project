@java.lang.Override
public void onResume() {
    _sensorManager.registerListener(this, _accel, SensorManager.SENSOR_DELAY_GAME);
}