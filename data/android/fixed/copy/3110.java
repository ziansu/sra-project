@java.lang.Override
public void onLeScan(final android.bluetooth.BluetoothDevice device, final int rssi, byte[] scanRecord) {
    addDevice(device, rssi);
}