@org.bukkit.event.EventHandler
public void onPlayerDeath(org.bukkit.event.entity.PlayerDeathEvent e) {
    e.getDrops().clear();
}