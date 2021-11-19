public void resetImage() {
    lastX = -1;
    lastY = -1;
    image = new java.awt.image.BufferedImage(size, size, java.awt.image.BufferedImage.TYPE_INT_RGB);
    repaint();
}