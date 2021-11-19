public static boolean isMinner(cn.nukkit.command.CommandSender player) {
    if (player.isPlayer()) {
        if (mineless.Main.Minner.contains(((cn.nukkit.Player) (player))))
            return true;
        
    }
    return false;
}