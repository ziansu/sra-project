public void inactiveTimerReset() {
    if ((inactiveTimer) != null) {
        inactiveTimer.cancel();
        inactiveTimer = null;
    }
    inactiveTimerStart();
}