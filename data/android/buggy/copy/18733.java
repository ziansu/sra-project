@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    onDrawReady = true;
    imageRenderedAtLeastOnce = true;
    if ((delayedZoomVariables) != null) {
        setZoom(delayedZoomVariables.scale, delayedZoomVariables.focusX, delayedZoomVariables.focusY, delayedZoomVariables.scaleType);
        delayedZoomVariables = null;
    }
    super.onDraw(canvas);
}