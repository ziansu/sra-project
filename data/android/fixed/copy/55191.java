public java.lang.Double getMaxScore(io.github.cms_dev.cmsscoreboard.Scoreboard scoreboard) throws io.github.cms_dev.cmsscoreboard.ScoreboardNotReadyException {
    synchronized(this) {
        if (!(scoreboards.containsKey(scoreboard)))
            throw new io.github.cms_dev.cmsscoreboard.ScoreboardNotReadyException("Scoreboard does not exist!", ScoreboardStatus.NON_EXISTENT);
        
        return scoreboards.get(scoreboard).getMaxScore();
    }
}