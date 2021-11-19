public void startMapFragment() {
    com.google.android.gms.maps.MapFragment mapFragment = new com.google.android.gms.maps.MapFragment();
    getFragmentManager().beginTransaction().add(R.id.fragment_container, mapFragment).commit();
    mapFragment.getMapAsync(this);
}