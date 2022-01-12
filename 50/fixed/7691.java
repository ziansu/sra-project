protected synchronized com.google.android.gms.common.api.GoogleApiClient buildGoogleApiClient() {
    return new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
}