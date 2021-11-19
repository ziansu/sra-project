public static java.lang.String read() {
    java.lang.String line = comets.irc.IrcClientApi.receive();
    return comets.irc.IrcClientApi.processLine(comets.irc.IrcClientApi.receive());
}