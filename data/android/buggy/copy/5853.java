public void disable() {
    if (((mGoogleApiClient) != null) && (mGoogleApiClient.isConnected())) {
        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
        mGoogleApiClient.disconnect();
    }
    isEnabled = false;
}