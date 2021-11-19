public java.util.ArrayList<spaceinvaders.spaceinvaders_framework.Score> getScores() {
    loadScoreFile();
    sort();
    return scores;
}