private void addCell(int x, int y) {
    this.board.getCellAt(x, y).setCurrentState(CellState.ALIVE);
}