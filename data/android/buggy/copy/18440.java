public Point[] getMove(Board board, int depth) {
    return max(new Board(board.getBoard()), depth).getMove();
}