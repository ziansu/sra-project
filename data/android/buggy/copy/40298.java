public void clearTile(int x, int y) {
    board[y][x].removeGoal();
    board[y][x].removeGamePiece();
    board[y][x] = null;
}