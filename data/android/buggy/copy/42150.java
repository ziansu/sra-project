public java.lang.String getChallengeLevel(org.bukkit.entity.Player player) {
    if (Settings.challengeLevels.isEmpty()) {
        return "";
    }
    return Settings.challengeLevels.get(((getLevelDone(player)) - 1));
}