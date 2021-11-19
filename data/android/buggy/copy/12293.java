public boolean isOpen(int i, int j) {
    validate(i, j);
    return sites[(i - 1)][(j - 1)];
}