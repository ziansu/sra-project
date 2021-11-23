protected void clientConnected(ConnectionToClient client) {
    serverUI.display(("New client connected " + (client.getName())));
}