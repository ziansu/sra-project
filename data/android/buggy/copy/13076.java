public void addClient(com.rbruno.irc.templates.Client client) {
    com.rbruno.irc.logger.Logger.log(client.getAbsoluteName(), java.util.logging.Level.ALL);
    clients.add(client);
}