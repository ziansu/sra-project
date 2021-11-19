@java.lang.Override
public void onLocationChanged(android.location.Location loc) {
    if (null != loc) {
        plotRoute();
    }
}