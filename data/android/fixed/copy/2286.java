public short getBlue(int x, int y) {
    PixImage.pixel getpixel = RGB[x][y];
    return getpixel.B;
}