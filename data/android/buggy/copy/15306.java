@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unbinder.unbind();
    unregisterReceiver(connectivityChangeReceiver);
}