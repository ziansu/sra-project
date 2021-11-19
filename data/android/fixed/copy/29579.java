public boolean isPlayerOnline(java.lang.String playerName) {
    if (playerName == null) {
        return false;
    }
    org.bukkit.entity.Player player = org.bukkit.Bukkit.getPlayer(playerName);
    if (player != null) {
        return true;
    }
    return false;
}