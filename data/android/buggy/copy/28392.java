public boolean send(byte[] data) {
    if ((mWriteCharacteristic) == null) {
        return false;
    }
    mWriteCharacteristic.setValue(data);
    mBGatt.writeCharacteristic(mWriteCharacteristic);
    return true;
}