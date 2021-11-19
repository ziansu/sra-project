private void disconnectClient(com.kylegiro.chat.server.model.Server.ClientConnection client, java.lang.String reason) {
    clients.remove(client);
    java.lang.System.out.println(("Clients: " + (clients.size())));
    client.disconnect(reason);
}