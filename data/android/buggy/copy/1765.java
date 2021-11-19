public int calculateBestMove() {
    subDiagonalRightToLeftOne(board);
    nl.hanze2017e4.gameclient.model.games.reversi.ReversiMove move = determineScore(legalMoves);
    java.lang.System.out.println("calculateBestMove invoked");
    return move.getMove();
}