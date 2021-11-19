@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
    com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(latLng, 15);
    googleMap.animateCamera(cameraUpdate);
}