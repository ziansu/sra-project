@java.lang.Override
protected void onResume() {
    super.onResume();
    if (isGooglePlayServicesAvailable()) {
        refreshResults();
    }else {
        mStatusText.setText(("Google Play Services required: " + "after installing, close and relaunch this app."));
    }
}