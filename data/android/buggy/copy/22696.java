protected void checkLocationPermission() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.ACCESS_COARSE_LOCATION }, ch.kanti_baden.ma.ninemensmorrisapp.MainActivity.REQUEST_COARSE_LOCATION);
    }else
        mBluetoothAdapter.startDiscovery();
    
}