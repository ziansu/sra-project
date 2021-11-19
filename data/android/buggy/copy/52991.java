public void deselectCell() {
    if ((selectedCell) != null)
        selectedCell.removeComponent(selectRenderer);
    
    selectedCell = null;
}