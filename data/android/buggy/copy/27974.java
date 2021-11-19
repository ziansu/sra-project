private void init() {
    isRunning = true;
    com.password.locker.StateMonitor.state = AppState.STARTUP;
    previousState = AppState.SHUTDOWN;
}