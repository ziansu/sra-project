public boolean isOpen(int i, int j) {
    return (grid[normalizeIndex(i, j)]) == 1;
}