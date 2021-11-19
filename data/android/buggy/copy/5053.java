@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if ((startAndStopBool) == true) {
    }else {
        cordinations = (("X:" + (location.getLatitude())) + "Y:") + (location.getLongitude());
    }
}