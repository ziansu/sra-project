private void checkMinutesSinceLastAction() {
    int localMinutesSinceLastAction = getMinutesSinceLastAction();
    if (localMinutesSinceLastAction > (minutesSinceLastAction)) {
        minutesSinceLastAction = localMinutesSinceLastAction;
    }
    if ((minutesSinceLastAction) >= (settings.getIdleTime())) {
        stateMachine.reset();
    }
}