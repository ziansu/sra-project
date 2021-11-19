public void checkAnswer() {
    if ((currentPlayer.getSelection().getText()) == (answer))
        currentPlayer.incrementCurrentScore();
    
    nextPlayer();
}