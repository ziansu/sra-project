public void moveMade(clueGame.BoardCell clickedCell) {
    this.turnUnfinished = false;
    setRow(clickedCell.getRow());
    setCol(clickedCell.getColumn());
}