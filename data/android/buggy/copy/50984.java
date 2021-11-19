@java.lang.Override
protected void onPause() {
    super.onPause();
    unregisterReceiver(mGattUpdateReceiver);
    unbindService(mServiceConnection);
}