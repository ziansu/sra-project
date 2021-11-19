protected synchronized void buildGoogleApiClient() {
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(getContext()).addApi(LocationServices.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
}