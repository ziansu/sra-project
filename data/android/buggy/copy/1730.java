public void onTick(long millisUntilFinished) {
    weightTimerText.setText(((n) + ""));
    (n)--;
    weightTimerProgressBar.setProgress(((10 - (n)) * 10));
}