public void setScore(int score) {
    this.score = score;
    setHighScore(java.lang.Math.max(getHighScore(), getScore()));
}