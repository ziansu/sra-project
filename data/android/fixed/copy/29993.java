protected void onStop() {
    mGoogleApiClient.disconnect();
    super.onStop();
}