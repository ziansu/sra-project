private java.awt.image.BufferedImage imgCopy(java.awt.image.BufferedImage img) {
    java.awt.image.ColorModel cm = img.getColorModel();
    boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
    java.awt.image.WritableRaster raster = img.copyData(null);
    return new java.awt.image.BufferedImage(cm, raster, isAlphaPremultiplied, null);
}