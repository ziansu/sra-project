@org.bukkit.event.EventHandler
public void onPlayerDeath(org.bukkit.event.entity.PlayerDeathEvent event) {
    if ((state) > 0) {
        event.setDeathMessage("");
    }
}