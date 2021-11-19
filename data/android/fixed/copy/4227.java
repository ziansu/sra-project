@net.canarymod.commandsys.TabComplete(commands = { "createworld" , "world create" })
public java.util.List<java.lang.String> createWorldTabComplete(net.canarymod.chat.MessageReceiver caller, java.lang.String[] args) {
    switch (args.length) {
        case 3 :
            return matchToDimension(args);
        case 4 :
            return matchToWorldType(args);
        default :
            return null;
    }
}