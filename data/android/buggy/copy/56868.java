public org.sputnikdev.bluetooth.URL copyWithProtocol(java.lang.String protocol) {
    return new org.sputnikdev.bluetooth.URL(protocol, this.adapterAddress, this.deviceAddress, this.serviceUUID, this.characteristicUUID, fieldName);
}