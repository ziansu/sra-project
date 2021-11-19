public void run() {
    if ((io.github.hsyyid.kits.utils.ConfigManager.getTimeRemaining(player, kit)) > 0)
        io.github.hsyyid.kits.utils.ConfigManager.setTimeRemaining(player, kit, ((io.github.hsyyid.kits.utils.ConfigManager.getTimeRemaining(player, kit)) - 1));
    
}