@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    showPopup(getContentFromMarker(marker), marker.getTitle());
    return true;
}