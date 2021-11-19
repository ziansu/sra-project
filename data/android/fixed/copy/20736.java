public java.awt.image.BufferedImage capturePartScreen(java.awt.Robot r, int x, int y, int width, int height) {
    java.awt.image.BufferedImage fullScreenImage = r.createScreenCapture(new java.awt.Rectangle(x, y, width, height));
    return fullScreenImage;
}