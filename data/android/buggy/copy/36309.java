private void connectionLost(android.bluetooth.BluetoothDevice device) {
    mHandler.obtainMessage(MainActivity.MESSAGE_DEVICE_DISCONNECTED, device).sendToTarget();
    this.start();
}