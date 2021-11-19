public void disconnect() {
    if ((handler) != null) {
        handler.disconnect();
        onDisconnect();
    }
}