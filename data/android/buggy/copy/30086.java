@java.lang.Override
protected void onStop() {
    super.onStop();
    if (mGoogleApiClient.isConnected()) {
        mGoogleApiClient.disconnect();
    }
}