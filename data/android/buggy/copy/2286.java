public short getBlue(int x, int y) {
    PixImage.pixel getpixel = RGB[y][x];
    return getpixel.B;
}