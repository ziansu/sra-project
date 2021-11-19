java.lang.Boolean removeFromLobby(Player player) {
    if (players.contains(player)) {
        players.remove(player);
        broadcastLobbyStructure();
        return true;
    }
    return false;
}