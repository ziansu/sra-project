@java.lang.Override
protected void onPause() {
    super.onPause();
    mSwipeDetector.stop();
}