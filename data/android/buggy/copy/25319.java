public java.awt.image.BufferedImage[] GifReader(java.lang.String fileLocation) throws java.io.IOException {
    File gif = new File(fileLocation);
    java.awt.image.BufferedImage image = javax.imageio.ImageIO.read(gif);
}