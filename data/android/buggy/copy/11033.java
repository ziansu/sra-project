protected void closeConncection(java.nio.channels.SelectionKey selectionKey) {
    java.nio.channels.SocketChannel socketChannel = ((java.nio.channels.SocketChannel) (selectionKey.channel()));
    try {
        socketChannel.close();
    } catch (java.io.IOException e) {
    }
    selectionKey.cancel();
}