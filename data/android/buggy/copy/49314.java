public void updateMapMarker(net.osmand.plus.MapMarkersHelper.MapMarker marker, boolean refresh) {
    if (marker != null) {
        markersDbHelper.updateMarker(marker);
        if (refresh) {
            loadMarkers();
            refresh();
        }
    }
}