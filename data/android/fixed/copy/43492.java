public void enableBluetooth() {
    if ((mBluetoothAdapter) != null) {
        if (!(mBluetoothAdapter.isEnabled())) {
            mBluetoothAdapter.enable();
            android.util.Log.d(TAG, "enableBluetooth():  BluetoothAdapter 실행");
        }
    }
}