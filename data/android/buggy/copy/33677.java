public void getWifiConnections(android.app.Activity activity) {
    android.support.v4.app.ActivityCompat.requestPermissions(activity, new java.lang.String[]{ Manifest.permission.ACCESS_COARSE_LOCATION }, 0);
    mWifiManager.startScan();
}