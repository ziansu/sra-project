private void sendAll(java.lang.String message) throws java.io.IOException {
    for (chat.Connection connection : chat.Server.connectedClients.values()) {
        try {
            connection.send(message);
        } catch (java.io.IOException e) {
            java.lang.System.err.println("Сообщение не было разослано");
        }
    }
}