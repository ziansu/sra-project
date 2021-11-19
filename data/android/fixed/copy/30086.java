@java.lang.Override
protected void onStop() {
    super.onStop();
    if (((mGoogleApiClient) != null) && (mGoogleApiClient.isConnected())) {
        mGoogleApiClient.disconnect();
    }
}