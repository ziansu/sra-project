public boolean isFull(int i, int j) {
    if (isOpen(i, j)) {
        return uf.connected(getIndex(i, j), sink);
    }
    return false;
}