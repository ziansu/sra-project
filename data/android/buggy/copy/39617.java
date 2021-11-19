private void handleNewConnection(io.gomint.jraknet.Connection connection) {
    synchronized(this.incomingConnections) {
        this.incomingConnections.add(new io.gomint.server.network.PlayerConnection(this, connection, PlayerConnectionState.HANDSHAKE));
    }
}