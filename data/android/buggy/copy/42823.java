public void close() {
    if ((bluetoothGatt) == null) {
        return ;
    }
    disconnect();
    bluetoothGatt.close();
    bluetoothGatt = null;
    android.util.Log.d(DEBUG_TAG, "close() called");
}