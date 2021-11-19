public void set(org.minesweeper.core.Cell[][] board, int x, int y, int neighbouringMineCount) {
    get(x, y).setNeighbouringMineCount(neighbouringMineCount);
}