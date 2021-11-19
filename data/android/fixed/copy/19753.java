private void broadcast(java.lang.String message) {
    for (net.bourgau.philippe.concurrency.kata.Output client : new java.util.HashMap(clients).keySet()) {
        safeWrite(client, message);
    }
}