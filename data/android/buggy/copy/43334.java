@java.lang.Override
public void stopSensing() {
    LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, this);
    if (googleApiClient.isConnected())
        googleApiClient.disconnect();
    
    active = false;
    stopAlarms();
    stopPolling();
}