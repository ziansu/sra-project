@java.lang.Override
protected void onPause() {
    super.onPause();
    mp.release();
    sensorManager.unregisterListener(this);
    fulls = false;
}