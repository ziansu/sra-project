public void setBrushSize(float newSize) {
    lastBrushSize = brushSize;
    brushSize = android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, newSize, getResources().getDisplayMetrics());
    drawPaint.setStrokeWidth(brushSize);
}