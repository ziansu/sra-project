public static java.awt.image.BufferedImage cropImage(java.awt.image.BufferedImage src, java.awt.Rectangle rect) throws java.io.IOException {
    return src.getSubimage(rect.x, rect.y, rect.width, rect.height);
}