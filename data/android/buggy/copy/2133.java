public void addNode() {
    com.mapbox.mapboxsdk.geometry.LatLng center = mapView.getCenter();
    com.spatialdev.osm.model.OSMNode node = new com.spatialdev.osm.model.OSMNode(center);
    jtsModel.addOSMStandaloneNode(node);
    mapView.invalidate();
}