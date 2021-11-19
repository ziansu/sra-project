public void onLongpress(final com.google.android.maps.MapView view, final com.google.android.maps.GeoPoint longpressLocation) {
    activity.geoPoint = longpressLocation;
    activity.executeGeocodingTask();
}