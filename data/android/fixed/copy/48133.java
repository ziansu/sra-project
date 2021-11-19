public void setSource(java.awt.image.BufferedImage sourceImage, int srcX, int srcY, float strength) {
    this.sourceImage = sourceImage;
    lastX = srcX;
    lastY = srcY;
    this.strength = strength;
    firstUsageInStroke = true;
}