@net.canarymod.commandsys.TabComplete(commands = { "groupmod parent" })
public java.util.List<java.lang.String> groupmodParentTabComplete(net.canarymod.chat.MessageReceiver caller, java.lang.String[] parameters) {
    return ((parameters.length) == 1) || ((parameters.length) == 2) ? matchToGroup(parameters) : null;
}