public void restartTimer() {
    if ((this.timer) && (this.isTimerRunning())) {
        LogoffTimer.restart();
    }
}