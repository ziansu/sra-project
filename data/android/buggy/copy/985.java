public void onLocationChanged(android.location.Location location) {
    drawMap(location, map, finalCoord, locationManager, this);
}