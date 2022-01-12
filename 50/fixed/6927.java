public static void writeJPEG(final java.awt.image.BufferedImage image, final java.io.File file, final int compression) throws java.io.IOException {
    jatoo.image.ImageUtils.writeJPEG(image, new javax.imageio.stream.FileImageOutputStream(file), compression);
}