@java.lang.Override
protected void onStop() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        mLocationManager.removeUpdates(this);
    }
    super.onStop();
}