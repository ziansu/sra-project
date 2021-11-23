private int getSize(int width, int maxMem, int stat) {
    return ((int) ((((float) (stat)) * width) / maxMem));
}