@org.bukkit.event.EventHandler
public static void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent e) {
    com.theminequest.MineQuest.Player.PlayerManager.playerAcct(e.getPlayer());
}