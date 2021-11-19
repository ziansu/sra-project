private void addCell(int x, int y) {
    board.getCellAt(x, y).setCurrentState(CellState.ALIVE);
}