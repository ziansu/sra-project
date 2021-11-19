@java.lang.Override
protected void onStart() {
    permissionCheck();
    super.onStart();
    mGoogleApiClient.connect();
}