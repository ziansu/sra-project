private void tick() {
    advanceTime();
    handleExit();
    updateViews();
    changeSubscriptionFloorPercentage();
    try {
        java.lang.Thread.sleep(tickPause);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    handleEntrance();
}