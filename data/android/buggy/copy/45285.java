@java.lang.Override
protected void onPause() {
    super.onPause();
    timer.cancel();
    currentResultListener.onPause();
}