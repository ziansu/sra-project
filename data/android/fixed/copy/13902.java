public void close() {
    if ((mGattServer) != null) {
        mGattServer.close();
    }
    mBleAdvertising.stopAdvertising();
}