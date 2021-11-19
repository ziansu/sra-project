public void endTurn() {
    if ((turnIndex) == (players.size())) {
        turnIndex = 0;
    }else {
        (turnIndex)++;
    }
    currentPlayer = players.get(turnIndex);
}