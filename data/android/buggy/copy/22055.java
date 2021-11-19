public void setDefaultZoomLevel() {
    if ((mapView.getZoomLevel()) < 13) {
        mapController.setZoom(13);
    }
}