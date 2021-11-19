private void broadcastToClients(java.lang.Object text) {
    for (net.ClientHandler ch : clientArray) {
        ch.send(text);
    }
}