public T getItem(int rowIndex, int columnIndex) {
    checkBounds(rowIndex, columnIndex);
    return ((T) (items[((rowIndex * (row)) + columnIndex)]));
}