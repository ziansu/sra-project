private kalah.game.board.Player getPlayer(int position) {
    return position <= (size) ? Player.PLAYER1 : Player.PLAYER2;
}