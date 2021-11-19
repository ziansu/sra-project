public void addPlayer(java.lang.String player) {
    if (enabled) {
        if (de.robingrether.idisguise.management.VersionHelper.requireVersion("v1_8_R3")) {
            ghostTeam.addEntry(player);
        }else {
            ghostTeam.addPlayer(org.bukkit.Bukkit.getOfflinePlayer(player));
        }
    }
}