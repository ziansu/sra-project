public void disconnect() {
    if (mGoogleApiClient.isConnected()) {
        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
        mGoogleApiClient.disconnect();
    }
}