@java.lang.Override
public void onLeScan(android.bluetooth.BluetoothDevice device, int rssi, byte[] scanRecord) {
    java.util.List<java.util.UUID> records = parseUuids(scanRecord);
    if (records.contains(serviceUUID))
        handleNewlyScannedDevice(device);
    
}