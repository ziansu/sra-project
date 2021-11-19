@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unregisterReceiver(connectionSuccessReceiver);
    unregisterReceiver(refreshedTokenReceiver);
}