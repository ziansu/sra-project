public void dispose() {
    deregisterClient();
    currentEndpointIdentifier.set(null);
}