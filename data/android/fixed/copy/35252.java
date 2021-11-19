private boolean checkPermissions() {
    java.lang.String[] requestPermissions = getPermissionsRequestArray(io.straas.android.sdk.streaming.demo.ScreencastSettingsActivity.STREAM_PERMISSIONS);
    if ((requestPermissions.length) != 0) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, requestPermissions, io.straas.android.sdk.streaming.demo.ScreencastSettingsActivity.STREAM_PERMISSION_REQUEST);
        return false;
    }
    return true;
}