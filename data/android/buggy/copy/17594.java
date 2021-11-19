@java.lang.Override
public boolean isCompleted(java.util.UUID playerID) {
    org.bukkit.entity.Player p = org.bukkit.Bukkit.getPlayer(playerID);
    if ((this.loc.distance(p.getLocation())) < (this.radius)) {
        return true;
    }
    return false;
}