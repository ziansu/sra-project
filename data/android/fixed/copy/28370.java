@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    _googleMap = googleMap;
    _googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    _googleMap.setIndoorEnabled(false);
    updateMap();
}