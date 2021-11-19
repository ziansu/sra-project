@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    org.redcross.openmapkit.tagswipe.TagEdit.updateUserLocationTags(location);
}