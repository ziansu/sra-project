public final java.awt.Image getImageFromArray(int[] pixels) {
    raster.setPixels(0, 0, 640, 480, pixels);
    return image;
}