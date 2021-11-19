private void connectToGoogleClientAPIandSendMessage() {
    if (!(mResolvingError)) {
        mGoogleApiClient.connect();
    }
}