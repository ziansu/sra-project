@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap map) {
    this.map = map;
    map.setMyLocationEnabled(true);
    map.setOnMarkerClickListener(this);
    map.setOnInfoWindowClickListener(this);
}