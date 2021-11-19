@org.bukkit.event.EventHandler
public void onPlayerChangedWorld(org.bukkit.event.player.PlayerChangedWorldEvent event) {
    teleportOnWorldEnter(event);
    autoFly(event);
}