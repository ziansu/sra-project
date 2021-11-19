public void saveScore() {
    java.util.List<org.eyeseetea.malariacare.database.model.CompositeScore> compositeScoreList = org.eyeseetea.malariacare.layout.score.ScoreRegister.loadCompositeScores(this);
    this.setMainScore(org.eyeseetea.malariacare.layout.score.ScoreRegister.calculateMainScore(compositeScoreList));
    this.saveMainScore();
}