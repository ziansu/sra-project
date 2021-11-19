public boolean delete(java.lang.Object o) {
    int row = findRow(o);
    if (row != (-1)) {
        delete(row);
    }
    return row != (-1);
}