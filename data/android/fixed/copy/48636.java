@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
}