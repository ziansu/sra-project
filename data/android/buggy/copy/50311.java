@java.lang.Override
protected void onStop() {
    super.onStop();
    unregisterReceiver(wifiStateChangeReceiver);
    task.cancel(true);
}