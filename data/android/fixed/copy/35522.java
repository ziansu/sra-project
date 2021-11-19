@net.canarymod.commandsys.TabComplete(commands = { "spawn" })
public java.util.List<java.lang.String> matchWorldNamePlayerName(net.canarymod.chat.MessageReceiver caller, java.lang.String[] args) {
    return (args.length) == 1 ? matchToKnownWorld(args) : (args.length) == 2 ? matchToOnlinePlayer(args) : null;
}