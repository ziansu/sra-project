public synchronized void stop() {
    com.smartdevicelink.transport.MultiplexBluetoothTransport.getBluetoothSerialServerInstance().stop(com.smartdevicelink.transport.MultiplexBluetoothTransport.STATE_NONE);
}