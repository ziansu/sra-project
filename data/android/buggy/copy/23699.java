public boolean isCellEditable(int row, int col) {
    if ((((col == 0) || (col == 1)) || (col == 13)) || (col == 14)) {
        return true;
    }
    return false;
}