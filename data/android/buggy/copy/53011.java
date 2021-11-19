@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void logasyncMonitor(org.bukkit.event.player.AsyncPlayerPreLoginEvent event) {
    if ((event.getLoginResult()) != (AsyncPlayerPreLoginEvent.Result.ALLOWED))
        return ;
    
    final java.util.UUID id = event.getUniqueId();
    this.idToState.remove(id);
}