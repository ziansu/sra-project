static java.lang.String getClient(java.lang.String name) {
    return ChatBot.Logger.readOneLineFile((((ChatBot.Logger.clientsPath) + name) + (ChatBot.Logger.EXT)), true);
}