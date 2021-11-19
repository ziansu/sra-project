public static java.lang.String getChannelUID(java.lang.String deviceMAC, java.lang.String serviceUUID, java.lang.String characteristicUUID, int fieldIndex) {
    return ((org.openhab.binding.bluetoothsmart.internal.BluetoothSmartUtils.getChannelUID(deviceMAC, serviceUUID, characteristicUUID)) + "-") + fieldIndex;
}