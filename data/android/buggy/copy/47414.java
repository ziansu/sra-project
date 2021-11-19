@java.lang.Override
protected void onStop() {
    unregisterReceiver(playReceiver);
    unregisterReceiver(prevReceiver);
    unregisterReceiver(nexReceiver);
    super.onStop();
}