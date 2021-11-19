@java.lang.Override
public void callPlayerInteractEvent(org.bukkit.event.player.PlayerInteractEvent event) {
    event.getPlayer().throwSnowball();
    event.getPlayer().sendMessage("Mana decreesed!");
    lastActiveItem.put(event.getPlayer(), event.getItem());
}