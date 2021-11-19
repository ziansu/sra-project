public void resetScaling() {
    minimumZoom = canvas.getMinimumScale();
    zoomFactor = 1.0F;
    reinitCanvasMatrix();
    canvas.resetScroll();
}