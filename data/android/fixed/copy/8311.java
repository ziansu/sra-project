private boolean validSite(int row, int col) {
    return (((row >= 1) && (row <= (n))) && (col >= 1)) && (col <= (n));
}