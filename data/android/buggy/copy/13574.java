public void setBrushSize(float newSize) {
    brushSize = android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, newSize, getResources().getDisplayMetrics());
    drawPaint.setStrokeWidth(brushSize);
    lastBrushSize = brushSize;
}