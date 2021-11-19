protected void onResume() {
    super.onResume();
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED))
        com.example.gdev.unipicityguide.MainActivity.locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
    
}