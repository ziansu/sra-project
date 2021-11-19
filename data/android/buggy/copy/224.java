protected synchronized void buildGoogleApiClient() {
    android.widget.Toast.makeText(this, "buildGoogleApiClient", Toast.LENGTH_SHORT).show();
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
}