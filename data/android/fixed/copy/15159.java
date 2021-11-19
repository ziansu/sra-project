@java.lang.Override
public void onServicesDiscovered(android.bluetooth.BluetoothGatt gatt, int status) {
    if (status == (android.bluetooth.BluetoothGatt.GATT_SUCCESS)) {
        broadcastUpdate(com.wm.bloodpro_4_0.BluetoothLeService.ACTION_GATT_SERVICES_DISCOVERED);
    }
}