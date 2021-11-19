public void disconnectBle() {
    android.util.Log.v(TAG, "disconnectBle");
    if ((mBleGatt) != null) {
        mBleGatt.disconnect();
        mBleGatt = null;
    }
}