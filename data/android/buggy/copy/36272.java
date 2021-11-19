public void addTotalDaily() {
    if (com.Ben12345rocks.VotingPlugin.Config.Config.getInstance().getDailyAwardsEnabled()) {
        setDailyTotal(((getDailyTotal()) + 1));
    }
}