public final int getPixel(int x, int y) {
    return (iPixels[((y * (iWidth)) + x)]) & 65535;
}