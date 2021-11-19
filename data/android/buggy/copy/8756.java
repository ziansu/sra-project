public boolean isFull(int i, int j) {
    if (isOpen(i, j)) {
        return uf.connected(getIndex((i - 1), (j - 1)), sink);
    }
    return false;
}