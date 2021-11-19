public void zoomVertical() {
    chart.zoomToCenter(0, (1 + (settings.getPoolSettings().getZoomingMultiplier())));
    chart.postInvalidate();
}