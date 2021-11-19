@java.lang.Override
public void onMapLongClick(com.google.android.gms.maps.model.LatLng latLng) {
    markerPosition = latLng;
    drawnMarker.setPosition(latLng);
    drawnCircle.setCenter(latLng);
    map.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(latLng));
}