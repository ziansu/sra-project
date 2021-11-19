@java.lang.Override
public void onLocationUpdated(android.location.Location location) {
    showLocation(location, new com.google.android.gms.location.DetectedActivity(com.google.android.gms.location.DetectedActivity.UNKNOWN, 100));
}