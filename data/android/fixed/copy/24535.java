@org.bukkit.event.EventHandler
public void onPlayerQuit(org.bukkit.event.player.PlayerQuitEvent e) {
    try {
        com.thebubblenetwork.api.framework.BubbleNetwork.getInstance().unregisterMenu(com.thebubblenetwork.api.game.kit.KitSelection.menuMap.remove(e.getPlayer().getUniqueId()));
    } catch (java.lang.Exception ex) {
    }
}