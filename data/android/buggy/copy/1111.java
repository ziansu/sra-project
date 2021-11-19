protected void loadMap(com.google.android.gms.maps.GoogleMap googleMap) {
    map = googleMap;
    if ((map) != null) {
        android.widget.Toast.makeText(getContext(), "Map Fragment was loaded properly!", Toast.LENGTH_SHORT).show();
        addMarkersToMap();
    }
}