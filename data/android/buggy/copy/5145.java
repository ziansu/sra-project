@java.lang.Override
protected void onResume() {
    super.onResume();
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, (1000 * 15), 10, locationListener);
    locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, (1000 * 15), 10, locationListener);
}