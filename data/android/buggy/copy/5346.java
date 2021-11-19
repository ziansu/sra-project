@java.lang.Override
public void completed(java.nio.channels.AsynchronousSocketChannel result, java.lang.Void attachment) {
    serverSocket.accept(null, this);
    handleNewlyAcceptedConnection(result);
}