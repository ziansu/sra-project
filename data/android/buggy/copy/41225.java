public void set(org.minesweeper.core.Cell[][] board, org.minesweeper.core.Cell cell, int neighbouringMineCount) {
    set(board, cell.getX(), cell.getY(), neighbouringMineCount);
}