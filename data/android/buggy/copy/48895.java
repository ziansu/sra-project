@java.lang.Override
public void onProviderDisabled(java.lang.String s) {
    android.util.Log.d("GPSTest", "onProviderDisabled called");
    org.redcross.openmapkit.tagswipe.TagEdit.cleanUserLocationTags();
    checkLocationProviderEnabled();
}