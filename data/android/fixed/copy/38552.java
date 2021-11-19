@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.umarbhutta.xlightcompanion.main.SlidingMenuMainActivity.mShakeInfo = null;
    if ((sensorManager) != null) {
        sensorManager.unregisterListener(sensorEventListener);
    }
}