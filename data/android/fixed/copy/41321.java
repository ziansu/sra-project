@org.bukkit.event.EventHandler
public void onEntityDamage(org.bukkit.event.entity.EntityDamageByEntityEvent event) {
    if ((event.getDamager()) == (entity)) {
        event.setCancelled(true);
    }
}