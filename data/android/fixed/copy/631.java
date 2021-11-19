private int wrapY(int y) {
    return ((y % (height)) + (height)) % (height);
}