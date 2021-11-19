private void cancelTimer() {
    this.countDownTimer.cancel();
    this.timerIsStarted = false;
    this.timeRemainingMilliseconds = this.getCurrentExercise().getDurationMilliseconds();
}