protected void startLocationUpdates() {
    android.widget.Toast.makeText(context, "startLocationUpdates", Toast.LENGTH_SHORT).show();
    LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
}