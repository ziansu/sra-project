@org.bukkit.event.EventHandler
public void onPlayerDeath(org.bukkit.event.entity.PlayerDeathEvent event) {
    if ((state) > 0) {
        event.setDeathMessage("");
    }
    if ((state) == 7) {
        event.getEntity().setGameMode(GameMode.SPECTATOR);
    }
}