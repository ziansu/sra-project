@org.bukkit.event.EventHandler
public void onCycle(in.twizmwaz.cardinal.event.CycleCompleteEvent event) {
    for (org.bukkit.entity.Player player : org.bukkit.Bukkit.getOnlinePlayers()) {
        match.getTeamById("observers").force(player, JoinType.JOIN);
    }
}