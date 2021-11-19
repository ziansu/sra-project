public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, java.lang.String commandLabel, java.lang.String[] args) {
    return readCommand(((org.bukkit.entity.Player) (sender)), commandLabel, args);
}