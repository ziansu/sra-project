public static int calculateNewSize(int currentSize) {
    return currentSize <= 4 ? 8 : currentSize << 1;
}