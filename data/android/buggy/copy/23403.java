@java.lang.Override
protected void onUnsubscribed(com.google.android.gms.common.api.GoogleApiClient apiClient) {
    LocationServices.FusedLocationApi.removeLocationUpdates(apiClient, locationListener);
}