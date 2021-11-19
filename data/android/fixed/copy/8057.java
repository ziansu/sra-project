public void startBattle() {
    new java.lang.Thread(() -> opponent.startBattle(opponentAmalgamation, playerAmalgamation)).start();
    player.startBattle(playerAmalgamation, opponentAmalgamation);
    doTurn();
}