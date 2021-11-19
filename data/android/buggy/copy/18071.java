protected void sendInNetworkOrder(final int value) throws java.io.IOException {
    byte[] bytes = new byte[org.irods.jargon.core.connection.ConnectionConstants.INT_LENGTH];
    org.irods.jargon.core.utils.Host.copyInt(value, bytes);
    send(bytes);
    flush();
}