protected void stopLocationUpdates() {
    if (gapiClient.isConnected()) {
        com.google.android.gms.location.LocationServices.FusedLocationApi.removeLocationUpdates(gapiClient, this);
        android.widget.Toast.makeText(this, "stopLocationUpdates", Toast.LENGTH_SHORT).show();
    }
}