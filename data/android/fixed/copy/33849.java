public void setCellsFromList(java.util.List<com.android.kaffka.arduinoledpainel.models.Cell> cellList) {
    clearPixelScreen();
    for (com.android.kaffka.arduinoledpainel.models.Cell cell : cellList)
        cellChecked[cell.getY()][cell.getX()] = cell;
    
    invalidate();
}