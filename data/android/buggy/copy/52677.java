@org.bukkit.event.EventHandler
public void onPlayerDeath(org.bukkit.event.entity.PlayerDeathEvent e) {
    try {
        e.getDrops().clear();
    } catch (java.lang.Exception exeption) {
    }
}