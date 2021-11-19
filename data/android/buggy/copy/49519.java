public boolean updateGame(java.lang.String from, java.lang.String to) {
    try {
        board = no.ntnu.game.GameAction.movePiece(board, new no.ntnu.game.Move(from, to));
        return true;
    } catch (no.ntnu.game.TypeErrorException e) {
        return false;
    }
}