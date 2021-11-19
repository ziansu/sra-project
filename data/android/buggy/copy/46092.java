public void changeTestProviderLocation(android.location.Location location) {
    if ((locationManager) != null) {
        locationManager.setTestProviderLocation(preferredLocationProvider, location);
        android.util.Log.d("GPSTest", "changeTestProviderLocation called");
    }else {
        android.util.Log.w("TagSwipeActivity", "Location manager is null, cannot change the location in the test provider");
    }
}