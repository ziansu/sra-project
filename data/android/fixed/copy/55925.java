private void startLocationService() {
    if (!(checkPermission(android.Manifest.permission.ACCESS_FINE_LOCATION))) {
        requestPermission();
    }else {
        buildGoogleApiClient();
        makeLocationRequest();
    }
}