public void enableBluetooth() {
    if (!(mBluetoothAdapter.isEnabled())) {
        mBluetoothAdapter.enable();
        android.util.Log.d(TAG, "enableBluetooth():  BluetoothAdapter 실행");
    }
}