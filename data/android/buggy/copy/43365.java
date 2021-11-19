@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((googleApiClient) != null) {
        android.util.Log.i(au.com.mazeit.seedaudit.GoogleDrive.TAG, "In onStop() - disConnecting...");
        googleApiClient.disconnect();
    }
}