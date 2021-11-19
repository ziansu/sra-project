public boolean isCellEditable(int row, int col) {
    if ((col == 0) || (col == 1)) {
        return true;
    }
    return false;
}