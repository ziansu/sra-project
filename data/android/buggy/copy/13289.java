@javax.annotation.PostConstruct
public void refreshBoostCompute() {
    java.util.Date date = new java.util.Date(((java.lang.System.currentTimeMillis()) + (alien4cloud.component.NodeTypeScoreService.SCORE_INITIAL_DELAY_MILLISECONDS)));
    scheduler.scheduleAtFixedRate(this, date, alien4cloud.component.NodeTypeScoreService.SCORE_RATE_MILLISECONDS);
}