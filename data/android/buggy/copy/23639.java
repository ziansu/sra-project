public void connect() {
    clientConnection.connect();
    clientConnection.setOnMessageListener(this);
    clientConnection.setOnConnectionListener(this);
    clientConnection.setOnDisconnectedListener(this);
}