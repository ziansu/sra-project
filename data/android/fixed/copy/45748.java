private void loadImage(java.lang.String path) throws java.io.IOException {
    image = javax.imageio.ImageIO.read(java.lang.ClassLoader.getSystemResourceAsStream(path));
}