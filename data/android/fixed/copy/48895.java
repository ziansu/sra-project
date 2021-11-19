@java.lang.Override
public void onProviderDisabled(java.lang.String s) {
    org.redcross.openmapkit.tagswipe.TagEdit.cleanUserLocationTags();
    checkLocationProviderEnabled();
}