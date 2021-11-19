@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object data) {
    java.lang.String nextWord = model.getCurrentWord();
    if (model.checkGameOver()) {
        endGame();
        return ;
    }
    gameText.setText(nextWord);
}