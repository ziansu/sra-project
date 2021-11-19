public int getArrayIndex(int row, int col) {
    int index = ((row - 1) * (size)) + col;
    return index;
}