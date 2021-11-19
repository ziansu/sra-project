@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    if ((marker.getSnippet()) != null) {
        com.vanshil.checkpoint.SelectedActivity.start(this, businesses.get(java.lang.Integer.parseInt(marker.getSnippet())));
    }
    return false;
}