public boolean doWrite(android.bluetooth.BluetoothGattCharacteristic characteristic, byte[] data) {
    characteristic.setValue(data);
    if (!(gatt.writeCharacteristic(characteristic))) {
        android.util.Log.d(it.innove.Peripheral.LOG_TAG, "Error on doWrite");
        return false;
    }
    return true;
}