@org.bukkit.event.EventHandler
public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent event) {
    setPlayer(event.getPlayer());
    refreshPlates();
}