@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    timer.cancel();
    tempTimer.cancel();
    matchRef.removeValue();
}