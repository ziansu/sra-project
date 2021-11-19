@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((com.example.swords.dutyreporting.LoggedInActivity.mGoogleApiClient) != null) {
        com.example.swords.dutyreporting.LoggedInActivity.mGoogleApiClient.disconnect();
        handler.removeCallbacks(CheckLocation);
    }
}