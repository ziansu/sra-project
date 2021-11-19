@org.bukkit.event.EventHandler
public static void onPlayerKick(org.bukkit.event.player.PlayerKickEvent e) {
    com.theminequest.MineQuest.Player.PlayerManager.getPlayerDetails(e.getPlayer()).save();
}