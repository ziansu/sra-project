@net.canarymod.commandsys.TabComplete(commands = { "groupmod permissions list" , "groupmod permission flush" , "groupmod remove" , "groupmod check" , "groupmod rename" , "groupmod prefix" })
public java.util.List<java.lang.String> matchToGroupTabComplete(net.canarymod.chat.MessageReceiver caller, java.lang.String[] parameters) {
    return (parameters.length) == 1 ? net.canarymod.commandsys.TabCompleteHelper.matchToGroup(parameters) : null;
}