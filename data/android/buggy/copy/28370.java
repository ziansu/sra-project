@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    android.util.Log.d(com.beccap.weathervane.WeatherStatusFragment.TAG, "onMapReady, setting up map");
    _googleMap = googleMap;
    _googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    _googleMap.setIndoorEnabled(false);
    android.util.Log.d(com.beccap.weathervane.WeatherStatusFragment.TAG, "calling updateMap from onMapReady()");
    updateMap();
}