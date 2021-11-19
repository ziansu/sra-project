private void checkMinutesSinceLastAction() {
    minutesSinceLastAction = getMinutesSinceLastAction();
    if ((minutesSinceLastAction) >= (settings.getIdleTime())) {
        stateMachine.reset();
    }
}