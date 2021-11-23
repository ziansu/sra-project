protected void startLocationUpdates() {
    com.google.android.gms.location.LocationServices.FusedLocationApi.requestLocationUpdates(gapiClient, locationRequest, this);
}