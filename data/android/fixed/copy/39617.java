private void handleNewConnection(io.gomint.jraknet.Connection connection) {
    this.incomingConnections.add(new io.gomint.server.network.PlayerConnection(this, connection, PlayerConnectionState.HANDSHAKE));
}