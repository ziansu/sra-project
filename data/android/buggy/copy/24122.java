private int applyFontMatrix(int width) {
    return ((int) ((width * (fontMatrix[0])) + (fontMatrix[4]))) * 1000;
}