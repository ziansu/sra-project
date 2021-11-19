@org.bukkit.event.EventHandler
public void onSpectatorQuit(com.thebubblenetwork.api.game.PlayerQuitEvent e) {
    setSpectating(e.getPlayer(), false);
}