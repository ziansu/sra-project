private void nextPlayer() {
    currentPlayer = players.get(nextPlayerNumber);
    nextPlayerNumber = ((nextPlayerNumber) + 1) % (players.size());
    (numberOfTurns)++;
    tryNumber = 1;
}