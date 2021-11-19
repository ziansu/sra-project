public synchronized io.grpc.ServerImpl shutdown() {
    if (shutdown) {
        return this;
    }
    shutdown = true;
    transportServer.shutdown();
    timeoutService.shutdown();
    return this;
}