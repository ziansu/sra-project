void close() {
    try {
        client.shutDown();
    } catch (java.lang.InterruptedException e) {
        org.ballerinalang.plugins.idea.debugger.BallerinaWebSocketConnector.LOGGER.debug(e);
    }
}