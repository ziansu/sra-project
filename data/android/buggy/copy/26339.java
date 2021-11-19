public static final void addAddress(java.net.SocketAddress primary, java.net.SocketAddress additional) {
    protocolsupport.protocol.storage.ProtocolStorage.Data dataentry = protocolsupport.protocol.storage.ProtocolStorage.primaryStorage.get(primary);
    dataentry.addresses.add(additional);
    protocolsupport.protocol.storage.ProtocolStorage.secondayStorage.put(additional, dataentry.connection);
}