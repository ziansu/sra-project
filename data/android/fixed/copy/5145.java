@java.lang.Override
protected void onResume() {
    super.onResume();
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, (1000 * 15), 1, locationListener);
    locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, (1000 * 15), 1, locationListener);
}