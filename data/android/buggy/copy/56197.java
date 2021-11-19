public boolean percolates() {
    for (int i = 0; i < (sideSize); i++) {
        if (isFull(sideSize, i)) {
            return true;
        }
    }
    return false;
}