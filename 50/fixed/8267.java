public void stopPeripheral() {
    if ((mGattServer) != null) {
        mGattServer.close();
    }
    mBleAdvertising.stopAdvertising();
}