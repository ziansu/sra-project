public synchronized void stop() {
    server.shutdownNow();
    uiServer.shutdownNow();
    org.apache.lens.server.LensServices.get().stop();
    org.apache.lens.server.LensServer.printShutdownMessage();
}