public void removePlayer(java.util.UUID uuid) {
    org.apache.commons.lang.Validate.isTrue(alivePlayers.remove(uuid), "Player (uuid: %s) not alive in game", uuid);
    deadPlayers.add(uuid);
}