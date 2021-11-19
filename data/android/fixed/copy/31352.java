@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mLastLocation = location;
    displayLocation();
}