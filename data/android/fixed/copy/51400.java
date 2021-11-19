public void connect(com.ericsson.addroneapplication.model.ConnectionInfo connectionInfo) {
    state = com.ericsson.addroneapplication.communication.TcpSocket.State.CONNECTING;
    connection = new com.ericsson.addroneapplication.communication.TcpSocket.SocketConnection();
    connection.execute(connectionInfo);
}