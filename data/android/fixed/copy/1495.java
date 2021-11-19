protected static boolean gameStatus(Board userBoard, Board computerBoard) {
    return ((userBoard.remainingGamePieces()) != 0) || ((computerBoard.remainingGamePieces()) != 0);
}