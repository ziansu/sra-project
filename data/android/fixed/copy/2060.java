public void disconnect() {
    if (mGoogleApiClient.isConnected()) {
        mGoogleApiClient.disconnect();
    }
}