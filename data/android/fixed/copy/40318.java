public void onScaleChange(float scaleFactor) {
    this.scaleFactor = scaleFactor;
    canvasRect.right = (canvasWidth) * scaleFactor;
    canvasRect.bottom = (canvasHeight) * scaleFactor;
    listener.onCanvasChanged(canvasRect);
}