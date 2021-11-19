public void addNode(com.spatialdev.osm.model.OSMNode node) {
    com.mapbox.mapboxsdk.overlay.Marker marker = node.getMarker();
    if (marker != null) {
        marker.setVisibility(true);
    }
    jtsModel.addOSMStandaloneNode(node);
    mapView.invalidate();
}