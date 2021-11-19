public void zoomOutVertical() {
    chart.zoomToCenter(1, (1 - (settings.getPoolSettings().getZoomingMultiplier())));
    chart.postInvalidate();
}