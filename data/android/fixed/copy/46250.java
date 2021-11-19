@java.lang.Override
public void onPause() {
    super.onPause();
    if ((bluetoothAdapter) == null) {
        return ;
    }
    bluetoothAdapter.cancelDiscovery();
    this.unregisterReceiver(broadcastReceiver);
}