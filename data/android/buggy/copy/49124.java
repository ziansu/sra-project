@java.lang.Override
public void onDestroy() {
    if (useExternalGpsDevice) {
        gps.stopPolling();
        gps = null;
    }else {
        locationManager.removeUpdates(locationListener);
        locationManager = null;
    }
    super.onDestroy();
}