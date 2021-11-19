@java.lang.Override
public void onNewHighScore(int rank, int score) {
    navigator.goToHighScores(true, rank, score);
    presenter.newGame();
}