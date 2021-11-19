@org.bukkit.event.EventHandler
public void stopBoatDamage(org.bukkit.event.entity.EntityExplodeEvent event) {
    if ((event.getEntity()) == (entity))
        event.setCancelled(true);
    
}