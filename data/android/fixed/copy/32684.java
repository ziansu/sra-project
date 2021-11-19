@org.bukkit.event.EventHandler
public void onDropItemSpectator(com.thebubblenetwork.api.game.PlayerDropItemEvent e) {
    if (isSpectating(e.getPlayer()))
        e.setCancelled(true);
    
}