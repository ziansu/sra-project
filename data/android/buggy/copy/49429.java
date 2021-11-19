@java.lang.Override
public void run(org.bukkit.command.CommandSender sender, java.lang.String[] args) {
    java.util.List<java.lang.String> output = getBoincCommunicator().getBoincVersion();
    sender.sendMessage(((java.lang.String[]) (output.toArray())));
}