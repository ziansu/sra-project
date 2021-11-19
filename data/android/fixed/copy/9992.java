private boolean isClear(org.minesweeper.core.Cell[][] board, int x, int y) {
    return get(board, x, y).isClear();
}