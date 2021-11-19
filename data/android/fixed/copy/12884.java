public boolean percolates() {
    if ((numberOfOpenSites()) < (dim))
        return false;
    
    return UF.connected(0, (-1), ((dim) - 1), dim, true);
}