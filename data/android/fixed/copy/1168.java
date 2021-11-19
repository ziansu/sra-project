public void send(java.lang.Error error, com.rbruno.irc.net.Client client, java.lang.String args) throws java.io.IOException {
    send(error, client.getNickname(), args);
}