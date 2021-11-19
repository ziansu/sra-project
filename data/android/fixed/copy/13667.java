java.lang.Boolean removeFromLobby(Player player) {
    if (players.contains(player)) {
        players.remove(player);
        return true;
    }
    return false;
}