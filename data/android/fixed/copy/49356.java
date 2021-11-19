public void doubleRolled() {
    if ((activePlayer) == 1) {
        player1.score += 10;
    }else {
        player2.score += 10;
    }
    updateGUI();
}