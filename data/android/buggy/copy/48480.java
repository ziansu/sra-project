public void saveHighScore(int highScore) {
    prefsEditor.putInt("high_score", highScore);
}