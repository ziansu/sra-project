@java.lang.Override
protected void onPause() {
    super.onPause();
    locationManager.removeUpdates(this);
}