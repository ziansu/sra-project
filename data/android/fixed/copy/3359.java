@java.lang.Override
public void runCommand(org.bukkit.command.CommandSender sender, java.util.List<java.lang.String> args) {
    plugin.registerConfiguration(true);
    plugin.registerPermissions();
    sender.sendMessage(((org.bukkit.ChatColor.BLUE) + "Privileges has been reloaded."));
}