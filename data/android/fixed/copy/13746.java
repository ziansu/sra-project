public void login(java.lang.String username) {
    this.username = username;
    client = new chat_client.ClientGUI(this);
    client.appendText("Trying to login..");
    connect();
}