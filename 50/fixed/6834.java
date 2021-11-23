void registerSelectionKey() throws java.nio.channels.ClosedChannelException {
    if (!(toWrites.isEmpty())) {
        socketChannel.register(selector, java.nio.channels.SelectionKey.OP_WRITE);
    }
}