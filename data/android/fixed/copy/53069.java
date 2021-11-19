public void stopTimer() {
    handler.removeCallbacks(runnable);
    isStarted = false;
}