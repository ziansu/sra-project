@java.lang.Override
public void onNewHighScore(int rank, int score) {
    presenter.newGame();
    navigator.goToHighScores(true, rank, score);
}