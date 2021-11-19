public static me.cuebyte.nexus.customized.NexusPlayer getPlayer(java.lang.String uuid) {
    return me.cuebyte.nexus.customized.NexusDatabase.players.containsKey(uuid) ? me.cuebyte.nexus.customized.NexusDatabase.players.get(uuid) : null;
}