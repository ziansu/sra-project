protected void onPause() {
    sensorManager.unregisterListener(this);
    super.onPause();
}