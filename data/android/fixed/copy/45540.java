public void placeLoc1(org.bukkit.entity.Player player, org.bukkit.Location loc) {
    if (loc != null) {
        playerLoc1.put(player.getName(), loc);
    }
}