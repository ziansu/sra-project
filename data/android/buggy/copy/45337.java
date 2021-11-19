@java.lang.Override
protected void onStart() {
    super.onStart();
    if (!(mResolvingError)) {
        mGoogleApiClient.connect();
    }
}