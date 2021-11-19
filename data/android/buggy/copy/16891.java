public boolean checkIfGameIsOver() {
    no.chess.game.PieceColor color = selectedPieceColor.get(playersTurn);
    boolean isCheckMate = chessBoard.isCheckMate(color);
    boolean isDraw = chessBoard.isDraw(color);
    return isCheckMate || isDraw;
}