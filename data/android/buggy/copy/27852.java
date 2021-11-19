private void removeClient(echoserver.ClientHandler ch, java.lang.String user) {
    messageToAll(2, userName, ((userName) + " disconnected."));
    es.removeClient(user, ch);
    sendOnlineMessage();
}