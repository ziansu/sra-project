@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unregisterReceiver(receiver);
    if ((bluetoothAdapter) != null) {
        if (bluetoothAdapter.isDiscovering()) {
            bluetoothAdapter.cancelDiscovery();
        }
    }
}