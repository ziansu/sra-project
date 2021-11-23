private void disconnectGoogleApiClient() {
    if ((googleApiClient) != null) {
        googleApiClient.disconnect();
    }
}