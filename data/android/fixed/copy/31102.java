@java.lang.Override
public void stop() {
    if (!(isTriggered)) {
        currentTimer.stop();
        resetCurrentTimer();
    }
    roundView.setText(java.lang.String.format("0/%d", maxRoundNumber));
}