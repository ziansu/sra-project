public void turnOnBluetooth() {
    if (!(mBluetoothAdapter.isEnabled()))
        mBluetoothAdapter.enable();
    else
        startScan();
    
}