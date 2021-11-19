protected void start() {
    timerState = TimerService.State.RUNNING;
    android.util.Log.d(com.simpleworkout.timer.MainActivity.TAG, ("start: timerState=" + (timerState)));
    updateButtonsLayout();
}