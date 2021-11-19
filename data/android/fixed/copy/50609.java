void disconnect() {
    if ((mConnected) && ((mBluetoothGatt) != null)) {
        mBluetoothGatt.disconnect();
        mConnected = false;
        mServiceDiscovered = false;
        cancelReadRssiTimerTask();
        mBluetoothGatt = null;
    }
}