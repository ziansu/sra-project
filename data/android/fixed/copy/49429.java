@java.lang.Override
public void run(org.bukkit.command.CommandSender sender, java.lang.String[] args) {
    java.util.List<java.lang.String> output = getBoincCommunicator().getBoincVersion();
    sender.sendMessage(output.toArray(new java.lang.String[1]));
}