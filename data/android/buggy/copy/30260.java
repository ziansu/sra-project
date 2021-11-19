private void showGooglePlayServicesAvailabilityErrorDialog(final int connectionStatusCode) {
    com.google.android.gms.common.GoogleApiAvailability api = com.google.android.gms.common.GoogleApiAvailability.getInstance();
    android.app.Dialog dialog = api.getErrorDialog(this, connectionStatusCode, com.y_taras.scheduler.activity.MainActivity.RequestGooglePlayServices);
    dialog.show();
}