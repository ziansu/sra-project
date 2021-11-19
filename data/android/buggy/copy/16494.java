void gameOver(java.lang.String str) {
    message.setText(str);
    this.newGameButton.setEnabled(true);
    resignButton.setEnabled(false);
    gameInProgress = false;
}