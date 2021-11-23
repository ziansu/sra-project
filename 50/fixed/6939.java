@org.bukkit.event.EventHandler
public void onPlayerTeleport(org.bukkit.event.player.PlayerTeleportEvent event) {
    if (event.getPlayer().getUniqueId().equals(player.getUniqueId())) {
        destroy();
        player.closeInventory();
    }
}