private void createOutOfBoundsOverlay() {
    if (((mMapOverlays) != null) && ((oOutOfBounds) == null)) {
        oOutOfBounds = new couk.chrisjenx.androidmaplib.overlays.OutOfBoundsOverlay(this);
        mMapOverlays.add(0, oOutOfBounds);
    }
}