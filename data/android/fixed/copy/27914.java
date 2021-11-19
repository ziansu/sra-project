public static java.awt.image.BufferedImage createProcessed(java.awt.image.BufferedImage img) {
    int Width = (img.getWidth()) - 1;
    img = resize(img, Method.SPEED, Width, uk.ac.dundee.computing.aec.instagrim.models.OP_ANTIALIAS);
    return pad(img, 4);
}