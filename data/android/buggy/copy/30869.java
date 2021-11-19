@java.lang.Override
protected void onResume() {
    super.onResume();
    if (googleApiClient.isConnected()) {
        getDeviceLocation();
    }
    updateMarkers();
}