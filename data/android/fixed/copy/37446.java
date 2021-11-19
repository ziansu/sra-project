public void moveMade(clueGame.BoardCell clickedCell) {
    this.turnUnfinished = false;
    setRow(clickedCell.getColumn());
    setCol(clickedCell.getRow());
}