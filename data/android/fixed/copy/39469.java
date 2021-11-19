private void initialize() throws java.io.IOException {
    socketChannel = java.nio.channels.SocketChannel.open();
    socketChannel.configureBlocking(false);
    selector = java.nio.channels.Selector.open();
    clientConnectionThread = new com.tieto.crterminal.model.network.CRTClient2Thread(selector, null, socketChannel, hostIp, hostListenningPort);
}