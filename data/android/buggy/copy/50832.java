public boolean close() {
    br.org.cesar.knot.beamsensor.communication.WsBeamCommunication.connection.disconnectSocket();
    return br.org.cesar.knot.beamsensor.communication.WsBeamCommunication.connection.isSocketConnected();
}