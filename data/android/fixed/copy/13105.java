private void stopTimer() {
    if (((timer) != null) && ((timerTask) != null)) {
        timerTask.cancel();
        timer.cancel();
        timer = null;
        timerTask = null;
    }
}