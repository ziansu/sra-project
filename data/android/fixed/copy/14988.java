private void checkIfLost() {
    if ((!(movesAvailable())) && (!(gameWon()))) {
        gameState = group2048.csse2048.MainGame.GAME_LOSE;
        endGame(false);
    }
}