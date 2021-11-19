public java.awt.image.BufferedImage createImageFromFile(java.io.File file) throws java.io.IOException {
    if (isImage(file)) {
        return javax.imageio.ImageIO.read(file);
    }
    return null;
}