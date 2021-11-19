public boolean isHighscore(int score) {
    return (getMinScore(getAllScores()).getScore()) < score;
}