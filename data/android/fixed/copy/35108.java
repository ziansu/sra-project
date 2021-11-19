public void resetScaling() {
    minimumZoom = canvas.getMinimumScale();
    if ((minimumZoom) > 1.0F) {
        zoomFactor = minimumZoom;
    }else {
        zoomFactor = 1.0F;
    }
    reinitCanvasMatrix();
    canvas.resetScroll();
}