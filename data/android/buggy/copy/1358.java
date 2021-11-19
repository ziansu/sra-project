public static void save_image(java.awt.image.BufferedImage image_p, java.lang.String name_p) {
    final java.lang.String format = "png";
    try {
        ca.uwaterloo.enghack17.cvision.File outputfile = new ca.uwaterloo.enghack17.cvision.File(name_p);
        javax.imageio.ImageIO.write(image_p, format, outputfile);
    } catch (ca.uwaterloo.enghack17.cvision.IOException e) {
    }
}