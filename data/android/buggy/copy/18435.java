static net.openhft.chronicle.map.ChronicleMap<java.lang.Integer, java.lang.String> newShmIntString(int port) throws java.io.IOException {
    final net.openhft.chronicle.engine.map.WireRemoteStatelessClientTest.RemoteMapSupplier remoteMapSupplier = new net.openhft.chronicle.engine.map.WireRemoteStatelessClientTest.RemoteMapSupplier(java.lang.Integer.class, java.lang.String.class);
    return remoteMapSupplier.get();
}