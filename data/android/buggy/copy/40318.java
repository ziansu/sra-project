public void onScaleChange(float scaleFactor) {
    canvasRect.right = (canvasWidth) * scaleFactor;
    canvasRect.bottom = (canvasHeight) * scaleFactor;
    listener.onCanvasChanged(canvasRect);
}