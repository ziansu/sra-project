public void stopLocationUpdates() throws java.lang.SecurityException {
    if ((locationManager) != null) {
        locationManager.removeUpdates(this);
    }
}