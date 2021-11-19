@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unregisterReceiver(serviceStateReceiver);
}