public void sendMessage(java.lang.String message) {
    java.lang.System.out.println(("sending message to clients: " + message));
    for (server.ClientConnection client : clients) {
        client.sendMessage(message);
    }
    java.lang.System.out.println(("finished sending message to clients: " + message));
}