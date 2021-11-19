@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    cordinations = (("X:" + (location.getLatitude())) + "Y:") + (location.getLongitude());
}