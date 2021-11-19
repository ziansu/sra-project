@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    currentLocation = LocationServices.FusedLocationApi.getLastLocation(mApiClient);
}