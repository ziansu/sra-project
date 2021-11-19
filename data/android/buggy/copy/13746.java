public void login(java.lang.String username) {
    this.username = username;
    client = new chat_client.ClientGUI();
    client.appendText("Trying to login..");
    connect();
}