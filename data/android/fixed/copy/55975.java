public static int advanceToNextPlayer(int currentPlayer) {
    int nextPlayer = currentPlayer + 1;
    if (nextPlayer > (c4.ConnectFour.NUM_PLAYERS)) {
        nextPlayer = 1;
    }
    return nextPlayer;
}