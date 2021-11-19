private java.awt.image.BufferedImage imgCopy(java.awt.image.BufferedImage img) {
    java.awt.image.ColorModel cm = img.getColorModel();
    return new java.awt.image.BufferedImage(cm, img.copyData(null), cm.isAlphaPremultiplied(), null);
}