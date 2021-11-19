public void send(chat_server.Message m) throws java.io.IOException {
    connection.getOutputStream().writeObject(m);
    connection.getOutputStream().flush();
}