@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.example.swords.dutyreporting.LoggedInActivity.mGoogleApiClient.disconnect();
    handler.removeCallbacks(CheckLocation);
}