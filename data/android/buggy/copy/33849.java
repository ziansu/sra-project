public void setCellsFromList(java.util.List<com.android.kaffka.arduinoledpainel.models.Cell> cellList) {
    clearPixelScreen();
    for (com.android.kaffka.arduinoledpainel.models.Cell cell : cellList)
        cellChecked[cell.getX()][cell.getY()] = cell;
    
    invalidate();
}