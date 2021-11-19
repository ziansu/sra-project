@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.location.Location mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    onLocationConnected(new com.google.android.gms.maps.model.LatLng(mLastLocation.getLatitude(), mLastLocation.getLongitude()));
}