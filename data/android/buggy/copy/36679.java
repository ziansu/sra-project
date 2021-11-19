protected void onStop() {
    mGoogleApiClient.disconnect();
    stopLocationUpdates();
    super.onStop();
}