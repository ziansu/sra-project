public synchronized void stop() throws java.io.IOException {
    isStarted = false;
    serviceDiscovery.close();
    services.clear();
}