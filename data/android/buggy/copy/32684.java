@org.bukkit.event.EventHandler
public void onDropItemSpectator(com.thebubblenetwork.api.game.PlayerDropItemEvent e) {
    if (com.thebubblenetwork.api.game.GameListener.isSpectating(e.getPlayer()))
        e.setCancelled(true);
    
}