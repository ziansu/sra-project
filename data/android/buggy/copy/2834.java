@org.bukkit.event.EventHandler
public static void onPlayerLeave(org.bukkit.event.player.PlayerQuitEvent event) {
    if (com.Acrobot.ChestShop.Commands.Toggle.isIgnoring(event.getPlayer())) {
        com.Acrobot.ChestShop.Commands.Toggle.setIgnoring(event.getPlayer(), false);
    }
    com.Acrobot.ChestShop.UUIDs.NameManager.dropUsername(event.getPlayer());
}