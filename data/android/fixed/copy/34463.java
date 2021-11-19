public void setItem(T item, int rowIndex, int columnIndex) {
    checkBounds(rowIndex, columnIndex);
    items[(rowIndex + (columnIndex * (row)))] = item;
}