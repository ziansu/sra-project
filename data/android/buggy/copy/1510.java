private void setUpMapIfNeeded() {
    if ((mMap) == null) {
        mMap = ((com.google.android.gms.maps.MapFragment) (getFragmentManager().findFragmentById(R.id.map))).getMap();
    }
    setUpMap();
}