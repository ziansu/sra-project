protected void startLocationUpdates() {
    com.google.android.gms.location.LocationServices.FusedLocationApi.requestLocationUpdates(gapiClient, locationRequest, this);
    android.widget.Toast.makeText(this, "startLocationUpdates", Toast.LENGTH_SHORT).show();
}