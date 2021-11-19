private int getPixelSize(int i, int blockPixelSize, int offSet) {
    return blockPixelSize + (i < offSet ? 1 : 0);
}