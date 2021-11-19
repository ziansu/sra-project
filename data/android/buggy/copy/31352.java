@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mLastLocation = location;
    android.widget.Toast.makeText(c, "Location changed!", Toast.LENGTH_SHORT).show();
    displayLocation();
}