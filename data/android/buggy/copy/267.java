public boolean isOpen(int i, int j) {
    return ((grid[normalizeIndex(i, j)]) == 1) && (!(quickUnionContainer.connected(0, quNormalizeIndex(i, j))));
}