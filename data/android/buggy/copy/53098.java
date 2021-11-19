@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    locationChanged = true;
    handleNewLocation(location);
}