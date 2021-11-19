public int getBestMove(com.harambe.game.Board board) {
    savedMove = -1;
    minimax(board, globalDepth, true);
    return savedMove;
}