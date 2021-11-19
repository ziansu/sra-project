private void removeClient(echoserver.ClientHandler ch, java.lang.String user) {
    messageToAll(2, userName, (("User " + (userName)) + " disconnected."));
    sendOnlineMessage();
    es.removeClient(user, ch);
}