@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    timer.cancel();
    tempTimer.cancel();
    timer = null;
    tempTimer = null;
    matchRef.removeValue();
}