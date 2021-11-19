@java.lang.Override
protected void onRestart() {
    mSensorManager.registerListener(mListener, mSensor, SensorManager.SENSOR_DELAY_NORMAL);
    super.onRestart();
}