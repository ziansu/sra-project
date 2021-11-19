public void setBorderWidth(float borderWidth) {
    this.borderWidth = borderWidth;
    this.borderPaint.setStrokeWidth(borderWidth);
    this.invalidate();
}