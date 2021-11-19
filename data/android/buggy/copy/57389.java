private void closeSocketOutput(java.net.Socket socket) {
    try {
        if (socket.isOutputShutdown()) {
            socket.shutdownOutput();
        }
    } catch (java.io.IOException e) {
        onError(new com.danikula.videocache.ProxyCacheException("Error closing socket output stream", e));
    }
}