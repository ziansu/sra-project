public void setBrushSize(float newSize) {
    float pixelAmount = android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, newSize, getResources().getDisplayMetrics());
    brushSize = pixelAmount;
    drawPaint.setStrokeWidth(brushSize);
}