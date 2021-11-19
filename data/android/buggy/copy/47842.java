public static synchronized com.smartdevicelink.transport.MultiplexBluetoothTransport getBluetoothSerialServerInstance(android.os.Handler handler, boolean keepSocketAlive) {
    if ((com.smartdevicelink.transport.MultiplexBluetoothTransport.serverInstance) == null) {
        com.smartdevicelink.transport.MultiplexBluetoothTransport.serverInstance = new com.smartdevicelink.transport.MultiplexBluetoothTransport(handler);
    }
    com.smartdevicelink.transport.MultiplexBluetoothTransport.keepSocketAlive = keepSocketAlive;
    return com.smartdevicelink.transport.MultiplexBluetoothTransport.serverInstance;
}