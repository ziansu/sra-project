@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object data) {
    if (model.checkGameOver()) {
        endGame();
        return ;
    }
    java.lang.String nextWord = model.getCurrentWord();
    gameText.setText(nextWord);
}