public static java.awt.image.BufferedImage loadPureFromSystem(java.lang.String location) throws java.io.IOException, java.net.MalformedURLException {
    return javax.imageio.ImageIO.read(new java.net.URL(location));
}