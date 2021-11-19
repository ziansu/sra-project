public void nextPhase() {
    currentPlayer.nextPhase();
    if ((currentPlayer.getPhase()) == 3) {
        nextPlayer();
    }
}