@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    if ((actionMode) == null) {
        actionMode = this.startActionMode(actionModeCallback);
    }
    selectedMarker = marker;
    return false;
}