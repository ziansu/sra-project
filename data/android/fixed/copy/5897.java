public boolean bluetoothStateOn(android.content.Intent intent) {
    int newState = mBluetoothAdapter.getState();
    if (newState == (android.bluetooth.BluetoothAdapter.STATE_ON)) {
        progress.dismiss();
        return true;
    }
    return false;
}