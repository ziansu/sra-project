protected synchronized void buildGoogleApiClient() {
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    mGoogleApiClient.connect();
}