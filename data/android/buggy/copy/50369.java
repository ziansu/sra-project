private com.google.android.gms.common.api.GoogleApiClient createGoogleApiClient() {
    logFlow("creating GoogleApliClient......");
    googleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addApi(Places.GEO_DATA_API).addApi(Places.PLACE_DETECTION_API).build();
    connectGoogleApiClient();
    logFlow("GoogleApliClient created. Returning.......");
    return googleApiClient;
}