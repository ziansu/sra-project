public boolean percolates() {
    return uf.connected((((count) * (count)) + 1), ((count) * (count)));
}