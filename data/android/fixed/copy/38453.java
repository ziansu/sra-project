protected int getIndex(int x, int y) {
    return ((y * (skyboxTextures.length)) + x) % (skyboxTextures.length);
}