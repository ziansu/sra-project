private android.bluetooth.BluetoothGattService getMiliService() {
    if (!(setupComplete))
        setupBluetooth();
    
    return mGatt.getService(MiBandConstants.UUID_SERVICE_MILI_SERVICE);
}