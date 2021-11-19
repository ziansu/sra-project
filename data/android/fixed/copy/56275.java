protected synchronized void buildGoogleApiClient() {
    if ((mGoogleApiClient) == null) {
        mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this.getActivity()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    }
}