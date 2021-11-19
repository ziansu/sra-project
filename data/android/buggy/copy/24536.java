public boolean hasLost(game.Player currentPlayer, java.util.List<game.Move> possibleMoves) {
    if (((currentPlayer.getNumOfRemainingPieces()) <= 2) || ((possibleMoves.size()) == 0)) {
        return true;
    }
    return false;
}