@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(initPosition, initZoom));
    mMap.setOnMapLoadedCallback(this);
    timber.log.Timber.d("onMapReady");
}