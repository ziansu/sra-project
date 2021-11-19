@java.lang.Override
protected void onPause() {
    mCountDownTimer.pause();
    super.onPause();
    progressbar = false;
    mProgressBar.setProgress(0);
    mbActive = false;
}