public int getPixelAt(int row, int col, processing.core.PImage image) {
    int index = (row * (image.width)) + col;
    return (image.pixels[index]) & 255;
}