protected void onStop() {
    super.onStop();
    mGoogleApiClient.disconnect();
    stopLocationUpdates();
}