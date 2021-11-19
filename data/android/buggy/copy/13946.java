public void sendMessage(java.lang.String message, networking.IPlayer sender) {
    client.send(new networking.sockets_old.Message(message, sender));
}