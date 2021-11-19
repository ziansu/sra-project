public static java.awt.image.BufferedImage getHighQualityScaledJpeg(java.io.InputStream sourceStream, int targetWidth, int targetHeight) throws java.io.IOException {
    java.awt.image.BufferedImage source = javax.imageio.ImageIO.read(sourceStream);
    return org.imgscalr.Scalr.resize(source, Method.QUALITY, targetWidth, targetHeight);
}