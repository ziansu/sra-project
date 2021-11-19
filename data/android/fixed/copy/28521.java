public synchronized void stop() throws java.io.IOException {
    isStarted = false;
    if ((serviceDiscovery) != null)
        serviceDiscovery.close();
    
    services.clear();
}