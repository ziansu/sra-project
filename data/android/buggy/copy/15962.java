@java.lang.Override
protected void onPause() {
    super.onPause();
    if (mGoogleApiClient.isConnected()) {
        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, ((com.google.android.gms.location.LocationListener) (this)));
        mGoogleApiClient.disconnect();
    }
}