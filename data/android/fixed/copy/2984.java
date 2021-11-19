private com.mapbox.mapboxsdk.geometry.LatLng getLatLng(final android.location.Location location) {
    if (location != null) {
        return new com.mapbox.mapboxsdk.geometry.LatLng(location.getLatitude(), location.getLongitude());
    }else {
        return null;
    }
}