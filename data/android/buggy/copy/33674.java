public void disconnectBle() {
    android.util.Log.v(TAG, "disconnectBle");
    mBleGatt.disconnect();
    mBleGatt = null;
}