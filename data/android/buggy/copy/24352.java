public static java.lang.String read() {
    return comets.irc.IrcClientApi.processLine(comets.irc.IrcClientApi.receive());
}