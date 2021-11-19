public void startLocationUpdates() throws java.lang.SecurityException {
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 0, this);
}