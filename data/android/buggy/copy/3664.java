@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.e("locationListener", "Location update");
    currentLocation = location;
    centerOnMapPosition(new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude()));
    updateDisplayedTags();
}