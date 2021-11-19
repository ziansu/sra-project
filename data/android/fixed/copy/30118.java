private void removeChessPiece(java.lang.String position) {
    chessGame.ChessPiece target = getChessPiece(position);
    chessGame.ChessPlayer winner = null;
    if (target instanceof chessGame.King) {
        winner = target.getPlayer();
    }
    chessGame.ChessMonitoringSystem.allChessPieces.remove(target);
    checkGameResult(winner);
}