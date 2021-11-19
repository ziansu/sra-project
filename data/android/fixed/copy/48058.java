public synchronized void requestReport() {
    for (server.ConnectedClient client : clients) {
        client.requestReport();
    }
}