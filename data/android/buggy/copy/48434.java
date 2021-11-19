public void send(chat_server.Message m) {
    try {
        connection.getOutputStream().writeObject(m);
        connection.getOutputStream().flush();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}