@org.bukkit.event.EventHandler(ignoreCancelled = true, priority = org.bukkit.event.EventPriority.HIGHEST)
public void onPlayerMove(org.bukkit.event.player.PlayerMoveEvent event) {
    if (tryBounceOutOfBorder(event)) {
        event.setCancelled(true);
        event.getPlayer().sendMessage(((org.bukkit.ChatColor.RED) + "You have reached the world border!"));
    }
}