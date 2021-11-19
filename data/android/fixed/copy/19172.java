@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (this.getChildFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
    getDeviceLocation();
}