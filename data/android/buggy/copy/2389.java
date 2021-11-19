protected void onPause() {
    notify("Application is pausing", Toast.LENGTH_SHORT);
    sensorManager.unregisterListener(this);
    super.onPause();
}