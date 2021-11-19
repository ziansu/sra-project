@java.lang.Override
protected void onStart() {
    super.onStart();
    if (loginType.equals("Google")) {
        mGoogleApiClient.connect();
    }
}