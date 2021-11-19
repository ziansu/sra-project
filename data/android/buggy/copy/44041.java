@java.lang.Override
public void call(android.location.Location location) {
    fragment.setAdapterLocation(location);
    if (location != null) {
        animateTo(new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude()));
    }
}