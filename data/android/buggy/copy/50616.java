@org.bukkit.event.EventHandler
public void onPlayerQuit(org.bukkit.event.player.PlayerQuitEvent event) {
    for (de.beimax.simplespleef.game.Game game : games) {
        game.onPlayerQuit(event);
    }
}