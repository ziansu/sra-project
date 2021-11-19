public void dispatchOnScoreUpdate(final com.jam.bjjscoreboard.model.Scoreboard.Practitioner practitioner, final com.jam.bjjscoreboard.model.Scoreboard.ScoreType scoreType, final int score, final boolean cancel) {
    if ((onScoreboardChangeListener) != null) {
        onScoreboardChangeListener.onScoreUpdate(practitioner, scoreType, score, cancel);
    }
}