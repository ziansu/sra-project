private boolean transmit(com.hazelcast.nio.Address target, com.hazelcast.nio.Packet packet) {
    com.hazelcast.nio.ConnectionManager connectionManager = node.getConnectionManager();
    com.hazelcast.nio.Connection connection = connectionManager.getOrConnect(target);
    return connectionManager.transmit(packet, connection);
}