public synchronized void shutdown() {
    if (clientHandlerAdapter.isConnected()) {
        clientHandlerAdapter.shutdown();
        workerGroup.shutdownGracefully();
    }
}