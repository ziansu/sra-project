protected boolean showPlayer(org.bukkit.entity.Player player) {
    java.lang.String name = player.getPlayerListName();
    boolean success = hiddenPlayers.remove(name);
    sendInfoPacket(player, true);
    return success;
}