@java.lang.Override
public void onPause() {
    super.onPause();
    bluetoothAdapter.cancelDiscovery();
    this.unregisterReceiver(broadcastReceiver);
}