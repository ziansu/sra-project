public void connect(java.nio.channels.SocketChannel ch) throws java.lang.Exception {
    Main.EVENT_BUS.bus(new io.github.alivety.conquerors.client.events.ConnectEvent());
}