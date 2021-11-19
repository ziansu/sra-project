public static java.awt.image.BufferedImage read(java.lang.String fileName) {
    try {
        return javax.imageio.ImageIO.read(new java.io.File(fileName));
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}