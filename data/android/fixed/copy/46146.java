private void addPhotoFace(int x, int y) {
    int rowCount = 0;
    while (rowCount < (y - 1)) {
        addRow(rowCount, x);
        rowCount++;
    } 
}