@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((timerEnabled) == true) {
        offsetStart = java.lang.System.currentTimeMillis();
    }
}