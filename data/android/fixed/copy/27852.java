private void removeClient(echoserver.ClientHandler ch, java.lang.String user) {
    es.removeClient(user, ch);
    messageToAll(2, userName, ((userName) + " disconnected."));
    sendOnlineMessage();
}