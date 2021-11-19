private void setCurrentPlayer(game.players.Player currentPlayer) {
    this.currentPlayer = currentPlayer;
    this.currentPlayer.startTurn();
}