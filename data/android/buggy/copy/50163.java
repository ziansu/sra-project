void interestOps() {
    if (!(resolving)) {
        selectionKey.interestOps((((bufferSize) == 0 ? 0 : java.nio.channels.SelectionKey.OP_READ) | ((status) == (com.xqbase.tuna.Client.STATUS_IDLE) ? 0 : java.nio.channels.SelectionKey.OP_WRITE)));
    }
}