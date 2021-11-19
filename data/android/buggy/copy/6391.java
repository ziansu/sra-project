protected void clientConnected(ConnectionToClient client) {
    client.setInfo("nbCommandes", 0);
    serverUI.display(("New client connected " + (client.getName())));
}