@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (!(location.equals(null))) {
        moveMarker(PositionMarker, location);
    }
}