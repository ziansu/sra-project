private static java.awt.image.BufferedImage getImage(java.lang.String filename) {
    java.awt.image.BufferedImage img = null;
    try {
        img = javax.imageio.ImageIO.read(new java.io.File(filename));
    } catch (java.lang.Exception e) {
    }
    return img;
}