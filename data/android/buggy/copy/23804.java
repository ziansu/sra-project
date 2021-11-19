@java.lang.Override
protected void generateHTTPMessageSuccessfully() {
    com.firefly.client.http2.HTTP1ClientConnection.log.debug("client session {} generates the HTTP message completely", connection.tcpSession.getSessionId());
    connection.generator.reset();
}