public void removePlayer(java.util.UUID uuid) {
    org.apache.commons.lang.Validate.isTrue(alivePlayers.remove(uuid), java.lang.String.format("Player (uuid: %s) not alive in game", uuid));
    deadPlayers.add(uuid);
}