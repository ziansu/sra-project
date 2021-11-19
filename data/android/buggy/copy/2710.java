public org.minesweeper.core.Cell get(org.minesweeper.core.Cell[][] board, int x, int y) {
    y = org.minesweeper.core.Board.bounded(y, getHeight());
    return board[y][org.minesweeper.core.Board.bounded(x, getWidth())];
}