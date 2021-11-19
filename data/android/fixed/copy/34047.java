public void setCurrentCell(com.pinguinson.sudoku.view.SudokuCell currentCell) {
    deselectCell();
    this.currentCell = currentCell;
    if (currentCell != null) {
        currentCell.setSelection(true);
    }
}