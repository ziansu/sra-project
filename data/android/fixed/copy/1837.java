private void nextPlayer() {
    currentPlayer = players.get(currentPlayerIndex);
    currentPlayerIndex = (++(currentPlayerIndex)) % (players.size());
    java.lang.System.out.println(currentPlayerIndex);
    java.lang.System.out.println(players.size());
}