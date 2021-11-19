public void clearMarkers() {
    if (!(getItems().isEmpty())) {
        getItems().clear();
        invalidate();
    }
}