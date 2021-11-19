private void setZoomLevel(int zoomLevel) {
    this.mapView.getModel().mapViewPosition.setZoomLevel(((byte) (zoomLevel)));
}