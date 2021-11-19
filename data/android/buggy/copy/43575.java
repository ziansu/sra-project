public void setShadowColor(int shadowColor) {
    this.shadowColor = shadowColor;
    this.shadowPaint.setShadowLayer(shadowRadius, 2.0F, 2.0F, shadowColor);
    this.invalidate();
}