@java.lang.Override
public void onClick(android.view.View v) {
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (getSupportFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
}