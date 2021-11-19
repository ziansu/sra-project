private java.util.LinkedHashMap<java.lang.String, org.bluetooth.gattparser.FieldHolder> parseCharacteristic(java.lang.String serviceUUID, java.lang.String characteristicUUID) {
    byte[] value = readCharacteristic(serviceUUID, characteristicUUID);
    return parseCharacteristic(characteristicUUID, value);
}