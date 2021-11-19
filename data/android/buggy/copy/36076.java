public boolean percolates() {
    for (int col = 0; col < (rowLen); col++) {
        if (isFull(((rowLen) - 1), col)) {
            return true;
        }
    }
    return false;
}