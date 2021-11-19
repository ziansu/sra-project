public void setCurrentPlayer(com.cs451.checkers.GameManager.Player player) {
    this.currentPlayerNum = player;
    if (player == (com.cs451.checkers.GameManager.Player.PLAYER1)) {
        currentPlayerColor = player1;
    }else {
        currentPlayerColor = player2;
    }
}