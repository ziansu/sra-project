@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    updateLocation(location.getLatitude(), location.getLongitude());
}