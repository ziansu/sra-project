@java.lang.Override
public void run() {
    if ((gatt.getDevice().getBondState()) != (android.bluetooth.BluetoothDevice.BOND_BONDING)) {
        if ((mBluetoothGatt) != null) {
            mBluetoothGatt.discoverServices();
        }
    }
}