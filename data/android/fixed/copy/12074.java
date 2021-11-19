private void startCountdown() {
    if (!(countdownStarted)) {
        startTimeCountdown = java.lang.System.nanoTime();
        countdownStarted = true;
    }
}